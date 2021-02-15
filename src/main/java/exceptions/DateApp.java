package exceptions;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class DateApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Write date like this: rrrr-mm-dd");
            String str = scanner.nextLine();
            try{
                LocalDate date = LocalDate.parse(str);
                System.out.println("Correct date: " + date);
                break;
            } catch (DateTimeParseException e){
                System.out.println("Incorrect date's format");
            }
        }
    }

}
