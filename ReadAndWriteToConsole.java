package gettingstartedwithjava;

import java.util.Scanner;

public class ReadAndWriteToConsole {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        while(reader.hasNext()){
            String word = reader.nextLine();
            System.out.println(word);
        }
    }
}
