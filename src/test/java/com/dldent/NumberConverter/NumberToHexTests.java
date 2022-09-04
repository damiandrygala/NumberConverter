package com.dldent.NumberConverter;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class NumberToHexTests {

    @Test
    public void IfParamsAreCorrect_TryConvertToHex_ShouldPass() {
        var converter = new NumberToHexConverter();
        var result = converter.convert(1023);
        assertEquals("3FF", result);
    }
}
