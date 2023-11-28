import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int negativePiece = 0;
        int piece = scanner.nextInt();
        int sum = 0;
        
        int[] A = new int[piece];
        for (int i=0; i<piece; i++){
            A[i] = scanner.nextInt();
        }
        scanner.close();
        
        for (int i=0; i<piece; i++){
            for (int j=i; j<piece;j++){
                sum+=A[j];
                if (sum<0) negativePiece++;
            }
            sum = 0;
        }
        System.out.println(negativePiece);
    }
}