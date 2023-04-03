import java.util.HashMap;

public class CollegeSeats {
    private HashMap<String, Integer> seats = new HashMap<>();
    
    public CollegeSeats() {
        // initialize available seats for each college
        seats.put("College A", 10);
        seats.put("College B", 20);
        seats.put("College C", 15);
    }
    
    public void showAvailableSeats(String college) {
        if (seats.containsKey(college)) {
            System.out.println("Available seats for " + college + ": " + seats.get(college));
        } else {
            System.out.println("College " + college + " not found.");
        }
    }
}
