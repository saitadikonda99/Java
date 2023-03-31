package Generics.Demo;

public class Vehicle<T , S > {
    S name;
    T price;

    Vehicle(  S name, T price  ) {
        this.name = name;
        this.price = price;
    }

    public S heyy()  {
        System.out.print ("heyy");
        return  name;
    }


}
