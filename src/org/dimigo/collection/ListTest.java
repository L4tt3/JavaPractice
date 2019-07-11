package org.dimigo.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListTest {
    public static void main(String[] args) {
        //List : ArrayList
       /* List list = new ArrayList();
        list.add("빽");
        list.add(2048);
        list.add(true);
        list.add(new Scanner(System.in));*/

       //제네릭
        List<String> list = new ArrayList<>();
        list.add("사과");
        list.add("배");
        list.add("딸기");
        list.add("딸기");
        list.add(1,"포도");
        list.set(2,"바나나");
        System.out.println(list.get(list.size()-1));

        //list.add(123);

        printList(list);
        list.clear();
        printList(list);
    }

    public static void printList(List<String> list){
        for(String value : list){
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
