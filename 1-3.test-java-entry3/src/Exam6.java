public class Exam6 {
    public static void main(String[] args) {
        int answer = calc(2, 3, '+');
        System.out.println("第1引数:" + num1 +"、"+ "第2引数:" + num2 +"、"+ "第3引数:" + num3 + "⇒" + "結果が" + answer + "になること");
    }

    static int calc(int num1, int num2, char num3) {
        if (num3 != '-' || num3 != '*' || num3 != '/') {
            int result1 = -1;
        } else {
            int result2 = num1 + num3 + num2;
        }
        return();
    }
}
