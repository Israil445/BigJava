/*Write a program that reads a file containing two columns of floating-point ­numbers.
Prompt the user for the file name. Print the average of each column.*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Example_11_6 {
    public static void main(String[] args) throws FileNotFoundException {
        double fcolsum=0;
        double scolsum=0;
        int cnt=0;
        int rownum=0;
        File file=new File("/home/israil/IdeaProjects/lab/input.txt");
        try(Scanner in=new Scanner(file)){
            while(in.hasNext()){
                String s=in.next();
                cnt++;
                if(cnt%2==1){
                    fcolsum+=(Double.parseDouble(s));
                }
                else{
                    scolsum+=(Double.parseDouble(s));
                }

            }
        }catch (Exception e){
            e.printStackTrace();
        }
        rownum=(cnt/2);
        System.out.printf("First column sum is: %.2f\n", fcolsum / rownum);
        System.out.printf("Second column sum is: %.2f\n", scolsum/ rownum);

    }



}
