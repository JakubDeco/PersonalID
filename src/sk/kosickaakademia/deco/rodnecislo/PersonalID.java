package sk.kosickaakademia.deco.rodnecislo;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

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
        if (id%11!=0){
            System.out.println("Invalid personal ID detected.");
            return false;
        }


        int day, year, month;
        day=Integer.parseInt(s.substring(4,6));
        month=Integer.parseInt(s.substring(2,4));
        year=Integer.parseInt(s.substring(0,2));
        year+=2000;
        int yearNow = Calendar.getInstance().get(Calendar.YEAR);
        if (year>yearNow)
            year-=100;


        //kontrola celeho datumu
        /*String[] days = new String[] { "Sunday", "Monday",
                "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };*/
        Calendar then=Calendar.getInstance();
        Calendar today=Calendar.getInstance();
        SimpleDateFormat sdf=new SimpleDateFormat("EEEE MMM dd yyyy");
        then.set(year,month,day);
        then.setLenient(false);
        try{
            //System.out.println(days[then.get(Calendar.DAY_OF_WEEK)-1]);
            System.out.println(sdf.format(then.getTime()));
        }catch (Exception e){
            return false;
        }

        //calculating number of days from birth
        long diffMillis = then.getTimeInMillis() - today.getTimeInMillis();
        int dayDiff= (int) Math.abs(TimeUnit.DAYS.convert(diffMillis,TimeUnit.MILLISECONDS));
        System.out.println(dayDiff+" days from your birth");

        Calendar retirement=Calendar.getInstance();
        retirement.set(year+62,month,day);
        //todo if (retirement.before())
        /*

        DOPLNKOVA ULOHA PRE SIKOVNYCH:
        zistite si priblizne kedy sa v dnesnej dobe chodi do dochodku a vypiste kedy dana osoba
        ma ist do dochodku*/

        System.out.println(day+"-"+month+"-"+year);

        return true;
    }


}
