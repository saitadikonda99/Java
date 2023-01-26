package com.sai.Interfaces;

public class CDplayer implements Music {

    @Override
   public void stop() {
        System.out.println (" Music stops ");
   }
    @Override
    public void start() {
        System.out.println (" Music starts ");
    }
}
