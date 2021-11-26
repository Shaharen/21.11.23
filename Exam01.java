import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		// 약수 구하기
		// 12 -> 결과 : 12의 약수는 1 2 3 4 6 12 입니다. 출력

		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		// 1)
		System.out.print(num + "의 약수는 ");
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println("입니다.");

		// 2)
		System.out.print(num + "의 약수는 ");
		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				System.out.print(i + " , ");
			}
		}
		System.out.print(num);
		System.out.println("입니다.");

		// 3)
		System.out.print(num + "의 약수는 ");
		for (int i = 1; i <= num / 2; i++) {  // 약수의 성질
			if (num % i == 0) {
				System.out.print(i + " , ");
			}
		}
		System.out.print(num);
		System.out.println("입니다.");

	}

}
