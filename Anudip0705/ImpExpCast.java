package Anudip0705;
// JavaPractice - 2
// 2.Write a program for implicit and explicit type casting

public class ImpExpCast {
	public static void impExpCast() {
		//implicit Casting --> No Loss of Data
		int n = 50;
		double d = n;
		System.err.println("Implicit Cast From int("+n+") to double:"+d);
		
		//Explicit Cast --> Loss of Some Data
		
		d = 50.20;
		n = (int)d;
		
		System.err.println("Explicit Cast From double("+d+") to int:"+n);
	}

	public static void main(String[] args) {
		ImpExpCast.impExpCast();

	}

}
