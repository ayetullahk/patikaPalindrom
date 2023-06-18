package org.example;
import java.util.Scanner;
public class Main {
    static boolean isPalindrom(int number){
        int  temp=number,reversNumber=0,lastNumbber;
        while (temp !=0){
            lastNumbber=temp%10;
            reversNumber=(reversNumber*10)+lastNumbber;
            temp/=10;

        }
        if (number==reversNumber){
            System.out.println("Palindromdur");
            return true;
        }else {
            System.out.println("Palindrom değildir");
            return false;
        }

    }
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Sayı giriniz :");
        int k= inp.nextInt();
        isPalindrom(k);

    }
}