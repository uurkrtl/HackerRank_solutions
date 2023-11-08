import java.io.*;
import java.util.*;

public class Solution {
    private static int B;
    private static int H;
    
    static{
        Scanner scanner = new Scanner(System.in);
        B = scanner.nextInt();
        H = scanner.nextInt();
    }
    

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        System.out.println(B>0 && H>0 ? B*H : "java.lang.Exception: Breadth and height must be positive");
    }
}