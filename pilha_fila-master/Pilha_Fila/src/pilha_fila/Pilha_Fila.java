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
        x = parseInt(JOptionPane.showInputDialog("informe o tamanho da palavra"));

        for (int i = 0; i < x; i++) {
            a = JOptionPane.showInputDialog("informe os caractere da palavra");

            l.addFirst(a);
        }
        l.print();

        Pessoa p1 = new Pessoa("mateus", 1, "123456");
        Pessoa p2 = new Pessoa("mateus", 0, "1451236");
        Pessoa p3 = new Pessoa("mateus", 1, "1321654");

        LinkedFilaLIst l1 = new LinkedFilaLIst();
        l1.addPrioridade(p1);
        l1.addPrioridade(p2);
        l1.addPrioridade(p3);

    }

}
