package com.example.registrarse;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class Canino extends AppCompatActivity {
    Button boton ;
    TextView concepto;
    TextView titulo;

    private final int [] mCanino = {R.drawable.pe1, R.drawable.pe2,R.drawable.pe3, R.drawable.p4, R.drawable.p5 };
    private final String [] titleCanino = {"ESCONDITE", "CANICROSS", "CACERÍA DE GOLOSINAS", "¿ME DEJAS TU JUGUETE?", "JUEGO MUSICAL"};
    private final String [] textCanino = {
            "¿Cuánto tardaría tu perro en encontrarte si te ocultas bien? Jugar al escondite con los canes es un plan divertido tanto dentro de casa, como en el parque o en cualquier lugar donde no sea peligroso." +
                    "\nInstrucciones:" +
                    "\n\t1. Mantén quieto a tu compañero." +
                    "\n\t2. Busca un lugar y escóndete." +
                    "\n\t3. Llámalo, así irá en tu búsqueda" +
                    "\nY no es sólo divertido, también es una forma de ejercitar el olfato de tu can, su capacidad de rastreo.",
            "Si te gusta salir a correr esta actividad puede interesarte. Canicross consiste en salir a correr con tu perro." +
                    "\nInstrucciones:" +
                    "\n\t1. Atamos a nuestro compañero con un cinturón especial para evitar hacerle o hacerte daño" +
                    "\n\t2. Ubicarse al aire libre y realizar la actividad" +
                    "\nRecuerda que deben llevar líquido, evitemos la deshidratación del can como la tuya. Con esta actividad no solo compartirás tiempo con tu mejor amigo, si no que los dos haréis un gran ejercicio juntos.",
            "Si el día está lluvioso y debes quedarse dentro de casa con tu mascota, nada mejor que jugar a encontrar golosinas." +
                    "\nInstrucciones:" +
                    "\n\t1. Asegúrate de que tu mascota se encuentre fuera de tu vista." +
                    "\n\t2. Junta algunas de sus golosinas favoritas." +
                    "\n\t3. Escóndelas en lugares estratégicos." +
                    "\nY no es sólo divertido, también es una forma de ejercitar el olfato de tu can, buscando las golosinas. Recuerda que puedes guiarlo para evitar la frustración en tu amigo",
            "Este juego permitirá que nuestra mascota se sitúe en estado de alerta y mantenga una óptima condición física" +
                    "\nInstrucciones:" +
                    "\n\t1. Conseguir un juguete que resulte atractivo para él y sobre todo cuyo tacto sea suave." +
                    "\n\t2. Permitimos que nuestro perro juegue libremente." +
                    "\n\t3. Quitamos el juguete, obviamente, nuestra mascota no nos dejará." +
                    "\n\t4. Empieza un divertido juego de tira y agarra." +
                    "\nPodemos incorporarle multitud de movimientos para así permitirle a nuestra mascota un mayor ejercicio físico. Si tienes varios perros no dudes en que esto funcionará.",
            "Jugar con nuestro perro no únicamente tiene por qué tener la función de estimularlo o excitarlo, sino que también puede ser una excelente manera de relajarlo." +
                    "\nInstrucciones:" +
                    "\n\t1. Busca una superficie donde tu perro pueda tumbarse cómodamente y relajarse" +
                    "\n\t2. Permanece a su lado, a medida que se vaya calmando podrás colmarlo de afecto" +
                    "\n\t3. Ponle música" +
                    "\nA los perros les puede encantar la música que incorpore aullidos de lobos u otros sonidos de animales salvajes, esto estimulará su cerebro a la vez que lo mantiene relajado."
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ImageView ivperro = (ImageView)findViewById(R.id.imageView4);
        setContentView(R.layout.activity_canino);
    }
    private void cambiarImagen (){
        boton = (Button)findViewById(R.id.boton_cambiar_can);
        concepto = (TextView) findViewById(R.id.texto_cambiar_can);
        titulo = (TextView) findViewById(R.id.titulo_cambiar_can);

        ImageView ivperro = (ImageView)findViewById(R.id.imageView4);
        Random numeros = new Random();
        int pos = numeros.nextInt(5);

        ivperro.setImageResource(mCanino[pos]);
        titulo.setText(titleCanino[pos]);
        concepto.setText(textCanino[pos]);
    }

    public void Aleatorio (View view){
        cambiarImagen();
    }

}