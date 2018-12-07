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
    private char numero;    //2345678910JQKA
    private char tipo;      // "corazones" "espada" "trebol" "cocos"

    public void setNumero(char numero) {
        this.numero = numero;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public char getNumero() {
        return numero;
    }

    public char getTipo() {
        return tipo;
    }


    
    //metodo para obtener el valor
    public int getValor(){
        if (this.numero=='J') return 11; {
            switch (this.numero) {
                case 'Q':
                    return 12;
                case 'K':
                    return 13;
                case 'A':
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

