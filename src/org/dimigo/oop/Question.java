package org.dimigo.oop;

import java.util.Random;
import java.util.Scanner;

public class Question {
    public static void main(String[] args) {
        String[ ] questions = {
                "가장 좋아하는 가수는?",
                "가장 좋아하는 배우는?",
                "가장 좋아하는 과목은?"
        };
        String[] answers = {
                "이토카시타로",
                "없음",
                "수학"
        };
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        int i, n;
        String input;
        StringBuilder sb = new StringBuilder("<< 정답 출력 >>\n");
        for(int a = 0 ; a < 3 ; a++)
            sb.append(questions[a]).append(" ").append(answers[a]).append("입니다.\n");
        do {
            System.out.println("------------------");
            System.out.println("1. 질문 선택");
            System.out.println("2. 정답 공개");
            System.out.println("9. 프로그램 종료");
            System.out.println("------------------");
            System.out.print("메뉴 선택 => ");
            i = s.nextInt();
            s.nextLine();
            switch (i) {
                case (1):
                    n = r.nextInt(3);
                    System.out.print(questions[n] + " ");
                    input = s.nextLine();
                    System.out.println(input.equals(answers[n]) ? "정답입니다!" : "틀렸습니다!");
                    break;
                case (2):
                    System.out.print(sb);
                    break;
                case (9):
                    System.out.println("Bye~");
                    break;
                default:
                    System.out.println("없는 메뉴입니다.");
                    break;
            }
        }while(i != 9);
    }
}
