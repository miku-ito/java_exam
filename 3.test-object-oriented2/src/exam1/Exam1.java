package exam1;
public class Exam1 {
    public static void main(String[] args) {
        SuperCar car1 = new SuperCar();
        car1.setName("フェラーリ");
        car1.putOnGas();
        car1.run();

        EcoCar car2 = new EcoCar();
        car2.setName("プリウス");
        car2.putOnGas();
        car2.run();
    }
}
