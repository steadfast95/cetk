package secondTask;

import java.util.ArrayList;
import java.util.HashMap;

public class PhoneBook {
    private String name, phoneNumber;
    private HashMap<String, String> book = new HashMap<String, String>();
    private ArrayList<String> listOfNumber = new ArrayList<String>();

    public ArrayList<String> getListOfNumber() {
        return listOfNumber;
    }


    public PhoneBook() {
    }

    public HashMap<String, String> getBook() {
        return book;
    }

    private void addIntoPhoneBook(String name, String phoneNumber) {
        book.put(name, phoneNumber);
    }

    public void useAddIntoBook() {

        addIntoPhoneBook("ИвановИ.И.", "+8 800 2000 500 +8 800 2000 600");
        addIntoPhoneBook("Петров П.П.", "+8 800 2000 700");
        addIntoPhoneBook("Сидоров С.С.", "+8 800 2000 800 +8 800 2000 900 +8 800 2000 000");

    }

    private void addIntoListofNumber(String phoneNumber) {
        listOfNumber.add(phoneNumber);
    }

    public void useAddIntoList() {
        addIntoListofNumber("+8 800 2000 500");
        addIntoListofNumber("+8 800 2000 600");
        addIntoListofNumber("+8 800 2000 700");
        addIntoListofNumber("+8 800 2000 800");
        addIntoListofNumber("+8 800 2000 900");
        addIntoListofNumber("+8 800 2000 000");

    }
}
