package day1;

import java.util.Scanner;

public class Shusu {
	public static void main(String[] args) {
		long begin = System.currentTimeMillis();
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.print("�����룺");
		int input = scanner.nextInt();
		int count = 0;

		for (int i = 2; i <= input; i++) {
			boolean flag = false;
			for (int j = 2; j <= Math.sqrt(i); j++) {
				if (i % j == 0) {
					flag = true;
					break;
				}
			}
			if (flag == false) {
				count += 1;
			}
		}
		System.out.print("�����");
		System.out.println(count);
		long end = System.currentTimeMillis();
		System.out.print("ʱ�䣺");
		System.out.println(end - begin);

	}

}
