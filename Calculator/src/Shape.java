import java.util.Scanner;

public class Shape {
    private float base, height;
    int shapeType;
                                        //you need to know the 2 basic measures and which shape you will calculate
    public Shape() {
        setShapeType(shapeType);
        setBase(base);
        setHeight(height);
    }

    public int getShapeType() {
        return shapeType;
    }

    public void setShapeType(int shapeType) {
        this.shapeType = shapeType;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float calculate() {

        float area;

        if(shapeType == 1) area = base*base;        //if you select square, only need the base

        else if(shapeType == 4 || shapeType == 6) area = (float) (height * height * Math.PI); //if you select the circle or semicircle, only need the
                                                                                                // radius (height) and pi
        else area = base * height;            //any other shape, needs base and height, that's why this is the basic operation

        return area;            //return the result of the basic multiplication, then you apply the other operations
                                // if the formula of the shape requires it
    }

}
