package p16608;

import java.util.Scanner;

public class Q08 {
	public static void main(String[] args) {
		System.out.print("정수 몇개?");
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();

		int num[] = new int[cnt];
		int size = 0;
		while (true) {
			int tmp = (int) (Math.random() * 100 + 1);
			int found = 0;
			for (int i = 0; i < num.length; i++) {
				if (num[i] == tmp) {
					found = 1;
					break;
				}
			}
			if (found == 0) {
				num[size] = tmp;
				size++;
			}
			if (size == cnt)
				break;
		}

		for (int i = 1; i <= num.length; i++) {
			System.out.print(num[i - 1] + " ");
			if (i % 10 == 0)
				System.out.println();
		}
	}
}
