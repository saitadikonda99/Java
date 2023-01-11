 // oops in java

 public class Main {
     public static void main(String[] args) {

         // store 5 student roll numbers

         int[] roll = new int[5];

         // store 5 student names

         String[] names = new String[5];

         // store 5 students marks

         float[] marks = new float[5];

         Student[] students = new Student[5];

         Student sai = new Student( 24 , "kusuma" , 94.7f);

         // random

         Student random = new Student(sai);
//
//         System.out.println(random.roll);
//         System.out.println(random.name);
//         System.out.println(random.marks);
//


//         sai.roll = 13;
//         sai.name = "kusuma";
//         sai.marks = 89.9f;

//
//         System.out.println(sai.roll);
//         System.out.println(sai.name);
//         System.out.println(sai.marks);


        sai.changeName();
         sai.Greeting();

     }
 }
     class Student {

         int roll;
         String name;
         float marks;

         void Greeting() {
             System.out.println("Hello, My name is " + this.name);
         }

         Student () {

             this.roll  = 13;
             this.name  = "kusuma";
             this.marks = 94.7f;
         }

         void changeName( ){
             this.name = "sai";
         }

         Student ( Student other ) {
             this.roll  = other.roll;
             this.name  = other.name;
             this.marks = other.marks;
         }


         // Student sai = new Student( 35 ,"rani" , 94.7 );
         // here, this will be replaced with " rani "
         Student (int roll , String name , float marks ) {
             this.roll  = roll;
             this.name  = name;
             this.marks =  marks;

         }


 }
