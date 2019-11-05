/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilha_fila;

/**
 *
 * @author aluno
 */
public class ListNodeF {

    Pessoa val;
    ListNodeF next;

    ListNodeF(Pessoa x, ListNodeF n) {
        val = x;
        next = n;
    }
}
