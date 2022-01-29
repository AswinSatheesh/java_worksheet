import java.util.HashSet;
public class HashsetInergerEx {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<Integer>();
        numbers.add(1);
        numbers.add(5);
        numbers.add(7);
        numbers.add(9);

        for (int i = 0; i <= 10; i++){
            if(numbers.contains(i)){
                System.out.println(i + " is present in the given Hashset!!");
            }else {
                System.out.println(i + " is not present in the given Hashset !!!");
            }
        }
        

    }
}
