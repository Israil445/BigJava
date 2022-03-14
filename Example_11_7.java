import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Example_11_7 {

    public static void main(String[] args) throws FileNotFoundException {
        File file =new File("/home/israil/IdeaProjects/lab/input.txt");
        int numberOfLine=0;
        int numberOfWord=0;
        int numberOfChar=0;

        try(Scanner in= new Scanner(file)){
            while(in.hasNextLine()){
                String line=in.nextLine();
                String[] words=line.split("\\s+");//joto gula space e thakbe sobgula ke ekti dhore split hobe;
                // String[] words=line.split(" ");//ekta space por por split hobe

                numberOfLine+=1;
                numberOfWord+=words.length;
                numberOfChar+=line.length();
            }

            System.out.println("Number of line = "+numberOfLine);
            System.out.println("Number of word = "+numberOfWord);
            System.out.println("Number of character are = "+numberOfChar);


        }catch (Exception e){
            e.printStackTrace();
        }



    }
}
