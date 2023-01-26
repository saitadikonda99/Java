package com.sai.Interfaces;

public class PowerEngine implements Engine {

    @Override
    public void start() {
        System.out.println ("Power engine starts");
    }

    @Override
    public void stop() {
        System.out.println ("Power engine stops");
    }

     @Override
    public void accelerate() {
        System.out.println ("Power engine accelerates");
    }

    @Override
    public void windows() {
        System.out.println ("power engine windows ");
    }


    }

