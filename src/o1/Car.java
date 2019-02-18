package o1;

public class Car {
    public int model = 2019;
    public CarColor color = CarColor.Black;
    private int max_speed;
    public String name;
    public double[] location = {0, 0};

    Car(int maxSpeed, String name) {
        this.max_speed = maxSpeed;
        this.name = name;
        System.out.println("Car Constructor" + this.model);
    }

    public double[] location() {
        return this.location;
    }

    public void move(CarDirection direction, double moveBy) {

        if (direction == CarDirection.Horizontal) {
            this.location[0] = this.location[0] + moveBy;
        }

        if (direction == CarDirection.Vertical) {
            this.location[1] = this.location[1] + moveBy;
        }
    }
}
