package baseJava.hw_1;

public class Main {
    public static void main(String[] args) {
        byte b1 = 127;
        byte b2 = 4;
        byte b3 = (byte) (b1 + b2);
        System.out.println(b3 + "\n");

        short s1 = - 32768;
        short s2 = - 1;
        short s3 = (short)(s1 + s2);
        System.out.println(s3 + "\n");

        int i1 = 15;
        int i2 = 2;
        System.out.println(i1/i2);
        System.out.println(i1%i2);
        System.out.println(i2/i1 + "\n");

        float f1 = 0.9f;
        float f2 = 0.1f;
        System.out.println(f1*f2 + "\n");

        double d1 = 0.9d;
        double d2 = 0.1d;
        System.out.println(d1*d2 + "\n");

        boolean bool1 = true;
        if(!bool1){
            System.out.println("отрицание true дает false");
        }else {
            System.out.println("это строка не выведется в консоль");
        }

        if(bool1 || (++b2 > 4)){
            System.out.println("здесь будет выведено равенство 4 = " + b2 + ". Т.к. вторая часть не проверяется");
        }
    }
}