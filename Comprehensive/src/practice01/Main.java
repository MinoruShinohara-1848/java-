package practice01;

public class Main {

	public static void main(String[] args) {

		int[] answer = new int[4];
		int inputNumber;
		int i = 0;
		int j = 0;
		int number = 0;
		boolean judge;

		System.out.println("4桁の数値を入力して下さい。");
		System.out.print("[入力]>");
		inputNumber = new java.util.Scanner(System.in).nextInt();
		int input1 = inputNumber / 1000;
		int input2 = (inputNumber - 1000) / 100;


		for (i = 0; i < answer.length; i++) {

			judge = true;
			while (judge) {
				number = new java.util.Random().nextInt(10);
				judge = false;

				for (j = 0; j < i; j++) {
					judge = numberJudge(number, answer[j]);
					if (judge == true) {
						break;
					}
				}
				if (judge == false) {
					answer[i] = number;
					System.out.print(answer[i]);
				}
			}
		}

		//数値の判定
		for(j = 0; j <= inputNumber.length; j++) {

			inputNumberJudge(inputNumber[j], answer[i], j, i);

		}

	}

	public static boolean numberJudge(int number, int answer) {

		boolean judge;
		if (number == answer) {
			judge = true;
		} else {
			judge = false;
		}
		return judge;
	}

	public static void inputNumberJudge(int input, int answer, int j, int i) {

		if(input == answer) {
			if(i == j) {
				System.out.print("〇");
			}else {
				System.out.println("△");
			}
		}else {
			System.out.println("×");
		}

	}
}
