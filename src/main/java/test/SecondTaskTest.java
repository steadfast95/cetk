package test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import secondTask.PhoneBook;

@RunWith(JUnit4.class)
public class SecondTaskTest {
    @Test
    public void addIntoPhoneListTest() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.useAddIntoList();
        String numberOne = "+8 800 2000 500";
        String numberTwo = "+8 800 2000 600";
        String numberThree = "+8 800 2000 700";
        String numberFour = "+8 800 2000 800";
        String numberFive = "+8 800 2000 900";
        String numberSix = "+8 800 2000 000";
        Assert.assertEquals(numberOne, phoneBook.getListOfNumber().get(0));
        Assert.assertEquals(numberTwo, phoneBook.getListOfNumber().get(1));
        Assert.assertEquals(numberThree, phoneBook.getListOfNumber().get(2));
        Assert.assertEquals(numberFour, phoneBook.getListOfNumber().get(3));
        Assert.assertEquals(numberFive, phoneBook.getListOfNumber().get(4));
        Assert.assertEquals(numberSix, phoneBook.getListOfNumber().get(5));
    }

    @Test
    public void addIntoPhoneBookTest() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.useAddIntoBook();
        String firstKey, secondKey, threeKey;
        String firstValue, secondValue, threeValue;
        firstKey = "ИвановИ.И.";
        secondKey = "ПетровП.П.";
        threeKey = "СидоровС.С.";
        firstValue = "+8 800 2000 500 +8 800 2000 600";
        secondValue = "+8 800 2000 700";
        threeValue = "+8 800 2000 800 +8 800 2000 900 +8 800 2000 000";

        Assert.assertTrue(phoneBook.getBook().containsKey(firstKey));
        Assert.assertTrue(phoneBook.getBook().containsKey(secondKey));
        Assert.assertTrue(phoneBook.getBook().containsKey(threeKey));
        Assert.assertEquals(firstValue, phoneBook.getBook().get(firstKey));
        Assert.assertEquals(secondValue, phoneBook.getBook().get(secondKey));
        Assert.assertEquals(threeValue, phoneBook.getBook().get(threeKey));

    }
}
