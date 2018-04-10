package secondTask;

/*  Иванов И.И. +8 800 2000 500 +8 800 200 600
    Петров П.П. +8 800 2000 700
    Сидоров С.С. +8 800 2000 800 +8 800 2000 900 +8 800 2000 000*/
public class SecondTask {
    public static void main(String[] args) {
        PhoneBook book = new PhoneBook();
        book.useAddIntoBook();
        book.useAddIntoList();
        book.getBook();
        book.getListOfNumber();


    }
}
