package o1;

enum HondaColor {
    White,
    Black,
    Pink,
    Grey
}

public class Honda extends Car{
    HondaColor color;
    Honda() {
        super(10, "Honda");
        System.out.println("Honda Car Constructor");
    }

    public HondaColor changeColor(HondaColor color) {
        return this.color = color;
    }
}
