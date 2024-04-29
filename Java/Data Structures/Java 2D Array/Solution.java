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

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        //Solution:
        int biggestSum = Integer.MIN_VALUE;
        for (int row = 0; row<=3; row++){
            for(int col = 0; col<=3; col++){
                int sum = 0;
                for(int matrix = col; matrix<=col+2; matrix++){
                    sum += arr.get(row).get(matrix) + arr.get(row+2).get(matrix);
                }
                sum += arr.get(row+1).get(col+1);
                biggestSum = Integer.max(biggestSum, sum);
            }
        }
        System.out.println(biggestSum);
    }
}
