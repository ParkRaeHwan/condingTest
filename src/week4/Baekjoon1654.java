package week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 4-2 (4-1 과 동일한 유형)
public class Baekjoon1654 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int arr[] = new int[K];

        for (int i = 0; i < K; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        System.out.println(solution(arr, N));
        br.close();

    }

    static long solution(int arr[], int N){
        long min = 1;
        // k개의 랜선중 가장 길이가 긴 랜선을 기준으로 실행
        long max = arr[arr.length - 1];
        long result = 0;

        while(min <= max){
            long mid = (min + max) / 2;
            // 해당 길이에서 최대 제작가능한 랜선수
            int complete = 0;
            for (int i = 0; i < arr.length; i++){
                complete += (arr[i] / mid);
            }
            // 현재 길이(mid)에서 N개의 랜선 못만드는 경우 길이 감소시킴
            if (complete < N){
                max = mid - 1;
            }
            // 가능한 최대길이를 구하므로 길이 증가
            else {
                min = mid + 1;
                // 최대길이를 구하기 때문
                result = mid;
            }
        }
        return result;
    }
}
