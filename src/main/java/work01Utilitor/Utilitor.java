package work01Utilitor;


public class Utilitor {
    
    //1.2
    public static String testString(String value){
        if(value == null){
            throw new NullPointerException();
        }
        if(value.isBlank()){
            throw new IllegalArgumentException();
        }
        return value;

    }
    //1.3
    public static double testPositive(double value){
        if(value > 0){
            return value;
        }
        throw new IllegalArgumentException(); 
    }
    //1.4
    public static long computeIsbn10(long isbn10) {
        int sum = 0;
        long digits ;
        for (int i = 1; i <= 9; i++) {
           digits = isbn10 % 10;
           sum += digits * i;
           isbn10 /= 10;
        }
       int checkDigit = sum % 11;
       
       return checkDigit;
    }
}

    /*
       1.5 Show in this "work01Utilitor" method how to use 1.2-1.4 and
           check their correctness. */

