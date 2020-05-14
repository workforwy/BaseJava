package com.wy.single;

public class XmppConnection {
	private static com.wy.single.XmppConnection instance;

	private XmppConnection() {
		try {
			Thread.currentThread().sleep(300);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public synchronized static com.wy.single.XmppConnection newInstance() {
		if (instance == null) {
			long startTime=System.currentTimeMillis();
			instance = new com.wy.single.XmppConnection();
			long endTime=System.currentTimeMillis();
			System.out.println(""+(endTime-startTime));
		}
		return instance;
	}
}
