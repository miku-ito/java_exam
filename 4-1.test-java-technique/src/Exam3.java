public class Exam3 {
    public static void main(String[] args) {
        
        try {
            Class.forName("java.lang.NotFoundClass");

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("例外が発生しました！");
        }
    }
}
