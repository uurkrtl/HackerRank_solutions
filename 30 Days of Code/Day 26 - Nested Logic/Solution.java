import java.io.*;
import java.util.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        LocalDate returnedDate = getDate(scanner);
        LocalDate dueDate = getDate(scanner);

        if (returnedDate.isBefore(dueDate) || returnedDate.isEqual(dueDate)){
            System.out.println(0);
        }else if (returnedDate.getMonth() == dueDate.getMonth() && returnedDate.getYear() == dueDate.getYear()){
            System.out.println(15*(returnedDate.getDayOfMonth()-dueDate.getDayOfMonth()));
        }else if (returnedDate.getYear() == dueDate.getYear()){
            System.out.println(500 * (returnedDate.getMonthValue()-dueDate.getMonthValue()));
        }else{
            System.out.
            println(10000);
        }
    }
    
    private static LocalDate getDate(Scanner scanner){
        int dayOfMonth = scanner.nextInt();
        int month = scanner.nextInt();
        int year = scanner.nextInt();
        return LocalDate.of(year, month, dayOfMonth);
    }
}