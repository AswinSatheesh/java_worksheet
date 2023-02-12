import java.util.*;
import java.util.Arrays;
import java.util.Collections;

public class Sample{

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
         HashMap<Integer, Integer> capitalCities = new HashMap<Integer, Integer>();
            
        // for(int k=0; k< noOfStudent;k++){
        //     System.out.println(reglist[k] + " : " + cutOff[k]);
        // }
        for(i=0;i<noOfStudent;i++){
            capitalCities.put(cutOff[i],reglist[i]);
        }
       

        Arrays.sort(cutOff);
 
        // Reversing the array
        reverse(cutOff);
 
        // Printing the elements
        System.out.println(Arrays.toString(cutOff));
        
        for (i = 0; i < noOfStudent; i++) {
            int regNumber = capitalCities.get(cutOff[i]);
            System.out.println("Cutoff: " + cutOff[i] + " Reglist: " + regNumber);
        }

        String[] clgName = {"RTC","KRISHNA","KPG","SKV","RVS"};
        
        // need to print reverse sorted first element with all clg names , second with one less clg name and so on
 

    }

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

 