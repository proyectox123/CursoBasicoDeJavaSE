public class HelloWorld {

    public static void main(String[] args){
        System.out.println("Hello world!!!!");

        //primitiveData();
        //castVariables();
        //arrayData();
        searchElementsInArrays();
    }

    private static void primitiveData(){
        //Enteros
        byte edad = 127;
        short year = 2020;//2 bytes
        int idUser = 1001;//4 bytes
        long idTwitter = 12345678923456789L;//8 bytes

        //Punto Flotante
        float diameter = 35.25F;//4 bytes
        double price = 12345.23456789234;//8 bytes

        //Textos
        char gender = 'M';//2 bytes

        //Lògicos
        boolean isVisible = false;//2 bytes
    }

    private static void castVariables(){
        byte b = 6;
        short s = b;
        b = (byte) s;

        int i = 1;
        double d = 2.8;
        i = (int) d;

        int code = 97;
        char codeASCII = (char) code;

        short number = 300;
        byte numberBy = (byte) number;

        System.out.println(numberBy);
    }

    private static void arrayData(){
        int[] arrayInt = new int[3];
        double arrayDouble[];

        int[][] array2D = new int[2][3];

        int[][][] array3D = new int[3][3][2];

        char[][] names = {
                {'M', 'T', 'W'},
                {'M', 'T', 'W'}
        };
    }

    private static void searchElementsInArrays(){
        char[] names = new char[5];
        names[0] = 'h';
        names[1] = 'o';
        names[2] = 'l';
        names[3] = 'l';

        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
        System.out.println(names[4]);

        char[][][][] monkey = new char[2][3][2][2];
        monkey[1][0][0][1] = 'm';
        System.out.println(monkey[1][0][0][1]);
    }
}
