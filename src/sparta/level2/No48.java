package sparta.level2;

// Programmers K 번재 수
/*
    문제 :  기준 배열 array 에서 i ~ j 번째 까지 숫자를 자르고 정렬했을때 k 번째 있는 수를 구하려한다.
           이때 [i,j,k] 를 원소로 갖는 2차원 배열 commands 를 기준으로 결과를 계산해라
           (1 <= array.length <= 100 1 <= array[n] <= 100, 1 <= commands.length <= 50, commands[n].length == 3)
    풀이 : 1. temp 배열에 arr 배열의 i ~ j 번째 까지의 배열을 추출
          2. temp 배열 정렬
          3. 정렬된 temp 배열에서 k 번째 원소 추출 
          4. 위 과정을 commands 요소 수 만큼 반복
 */


import java.util.Arrays;

public class No48 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        int[] result = new int[commands.length];

        for (int j = 0; j < commands.length; j++) {
            int[] temp = new int[commands[j][1] - commands[j][0] + 1];
            int index = 0;
            for (int i = commands[j][0]; i <= commands[j][1]; i++) {
                temp[index] = arr[i - 1];
                index++;
            }
            Arrays.sort(temp);
            result[j] = temp[commands[j][2] - 1];
        }
        
        System.out.println(Arrays.toString(result));
    }
}

