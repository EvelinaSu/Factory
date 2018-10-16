package com.company.Factory;

public class Square implements Shape {
    private float radius;

    public Square(float parR) {
        radius=parR;

    }

    @Override
    public float draw() {
        float result=(radius*radius);
        System.out.println ("square:"+ result);
        return result;

    }
}
