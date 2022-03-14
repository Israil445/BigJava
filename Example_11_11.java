/*Write a program that reads each line in a file, reverses its lines, and writes them to
another file. For example, if the file input.txt contains the lines
Mary had a little lamb
Its fleece was white as snow
And everywhere that Mary went
The lamb was sure to go.
and you run
reverse input.txt output.txt
then output.txt contains
The lamb was sure to go.
And everywhere that Mary went
Its fleece was white as snow
Mary had a little lamb*/
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Example_11_11 {
    public static void main(String[] args) throws FileNotFoundException {
        File file=new File("/home/israil/IdeaProjects/lab/input.txt");
        ArrayList<String>value=new ArrayList<String>();

        try(Scanner in=new Scanner(file)){
            while(in.hasNextLine()){
                String s=in.nextLine();
                value.add(s);
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        File f=new File("/home/israil/IdeaProjects/lab/output.txt");
        try(PrintWriter out=new PrintWriter(f)){
            for(int i=value.size()-1;i>=0;i--){
                out.println(value.get(i));
            }

        }catch(Exception e){
            e.printStackTrace();
        }
    }

}
