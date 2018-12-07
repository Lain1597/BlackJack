/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjackconsolamain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

/**
 *
 * @author LAIN-PC
 */
public class Baraja {
    Carta carta[]= new Carta[52];
    int posicion;
    
    //crear cartas 
    public void crearcartas(){
        String [] Cartas = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
        String [] tipo = {"Corazones", "Espada", "Trébol", "Coco"};
        String numero = "2345678910JQKA";
        String tipo = "Corazones"+ "Espada"+ "trebol"+ "cocos";   
        int index=0;
        
        //crear baraja
        for (int i = 0; i < Cartas.length; i++) {
            for (int j = 0; j < ; j++) {
                System.out.println("" + );
            }
        }
        
        //generamos las 52 cartas de la baraja
        for (int i = 0; i < numero.length(); i++) {
            for (int j = 0; j < tipo.length(); j++) {
                Carta cartatemporal = new Carta();
                cartatemporal.setNumero(numero.charAt(j));
                cartatemporal.setTipo(tipo.charAt(i));
                this.carta[index]=cartatemporal;
                index++;
            }    
        }
        BarajarCartas();
    }
    
    void BarajarCartas(){
        //shuffle con arreglo
        ArrayList<Carta> cartas = new ArrayList(Arrays.asList(carta));        
        Collections.shuffle(cartas);
    }
    
    //metodo para retornar una carta del tope de la baraja
    public Carta getCarta(){
        if (posicion ==51) {
            System.out.println("No hay mas cartas que repartir ");
            return null;
        }
        Carta cartatemporal = this.getCarta();
        posicion ++;    //mover una posicion a la derecha/izq en el arreglo 
        return cartatemporal;
    }
      
}
