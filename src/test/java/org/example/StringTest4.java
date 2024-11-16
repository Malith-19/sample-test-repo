package org.example;

import org.example.services.StringService;
import org.example.util.StringUtils;
import org.mockito.MockedStatic;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.mockito.Mockito.mockStatic;
import static org.testng.Assert.assertEquals;

public class StringTest4 {

    private StringService stringService;

    @BeforeClass
    public void setup() {

        stringService = new StringService();
    }

    @Test
    public void testCreatePalindrome() {

        try (MockedStatic<StringUtils> stringUtilsMockedStatic = mockStatic(StringUtils.class)) {
            stringUtilsMockedStatic.when(() -> StringUtils.reverse("test")).thenReturn("tset");
            String result = stringService.createPalindrome("test");
            assertEquals(result, "testtset");
            stringUtilsMockedStatic.verify(() -> StringUtils.reverse("test"));
        }
    }
}
