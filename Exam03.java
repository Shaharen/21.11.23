
public class Exam03 {

	public static void main(String[] args) {
		// 1���� 1000 �� ������ ã��

		for (int i = 2; i <= 1000; i++) {
			int sum = 0;
			for (int j = 1; i / 2 >= j; j++) {
				if (i % j == 0) {
					sum = sum + j;
				}
			}
			if (sum == i) {
				System.out.println(i);
			}

		}

	}
}
