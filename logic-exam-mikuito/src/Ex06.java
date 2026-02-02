import java.util.Random;

public class Ex06 {
    public static void main(String[] args) {
        int random1, random2, random3;
        Random random = new Random();
        random1 = random.nextInt(10);
        do {
            random2 = random.nextInt(10);
        } while (random2 == random1);
        do {
            random3 = random.nextInt(10);
        } while (random3 == random2 || random3 == random1);
        
        System.out.print(random1);
        System.out.print(random2);
        System.out.println(random3);
        System.out.print(random1);
        System.out.print(random3);
        System.out.println(random2);
        System.out.print(random2);
        System.out.print(random1);
        System.out.println(random3);
        System.out.print(random2);
        System.out.print(random3);
        System.out.println(random1);
        System.out.print(random3);
        System.out.print(random1);
        System.out.println(random2);
        System.out.print(random3);
        System.out.print(random2);
        System.out.println(random1);
        
    }
}
