package firstTask;

import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
        /*
        body - первые 3 числа в ip адрессе
       body у ip адресов  должны быть равны для корректной
       работы программы, т.к небыло учтено что они могут быть разными (см. пр.)
        */
        System.out.println("1: ");
        System.out.println("waiting for two ip: ");
        Scanner fromKeyB = new Scanner(System.in);
        String s = fromKeyB.next();
        String ss = fromKeyB.next();

        IPadress iPadress = new IPadress(s, ss);
        DoubleInt adv = iPadress.pareStringIp();
        String body = adv.s;
        int start = adv.x;
        int end = adv.y;

        for (String z : iPadress.genereteListOfIpaddress(start, end, body)) {
            System.out.println(z);
        }


    }
}
