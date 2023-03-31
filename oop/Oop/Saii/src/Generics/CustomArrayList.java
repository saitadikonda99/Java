package Generics;

public class CustomArrayList {

        int[] data;
        public static int DEFAULT_SIZE = 10;
        int size = 0;

        public CustomArrayList() {
            data = new int[DEFAULT_SIZE];
        }
        public void add( int num ) {
            if( isfull() ) {
                resize ();
            }
             data[size++] = num;
        }

        public boolean isfull() {
          return size == data.length;
        }

        public void resize() {
            int[] temp = new int[DEFAULT_SIZE * 2];

            for (int k = 0; k < data.length; k++) {
                temp[k]  = data[k];
            }
            data = temp;
        }
        public void remove( int index ) {
            data[index] = 0;
        }

        public void set(int index, int num ) {
            data[index] = num;
        }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + java.util.Arrays.toString ( data ) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        CustomArrayList list = new Generics.CustomArrayList ();

        list.add(99);
        list.add(5);
        list.add(10);
        list.remove(0);
        list.set ( 1, 555 );
        System.out.println (list);


    }
}
