import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileRandW {
    public static void main(String[] args) throws FileNotFoundException {
        File file=new File("/home/israil/IdeaProjects/lab/output.txt");
        //now write a file
        try(PrintWriter out= new PrintWriter(file)){
           out.println("israil");
           out.println("CSE");
        }catch(Exception e){
            e.printStackTrace();
        }

        //read a file

        try(Scanner in= new Scanner(file)){
            while(in.hasNext()){
                String line=in.nextLine();
                System.out.println(line);
            }

        }catch(Exception e){
            e.printStackTrace();
        }







    }
}
