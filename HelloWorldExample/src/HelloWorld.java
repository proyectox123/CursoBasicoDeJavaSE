public class HelloWorld {

    public static void main(String[] args){
        System.out.println("Hello world!!!!");

        primitiveData();
        castVariables();
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

}
