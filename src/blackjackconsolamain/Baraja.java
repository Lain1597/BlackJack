/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjackconsolamain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;


/**
 *
 * @author LAIN-PC
 */
public class Baraja {
    public ArrayList<Carta> baraja1;
    int posicion;
    
    public Baraja(){
        baraja1= new ArrayList<>(52);
        posicion = 0;
    }
    
    //crear cartas 
    public void crearcartas(){
       
        String [] numero = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
        String [] tipo = {"♥", "♦", "♣", "♠"};   
        
        
        do{
            for (int i=0 ; i<numero.length ; i++) {
                for (int j=0 ; j<tipo.length ; j++) {
                    
                    Carta temporal = new Carta(numero[i],tipo[j]);
                    baraja1.add(temporal);                    
                    
                    System.out.println(baraja1.get(posicion).numero + baraja1.get(posicion).tipo) ;
                    posicion++;
                }
            }
        }while(posicion<52);       
       //mostramos cartas
       PrintCards(baraja1);
       //barajeamos y mostramos
       System.out.println("*********************************************");
        PrintCards(BarajarCartas(baraja1));        
        
    }
    public void PrintCards(ArrayList<Carta> maso){
        
        System.out.println("Mostramos baraja en estado actual :");
        for (Iterator<Carta> it = maso.iterator(); it.hasNext();) {
            Carta cartitas = it.next();
            System.out.println(cartitas.numero + cartitas.tipo);
        }
       
    }
    
    private ArrayList<Carta> BarajarCartas(ArrayList<Carta> maso){
        //shuffle con arreglo
        ArrayList<Carta> copia = maso;
        Collections.shuffle(copia);
        return copia;
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
