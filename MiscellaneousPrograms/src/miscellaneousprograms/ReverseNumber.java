package miscellaneousprograms;
import java.util.*;

class reverseNumberSolution{
    
     public int reverse(int x) {
        int reverseNumber = 0;
        int prevReverseNumber = 0;
        boolean negativeNumber= false;
        if(x < 0) {
            negativeNumber = true;
            x = -x;
        }
            while(x != 0){
                int currentDigit = x%10;
                reverseNumber = reverseNumber*10+ currentDigit ;
                //System.out.println("The number is ~ " + reverseNumber);
                if((reverseNumber - currentDigit)/10 != prevReverseNumber){
                    System.out.println("Number not supported. Warning for Overflow!! ");
                }
                prevReverseNumber = reverseNumber;
                x = x/10;
            }
            return (negativeNumber == true)? -reverseNumber : reverseNumber ;
    }

}

public class ReverseNumber {
    public static void main(String[] args) {
        reverseNumberSolution obj = new reverseNumberSolution();
        Scanner scanObj = new Scanner(System.in);
        System.out.println("Please enter a number to reverse~ ");
        int num = scanObj.nextInt();
        num = obj.reverse(num);
        
        System.out.println("The reversed number is ~ " + num);
    }
}
