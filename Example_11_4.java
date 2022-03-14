import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Example_11_4 {
    public static void main(String[] args) throws FileNotFoundException {

        File file=new File("/home/israil/IdeaProjects/lab/input.txt");
        File f=new File("/home/israil/IdeaProjects/lab/output.txt");
        int line=0;
        try(PrintWriter out=new PrintWriter(f)) {


            try (Scanner in = new Scanner(file)) {
                while (in.hasNextLine()) {
                    String s = in.nextLine();
                    line++;
                    //System.out.println(s);
                    out.println("/*"+line+"*/"+s);


                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }catch (Exception e){
            e.printStackTrace();
        }







    }

}
