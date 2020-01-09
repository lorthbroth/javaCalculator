/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topic_1;

/**
 *
 * @author dominic5
 */
import java.util.*;
import java.util.Scanner;
public class Topic_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Welcome to my simple calculator \n Enter first number and Second number:");
        Scanner inp = new Scanner(System.in);
        int num1;
        int num2;
        num1 = inp.nextInt();
        num2 = inp.nextInt();
        int answer;
        
        System.out.println("Enter your selection:\n 1 for Addition \n 2 for substraction\n 3 for Multiplication \n 4 for division:");
        int choose;
        choose = inp.nextInt();
        
        switch (choose) {
            case 1:
                System.out.println(add(num1, num2));
                break;
            case 2:
                System.out.println(sub(num1, num2));
                break;
            case 3:
                System.out.println(mult(num1, num2));
                break;
            case 4:
                System.out.println(div(num1, num2));
                break;
                default:
                    System.out.println("error, ");
        }
    }
    public static int add(int x, int y)
    {
        int result = x + y;
        return result;
    }
    public static int sub(int x, int y)
    {
        int result = x-y;
        return result;
    }
    public static int mult(int x, int y)
    {
        int result = x*y;
        return result;
    }
    public static int div(int x, int y)
    {
        int result = x/y;
        return result;
    }
    
}
