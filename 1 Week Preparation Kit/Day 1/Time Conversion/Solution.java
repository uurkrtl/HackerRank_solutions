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
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
    // Write your code here

        int hour = Integer.parseInt(Character.getNumericValue(s.charAt(0)) + "" + Character.getNumericValue(s.charAt(1)));
        if(s.charAt(8)=='P' && hour != 12) hour +=12;
        if(s.charAt(8)=='A' && hour == 12) hour =0;
        return String.format("%02d:%d%d:%d%d", hour, Character.getNumericValue(s.charAt(3)),Character.getNumericValue(s.charAt(4)), Character.getNumericValue(s.charAt(6)),Character.getNumericValue(s.charAt(7)));
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}