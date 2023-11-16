import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        while(0<amount){
            int number = scanner.nextInt();
            boolean isPrime = true;
            if (number == 1){
                isPrime = false;
            }else{
                for (int i=2; i<number; i++){
                if (number%i==0){
                    isPrime=false;
                    break;
                } 
            }
        }
            System.out.println(isPrime ? "Prime" : "Not prime");
            amount--;
        }
    }
}