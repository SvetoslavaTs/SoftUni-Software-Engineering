package LabTextProcessing;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // String str = new String(new char[]{'s', 't', 'r'});
        //char[] charArr = str.toCharArray();
        // ['s', 't', 'r']

        // String a = "abc";
        // String b = scanner.nextLine();
        //System.out.println(a==b);

        //String s = "Hello";
        //int v = 42;
        //System.out.println(s+v);

        //String text = "Hello and goodbye";
        // String subText = text.substring(9);
        //System.out.println(subText);

        // String fruits = "banana, apple, kiwi, banana, apple";
        // System.out.println(fruits.indexOf("banana"));
        //System.out.println(fruits.indexOf("orange"));

        //String fruits = "banana, apple, kiwi, banana, apple";
        //System.out.println(fruits.lastIndexOf("banana"));
        //System.out.println(fruits.lastIndexOf("orange"));

        StringBuilder sb = new StringBuilder();
        sb.append("Hello Peter, how are you?");
        System.out.println(sb);

        System.out.println(sb.length());

        System.out.println(sb.charAt(1));

        sb.insert(11, " Ivanov");
        System.out.println(sb);

        sb.replace(6, 11, "George");
        System.out.println(sb);

        String text = sb.toString();
        System.out.println(text);


    }
}
