package Kalam;

public class Sumofarray {

	public static void main(String[] args) {

		int num = 8;
		int count = 0;
		int a[] = { 8, 3, 5, 4, 1, 7, 0 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] + a[j] == num) {
					System.out.println("pair number" + a[i] + " " + a[j]);
					count++;
				}

			}

		}
		System.out.println("no of pair= " + count);
	}
}
