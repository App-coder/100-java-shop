package com.shop.main;

/**
 * @author Administrator
 * 可以得到当前执行的方法和那个方法调用它的
 */
public final class GetCurrentClassAndMethod {

	public static void main(String[] args) throws Exception {
		getCurrentClassAndMethod();
	}

	public static void getCurrentClassAndMethod() throws Exception {
		StackTraceElement[] stacks;
		String data;

		stacks = (new Throwable()).getStackTrace();
		data = stacks[0].getClassName() + "." + stacks[0].getMethodName();
		System.out.println(data);

		System.out.println();
		System.out.println("---推荐使用上面的方法，在JDK1.5和JDK1.6下结果相同-----");
		System.out.println("-----------------------------------------------");
		System.out.println("---下面的方法，在JDK1.5和JDK1.6下结果相同-----------");
		System.out.println();

		stacks = Thread.currentThread().getStackTrace();
		data = stacks[1].getClassName() + "." + stacks[1].getMethodName();
		System.out.println(data);// JDK 1.6

		data = stacks[2].getClassName() + "." + stacks[2].getMethodName();
		System.out.println(data);// JDK 1.5

	}

}
