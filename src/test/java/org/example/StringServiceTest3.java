package org.example;

import org.example.services.StringService;
import org.mockito.InjectMocks;
import org.mockito.MockedStatic;
import org.example.util.StringUtils;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.mockito.Mockito.mockStatic;
import static org.mockito.MockitoAnnotations.openMocks;
import static org.testng.Assert.assertEquals;

public class StringServiceTest3 {
    private MockedStatic<StringUtils> stringUtilsMockedStatic;

    @InjectMocks
    private StringService stringService;

    @BeforeMethod
    public void setup() {

        stringUtilsMockedStatic = mockStatic(StringUtils.class);
    }

    @AfterMethod
    public void tearDown() {

        stringUtilsMockedStatic.close();
    }

    @BeforeTest
    private void init() {

        openMocks(this);
    }

    @Test
    public void testCreatePalindrome() {

        stringUtilsMockedStatic.when(() -> StringUtils.reverse("test")).thenReturn("tset");
        String result = stringService.createPalindrome("test");
        assertEquals(result, "testtset");
        stringUtilsMockedStatic.verify(() -> StringUtils.reverse("test"));
    }


}
