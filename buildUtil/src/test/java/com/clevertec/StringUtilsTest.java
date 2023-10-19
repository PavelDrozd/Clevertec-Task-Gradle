package com.clevertec;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringUtilsTest {

    @Test
    public void positiveInTrueOut() {
        Assertions.assertTrue(StringUtils.isPositiveNumber("12"));
    }
}
