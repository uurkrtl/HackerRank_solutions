import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        int foundedChr = 0;
        char[] chr1 = a.toLowerCase().toCharArray();
        char[] chr2 = b.toLowerCase().toCharArray();
        if (chr1.length!=chr2.length) return false;
        for (char chr : chr1){
            for (int i = 0; i<chr2.length; i++){
                if (chr==chr2[i]){
                    chr2[i]=00;
                    foundedChr++;
                    break;
                }
            }
        }
        return foundedChr == chr1.length;
    }
    

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
