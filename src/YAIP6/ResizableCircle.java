package YAIP6;

public class ResizableCircle extends Circle implements Resizable {
    
    public ResizableCircle(double radius) {
        super(radius);  
    }

    @Override
    public void resize(double percentage) {
        double newRadius = getRadius() * (1 + percentage / 100);
        setRadius(newRadius);
    }

    @Override
    public String toString() {
        return "ResizableCircle [radius=" + getRadius() + "]";
    }
}