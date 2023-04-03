public Student(int regNo, int physicsMark, int chemistryMark, int mathsMark) {
    this.regNo = regNo;
    this.physicsMark = physicsMark;
    this.chemistryMark = chemistryMark;
    this.mathsMark = mathsMark;
    this.cOff = (physicsMark/4) + (chemistryMark/4) + (mathsMark/2);
}

public int getRegNo() {
    return regNo;
}

public int getCOff() {
    return cOff;
}
public College(String name) {
    this.name = name;
}

public String getName() {
    return name;
}

class AnnaUniversityCutoffMarks2 {

public static void main(String[] args) {

    int i, noOfStudent, regNo, physicsMark, chemistryMark, mathsMark, alterSubject;

    System.out.print("Enter the no of student: ");

    Scanner ip = new Scanner(System.in);

    noOfStudent = ip.nextInt();

    ArrayList<Student> students = new ArrayList<Student>();

    for(i = 0; i < noOfStudent; i++) {
        System.out.print("Enter student's reg number:");

        regNo = ip.nextInt();

        System.out.println(regNo);

        System.out.println("\n Marks");
   
        System.out.print("Enter physics marks: ");

        physicsMark = ip.nextInt();

        System.out.println("Physics Mark: " + physicsMark);

        System.out.print("Enter chemistry marks: ");

        chemistryMark = ip.nextInt();

        System.out.println("Chemistry Mark: " + chemistryMark);

        System.out.print("Enter maths marks: ");

        mathsMark = ip.nextInt();

        System.out.println("Maths Mark: " + mathsMark);

        System.out.println("\n");

        Student student = new Student(regNo, physicsMark, chemistryMark, mathsMark);

        students.add(student);
    }

    // Sort students in descending order of cOff
    Collections.sort(students, new Comparator<Student>() {
        @Override
        public int compare(Student s1, Student s2) {
            return Integer.compare(s2.getCOff(), s1.getCOff());
        }
    });

    ArrayList<College> colleges = new ArrayList<College>();
    colleges.add(new College("RTC"));
    colleges.add(new College("KRISHNA"));
    colleges.add(new College("KPG"));
    colleges.add(new College("PSG"));
    colleges.add(new College("Karapagam"));

    System.out.println("All Available colleges are:");
    System.out.println();
    for (College college : colleges) {
        System.out.println(college.getName());
    }
    System.out.println();
    System.out.println();

    for (Student student : students) {
        System.out.println("Student who is having Cutoff " + student.getCOff() + " Available colleges are:");
        for (int j = 0; j < colleges.size() - students.indexOf(student); j++) {
            System.out.println(colleges.get(j).getName());
        }
        System.out.println("-----------------------------");
    }

}

}