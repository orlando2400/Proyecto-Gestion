package com.example.registrarse;

import static org.mockito.Mockito.mock;

import android.content.Context;

import junit.framework.TestCase;

import org.junit.Test;
import org.junit.Rule;
import org.junit.runner.RunWith;


public class Interfaz2Test extends TestCase {

    public void testValidardatos() {
        String input = "Adrian";
        String input2 = "Persa";
        boolean output;
        boolean expected = true;

        Interfaz2 registrarse = new Interfaz2();
        output = registrarse.validardatos(input, input2);

        assertEquals(expected, output);
    }

    public void numberIsDisplayed(){

    }
}