public class Exam3 {
    public static void main(String[] args) {
        int price1 = 200;
        int price2 = 250;

        int count1 = 3;
        int count2 = 4;

        int subtotal = price1 * count1 + price2 * count2;
        int tax = (int)(subtotal * 0.1);
        int total = subtotal + tax;

        System.out.println("小計");
        System.out.println(subtotal + "円");

        System.out.println("消費税");
        System.out.println(tax + "円");

        System.out.println("合計金額");
        System.out.println(total + "円");
    }
}
