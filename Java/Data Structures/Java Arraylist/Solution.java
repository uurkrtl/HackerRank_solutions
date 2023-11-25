import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int rowPiece = scanner.nextInt();
        ArrayList<ArrayList<Integer>> numbers = new ArrayList<ArrayList<Integer>>();
        for (int i=0; i<rowPiece; i++){
            ArrayList<Integer> numberRow = new ArrayList<>();
            int colPiece = scanner.nextInt();
            for (int j=0; j<colPiece;j++){
                numberRow.add(scanner.nextInt());
            }
            numbers.add(numberRow);
        }
        int queryPiece = scanner.nextInt();
        for(int i=0; i<queryPiece; i++){
            int row = scanner.nextInt();
            int col = scanner.nextInt();
            if(numbers.size()<row || numbers.get(row-1).size()<col){
                System.out.println("ERROR!");
            }else{
                System.out.println(numbers.get(row-1).get(col-1));
            }
        }
    }
}