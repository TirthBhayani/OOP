import java.text.SimpleDateFormat;
import java.util.*;

public class array {
	public static void main(String args[]) {
		System.out.println("Name: Tirth Bhayani");
		System.out.println("220170116004");
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = new Date();
		System.out.println(formatter.format(date));
		long startTime = System.currentTimeMillis();
		Scanner sc = new Scanner(System.in);

		int a[][] = new int[6][6];
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		print(a);
		checkrow(a);
		checkcols(a);

		long endTime = System.currentTimeMillis();
		long executionTime = endTime - startTime;
		System.out.println("Execution time: " + executionTime + " nanoseconds");
		System.out.println(" ");
	}

	public static void print(int a[][]) {
		for (int j = 0; j < 6; j++) {
			for (int k = 0; k < 6; k++) {
				System.out.print(a[j][k] + " ");
			}
			System.out.println();
		}
	}

	public static void checkrow(int a[][]) {
		int count;
		for (int i = 0; i < 6; i++) {
			count = 0;
			for (int j = 0; j < 6; j++) {
				if (a[i][j] == 1) {
					count++;
				}
			}
			if (count % 2 == 0) {
				System.out.println("row - " + i + " not having odd num of 1");
			} else {
				System.out.println("row - " + i + " having odd num of 1");
			}

		}
	}

	public static void checkcols(int a[][]) {
		int count1;
		for (int i = 0; i < 6; i++) {
			count1 = 0;
			for (int j = 0; j < 6; j++) {

				if (a[j][i] == 1) {
					count1++;
				}
			}
			if (count1 % 2 == 0) {
				System.out.println("colum - " + i + " not having odd num of 1");
			} else {
				System.out.println("column - " + i + " having odd num of 1");
				;
			}
		}
	}
}
