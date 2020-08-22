package miscellaneousprograms;

import java.util.Scanner;

class convertValue {

    public int valueofChar(char s) {

        if (s == 'I')
            return 1;
        if (s == 'V')
            return 5;
        if (s == 'X')
            return 10;
        if (s == 'L')
            return 50;
        if (s == 'C')
            return 100;
        if (s == 'D')
            return 500;
        if (s == 'M')
            return 1000;
        else
            return -1;
    }

    int romanToInteger(String number) {
        int result = 0;

        for (int i = 0; i < number.length(); i++) {
            int digit1 = valueofChar(number.charAt(i));

            if (i + 1 < number.length()) {
                int digit2 = valueofChar(number.charAt(i + 1));

                if (digit1 >= digit2) {
                    result = result + digit1;
                } else {
                    result = result + (digit2 - digit1);
                    i++;
                }
            } else {
                result = result + digit1;
                i++;
            }
        }

        return result;
    }
}

public class RomanToInteger {
    public static void main(String[] args) {
        convertValue romanToInteger = new convertValue();

        Scanner scan = new Scanner(System.in);
        String answer = "Y";
        
        while (answer.equals("Y")) {
            
            System.out.println("\nPlease input a Roman numeral to convert it to Integer: ");
            String romanInput = scan.next();

            int integerOutput = romanToInteger.romanToInteger(romanInput);

            System.out.println("The Integer equal is ~ " + integerOutput);
            
            System.out.println("Do you want to run the program? Reply Y or N");
            answer = scan.next();
        }
    }
}
