import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class User {
    public static ArrayList<String> getList() {
        return null;
    }

    public String Name;
    public String SurName;
    public String ID;
    public String Password;


    public String getName () {
        return Name;
    }

    public void setName (String name){
        this.Name = Name;

    }

    public String getSurName () {
        return SurName;
    }

    public void setSurName (String surName){
        SurName = surName;

    }

    public String getID () {
        return ID;
    }

    public void setID (String ID){
        this.ID = ID ;

    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}