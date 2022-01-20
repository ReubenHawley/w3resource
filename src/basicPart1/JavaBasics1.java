package basicPart1;

import java.text.DecimalFormat;
import java.util.Arrays;

public class JavaBasics1 {
    public static void printExerciseNum(int num) {
        String corner = "*";
        String border = "-------------";
        if (num < 9) {
            System.out.println(corner + border + corner + "\n" + "- Exercise " + num + ": -\n" + corner + border + corner);
        } else if ((num > 9) && (num < 99)) {
            System.out.println(corner + border + "-" + corner + "\n" + "- Exercise " + num + ": -\n" + corner + border + "-" + corner);
        } else {
            System.out.println(corner + border + "--" + corner + "\n" + "- Exercise " + num + ": -\n" + corner + border + "--" + corner);
        }


    }

    public static int convertDecimalToBinary(int number) {
        String binary = "";
        while (number >= 1) {
            if (number % 2 == 0) {
                number = number / 2;
                binary += "0";
            } else {
                binary += "1";
                number = number / 2;
            }
        }
        String rev = new StringBuffer(binary).reverse().toString();
        return Integer.parseInt(rev);
    }

    public static int convertBinaryToDecimal(int number) {
        String binary = Integer.toString(number);
        String rev = new StringBuffer(binary).reverse().toString();
        int decimal = 0;
        for (int i = rev.length() - 1; i >= 0; i--) {
            if (rev.charAt(i) == '1') {
                decimal += Math.pow(2, i);
            }
        }
        return decimal;
    }

    private static String convertDecimalToHexa(int num) {
        String[] letter = {"A", "B", "C", "D", "E", "F"};
        if (num < 10)
            return Integer.toString(num);
        else {
            num -= 10;
            return letter[num];
        }
    }

    public static String[] splitString(String binary) {
        int count = binary.length();
        String[] binaries = new String[(count / 4) + 1];
        int loopCounter = 0;
        while (count >= 4) {
            count = binary.length();
            if (count >= 4) {
                // create a substring of length 4 and assign to array
                binaries[loopCounter] = binary.substring(count - 4, count);
                //subtract substring and reassign to itself
                binary = binary.substring(0, count - 4);
            } else {
                // if the string left over is smaller than 4, fill with zero's.
                for (int i = 0; i < count - 2; i++) {
                    binary = "0" + binary;
                }
                binaries[loopCounter] = binary;
                binary = binary.substring(0, count);
            }

            loopCounter++;
        }
        return binaries;
    }

    public static void exercise1(String name) {
        System.out.println("Hello");
        System.out.println(name);
    }

    public static void exercise2(int one, int two) {
        System.out.println(one + two);
    }

    public static void exercise3(int one, int two) {
        try {
            System.out.println(one / two);
        } catch (AbstractMethodError e) {
            System.err.println("AbstractMethodError: " + e.getMessage());
        }
    }

    public static void exercise4() {
        System.out.println(-5 + 8 * 6);
        System.out.println((55 + 9) % 9);
        System.out.println(20 + -3 * 5 / 8);
        System.out.println(5 + 15 / 3 * 2 - 8 % 3);
    }

    public static void exercise5(int one, int two) {
        try {
            System.out.println(one * two);
        } catch (AbstractMethodError e) {
            System.err.println("AbstractMethodError: " + e.getMessage());
        }
    }

    public static void exercise6(int one, int two) {
        try {
            System.out.println(one + " + " + two + " = " + (one + two));
            System.out.println(one + " - " + two + " = " + (one - two));
            System.out.println(one + " x " + two + " = " + (one * two));
            System.out.println(one + " / " + two + " = " + (one / two));
            System.out.println(one + " mod " + two + " = " + (one % two));
        } catch (AbstractMethodError e) {
            System.err.println("AbstractMethodError: " + e.getMessage());
        }
    }

    public static void exercise7(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (i * num));
        }
    }

    public static void exercise8() {
        System.out.println("   J    a   v     v  a                                                  \n" +
                "   J   a a   v   v  a a                                                 \n" +
                "J  J  aaaaa   V V  aaaaa                                                \n" +
                " JJ  a     a   V  a     a");
    }

    public static void exercise9() {
        System.out.println(((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)));
    }

    public static void exercise10() {
        System.out.println(4.0 * (1 - (1.0 / 3) + (1.0 / 5) - (1.0 / 7) + (1.0 / 9) - (1.0 / 11)));
    }

    public static void exercise11(double radius) {
        double area = Math.PI * Math.pow(radius, 2);
        double perimeter = 2 * (Math.PI * radius);

        System.out.println("Perimeter is = " + perimeter);
        System.out.println("Area is = " + area);

    }

    public static void exercise12(int a, int b, int c) {
        int avg = (a + b + c) / 3;
        System.out.println(avg);

    }

    public static void exercise13(double width, double height) {
        DecimalFormat f = new DecimalFormat("##.00");
        double area = width * height;
        double perimeter = 2 * (width + height);
        System.out.println("Area is " + width + " * " + height + " = " + f.format(area));
        System.out.println("Perimeter is 2 *(" + width + " + " + height + ") = " + f.format(perimeter));
    }

    public static void exercise14() {
        String even = "* * * * * * ";
        String odd = " * * * * *  ";
        String lineShort = "==================================";
        String flag = "";
        for (int i = 0; i < 15; i++) {
            if (i < 9) {
                if (i % 2 == 0) {
                    flag = flag + even + lineShort + "\n";
                } else {
                    flag = flag + odd + lineShort + "\n";
                }
            } else {
                for (int j = 0; j < even.length(); j++) {
                    flag = flag + "=";
                }
                flag = flag + lineShort + "\n";
            }
        }
        System.out.println(flag);

    }

    public static void exercise15(int a, int b) {
        System.out.println("input: a=" + a + " b=" + b);
        int c = b;
        b = a;
        a = c;
        System.out.println("output: a=" + a + " b=" + b);
    }

    public static void exercise16() {
        System.out.println(" +\"\"\"\"\"+                                                 \n" +
                "[| o o |]                                                \n" +
                " |  ^  |                                                 \n" +
                " | '-' |                                                 \n" +
                " +-----+");
    }

    public static void exercise17(int one, int two) {
        int binarySum = convertBinaryToDecimal(one) + convertBinaryToDecimal(two);
        int sum = convertDecimalToBinary(binarySum);
        System.out.println("Binary number is: " + sum);
    }

    public static void exercise18(int one, int two) {
        int binarySum = convertBinaryToDecimal(one) * convertBinaryToDecimal(two);
        int sum = convertDecimalToBinary(binarySum);
        System.out.println("Product of two binary numbers: " + sum);
    }

    public static void exercise19(int num) {
        System.out.println("Binary  Number: " + convertDecimalToBinary(num));
    }

    public static void exercise20(int num) {

        String hexa = convertDecimalToHexa(num);
        System.out.println("Hexadecimal number is : " + hexa);
    }

    public static void exercise22(int num) {
        System.out.println("Decimal Number: " + convertBinaryToDecimal(num));
    }
}
