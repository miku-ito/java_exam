package exam1;
public class SuperCar extends Car {
    
    @Override
    public void run() {
        System.out.println("ブォーン！"+getName()+"が走ります");
    }
}
