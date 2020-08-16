package miscellaneousprograms;

import java.util.Scanner;

class CheckPalindrome {

    public boolean isPalindrome(int x) {

        if (x < 0) {
            return false;
        } else {

            int divisor = 1;

            while (x / divisor >= 10) {
                divisor *= 10;
            }

            while (x != 0) {
                int leadingDigit = x / divisor;
                int trailingDigit = x % 10;

                if (leadingDigit != trailingDigit) {
                    return false;
                }

                x = (x % divisor) / 10;

                divisor /= 100;
            }
        }
        return true;
    }
}

public class PalindromeSequence {
    public static void main(String[] args) {
        CheckPalindrome obj = new CheckPalindrome();

        Scanner scanObj = new Scanner(System.in);
        System.out.println("Please enter a number to check if it is a palindrome~ ");
        int num = scanObj.nextInt();
        boolean result = obj.isPalindrome(num);

        if (result) {
            System.out.println("The number is a palindrome.");
        }
        else{
            System.out.println("The number is not a palindrome.");
        }
    }
}
