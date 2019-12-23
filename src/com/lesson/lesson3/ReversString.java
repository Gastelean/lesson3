package com.lesson.lesson3;

public class ReversString {
    private String s;
    private String reS;

    public ReversString(String s) {
        this.s = s;
    }

    public void reversString() {

        MyStack<Character> stack = new MyStack<>(s.length());
        for (int i = 0; i < s.length(); i++) {
            char str = s.charAt(i);
            stack.push(str);
        }
        for (int i = 0; i < s.length(); i++) {
            System.out.print(stack.pop());
        }

    }
}
