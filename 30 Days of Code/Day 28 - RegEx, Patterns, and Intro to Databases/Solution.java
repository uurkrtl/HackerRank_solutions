//
//  Day 28: RegEx, Patterns, and Intro to Databases
//  HackerRank-Solutions/30 Days of Code
//
//  Created by Ugur Kartal on 19/11/2023
//  Copyright © 2023 Ugur Kartal. All rights reserved.
//

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
        
        // List to store names of people with Gmail accounts
        List<String> gmailUsers = new ArrayList<>();

        // Define regex patterns for first name and email ID validation
        String firstNamePattern = "[a-z]{1,20}";
        String emailIDPattern = "[a-z]{1,50}\\.?[a-z]{1,50}@[a-z]{1,50}\\.[a-z]{1,10}";

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, N).forEach(NItr -> {
            try {
                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                String firstName = firstMultipleInput[0];

                String emailID = firstMultipleInput[1];
                
                // Check if the first name and email ID match the regex patterns and if the email address ends with "@gmail.com"
                if (firstName.matches(firstNamePattern) && emailID.matches(emailIDPattern) && emailID.endsWith("@gmail.com")) {
                    // Add the first name to the list
                    gmailUsers.add(firstName);
                }
                
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        // Sort the list alphabetically
        Collections.sort(gmailUsers);

        // Print the names of people with Gmail accounts
        for (String name : gmailUsers) {
            System.out.println(name);
        }
        
        bufferedReader.close();
        
        
    }
}