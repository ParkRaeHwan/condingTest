package week1.concept;

import java.util.EmptyStackException;

public class Stack<T> {

    private int top; // 스택의 최상단을 가르키는 포인터 (마지막으로 삽입된 데이터 위치)
    private int maxSize; // 스택의 크기
    private T[] stackArray; // 스택 구현 배열

    public Stack(int size) {
        this.maxSize = size;
        this.stackArray = (T[]) new Object[size];
        // top값이 -1로 초기화한 이유 : 배열은 선언시 0 ~ size - 1 까지 생성되기때문
        this.top = -1; // -1 = 스택이 비워져있는 상태 (초기화)
    }

    // 삽입 연산
    public void push(T value){
        // overflow 확인
        if(isFull()){
            throw new StackOverflowError("Stack is Full");
        }
        // top 증가후 삽입
        stackArray[++top] = value;
    }

    // 삭제 연산
    public T pop(){
        // underflow 확인
        if (isEmpty()){
            throw new EmptyStackException();
        }
        // return 후 top 감소
        return stackArray[top--];
    }

    public T peek(){
        if (isEmpty()){
            throw new EmptyStackException();
        }
        return stackArray[top];
    }

    // top 값이 -1 인경우 스택이 비워진 상태
    public boolean isEmpty() {
        return (top == -1);
    }

    // top 값이 maxSize와 동일한 경우 가득찬 상태
    public boolean isFull() {
        return (top >= maxSize - 1);
    }

    // 스택안 데이터 갯수 반환
    public int getSize(){
        return top + 1;
    }

    // 확인용 main 메서드
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>(10);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.pop()); // 30 return
        System.out.println(stack.peek()); // 20 return
        System.out.println(stack.getSize()); // 2 return
    }

}
