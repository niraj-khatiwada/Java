import java.lang.String;
import java.lang.Integer;
import java.lang.Float;
import java.lang.Math;

class TypeConversion {
    public static void main(String[] args) {
        int integer = 100;
        System.out.println(integer);

        // Integer to Float
        float integerToFloat = (float) integer;
        System.out.println(integerToFloat);

        // Float to Integer
        int floatToInteger = (int) integerToFloat;
        System.out.println(floatToInteger);

        // String to Integer
        String str = "1";
        int strToInt = Integer.parseInt(str);
        System.out.println(strToInt);

        // Integer to String
        System.out.println(String.format("Integer %s", strToInt));

        // String to Float
        float strToFloat = Float.parseFloat(str);
        System.out.println(strToFloat);

        System.out.println(String.format("Float %s", strToFloat));

        // float division = 10 / 3; // This will result in whole number
        float division = 10F / 3;
        System.out.println(division);

        int x = 1;
        int y = x++;
        System.out.println(x);
        System.out.println(y);

        x = 1;
        y = ++x;
        System.out.println(x);
        System.out.println(y);

        double sqrt = Math.sqrt(4);
        System.out.println(sqrt);

        int abs = Math.abs(-4);
        System.out.println(abs);

        double abs2 = Math.abs(-4.1);
        System.out.println(abs2);

        // Although, round, floor and ceil always return integer, Java returns them as
        // double. So we need to do type conversion.
        int round = (int) Math.round(2.3);
        System.out.println(round);
        int floor = (int) Math.floor(2.3);
        System.out.println(floor);
        int ceil = (int) Math.ceil(2.3);
        System.out.println(ceil);

        int random = (int) (Math.random() * 100);
        System.out.println(random);

    }
}