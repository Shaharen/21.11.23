import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		// ��� ���ϱ�
		// 12 -> ��� : 12�� ����� 1 2 3 4 6 12 �Դϴ�. ���

		Scanner sc = new Scanner(System.in);

		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		// 1)
		System.out.print(num + "�� ����� ");
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println("�Դϴ�.");

		// 2)
		System.out.print(num + "�� ����� ");
		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				System.out.print(i + " , ");
			}
		}
		System.out.print(num);
		System.out.println("�Դϴ�.");

		// 3)
		System.out.print(num + "�� ����� ");
		for (int i = 1; i <= num / 2; i++) {  // ����� ����
			if (num % i == 0) {
				System.out.print(i + " , ");
			}
		}
		System.out.print(num);
		System.out.println("�Դϴ�.");

	}

}
