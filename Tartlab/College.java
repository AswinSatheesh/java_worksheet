import java.util.*;

class College {
    private String name;
    private int totalSeats;
    private int seatsAvailable;

    public College(String name, int totalSeats) {
        this.name = name;
        this.totalSeats = totalSeats;
        this.seatsAvailable = totalSeats;
    }

    public String getName() {
        return name;
    }

    public int getTotalSeats() {
        return totalSeats;
    }

    public int getSeatsAvailable() {
        return seatsAvailable;
    }

    public void reserveSeat() {
        if (seatsAvailable > 0) {
            seatsAvailable--;
            System.out.println("Seat reserved in " + name);
        } else {
            System.out.println("No seats available in " + name);
        }
    }

    public void releaseSeat() {
        if (seatsAvailable < totalSeats) {
            seatsAvailable++;
            System.out.println("Seat released in " + name);
        } else {
            System.out.println("No seats to release in " + name);
        }
    }
}

class CollegeApplication {
    private List<College> colleges;

    public CollegeApplication() {
        colleges = new ArrayList<>();
    }

    public void addCollege(College college) {
        colleges.add(college);
    }

    public List<College> getColleges() {
        return colleges;
    }
}

class CollegeSeats {
    private CollegeApplication collegeApp;

    public CollegeSeats(CollegeApplication collegeApp) {
        this.collegeApp = collegeApp;
    }

    public void showAvailableSeats() {
        System.out.println("Available seats in each college:");
        for (College college : collegeApp.getColleges()) {
            System.out.println(college.getName() + ": " + college.getSeatsAvailable());
        }
    }
}

public class Main {
    public static void main(String[] args) {
        CollegeApplication collegeApp = new CollegeApplication();
        College college1 = new College("College A", 50);
        College college2 = new College("College B", 100);
        collegeApp.addCollege(college1);
        collegeApp.addCollege(college2);

        CollegeSeats collegeSeats = new CollegeSeats(collegeApp);

        // Display available seats before any reservations
        collegeSeats.showAvailableSeats();

        // Reserve seats
        college1.reserveSeat();
        college2.reserveSeat();
        college2.reserveSeat();
        college1.reserveSeat();
        college2.reserveSeat();

        // Display available seats after some reservations
        collegeSeats.showAvailableSeats();

        // Release some seats
        college2.releaseSeat();
        college2.releaseSeat();

        // Display available seats after some releases
        collegeSeats.showAvailableSeats();
    }
}
