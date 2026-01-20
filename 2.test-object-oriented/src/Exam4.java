public class Exam4 {
    public static void main(String[] args) {
        int result1 =  Calculation.addition(5,3);
        int result2 = Calculation.subtraction(5,3);
        int result3 = Calculation.multiplication(5,3);
        int result4 = Calculation.division(5,3);
        int result5 = Calculation.remainder(5,3);

        System.out.println("足し算結果:" + result1);
        System.out.println("引き算結果:" + result2);
        System.out.println("掛け算結果:" + result3);
        System.out.println("割り算結果:" + result4);
        System.out.println("剰余算結果:" + result5);
    }
}
