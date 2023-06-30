package DesignPattern.Prototype;

public class NetworkConnection implements Cloneable {
    public String ip;
    public String importantData;

    public String getIp() {
        return ip;
    }

    @Override
    public String toString() {
        return "NetworkConnection{" + "ip='" + ip + '\'' + ", importantData='" + importantData + '\'' + '}';
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getImportantData() {
        return importantData;
    }

    public void setImportantData(String importantData) {
        this.importantData = importantData;
    }

    public void loadImportantData() throws InterruptedException {
        //it will take more than 5 minuts
        System.out.println("Loading important data");
        Thread.sleep(5000);
    }

    @Override
    public NetworkConnection clone() {
        try {
            NetworkConnection clone = (NetworkConnection) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
