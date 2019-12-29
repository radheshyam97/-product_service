package com.radhe.product.logger;

public class AppLogger {

	private Class clazz;

	public AppLogger(Class clazz) {

		this.clazz = clazz;
	}

	public static AppLogger getLogger(Class clazz) {
		AppLogger logger = new AppLogger(clazz);
		return logger;
	}

	public void debug(String msg) {

		msg = formatMsg(msg);
		System.out.println(msg);
	}

	private String formatMsg(String msg) {
		return clazz.getName() + " " + msg;
	}

	public void info(String msg) {
		msg = formatMsg(msg);

		System.out.println(msg);
	}

	public void error(String msg) {
		msg = formatMsg(msg);

		System.out.println(msg);
	}

	public void debug(String msg, Throwable t) {
		msg = formatMsg(msg);

		System.out.println(msg);
		t.printStackTrace();

	}

	public void info(String msg, Throwable t) {
		msg = formatMsg(msg);

		System.out.println(msg);
		t.printStackTrace();

	}

	public void error(String msg, Throwable t) {
		msg = formatMsg(msg);

		System.out.println(msg);
		t.printStackTrace();

	}
}
