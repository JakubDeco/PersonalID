package sk.kosickaakademia.deco.totest;



public class Task {
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
