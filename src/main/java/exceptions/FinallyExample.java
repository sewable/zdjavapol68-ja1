package exceptions;

import java.util.Scanner;

public class FinallyExample {

    public static int parse(String str){
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e){
            return 0;
        //blok finally dominuje nad wszystkimi return-ami w metodzie
        //i tylko jego return zwróci wartość z metody
        } finally {
            return -1;
        }
    }

    public static void main(String[] args) {
        // ========================= PART ONE ========================
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        try{
            int number = Integer.parseInt(str);
            System.out.println("end " + number);
        } catch (NumberFormatException e){
            System.out.println("Incorrect number");
        }
        finally {
            System.out.println("END");
        }

        //========================== PART TWO =========================
        System.out.println();
        System.out.println("PART TWO");
        System.out.println(parse(str));
    }

}
