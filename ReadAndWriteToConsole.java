package gettingstartedwithjava;

import java.util.Scanner;

public class ReadAndWriteToConsole {
    public static void main(String[] args) {
        // create a scanner object and pass System.in object as constructor argument
        Scanner reader = new Scanner(System.in);
        // while reader has data, keep the loop running
        while (reader.hasNext()) {
            // read data to word
            String word = reader.nextLine();
            // print the word
            System.out.println(word);
        }
    }
}
