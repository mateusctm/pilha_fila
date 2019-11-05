/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilha_fila;

import static java.lang.Integer.parseInt;
import javax.swing.JOptionPane;

/**
 *
 * @author mateu
 */
public class Pilha_Fila {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Linkintlist l = new Linkintlist();
        int x;
        String a;
       x = parseInt(JOptionPane.showInputDialog("informe o tamanho da pilha"));
        
       for(int i = 0; i< x; i++){
           a = JOptionPane.showInputDialog("informe os elementos da pilha");
           
           l.addFirst(a);
       }
       l.print();
        
        
        
    }
    
}
