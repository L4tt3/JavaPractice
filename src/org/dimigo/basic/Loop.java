package org.dimigo.basic;

import java.util.*;

public class Loop {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int i = 0;
        int[] attackPoint = {100, 100, 100, 100};
        String[] character = {"마법사", "영주", "기사", "농민"};
        int cha_n = 100;
        do {
            System.out.print("--------------------\n<< 게임 메뉴 >>\n1. 캐릭터 설정\n2. 공격력 증가\n3. 공격력 감소\n9. 종료\n--------------------\n메뉴 입력 => ");
            i = scan.nextInt();
            switch(i) {
                case 1:
                    int a = cha_n;
                    do {
                        cha_n = random.nextInt(4);
                    }while(cha_n == a);
                    System.out.println(character[cha_n] + "(으)로 설정되었습니다.");
                    break;
                case 2:
                    if (cha_n > 3) {
                        System.out.println("먼저 캐릭터를 설정하세요!!");
                    } else {
                        attackPoint[cha_n] += 10;
                        System.out.println(character[cha_n] + " 공격력이 증가되었습니다. 현재 공격력 : " + attackPoint[cha_n]);
                    }
                    break;
                case 3:
                    if (cha_n > 3) {
                        System.out.println("먼저 캐릭터를 설정하세요!!");
                        break;
                    } else {
                        attackPoint[cha_n] -= 10;
                        if(attackPoint[cha_n] < 0) {
                            attackPoint[cha_n] = 0;
                            System.out.println(character[cha_n] + " 공격력은 더이상 내려갈 수 없습니다. 현재 공격력 : 0");
                        }
                        else
                            System.out.println(character[cha_n] + " 공격력이 감소되었습니다. 현재 공격력 : " + attackPoint[cha_n]);
                    }
                    break;
                case 9:
                    System.out.print("이제 공부하세요!");
                    scan.close();
                    break;
                default:
                    System.out.println("없는 메뉴입니다!!");
            }
        }while(i != 9);
    }
}
