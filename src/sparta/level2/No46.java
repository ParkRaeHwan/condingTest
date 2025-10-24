package sparta.level2;

// Programmers 숫자 문자열과 영단어
/*
    문제 : 숫자의 일부 자릿수가 영단어로 바뀌었거나, 바뀌지 않았을때의 문자열 s 가 주어질때
          해당 문자열 s 가 의미하는 숫자를 반환하는 로직 작성
          (ex) one4seveneight -> 1478 반환)
          (1 <= s.length <= 50, s 가 zero/0 으로 시작 X, 1 <= 반환 값 <= 2000000000)
    풀이 : 문자열의 길이만큼 반복문을 돌아 각 문자 단위로 자른뒤 
          해당 문자가 숫자인 경우 result 에 추가
                    문자인경우 change 에 추가후, 해당 문자열이 숫자로 변환 가능한지 확인
                             가능 O : 숫자 변환, change 초기화
                             불가능 X : 다음 문자 확인
          위 과정을 통해 결과 확인
 */
public class No46 {
    public static void main(String[] args) {
        String s = "one4seveneight";
        String result = "", change = "";
        char word;

        for (int i = 0; i < s.length(); i++) {
            word = s.charAt(i);
            if ('0' <= word && word <= '9') {
                result += word;
            } else {
                change += word;
                switch (change) {
                    case "zero": result += "0"; change = ""; break;
                    case "one": result += "1"; change = ""; break;
                    case "two": result += "2"; change = "";  break;
                    case "three": result += "3"; change = ""; break;
                    case "four": result += "4"; change = ""; break;
                    case "five": result += "5"; change = ""; break;
                    case "six": result += "6"; change = ""; break;
                    case "seven": result += "7"; change = ""; break;
                    case "eight": result += "8"; change = ""; break;
                    case "nine": result += "9"; change = ""; break;
                }
            }
        }

        System.out.println(Integer.parseInt(result));
        
//        replace() 사용
//        String[] strArr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
//        for(int i = 0; i < strArr.length; i++) {
//            s = s.replace(strArr[i], Integer.toString(i));
//        }
    }
}
