package programmers.level1;

public class StrToInt {
    public int getStrToInt(String str) {

        return Integer.valueOf(str);
    }
    //아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void main(String args[]) {
        StrToInt strToInt = new StrToInt();
        System.out.println(strToInt.getStrToInt("-1234"));
    }
}
