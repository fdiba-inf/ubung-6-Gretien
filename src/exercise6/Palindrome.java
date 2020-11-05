package exercise6;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        assert number > 0 : "Invalid number";
        int copy = number;
        int revnumber = 0;

        while(copy!=0){
          int digit = copy % 10;
          copy /= 10;
          revnumber *= 10;
          revnumber += digit;

        }
        if ( revnumber == number){
          System.out.println("Palindrome: true");

        }else{
          System.out.println("Palindrome: false");

        }

    }
}
