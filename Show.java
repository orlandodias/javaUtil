package br.com.orlandodias.myutils.library;

import org.apache.commons.lang3.StringUtils;

public class Show {
	public static void printStack() {
		StackTraceElement[] stes = Thread.currentThread().getStackTrace();
		int i = 0;
		for (StackTraceElement s : stes) {
			System.out.println("ste: " + i++ + ":" + s.toString());
		}
	}

	public static String getMethodName() {
		StackTraceElement[] stes = Thread.currentThread().getStackTrace();
		if (stes.length >= (4)) {
			return stes[3].toString();
		} else {
			return null;
		}
	}

	public static void out(String msg) {
		System.out.println("---> ShowOut " + StringUtils.repeat("-", 50));
		String methodName = getMethodName();
		StringBuffer sb = new StringBuffer();
		if (methodName != null) {
			sb.append(methodName);
		}
		sb.append(": [");
		if (msg != null) {
			sb.append(msg);
		}
		sb.append("]");
		System.out.println(sb.toString());
	}

	public static void out(String msg, String charSep) {
		System.out.println("---> ShowOut " + StringUtils.repeat(charSep, 50));
		String methodName = getMethodName();
		StringBuffer sb = new StringBuffer();
		if (methodName != null) {
			sb.append(methodName);
		}
		sb.append(": [");
		if (msg != null) {
			sb.append(msg);
		}
		sb.append("]");
		System.out.println(sb.toString());
	}

	public static void out(String msg, Boolean showStack) {
		System.out.println("---> ShowOut " + StringUtils.repeat("-", 50));
		if (showStack == true) {
			printStack();
		}
		String methodName = getMethodName();
		StringBuffer sb = new StringBuffer();
		if (methodName != null) {
			sb.append(methodName);
		}
		sb.append(": [");
		if (msg != null) {
			sb.append(msg);
		}
		sb.append("]");
		System.out.println(sb.toString());
	}
}
