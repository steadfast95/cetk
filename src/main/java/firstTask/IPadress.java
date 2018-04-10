package firstTask;

import java.util.ArrayList;

public class IPadress {
    String ipAddressString, ipAddressString2;


    public IPadress(String ipAddressString, String ipAddressString2) {
        this.ipAddressString = ipAddressString;
        this.ipAddressString2 = ipAddressString2;
    }


    public DoubleInt pareStringIp() {
        String[] arrayF = ipAddressString.split("\\D");
        String[] arrayS = ipAddressString2.split("\\D");
        int start = Integer.parseInt(arrayF[arrayF.length - 1]);
        int end = Integer.parseInt(arrayS[arrayS.length - 1]);
        String body = arrayF[0] + arrayF[1] + arrayF[2];
        return new DoubleInt(start, end, body);
    }

    public ArrayList<String> genereteListOfIpaddress(int start, int end, String body) {
        ArrayList<String> listOfIpAddres = new ArrayList<String>();
        for (int i = start + 1; i < end; i++) {
            String ipAddres = body + "." + String.valueOf(i);
            listOfIpAddres.add(ipAddres);
        }

        return listOfIpAddres;
    }


}
