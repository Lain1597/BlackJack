/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjackconsolamain;

import java.util.ArrayList;

/**
 *
 * @author LAIN-PC
 */
public class Mano {
    ArrayList<Carta> arregloMano = new ArrayList<>();
    int posicion=0;
    
    //met pedir carta
    public void PedirCarta(Carta c){
        arregloMano.add(c);
    }
    
    // devuelve mano en el formato 3Corazones    7trebol
    public String MostrarMano(){
        String Mano="";
        for (int i = 0; i < arregloMano.size() ; i++) {
            Mano += arregloMano.get(i).formacarta() + "" ;
        }
        return Mano;
    }
    
    //retorna valor numerico de la mano
    public int getValor(){
        int valor =0;       //acumulador
        boolean ace=false;  //true si la mano contiene aces
        for (int i = 0; i < arregloMano.size(); i++) {
            Carta cartatemporal = arregloMano.get(i);
            int ValorCarta = cartatemporal.getValor();
            if (ValorCarta>10) {    // osea J Q K
                ValorCarta =10;
                if (ValorCarta==1) {    //Hay un as
                    ace=true;
                    valor += ValorCarta;
                }
            }
        }
        if (ace==true && valor +10 < 21) {
            valor= valor+10;
        }
        return valor;
    }
}
