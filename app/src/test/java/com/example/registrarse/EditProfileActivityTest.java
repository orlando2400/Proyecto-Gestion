package com.example.registrarse;

import junit.framework.TestCase;

public class EditProfileActivityTest extends TestCase {

    public void testVerificadordedatos() {
        String input;
        String input2;
        int bandera;
        input = "Gustavo";
        input2 = "975602085";
        bandera = 2;
        boolean output;
        boolean expected=true;

        EditProfileActivity registrarse = new EditProfileActivity();
        output = registrarse.Verificadordedatos(input,input2,bandera);

        assertEquals(expected,output);
    }

    public void testopcionesdeimagen(){
        int input = 0;
        int input2 = 3;
        boolean output;
        boolean expected=true;

        EditProfileActivity registrarse = new EditProfileActivity();
        output = registrarse.opcionesdeimagen(input,input2);

        assertEquals(expected,output);
    }
}