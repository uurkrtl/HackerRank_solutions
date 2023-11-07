import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();
        
        /* Determine answer */
        String binary = Integer.toString(n,2);
        int maxLenght = 0;
        int maxLenghtNew = 0;
        for (char chr : binary.toCharArray()){
            if (chr=='1'){
                maxLenghtNew++;
                if(maxLenghtNew>maxLenght) maxLenght=maxLenghtNew;
            }else{
                maxLenghtNew = 0;
            }
        }
        System.out.println(maxLenght);
    }
}