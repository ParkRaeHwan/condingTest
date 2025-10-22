package sparta.level2;

// Programmers 최소직사각형
/*
    문제 : 모든 명함이 들어갈수있는 명함지갑의 크기를 구하는 로직 작성
          (모든 명함의 가로, 세로 길이가 2차원 배열로 주어지며,
          이때 명함의 길이를 통해 모든 명함이 들어갈 지갑의 크기를 계산)
          (1 <= 지갑크기(sizes) <= 10000, sizes = [w,h], w = 명함 가로 길이, h = 명함 세로 길이, 1 <= w, h <= 1000)
    풀이 : 각 명함의 크기 w, h 를 비교해 더 큰값을 w 로 고정 한뒤 모든 명함을 비교해 최댓값을 구하며,
          동일하게 더작은값 h 중 최댓값을 구해 모든 명함이 들어갈수 있는 지갑 크기를 계산
 */
public class No44 {
    public static void main(String[] args) {
        int[][] sizes = {{60,50}, {30,70}, {60,30}, {80,40}};
        int w = 0;
        int h = 0;

        for (int i = 0; i < sizes.length; i++) {
            if (sizes[i][0] > sizes[i][1]) {
                w = Math.max(sizes[i][0], w);
                h = Math.max(sizes[i][1], h);
            } else {
                w = Math.max(sizes[i][1], w);
                h = Math.max(sizes[i][0], h);
            }
        }

//      iter 사용한 리팩토링 ()
//        for (int[] size : sizes) {
//            w = Math.max(w, Math.max(size[0], size[1]));
//            h = Math.max(h, Math.min(size[0], size[1]));
//        }

        System.out.println(w * h);
    }
}
