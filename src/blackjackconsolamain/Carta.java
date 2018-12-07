/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjackconsolamain;

/**
 *
 * @author LAIN-PC
 */
public class Carta {
    public String numero;    //2345678910JQKA
    public String tipo;      // "corazones" "espada" "trebol" "cocos"
    
    public Carta(String numero , String tipo){
        this.numero = numero;
        this.tipo = tipo;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNumero() {
        return numero;
    }

    public String getTipo() {
        return tipo;
    }


    
    //metodo para obtener el valor
    public int getValor(){
        if ("J".equals(this.numero)) return 11; {
            switch (this.numero) {
                case "Q":
                    return 12;
                case "K":
                    return 13;
                case "A":
                    return 1;
                default:
                    return Integer.parseInt(this.numero+ "" );
            }
        }
    }
    
    //retornar la carta 2corazones  3trebol
    public String formacarta(){                 //toString
        return this.numero + "" + this.tipo;
    }
}

