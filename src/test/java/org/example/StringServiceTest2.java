package org.example;

import org.example.services.StringService;
import org.example.util.StringUtils;
import org.mockito.InjectMocks;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.openMocks;
import static org.testng.Assert.assertTrue;

public class StringServiceTest2 {

    @InjectMocks
    private StringService stringService;
    private StringUtils stringUtils;

    @BeforeTest
    public void setup() {

        stringUtils = mock(StringUtils.class);
        openMocks(this);
    }

    @Test
    public void testIsPalindrome() {

        when(stringUtils.convertToLowerCase("madam")).thenReturn("madam");
        boolean result = stringService.isPalindrome("madam");
        assertTrue(result);
        verify(stringUtils).convertToLowerCase("madam");
    }

}
