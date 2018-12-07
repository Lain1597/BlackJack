/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjackconsolamain;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author LAIN-PC
 */
public class BlackJackConsolaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Baraja d = new Baraja();
        d.crearcartas();
        
        Mano ManoCasa = new Mano();     //mano para la casa 
        Mano ManoJugador = new Mano();      //mano para el jugador
        
        //repartir 2 cartas
        ManoCasa.PedirCarta(d.getCarta());
        ManoJugador.PedirCarta(d.getCarta());
        ManoCasa.PedirCarta(d.getCarta());
        ManoJugador.PedirCarta(d.getCarta());
        
        //si la casa tiene 16 o menos en su mano esta obligado a pedir otra carta
        while(ManoCasa.getValor()<=16){
            ManoCasa.PedirCarta(d.getCarta());           
        }
       
        Scanner teclado = new Scanner(System.in); 
        
        System.out.println("Tus cartas : " + ManoJugador.MostrarMano());
        System.out.println("Pedir otra carta [c] o Plantarse[p]" );
        String opc = teclado.nextLine(); 
        while(opc=="c"){
            ManoJugador.PedirCarta(d.getCarta());
            System.out.println("Tus cartas : " +ManoJugador.MostrarMano());
            break;
        }
        System.out.println("La casa: " + ManoCasa.MostrarMano() ); 
        
        if (ManoJugador.getValor()<ManoCasa.getValor()) {
            System.out.println("Perdiste perro ");
        } else{
            System.out.println("Ganaste"); //hmmbnb
        }
    }
    
}
