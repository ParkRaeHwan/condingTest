package sparta.level2;

// Programmers 시저 암호
/*
    문제 : 시저 암호 = 문장의 각 알파벳을 일정 거리만큼 밀어서 다른 알파벳으로 바꾸는 암호화 방식
          문자열 s, 거리 n 을 입력받아 s를 n 만큼 민 암호문을 만드는 로직 작성
          (공백은 밀어도 공백, s는 소문자/대문자/공백, s.length <= 8000, 1 <= n <= 25)
    풀이 : 4가지 경우 고려해 코드 작성 1. 공백 2. 소문자 범위 초과, 3. 대문자 범위 초과 4. 정상
          범위를 초과하는 경우 -26을 하여 다시 알파벳 아스키 코드 만큼 돌아가게 하며
          대문자인 경우 소문자로 넘어가는 것을 방지하기 위해 소문자 검증시 해당 문자가 소문자인지 확인 
 */
public class No45 {
    public static void main(String[] args) {
        String s = "Z B x";
        int n = 8;
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                result.append(" ");
            }
            else if ((65 <= s.charAt(i) + n && s.charAt(i) + n <= 90)
                    // 소문자 인지 확인
                    || (s.charAt(i) >= 97 && 97 <= s.charAt(i) + n  && s.charAt(i) + n <= 122)) {
                result.append((char) (s.charAt(i) + n));
            } else {
                result.append((char) (s.charAt(i) + n - 26));
            }
        }

        System.out.println(result);
    }
}
