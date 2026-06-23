package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void testGetGreeting() {
        // This checks if the main app's message matches perfectly
        assertEquals("Hello, Java World via CI/CD!", App.getGreeting());
    }
}
