package sk.kosickaakademia.deco.rodnecislo;

import java.util.Calendar;
import java.util.Date;

public class PersonalID {
    private String id="";

    public boolean checkID(String s){
        if (s.length()<9 || s.length()>11) return false;

        int cDigits=0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i)))
                cDigits++;
        }

        if (cDigits!=10 && cDigits!=9)
            return false;

        if (s.length()==11 && (s.charAt(6)!='/' || cDigits!=10))
            return false;

        if (s.length()==10 && s.charAt(6)!='/' && cDigits==9)
            return false;
        if (s.charAt(2)!='5' && s.charAt(2)!='6' && s.charAt(2)!='0' &&s.charAt(2)!='1')
            return false;

        if (cDigits==9)
            s=s+'0';

        if (s.charAt(6)=='/')
            s=s.replaceAll("[/]","");

        System.out.println(s);
        long id=Long.parseLong(s);
        /*if (id%11!=0){
            System.out.println("Invalid personal ID detected.");
            return false;
        }*/


        int day, year, month;
        day=Integer.parseInt(s.substring(4,6));
        month=Integer.parseInt(s.substring(2,4));
        year=Integer.parseInt(s.substring(0,2));
        year+=2000;
        int yearNow = Calendar.getInstance().get(Calendar.YEAR);
        if (year>yearNow)
            year-=100;


        //kontrola celeho datumu
        Calendar then=Calendar.getInstance();
        then.set(year,month,day);
        then.setLenient(false);
        try{
            then.getTime();
        }catch (Exception e){
            return false;
        }

        System.out.println(day+"-"+month+"-"+year);

        return true;
    }


}
