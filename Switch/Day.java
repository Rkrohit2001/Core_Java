/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Switch;

import java.util.*;
public class Day {
    public static void main(String[] args) {
        int a;
        System.out.println("Enter number between 0-6 :");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        switch(a)
        {
            case 0:
                System.out.println("Sunday");
                break;
                case 1:
                System.out.println("Monday");
                break;
                case 2:
                System.out.println("Tuesday");
                break;
                case 3:
                System.out.println("Wednesday");
                break;
                case 4:
                System.out.println("Thursday");
                break;
                case 5:
                System.out.println("Friday");
                break;
                case 6:
                System.out.println("Saturday");
                break;
                default:
                    System.out.println("Invalids");
        }
    }
    
}
