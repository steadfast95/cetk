package secondTask;

import java.util.HashMap;
import java.util.Scanner;


public class SecondTask {
    public static void main(String[] args) {
        PhoneBook book = new PhoneBook();
        book.useAddIntoBook();
        book.useAddIntoList();
        HashMap<String, String> phoneBook = book.getBook();
        book.getListOfNumber();
        Scanner fromKeyB = new Scanner(System.in);
        String s = fromKeyB.nextLine().replaceAll(" ", "");

        for (String number : book.getListOfNumber()) {
            if (phoneBook.get(s).contains(number)) {
                System.out.println(number);
            }
        }
    }
}
