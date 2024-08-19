package week1;

import java.util.Scanner;

public class Baekjoon10828 {

    private static int stack[];
    private static int top = -1;
    private static int size;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();
        stack = new int[size];

        for (int i = 0; i < size; i++){
            String str = sc.next();

            switch (str){
                case "push":
                    push(sc.nextInt());
                    break;

                case "pop":
                    System.out.println(pop());
                    break;

                case "top":
                    System.out.println(top());
                    break;

                case "empty":
                    System.out.println(isEmpty());
                    break;

                case "size":
                    System.out.println(size());
                    break;
            }
        }
        sc.close();
    }

    // static 으로 작성해야 인식가능
    public static void push(int value){
        if (top >= size - 1){
            throw new StackOverflowError();
        }
        stack[++top] = value;
    }

    public static int pop(){
        if(isEmpty() == 1){
            return -1;
        }
        return stack[top--];
    }

    public static int isEmpty(){
        if (top <= -1){
            return 1;
        }
        return 0;
    }

    public static int top(){
        if(isEmpty() == 1){
            return -1;
        }
        return stack[top];
    }

    public static int size(){
        return top + 1;
    }
}
