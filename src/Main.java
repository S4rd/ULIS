import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Register r = new Register();

        Scanner input = new Scanner(System.in);

        System.out.println(" Do You Have an Account ? ");
        boolean a = input.nextBoolean();

        if (!a) {

            r.register();

        } else if (a) {

            System.out.println("Please Enter Your ID :");
            String ID = input.nextLine();

            System.out.println("Please Enter Your Password :");
            String Password = input.nextLine();

            ArrayList<String> IDList = Register.getList();
            ArrayList<String> PasswordList = Register.getList();


            if (ID == IDList.get(0) && Password == PasswordList.get(0)) {

                System.out.println("Correct ID and Password");


            }

        }
    }
}