package sparta.level2;

// Programmers 행렬의 덧셈
/*
    문제 : 행, 열의 크기가 동일한 두 행렬의 같은 행, 같은 열의 값을 서로 다한 결과 반환하는 로직 작성
    풀이 : 2차원 배열에서 첫번째 인덱스는 행, 두번째 인덱스는 열을 나타내므로
          입력받은 arr 와 동일한 크기의 결과 2차원배열을 생성후, 반복문을 통해 인덱스를 지정해각 행, 열을 계산해 결과 계산
 */
public class No37 {
    public static void main(String[] args) {
        int[][] arr1 = {{1,2}, {2,3}};
        int[][] arr2 = {{3,4}, {5,6}};

        int[][] result = new int[arr1.length][arr1[0].length];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                result[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
        }
    }
}
