package firstTask;

import java.util.ArrayList;

public class IPadress {
    String firstIpAdress, secondIpAdress;


    public IPadress(String ipAddressString, String ipAddressString2) {
        this.firstIpAdress = ipAddressString;
        this.secondIpAdress = ipAddressString2;
    }


    public VariableStorage parseStringIp() {
        String[] arrayF = firstIpAdress.split("\\D");
        String[] arrayS = secondIpAdress.split("\\D");
        int start = Integer.parseInt(arrayF[arrayF.length - 1]);
        int end = Integer.parseInt(arrayS[arrayS.length - 1]);
        String firstThreNumberOfIpAdress = arrayF[0] + arrayF[1] + arrayF[2];
        return new VariableStorage(start, end, firstThreNumberOfIpAdress);
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
