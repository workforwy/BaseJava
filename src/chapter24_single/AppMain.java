package chapter24_single;

public class AppMain {

    public static void main(String[] args) {
//		XmppConnection xmppConnection1=new XmppConnection();
//		System.out.println(xmppConnection1.toString());
//		
//		XmppConnection xmppConnection2=new XmppConnection();
//		System.out.println(xmppConnection2.toString());

        XmppConnection xmppConnection1 = XmppConnection.newInstance();
        System.out.println(xmppConnection1.toString());

        XmppConnection xmppConnection2 = XmppConnection.newInstance();
        System.out.println(xmppConnection2.toString());
    }
}
