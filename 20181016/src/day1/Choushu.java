package day1;

import java.util.Scanner;

public class Choushu {
	@SuppressWarnings("resource")
	public static void main(String [] args) {
		
		long [] a = new long[10];
		long begin = System.currentTimeMillis();
		Scanner scanner = new Scanner(System.in);
		System.out.print("ÊäÈë£º");
		int input = scanner.nextInt();

		while (input % 2 == 0 || input % 3 == 0 || input % 5 == 0) {
			if (input % 2 == 0) {
				input = input / 2;
			} else if (input % 3 == 0) {
				input = input / 3;
			} else if (input % 5 == 0) {
				input = input / 5;
			}
		}
		if(input == 1) {
			System.out.println("Êä³ö£º ture");
		}else {
			System.out.println("Êä³ö£º false");
		}
		long end = System.currentTimeMillis();
		System.out.println("time:" + (end - begin));
		System.out.println(a[2]);

	}

}
