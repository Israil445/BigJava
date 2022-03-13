import java.util.ArrayList;

public class Array {
    private int[] values;

    public Array(int[] initialValues) {
        values = initialValues;
    }

    public void printArray() {
        for (int i = 0; i < values.length; i++) {

            System.out.print(" " + values[i]);
        }
        System.out.println();
    }

//    public void swapFirstAndLast()
//    {
//        int first, last;
//
//        first = values[0];
//        last = values[values.length - 1];
//
//        values[0] = last;
//        values[values.length - 1] = first;
//
//    }

//    public  void shiftRight(){
//         for(int i=0;i<values.length;i++){
//             int temp=values[i];
//             values[i]=values[values.length-1];
//             values[values.length-1]=temp;
//         }
//
//
//
//    }
//    public void setEvenTo0(){
//        for (int i = 0; i < values.length; i++)
//        {
//            if (values[i] % 2 == 0)
//            {
//                values[i] = 0;
//            }
//        }
//    }


//    public void replaceWithLarger() {
//        for (int i = 0; i < values.length; i++) {
//            if (i == 0) {
//                if (values[i + 1] > values[i]) {
//                    values[i] = values[i + 1];
//                }
//            } else if (i == values.length - 1) {
//                if (values[i - 1] > values[i]) {
//                    values[i] = values[i - 1];
//                }
//            } else {
//                if (values[i - 1] > values[i]) {
//                    values[i] = values[i - 1];
//                }
//                if (values[i + 1] > values[i]) {
//                    values[i] = values[i + 1];
//                }
//            }
//        }
//    }//1 2 3 4 5 6 7 8


//    public void removeMid(){
//        if(values.length %2==0){
//            int mid=values.length/2;
//            for(int i=mid-1;i<values.length-2;i++){
//                values[i]=values[i+2];
//            }
//            values[values.length-1]=0;
//            values[values.length-2]=0;
//
//
//        }
//        else{
//            int mid=values.length/2;
//            for(int i=mid;i<values.length-1;i++){
//                values[i]=values[i+1];
//            }
//            values[values.length-1]=0;
//        }
//
//
//
//    }
//public void evenFirst() {
//
//        for(int i=0;i<values.length-1;i++){
//            if(values[i]%2==1){
//                for(int j=i+1;j<values.length;j++){
//                    if(values[j]%2==0){
//                        int temp=values[i];
//                        values[i]=values[j];
//                        values[j]=temp;
//                        break;
//                    }
//                }
//
//            }
//        }
//
//
//}



    public static void main(String[] args) {
        Array a = new Array(new int[]{1, 2, 3, 4, 5,6,7,8});
        a.printArray();
//        a.swapFirstAndLast();
        //   a.shiftRight();
//        a.setEvenTo0();
      //  a.replaceWithLarger();
       // a.removeMid();
       // a.evenFirst();


        a.printArray();


    }
}


//1 2 3 4
    //4 1 2 3


