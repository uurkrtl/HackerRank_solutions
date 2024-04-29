import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> numbers = new ArrayList<ArrayList<Integer>>();
        Scanner scanner = new Scanner(System.in);
        int piece = scanner.nextInt();
        for(int i = 0; i<piece; i++){
            int subPiece = scanner.nextInt();
            ArrayList<Integer> subList= new ArrayList<>();
            for(int j = 0; j<subPiece; j++){
                subList.add(scanner.nextInt());
            }
            numbers.add(subList);
        }
        int queryPiece = scanner.nextInt();
        for(int i = 1; i<=queryPiece; i++){
            int row = scanner.nextInt()-1;
            int col = scanner.nextInt()-1;
            try{
                System.out.println(numbers.get(row).get(col));
            }catch(Exception ex){
                System.out.println("ERROR!");
            }
        }
        scanner.close();
    }
}
