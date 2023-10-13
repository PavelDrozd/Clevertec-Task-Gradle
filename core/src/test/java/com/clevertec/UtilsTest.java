package com.clevertec;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UtilsTest {

    @Test
    public void positiveInTrueOut() {
        Assertions.assertTrue(Utils.isAllPositiveNumbers("22", "120"));
    }
}
