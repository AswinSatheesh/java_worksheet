import java.util.*;
import java.util.Arrays;
import java.util.Collections;

public class AnnaUniversityCutoffMarks{

    public static void main(String[] args) {

        int i, noOfStudent,regNo,physicsMark,chemistryMark,mathsMark,alterSubject;

        System.out.print("Enter the no of student: ");

        Scanner ip =new Scanner(System.in);

        noOfStudent = ip.nextInt();

        int cutOff[] = new int[noOfStudent];
        int reglist[] = new int[noOfStudent];

        for(i=0;i<noOfStudent;i++)
        {
            System.out.print("Enter students reg number:");

            regNo = ip.nextInt();
            reglist[i] = regNo;

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

            int cOff = (physicsMark/4)+(chemistryMark/4)+(mathsMark/2);

            cutOff[i]=cOff;

            System.out.println("Student CutOff: "+cOff);

            System.out.println("\n");

        }

        //Initializing hash map
         HashMap<Integer, Integer> capitalCities = new HashMap<Integer, Integer>();
        
        //Asignnig key and value to hashmap
        for(i=0;i<noOfStudent;i++){
            capitalCities.put(cutOff[i],reglist[i]);
        }
       

        Arrays.sort(cutOff);
 
        // Reversing the array , calling funciton
        reverse(cutOff);
        
        //After arranging descending order showing cutOff marks and respective register number
        for (i = 0; i < noOfStudent; i++) {
            int regNumber = capitalCities.get(cutOff[i]);
            System.out.println("Cutoff: " + cutOff[i] + " Reglist: " + regNumber);
        }

        String[] clgName = {"RTC","KRISHNA","KPG","PSG","Karapagam"}; //five clg name means needs to enter 5 student details, if 4 student means remove one clg name from this array, if more means add extra clg name.
        
        System.out.println("All Available colleges are : ");
        System.out.println();
        System.out.println("1.RTC");
        System.out.println("1.KRISHNA");
        System.out.println("1.KPG");
        System.out.println("1.PSG");
        System.out.println("1.Karapagam");
        
        System.out.println();
        System.out.println();

        //cutOff first element prints all clg names in String array and second element prints one minus from clg name array and so on.
         for ( i = 0; i < cutOff.length; i++) {
            int length = clgName.length - i;
            System.out.println("Student who is having Cutoff " + cutOff[i] + " Available colleges are these :");
            for ( int j = 0; j < length; j++) {
                System.out.println(clgName[j]);
            }
            System.out.println("-----------------------------");
        }
 

    }

    //function to reverse the array in descending order
    public static void reverse(int[] array)
    {
 
        int n = array.length;

        for (int i = 0; i < n / 2; i++) {
             int temp = array[i];
             array[i] = array[n - i - 1];
             array[n - i - 1] = temp;
        }
    }


}

 