package com.dldent.NumberConverter;

import com.dldent.NumberConverter.exceptions.ValidationTypeConversionException;

public class ConverterFactory {

    public static INumberConvertable Create(String typeOfConversion) throws ValidationTypeConversionException {
        switch (typeOfConversion) {
            case "hex" -> {return new NumberToHexConverter();}
            case "roman" -> {return new NumberToRomanConverter();}
            default -> throw new ValidationTypeConversionException();
        }
    }
}
