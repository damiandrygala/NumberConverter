package com.dldent.NumberConverter;

public class NumberToRomanConverter implements INumberConvertable {

    @Override
    public String convert(int number) {
        String result = "";

        while (number >= 1000) {
            result += "M";
            number -= 1000;
        }

        while (number >= 500) {
            if (number >= 900) {
                result += "CM";
                number -= 900;
            } else {
                result += "D";
                number -= 500;
            }
        }

        while (number >= 100) {
            if (number >= 400) {
                result += "CD";
                number -= 400;
            } else {
                result += "C";
                number -= 100;
            }
        }

        while (number >= 50) {
            if (number >= 90) {
                result += "XC";
                number -= 90;
            } else {
                result += "L";
                number -= 50;
            }
        }

        while (number >= 10) {
            if (number >= 40) {
                result += "XL";
                number -= 40;
            } else {
                result += "X";
                number -= 10;
            }
        }

        while (number >= 5) {
            if (number >= 9) {
                result += "IX";
                number -= 9;
            } else {
                result += "V";
                number -= 5;
            }
        }

        while (number >= 1) {
            if (number >= 4) {
                result += "IV";
                number -= 4;
            } else {
                result += "I";
                number -= 1;
            }
        }
        return result;
    }
}
