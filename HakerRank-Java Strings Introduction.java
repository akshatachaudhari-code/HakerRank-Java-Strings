import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i;
        String a,b,c,firstL,remainingString,d;
        
        a=sc.next();
        
        b=sc.next();
        c=a+b;
        System.out.println(c.length());
        if(a.charAt(0)>b.charAt(0)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        firstL=a.substring(0,1);
        remainingString=a.substring(1);
        d=firstL.toUpperCase()+remainingString.toLowerCase();
        System.out.print(d);
        System.out.print(" ");

        firstL=b.substring(0,1);
        remainingString=b.substring(1);
        d=firstL.toUpperCase()+remainingString.toLowerCase();
        System.out.print(d);
    }
}



