import java.util.ArrayList;
import java.util.Scanner;

public class Register {

    public static ArrayList<String> getList(){
        return null;
    }

    void register() {

        Scanner input = new Scanner(System.in);

        User user = new User();

        ArrayList<String> NameList = new ArrayList<String>();
        ArrayList<String> SurNameList = new ArrayList<String>();
        ArrayList<String> IDList = new ArrayList<String>();
        ArrayList<String> PasswordList = new ArrayList<String>();

        NameList.add("Boran");
        SurNameList.add("Kelek");
        IDList.add("21081916273");
        PasswordList.add("2022");

        NameList.add("Efe");
        SurNameList.add("Altas");
        IDList.add("20200602003");
        PasswordList.add("2322");

        System.out.println("What is your name?");
        user.Name = input.next();
        NameList.add(user.Name);


        System.out.println("What is your Surname?");
        user.SurName = input.next();
        SurNameList.add(user.SurName);


        System.out.println("What is your ID?");
        user.ID = input.next();
        IDList.add(user.ID);

        System.out.println("Please enter a password to register ?");
        user.Password = input.next();
        PasswordList.add(user.Password);


        System.out.println(NameList);
        System.out.println(SurNameList);
        System.out.println(IDList);
        System.out.println(PasswordList);

    }
}
