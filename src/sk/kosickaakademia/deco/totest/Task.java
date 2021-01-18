package sk.kosickaakademia.deco.totest;


import java.util.ArrayList;

public class Task {
    public String breakCamelCase(String s){
        if (s==null) return null;
        if (s.isEmpty()) return "";
        if (s.length()==1) return s;

        StringBuilder sb=new StringBuilder(s);
        char[] arr=s.toCharArray();
        int offset=0;
        for (int i = 1; i < arr.length; i++) {
            if (Character.isUpperCase(arr[i])){
                sb.insert(i+offset," ");
                offset++;
            }
        }
        return sb.toString();
    }

    public boolean isPalindrom(int a){
        if (a<0) return false;
        StringBuilder sb=new StringBuilder(Integer.toString(a));
        sb.reverse();
        return Integer.parseInt(sb.toString()) == a;
    }

    public int max( int[ ] array ) {
        if (array.length==0) {
            return 0;
        }
        if (array.length==1) {
            return array[0];
        }
        int result=array[0];
        for (int temp :
                array) {
            if (temp>result) result=temp;
        }
        return result;
        /*
        PRE LEPSICH: uprava tejto ulohy, metoda max 2, pole vrati 2 najvacsie cislo v poli.
        ak je pole prazdne, alebo jednoprvkove,
        alebo su vsetky cisla rovnake, tak druhe najvacsii prvok neexistuje a metoda vrati 0 to do */
    }

    public double calcTripPrice(double distance, double consumption, double fuelPrice){
        if (distance<=0 || consumption<=0 || fuelPrice<=0) return 0;

        double result=distance*consumption/100*fuelPrice;
        return Math.round(result*100)/100.0;
    }

    public double terminovanyVklad(double value, int years, double interest, boolean tax){
        if (value<=0 || years<0 ||interest<0)
            return 0;

        for (int i = 0; i < years; i++) {
            double profit=value*interest/100;
            if (tax)
                value+=profit*0.8;
            else value+=profit;
        }
        double rounded=Math.round(value*100)/100.0;
        return rounded;
    }
    
    /**
     * description: method returns middle character/s of parameter
     * */
    public String getMiddle(String word) {
        if (word==null) return null;
        int start=word.length()/2;
        if (word.length()%2==0) return word.substring(start-1,start+1);
        else return word.substring(start,start+1);
    }

    /**
     * description: method replaces all characters in String but the last four
     * */
    public String maskify(String str) {
        if (str==null) return null;
        if (str.length() <= 4) return str;
        else {
            int start = str.length() - 4;
            String uncovered = str.substring(start);
            uncovered = "#".repeat(str.length() - 4) + uncovered;
            return uncovered;
        }
    }

    /**
     * description: method finds integer that exists odd number of times in parameter array; find only one
     * */
    public int findIt(int[] a) {
        int odd=0;
        for (int temp : a) {
            odd ^= temp;
        }
        return odd;
    }

    public double sum(double a, double b){
        return a+b;
    }

    public boolean isPrimeNum(int n){
        if (n<2)
            return false;
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n%i==0)
                return false;
        }
        return true;
    }

    public boolean isRectangular(int a,int b,int c){
        if (a<1 || b<1 ||c<1) return false;
        return a*a==b*b+c*c || b*b==a*a+c*c || c*c==a*a+b*b;
    }

    public String reverse(String s){
        if (s==null) return null;
        if (s.isEmpty()) return "";
        StringBuilder result= new StringBuilder(s);

        return result.reverse().toString();
    }
}
