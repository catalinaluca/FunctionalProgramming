@FunctionalInterface
public interface MyFirstInterface {
    int functionalInterface(int number);
}

abstract class Figure {
    public abstract void draw();
}

class Circle extends Figure {

    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}
