package com.sai.Interfaces;

public class NiceCar {

    private Engine engine;
    private Music songs = new CDplayer ();
    public NiceCar() {
        engine = new PowerEngine();
    }

        public void musicstart() {
            songs.start ();
        }
        public void musicstop() {
        songs.stop ();
        }

        public void start() {
            engine.start();
        }

        public void stop() {
            engine.stop ();
        }
        public void accelerate() {
            engine.accelerate ();
        }


        public void windows() {
        engine.windows ();
        }

    public void upgradeEngine() {
        this.engine = new ElectricEngine();
    }

    }
