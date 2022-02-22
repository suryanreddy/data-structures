package com.java11.features;

public interface InterfaceEx {

	public static void method() {
		System.out.println("InterfaceEx.method()");
	}
	
	public static void method2() {
		System.out.println("InterfaceEx.method2()");
	}
	
	public static void method3() {
		System.out.println("InterfaceEx.method3()");
	}
	
	static void method4(){
		System.out.println("InterfaceEx.enclosing_method()");
	}
	
	static void method5() {
		System.out.println("InterfaceEx.method5()");
	}
	
	private static void method6() {
		System.out.println("InterfaceEx.method6()");
	}
	
	abstract void method7();
	public abstract void method8();
	
	
}
