import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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
