package firstTask;

import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
        Scanner fromKeyB = new Scanner(System.in);
        String s = fromKeyB.next();
        String ss = fromKeyB.next();

        IPadress ipAdress = new IPadress(s, ss);
        VariableStorage variableStorage = ipAdress.parseStringIp();
        String body = variableStorage.firstTreeNumberOfIpAdress;
        int start = variableStorage.start;
        int end = variableStorage.end;

        for (String z : ipAdress.genereteListOfIpaddress(start, end, body)) {
            System.out.println(z);
        }


    }
}
