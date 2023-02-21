package day1;

import java.util.Scanner;

public class Que15b {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(Armstrong(n)){
            System.out.println("yes, it is armstrong number");
        }
        else if(perfect(n)){
            System.out.println("Yes, it is perfect number");
        }
        else if(palindrome(n))
            System.out.println("Yes, it is palindrome");
        else{
            System.out.println("No, it is not armstrong or perfect or palindrome number");
        }
        sc.close();

    }
    static boolean Armstrong(int n){
        int temp = n,count =0,sum =0;
        while(temp > 0){
            temp = temp/10;
            count++;
        }
        int temp2 = n;
       while(n > 0){
           temp = n%10;
           sum = (int)(sum + Math.pow(temp,count));
           n = n / 10;
       }
       if(sum == temp2){
           return true;
       }
       return false;
    }
    static int power(int a,int b){
        int temp = a;
        for(int i=0;i<b;i++){
            a+=temp;
        }
        return a;
    }
    static boolean perfect(int a){
        int sum = 0;
        for(int i=1;i<a;i++){
            if(a%i==0){
                sum = sum + i;
            }

        }
        return (sum==a)?true:false;
    }
    static boolean palindrome(int n){
        int sum =0,temp =n,a;
        while(n > 0){
            a = n%10;
            sum = sum * 10 + (a);
            n = n/10;
        }
        return (sum == temp)?true:false;
    }
}
