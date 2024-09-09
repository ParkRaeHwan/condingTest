package week4.concept;

public class BinarySearch {
    // 탐색할 배열 (정렬 되어있음)
    static int[] arr = {1, 3, 5, 7, 8, 10, 20, 35, 99, 100};

    public static void main(String[] args) {
        // 재귀 호출
        System.out.println(binarySearch1(5, 0, arr.length-1));
        // 반복문 사용
        System.out.println(binarySearch2(20, 0, arr.length-1));

    }

    // 재귀
    static int binarySearch1(int key, int low, int high) {
        // 중앙값
        int mid;

        // low 값이 high 보다 큰경우 탐색값 존재 X
        if(low <= high) {
            mid = (low + high) / 2;

            if(key == arr[mid]) { // 탐색 성공
                return mid;
            } else if(key < arr[mid]) {
                return binarySearch1(key ,low, mid-1); // 왼쪽 부분 탐색
            } else {
                return binarySearch1(key, mid+1, high); // 오른쪽 부분 탐색
            }
        }
        return -1; // 탐색값 존재 X
    }

    // 반복문
    static int binarySearch2(int key, int low, int high) {
        int mid;

        while(low <= high) {
            mid = (low + high) / 2;

            if(key == arr[mid]) {
                return mid;
            } else if(key < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1; // 탐색 실패
    }

}
