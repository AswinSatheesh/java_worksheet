public class Arrays {
    public static void main(String[] args){
        String[] myNames = {"Aswin", "Kannan", "Evan"};
        for (int i = 0; i < myNames.length; i++){
            System.out.println(myNames[i]); //Loop through the array using for loop
        }
        myNames[1] = "Tushar"; // Changing the first value in the array
        System.out.println(myNames[1]);
        System.out.println(myNames.length);  // finding the length of the array

        //foreach loop

        for(String j : myNames){
            System.out.println(j);
        }

        //Multidimensional array

        int[][] myNumbers = {{1,2,3,4,5}, {6,7,8,9,10}};
        System.out.println(myNumbers[1][2]);
    }
}
