package org.Practice;

public class Variables {
int b;
	private void Login() {
		int a=500;
		System.out.println(a);
	}
	
	static String name;
	public static void main(String[] args) {
		Variables v=new Variables();
		v.Login();
		System.out.println(v.b);
System.out.println();	
	}
}
