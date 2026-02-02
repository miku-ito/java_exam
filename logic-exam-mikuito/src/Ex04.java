public class Ex04 {
    public static void main(String[] args) {
        System.out.println("2000年は" + sub(2000));
        System.out.println("2100年は" + sub(2100));
    }

    public static String sub (int num) {
        if (num % 4 == 0) {
            if (num % 100 != 0) {
            } else if (num % 400 == 0) {
                return ("うるう年です");
                }
            }
            return ("うるう年ではありません"); 
    }
}
