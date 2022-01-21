public class Main3 {
    public static void main(String[] args) {
        String myValue = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String name = "Aswin Satheesh";
        System.out.println("The length of the given string is : " + myValue.length());
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.indexOf("Satheesh")); // This indexof will help to find the location of the particular text.
        String value1 = "firstPart";
        String value2 = "Secondpart";
        String concatination = value1 + " " + value2;
        System.out.println(concatination);
        System.out.println(value1.concat(value2));
        String myString = "This is \'text";
        System.out.println(myString);
        String myString1 = "This is \\ single backslash";
        System.out.println(myString1);



    }
}
