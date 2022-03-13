import java.io.File;
import java.util.Formatter;
import java.util.Scanner;

public class ReadandWrite {
    public static void main(String[] args) {
        try{
            Formatter ff=new Formatter("input.txt");
            ff.format("%s\r\n","Israil");
            ff.format("%s\r\n","CSE");

            ff.close();

        }catch(Exception e){
            e.printStackTrace();
        }


        try{
            File f= new File("/home/israil/IdeaProjects/lab/input.txt");
            Scanner in=new Scanner(f);

            while(in.hasNext()){
                String s=in.next();
                System.out.println(s);
            }
            in.close();


        }catch(Exception e){
            e.printStackTrace();
        }


    }
}
