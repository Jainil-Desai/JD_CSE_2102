package com.example.demo;

import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;

@WebMvcTest(QuizController.class)
public class PasswordTest {
    @Test
    public void testValidPassword() {
        Password password = new Password("Admin@12345", "user1", "djainil04@gmail.com");
        assertTrue(password.validPassword());
    }

    @Test
    public void testInvalidPassword() {
        Password password = new Password("badpwd", "user1", "djainil04@gmail.com");
        assertFalse(password.validPassword());
    }
}