import java.util.Scanner;

public class Que3 {
       public static void main(String[] args){
        double num1 = 10.5, num2 = 20.8, num3 = 25.4;
        if(num1 >= num2 && num1 >= num3)
            System.out.println(num1 + " is the largest number.");
        else if (num2 >= num1 && num2 >= num3)
            System.out.println(num2 + " is the largest number.");
        else
            System.out.println(num3 + " is the largest number.");
    }
}
