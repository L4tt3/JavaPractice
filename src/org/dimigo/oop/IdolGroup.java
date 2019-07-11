package org.dimigo.oop;

public class IdolGroup {
    public static void main(String[] args) {
        String[] groupName = {"방탄", "2NE1", "걸스데이"};
        String[ ][ ] memberName = {
                {"정국", "지민", "뷔","슈가","진"},
                {"CL", "산다라박", "박봄", "민지"},
                {"유라", "혜리", "소진", "민아"}
        };
        for(int i = 0 ; i < groupName.length ; i++){
            System.out.println("<< "+groupName[i]+" >>");
            for(int j = 0 ; j <memberName[i].length ; j++){
                if(i!=groupName.length-1 || j!=memberName.length)
                    System.out.println(memberName[i][j]);
                else
                    System.out.print(memberName[i][j]);
            }
            if(groupName.length-1 != i)
                System.out.println();
        }
    }
}
