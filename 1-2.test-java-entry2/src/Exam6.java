public class Exam6 {
    public static void main(String[] args) {
        int num = 0;
        
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                num = i * j;
                if (num < 10) {
                    System.out.print(" " + num + " ");
                } else {
                    System.out.print(num + " ");
                }
            }
            System.out.println();
        }
    }
}
