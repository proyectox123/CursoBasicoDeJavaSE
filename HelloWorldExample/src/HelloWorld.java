public class HelloWorld {

    public static void main(String[] args){
        System.out.println("Hello world!!!!");

        //primitiveData();
        //castVariables();
        //arrayData();
        //searchElementsInArrays();
        //arithmeticOperators();
        //
        //relationalOperators();
        //flowControlIfElse();
        //flowControlSwitch();
        //flowControlWhile();
        flowControlFor();
        flowControlForEach();
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

    private static void arithmeticOperators(){
        int a = 1;
        int aa = a + a;
        System.out.println("El valor de aa es: " + aa);

        double x = 2.56;
        int y = 9;
        float w = (float) x + y;
        System.out.println("El valor de w es: " + w);
        System.out.println("El valor de w * 2 es: " + (w * 2));

        double k = 4 / 0.00002;
        System.out.println("El valor de k es: " + k);
        System.out.println(7%2);

        int f = 2;
        int g = 3;
        f += g;
        System.out.println("El valor de f es: " + f);

    }

    private static void relationalOperators(){
        int q = 5;
        int p = 4;

        System.out.println("q > p -> " + (q > p));
        System.out.println("q < p -> " + (q < p));

        System.out.println("q >= p -> " + (q >= p));
        System.out.println("q <= p -> " + (q <= p));

        boolean n = false;
        boolean m = true;

        System.out.println("n && m -> " + (n && m));
        System.out.println("n || m -> " + (n || m));
        System.out.println("!n -> " + (!n));
        System.out.println("!m -> " + (!m));
    }

    private static void flowControlIfElse(){
        int q = 5;
        int p = 4;

        if(q > p){
            System.out.println("Si es mayor");
        }else if(q == p){
            System.out.println("Es igual");
        }else{
            System.out.println("No es mayor");
        }
    }

    private static void flowControlSwitch(){
        int month = 8;
        switch (month){
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                break;
        }
    }

    private static void flowControlWhile(){
        int e = 1;
        while(e++ <= 5){
            System.out.println("e = "+ e);
        }

        int a = 1;
        while(++a <= 5){
            System.out.println("a = "+ a);
        }
    }

    private static void flowControlFor(){
        char[] names = new char[5];
        names[0] = 'h';
        names[1] = 'o';
        names[2] = 'l';
        names[3] = 'a';

        for(int c = 0; c < names.length; c++){
            System.out.println("c["+c+"] = "+ names[c]);
        }
    }

    private static void flowControlForEach(){
        char[] names = new char[5];
        names[0] = 'h';
        names[1] = 'o';
        names[2] = 'l';
        names[3] = 'a';

        for (char c: names){
            System.out.println(c);
        }
    }
}