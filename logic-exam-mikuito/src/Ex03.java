public class Ex03 {
    public static void main(String[] args) {
        System.out.println("2000年は" + sub(2000)+"世紀です");
        System.out.println("2100年は" + sub(2001)+"世紀です");
    }
    public static int sub (int num) {
        int seiki= 0;
        seiki = (num -1) / 100 + 1;
        return seiki;
    }
}
