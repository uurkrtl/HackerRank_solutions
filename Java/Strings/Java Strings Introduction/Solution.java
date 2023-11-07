import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        
        /* Sum the lengths of A and B. */
        System.out.println(A.length()+B.length());
        
        /* Write Yes if A is lexicographically greater than B otherwise print No instead. */
        System.out.println(A.compareTo(B)>0 ? "Yes" : "No");
        
        /* capitalize the first letter in both  and  and print them on a single line, separated by a space. */
        System.out.println(upperFirstLetter(A) + " " + upperFirstLetter(B));
        
    }
    
    public static String upperFirstLetter(String word){
        if(word.length() == 0 || word == null){
            return "";
        }else{
            return word.substring(0,1).toUpperCase() + word.substring(1);
        }
    }
}