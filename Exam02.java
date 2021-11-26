
public class Exam02 {

	public static void main(String[] args) {
		// 업그레이드된 약수 구하기
		// 2부터 30까지의 약수 출력
		for (int i = 2; i <= 30; i++) {
			System.out.print(i + "의 약수 : ");
			for (int j = 1; j <= i / 2; j++) {
				if (i % j == 0) {
					System.out.print(j + " ");
				}
			}
			System.out.println(i);
		}

	}

}
