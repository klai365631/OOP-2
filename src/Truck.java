public class Truck extends ServiceStation{
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }



    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}
