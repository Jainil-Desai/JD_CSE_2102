package com.example.demo;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;

@WebMvcTest(QuizController.class)
public class EmailValidatorTest {

    @Test
    public void testValidEmail() {
        assertTrue(EmailValidator.validEmail("djainil04@gmail.com"));
    }

    @Test
    public void testInvalidEmail2() {
        assertFalse(EmailValidator.validEmail("Hi"));
    }
}
