package com.example.registrarse;

import junit.framework.TestCase;

public class RegistrarseTest extends TestCase {

    public void testIsEmailValid() {
        String input;
        input = "cristhelquito1gmail.com";
        boolean output;
        boolean expected=true;

        Registrarse registrarse = new Registrarse();
        output = registrarse.isEmailValid(input);

        assertEquals(expected,output);
    }

    public void testisNombreValid(){
        String input;
        input = "Q";
        boolean output;
        boolean expected=true;

        Registrarse registrarse = new Registrarse();
        output = registrarse.isNombreValid(input);

        assertEquals(expected,output);
    }

    public void testisConfirmarValid(){
        String input;
        input = "12345678";
        boolean output;
        boolean expected=true;

        Registrarse registrarse = new Registrarse();
        output = registrarse.isConfirmarValid(input,"22572481");

        assertEquals(expected,output);
    }

    public void testisApellido(){
        String input;
        input = "Camilo";
        boolean output;
        boolean expected=true;

        Registrarse registrarse = new Registrarse();
        output = registrarse.isApellido(input);

        assertEquals(expected,output);
    }

    public void testisTelefono(){
        String input;
        input = "99209422";
        boolean output;
        boolean expected=true;

        Registrarse registrarse = new Registrarse();
        output = registrarse.isTelefono(input);

        assertEquals(expected,output);
    }
}