package week4;

import java.io.IOException;
import java.util.Arrays;

// 4-1
public class Programmers {

    public static void main(String[] args) throws IOException {
        System.out.println(solution(6, new int[]{7, 10}));
    }


    static long solution(int n, int[] times) {
        // 결과 시간
        long answer = 0;
        Arrays.sort(times);
        long left = 0;
        // 가장 느린 심사시간
        long right = times[times.length-1] * (long)n;

        while(left <= right) {
            // 해당 시간 (Binary Search 이용해 최대 시간 기준으로 탐색)
            long mid = (left + right) / 2;
            // 해당 시간에 수행 가능한 인원
            long complete = 0;
            // 각 심사관별 해당 시간에 수행가능한 인원 체크
            for (int i = 0; i < times.length; i++) {
                complete += mid / times[i];
            }
            // 해당 시간에는 모든 사람이 검사받을 수 없음 (시간 증가)
            if (complete < n) {
                left = mid + 1;
            }
            // 모두 검사받았으나, 더 최솟값이 있을 수 있으므로 더 탐색 (시간 감소)
            else {
                right = mid - 1;
                answer = mid;
            }
            System.out.println(left + " " + right);
        }

        return answer;
    }

}
