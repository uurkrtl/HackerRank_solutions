// Created by Ugur Kartal - 29.04.2024
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

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
    // Write your code here
    double countPlusNumber = 0;
    double countMinusNumber = 0;
    double countZeroNumber = 0;
    for (int number : arr){
        if(number<0) {
            countMinusNumber++;
        } else if(number>0) {
            countPlusNumber++;
        } else{
            countZeroNumber++;
        }
        
    }
    System.out.printf("%.6f%n", countPlusNumber/(countPlusNumber+countMinusNumber+countZeroNumber));
    System.out.printf("%.6f%n", countMinusNumber/(countPlusNumber+countMinusNumber+countZeroNumber));
    System.out.printf("%.6f%n", countZeroNumber/(countPlusNumber+countMinusNumber+countZeroNumber));

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}