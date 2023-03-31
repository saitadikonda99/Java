package com.sai.Abstraction.Demo;

public class Main {
    public static void main(String[] args) {
        Info info = new com.sai.Abstraction.Demo.Info ();

        info.message ( "sai" );

        Portal obj = new Info();

        obj.message("kusuma" );

        obj.setName ( "kusuma" );

        String name =  obj.getName ();

        System.out.println (name);

    }
}
