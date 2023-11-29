package com.mycompany.palindrome;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
       
        System.out.println("-----------------------------------------------------------------------");
        System.out.println(" ");
        System.out.println("Please give the input number to check palindrome: ");
        System.out.println(" ");
        String str = input.nextLine();
        System.out.println(" ");
        System.out.println("-----------------------------------------------------------------------");
        System.out.println(" ");
        
        long num = Long.parseLong(str);
        
        boolean isPalindrome = true;
        long reverse = 0;
        long temp = num;
        
        while(temp !=0) {
            reverse = reverse * 10 + temp% 10;
            temp/= 10;
        }    
        if  (num != reverse) {
            isPalindrome = false;
        }
        
        System.out.println("Input By User: " + str);
        System.out.println(" ");
        System.out.println("Reverse number: " + reverse);
        System.out.println(" ");
        
        if (isPalindrome){
            System.out.println(str + " is a Palindrome Number");
            System.out.println(" ");
        } 
        else {
           System.out.println(str + " is not a Palindrome Number"); 
           System.out.println(" ");
        }    
    }
}
