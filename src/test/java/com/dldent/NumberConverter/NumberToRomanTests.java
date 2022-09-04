package com.dldent.NumberConverter;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class NumberToRomanTests {

    @Test
    public void IfParamsAreCorrect_TryConvertToRoman_ShouldPass() {
        var converter = new NumberToRomanConverter();
        var result = converter.convert(1023);
        assertEquals("MXXIII", result);
    }
}
