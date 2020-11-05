package exercise6;

import java.util.Scanner;

public class PasswordCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(true){
          String password = input.nextLine();
          boolean valid = true;
          int count = 0;

          if(password.length() < 8 ){
            valid = false;
            continue;
          }else{
            for( int i = 0; i < password.length(); i++){
              if(Character.isDigit(password.charAt(i))){
                count++;
              }
              if(!Character.isLetterOrDigit(password.charAt(i))){
                valid = false;
                break;

              }
            }
          }
          if(count < 2 ){
            valid = false;
          }
          if(valid= true){
            System.out.println("Password valid!");
            break;
          }
        }
    }
}
