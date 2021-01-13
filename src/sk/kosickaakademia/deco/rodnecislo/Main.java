package sk.kosickaakademia.deco.rodnecislo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        PersonalID id1=new PersonalID();
        System.out.println(id1.checkID("980113/1527"));
    }
}
