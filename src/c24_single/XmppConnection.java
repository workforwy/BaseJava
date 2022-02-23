package c24_single;

public class XmppConnection {
    private static XmppConnection instance;

    private XmppConnection() {
        try {
            Thread.currentThread().sleep(300);
        } catch (Exception e) {
        }
    }

    public synchronized static XmppConnection newInstance() {
        if (instance == null) {
            long startTime = System.currentTimeMillis();
            instance = new XmppConnection();
            long endTime = System.currentTimeMillis();
            System.out.println("" + (endTime - startTime));
        }
        return instance;
    }
}
