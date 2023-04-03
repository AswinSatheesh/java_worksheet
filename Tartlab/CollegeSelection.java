import java.util.*;
public class CollegeSelection {


        public static void main(String[] args) {
            studentDetails sd = new studentDetails();
            System.out.println(sd);
            Scanner input = new Scanner(System.in);
            Map<String, Integer> college1;
            ArrayList<String> department1 = new ArrayList<>();
            college1 = new HashMap<>();
            {
                college1.put("RTC", 7218);
                {
                    department1.add("CSE");
                    department1.add("ECE");
                    department1.add("IT");
                    department1.add("BME");

                    System.out.println("RTC" + "\n" + department1);
                    System.out.println("\n");
                }
                Map<String, Integer> college2;
                college2 = new HashMap<>();

                ArrayList<String> department2 = new ArrayList<>();
                college2.put("KARPAGAM(A)", 7178);
                {
                    department2.add("CSE");
                    department2.add("ECE");
                    department2.add("IT");
                    department2.add("CIVIL");

                    System.out.println("KARPAGAM" + "\n" + department2);
                    System.out.println("\n");
                }
                Map<String, Integer> college3;
                college3= new HashMap<>();
                ArrayList<String> department3 = new ArrayList<>();
                college3.put("PSG", 7180);
                {
                    department3.add("CSE");
                    department3.add("ECE");
                    department3.add("IT");

                    System.out.println("PSG" + "\n" + department3);
                    System.out.println("\n");
                }
                Map<String, Integer> college4;
                college4 = new HashMap<>();
                ArrayList<String> department4 = new ArrayList<>();
                college4.put("PR", 8212);
                {
                    department4.add("CSE");
                    department4.add("ECE");
                    department4.add("IT");
                    department4.add("EEE");

                    System.out.println("PR" + "\n" + department4);
                    System.out.println("\n");
                }
                Map<String, Integer> college5;
                college5 = new HashMap<>();
                ArrayList<String> department5 = new ArrayList<>();
                college5.put("CMS", 7204);
                {
                    department5.add("CSE");
                    department5.add("ECE");
                    department5.add("IT");
                    department5.add("MECH");

                    System.out.println("CMS" + "\n" + department5);
                    System.out.println("\n");
                }
                Map<String, Integer> college6;
                college6 = new HashMap<>();
                ArrayList<String> department6 = new ArrayList<>();
                college6.put("CIT(A)", 7105);
                {
                    department6.add("CSE");
                    department6.add("ECE");
                    department6.add("IT");
                    department6.add("MECH");
                    department6.add("EEE");

                    System.out.println("CIT(A)" + "\n" + department6);
                    System.out.println("\n");

                }







            /*System.out.println("select your college: "+college1 );
            System.out.println("select your college: "+college2 );
            System.out.println("select your college: "+college3 );
            System.out.println("select your college: "+college4 );
            System.out.println("select your college: "+college5);
            System.out.println("select your college: "+college6 );*/
            }


        }
    }