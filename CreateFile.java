import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
public class CreateFile {
    public static void main(String[] args) {
        try {
            // File myobj = new File("filename.txt");
            FileWriter mywriter = new FileWriter("filename.txt");
            mywriter.write("This is a text file used to learn the java File handling!!");
            mywriter.close();
            System.out.println("Successfully wrote the file!!");
            // if (myobj.createNewFile()){
            //     System.out.println("File created : "+ myobj.getName());
            // }else{
            //     System.out.println("File already exits.");
            // }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
