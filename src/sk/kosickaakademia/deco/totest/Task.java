package sk.kosickaakademia.deco.totest;



public class Task {
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
