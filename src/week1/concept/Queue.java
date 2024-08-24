package week1.concept;

// 선형 큐 구현
public class Queue<T> {

    private int front; // 큐의 앞부분(먼저 삽인된 데이터 위치)
    private int rear; // 큐의 뒷부분(마지막으로 삽인된 데이터 위치)
    private int maxSize; // 큐의 크기
    private T[] queueArray; // 큐 구현 배열
    private int nItems; // 큐안 데이터의 수

    public Queue(int maxSize) {
        this.maxSize = maxSize;
        this.queueArray = (T[]) new Object[maxSize]; // 초기화
        this.front = 0;
        this.rear = -1;
        this.nItems = 0;
    }

    // 삽입 연산
    public void enqueue(T value){
        if (isFull()){
            throw new RuntimeException("Queue is Full");
        }
        queueArray[++rear] = value;
        nItems++;
    }

    // 삭제 연산
    public T dequeue(){
        if (isEmpty()){
            throw new RuntimeException("Queue is Empty");
        }
        // 앞단의 데이터를 복사해둔뒤 반환
        T temp = queueArray[front];
        queueArray[front] = null;
        front++;
        nItems--;
        return temp;
    }

    public T peek(){
        if (isEmpty()){
            throw new RuntimeException("Queue is Empty");
        }
        return queueArray[front];
    }

    public int getSize(){
        return nItems;
    }

    public boolean isFull(){
        return nItems == maxSize;
    }

    public boolean isEmpty(){
        return nItems == 0;
    }

    // 확인용 main 메서드
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>(10);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println(queue.dequeue()); // return 10
        System.out.println(queue.peek()); // return 20
        System.out.println(queue.getSize()); // return 2

    }
}
