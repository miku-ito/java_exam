import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Ex02 {
public static void main(String[] args) {
    LocalTime localTime1 = LocalTime.of(11, 59, 59);
    localTime1 = localTime1.plusSeconds(1);
    DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("h時m分s秒");
    String answer1 = formatter1.format(localTime1);
    System.out.println("11時59分59秒の1秒後は" + answer1 + "です");
    
    LocalTime localTime2 = LocalTime.of(23, 59, 59);
    localTime2 = localTime2.plusSeconds(1);
    DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("H時m分s秒");
    String answer2 = formatter2.format(localTime2);
    System.out.println("23時59分59秒の1秒後は" + answer2 + "です");

    }
}
