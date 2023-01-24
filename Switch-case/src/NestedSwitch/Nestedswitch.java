package NestedSwitch;

import java.util.Scanner; //Scanner Class
public class Nestedswitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //input the employee id
        System.out.print("Enter the employee id : ");
        int id = in.nextInt();
        //input the department
        System.out.print("Enter the department : ");
        String D = in.next();

        switch(id) {
            case 1 -> System.out.println("SAI TADIKONDA");
            case 2 -> System.out.println("KUSUMA");
            case 3 -> {
                System.out.println("Employee number 3 ");
                switch(D) {
                    case "it" -> System.out.println("IT");
                    case "tech" -> System.out.println("TECH");
                    default -> System.out.println("Enter the correct department ");
                }
            }
            	    default -> System.out.println("Enter the correct id ");
            }
        }
    }


