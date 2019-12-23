package com.lesson.lesson3;


public class Main {

    public static void main(String[] args) {
//        ReversString str = new ReversString("А роза упала на лапу Азора");
//        str.reversString();
//    }

Deque<Integer> deq = new Deque();
        deq.insertRight(5);
        deq.insertLeft(8);
        deq.insertRight(7);
        System.out.println(deq.getRight());
        System.out.println(deq.getLeft());
        System.out.println(deq.getLeft());



    }
}