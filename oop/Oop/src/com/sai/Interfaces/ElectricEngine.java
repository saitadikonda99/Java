package com.sai.Interfaces;

public class ElectricEngine implements Engine{



    @Override
    public void start() {
        System.out.println ("Electric engine starts");
    }

    @Override
    public void stop() {
        System.out.println ("Electric  engine stops");
    }

    @Override
    public void accelerate() {
        System.out.println ("Electric engine accelerates");
    }

    @Override
    public void windows() {
        System.out.println ("Electric car Windows");

    }

}
