public class OopsUpdate {
    int x =20 ;  // if we use 'final'  then  can't able to override the existing values. 

    public static void main(String[] args){
        OopsUpdate myobj = new OopsUpdate();
        myobj.x = 40;
        System.out.println(myobj.x);
    }
}
