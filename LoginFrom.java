import java.util.Scanner;

public class LoginFrom {
    private String actualUserName="";
    private String actualPassword="";
    private String enteredUserName="";
    private String enterPassword="";
    private boolean loggedIn=false;

    public LoginFrom(String userName,String password){
        this.actualUserName=userName;
        this.actualPassword=password;
    }


    public  void input(String userName,String password){

            enteredUserName=userName;
            enterPassword=password;


    }

    public void click(String button){
        if(button.equals("Submit")){
            if(enteredUserName.equals(actualUserName) && enterPassword.equals(actualPassword)){
                loggedIn=true;
            }
            else{
                loggedIn=false;
            }
        }
        else if(button.equals("Reset")){
            enterPassword="";
            enteredUserName="";
        }

        else{
            System.out.println("Somethings went wrong: click");
        }

    }


    public boolean loggedIn(){
        return loggedIn;
    }






    public static void main(String[] args) {
        LoginFrom form = new LoginFrom("israil445","israil");
        Scanner in=new Scanner(System.in);
        while(!form.loggedIn()){
            System.out.println("Login Form");

            System.out.print("Enter userName: ");
            String userName=in.next();


            System.out.print("Enter password: ");
            String password=in.next();
            form.input(userName,password);

            form.click("Submit");

            if(form.loggedIn==true){
                System.out.println("Successfully logged in");

            }
            else{
                System.out.println("Something Wrong please try again........");
            }



        }



    }


}
