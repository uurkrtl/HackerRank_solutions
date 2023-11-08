import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int row = 0;
        while(scanner.hasNext()){
            row++;
            System.out.printf("%d %s%n",row,scanner.nextLine());
        }
    }
}