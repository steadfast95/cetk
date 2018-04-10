package test;

import firstTask.IpAdress;
import firstTask.VariableStorage;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class firstTaskTest {
    @Test
    public void testParingIp() {
        String firstIpAdress = "192.168.0.1";
        String secondIpAdress = "192.168.0.5";
        IpAdress ipAdress = new IpAdress(firstIpAdress, secondIpAdress);
        VariableStorage variableStorage = new VariableStorage(1, 5, "192.168.0");
        VariableStorage testingParseStringIp = ipAdress.parseStringIp();

        Assert.assertEquals(variableStorage.getStart(), testingParseStringIp.getStart());
        Assert.assertEquals(variableStorage.getEnd(), testingParseStringIp.getEnd());
        Assert.assertEquals(variableStorage.getFirstTreeNumberOfIpAdress(), testingParseStringIp.getFirstTreeNumberOfIpAdress());
    }


    @Test
    public void generateListOfIpAdressTest() {
        int start = 1;
        int end = 3;
        String firstThreNumberOfIpAdress = "192.168.0";
        String defaultIpAdress = "192.168.0.2";
        IpAdress ipAdress = new IpAdress();

        Assert.assertEquals(defaultIpAdress, ipAdress.genereteListOfIpaddress(start, end, firstThreNumberOfIpAdress).get(0));
    }

    @Test
    public void variableStorageTest() {
        int start = 1;
        int end = 3;
        String firstThreNumberOfIpAdress = "192.168.0";
        VariableStorage variableStorage = new VariableStorage(start, end, firstThreNumberOfIpAdress);

        Assert.assertEquals(start, variableStorage.getStart());
        Assert.assertEquals(end, variableStorage.getEnd());
        Assert.assertEquals(firstThreNumberOfIpAdress, variableStorage.getFirstTreeNumberOfIpAdress());

    }
}
