import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int start = 0;
        int end = A.length()-1;
        char[] characters = A.toCharArray();
        boolean isReverse = true;
        while(end>start){
            if (characters[start] != characters[end]){
                isReverse = false;
                break;
            }
            start++;
            end--;
        }
        System.out.println(isReverse ? "Yes" : "No");
    }
}