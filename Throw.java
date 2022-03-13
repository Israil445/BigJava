public class Throw extends RuntimeException {

    Throw(String m){
        super(m);
    }

    public static void main(String[] args) {
        int age=16;
        if(age<18){
            throw new Throw("You are not eligible for voting");
        }
        else{
            System.out.println("pleasse vote");
        }
    }
}
