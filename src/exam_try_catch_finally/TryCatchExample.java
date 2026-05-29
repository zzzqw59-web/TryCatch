package exam_try_catch_finally;

import java.util.Scanner;

public class TryCatchExample {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;

        while(true) {
            try {
                System.out.println("정수를 입력하세요.");
                String input = scanner.nextLine();

                // 아무것도 입력하지 않고 엔터를 입력한 경우
                if (input.isBlank()) {
                    System.out.println("입력값이 없습니다. 정수를 입력하세요.");
                    continue;
                }

                // 문자열을 정수로 변환
                number = Integer.parseInt(input);

                // 정수 변환에 성공
                break;
            } catch (NumberFormatException e) {
                System.out.println("잘못된 입력입니다. 정수를 입력하세요.");
            }
        }
        System.out.println("입력받은 수: " + number);
        scanner.close();
    }
}
