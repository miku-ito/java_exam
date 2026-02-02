import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ex05 {
    public static void main(String[] args) {
        String[] sports = { "soccer", "baseball", "jogging", "jogging", "soccer", "surfing", "surfing", "soccer", "surfing", "baseball", "boxing", "surfing", "soccer", "surfing", "jogging", "boxing", "jogging", "baseball", "soccer", "soccer"};
        Map<String, Integer> map = new HashMap<>();
        for (String sport : sports) {
            Integer count = map.get(sport);
            if (count == null) {
                map.put(sport, 1);
            } else {
                count++;
                map.put(sport, count);
            }
        }
        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            Integer value = map.get(key);
            if (value == 6) {
                System.out.println("最も出場回数の多いスポーツは" + key + "で、出場回数は" + value + "回です");
            }
        }
    }
}
