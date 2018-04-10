package firstTask;

public class VariableStorage {
    int start, end;
    String firstTreeNumberOfIpAdress;

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }

    public String getFirstTreeNumberOfIpAdress() {
        return firstTreeNumberOfIpAdress;
    }

    public VariableStorage(int start, int end, String s) {
        this.start = start;
        this.end = end;

        this.firstTreeNumberOfIpAdress = s;
    }
}
