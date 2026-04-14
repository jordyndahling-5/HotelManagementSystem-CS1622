
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;


// class for the "website" portion

// class for the "website" portion
public class GUI extends Frame{
    private ArrayList<Integer> occupiedRooms;

    private TextField nameField;
    private Button standardRoom;
    private Button suiteRoom;
    private String selectedRoomType;

    Random random = new Random();

    public GUI() {
        this.occupiedRooms = new ArrayList<>();
        setTitle("Hotel Reservation");
        setSize(300,200);
        setLayout(new FlowLayout());

        nameField = new TextField(20);
        standardRoom = new Button("Standard");
        suiteRoom = new Button("Suite");

        add(new Label("Enter Name: "));
        add(nameField);
        add(standardRoom);
        add(suiteRoom);

        standardRoom.addActionListener(e -> createReservation("Standard"));
        suiteRoom.addActionListener(e -> createReservation("Suite"));

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });
    }

    private void createReservation(String roomType) {
        String name = nameField.getText();

        if (name.isEmpty()) {
            System.out.println("Please enter a name");
            return;
        }
        Room room1;

        if (roomType.equals("Standard")) {
            room1 = new StandardRoom();
        } else {
            room1 = new SuiteRoom();
        }

        room1.setRoomNum(random.nextInt(100));
        for (int i : occupiedRooms) {
            if (i == room1.roomNum) {
                System.out.println("Room number already occupied");
                break;
            }
        }
        room1.setNumBeds(2);
        room1.setNumNights(3);
        room1.calcCost();

        occupiedRooms.add(room1.roomNum);

        Amenity amenity1 = new Amenity();
        amenity1.setNumExcursions(2);
        amenity1.setFoodPlan("Buffet");
        amenity1.setNumFridgeFood(4);
        amenity1.calcCost();

        Reservation person1 = new Reservation();
        person1.setName(name);
        person1.setDateArrival("March 8");
        person1.calcReservationTotalCost(room1.roomCost, amenity1.getAmenityCost());
        person1.setRoom(room1);
        person1.setAmenity(amenity1);
        System.out.println("Reservation created for: " + name);
        System.out.println("Room Number: " + room1.roomNum);
        System.out.println("Cost of Room: $" + room1.roomCost);
        System.out.println("Amenity Costs: $" + amenity1.getAmenityCost());
        System.out.println("Total Cost: $" + person1.getReservationTotalCost());


    }

}
