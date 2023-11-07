import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        String[] words = new String[T];
        scanner.nextLine();
        for (int i = 0; i<T; i++){
            words[i] = scanner.nextLine();
        }
        for (String word : words){
            char[] characters = word.toCharArray();
            StringBuffer left = new StringBuffer();
            StringBuffer right = new StringBuffer();
            for(int i = 0; i<characters.length;i++){
                if (i%2==0){
                    left.append(characters[i]);
                }else{
                    right.append(characters[i]);
                }
            }
            System.out.println(left + " " + right);
        }
    }
}