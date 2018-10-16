package com.company.Factory;

public class Rectangle implements Shape {
    private float height;
    private float width;

    public Rectangle(float parWidth, float parHeight) {
        width = parWidth;
        height = parHeight;



    }

    @Override
    public float draw() {
        float result = (width*height);
        System.out.println ("rectangle:"+ result);
        return result;
    }
}
