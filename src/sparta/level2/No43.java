package sparta.level2;

// Programmer 크기가 작은 부분문자열
/*
    문제 : 숫자로 이루어진 문자열 t, p가 주어졌을때 t에서 p의 길이와 같은 부분문자열줄
          p 보다 더 작거나 같은수를 나타내는 부분문자열의 횟수를 반환하는 로직작성
          (1 <= p.length <= 18, p.length <= t.length <= 10000, t, p != 0)
    풀이 : 문자열 t 를 처음 요소부터 문자열 p의 길이만큼 잘라서 비교후 작거나 같은경우 횟수 갱신
 */
public class No43 {
    public static void main(String[] args) {
        String t = "2000";
        String p = "5";
        int result = 0;

        for (int i = 0; i <= t.length() - p.length(); i++) {
            String substring = t.substring(i, i + p.length());
            // 제한 사항에서 문자열의 길이를 의미했으므로 Integer 보다 큰 범위의 숫자가 들어오는경우 오류 발생 가능하므로 Long 타입으로 변환해 처리
            // (18 길이의 숫자의 경우 Integer 크기를 초과)
            if (Long.parseLong(substring) <= Long.parseLong(p)) {
                result++;
            }
        }
        System.out.println(result);
    }
}
