public class ArrayUtil{
    public void printArray(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public void arrayDemo(){
        int[] myArray=new int[5];
        myArray[0] = 5;
        myArray[1] = 1;
        myArray[2] = 8;
        myArray[3] = 2;
        myArray[4] = 10;
        printArray(myArray);
        System.out.println("Actual Array length : "+myArray.length);
        System.out.println("last array element : "+myArray[myArray.length-1]);
    }
    public static void main(String[] args){
        ArrayUtil arrutil = new ArrayUtil(); 
        arrutil.arrayDemo();//or we can initialize array directly while calling function like --- arrutil.arrayDemo(new int[] {10,20,30,40,50});
    }
}