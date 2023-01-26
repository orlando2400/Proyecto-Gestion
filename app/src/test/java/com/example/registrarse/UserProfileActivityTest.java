package com.example.registrarse;

import junit.framework.TestCase;

public class UserProfileActivityTest extends TestCase {

    public void testNumeroPosts() {
        int input;
        input = -8;
        int output;
        int expected=-7;

        UserProfileActivity registrarse = new UserProfileActivity();
        output = registrarse.numeroPosts(input);

        assertEquals(expected,output);
    }
}