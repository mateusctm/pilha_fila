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
public class LinkedFilaLIst {
     private ListNodeF first;
    private int size;

    LinkedFilaLIst() {
        first = null;
        size = 0;
    }

    LinkedFilaLIst(LinkedFilaLIst l) {
        first = l.getFirst();
        size = l.size();
    }

    public ListNodeF getFirst() {
        return first;
    }

    public int size() {
        return size;
    }

    public boolean empty() {
        return size == 0;
    }

    public void print() {

        for (ListNodeF cursor = first; cursor != null; cursor = cursor.next) {
            System.out.print(cursor.val);
        }
    }

    public void addFirst(Pessoa v) {
        first = new ListNodeF(v, first);
        size++;
    }

    public void add(Pessoa v, int index) {
        if (index == 0) {
            addFirst(v);
          
        }else{
            ListNodeF cursor = first;
            for(int i = 0;i< index -1;i++){
                cursor = cursor.next;
            }
            cursor.next = new ListNodeF(v, cursor.next);
        }
        size++;

    }

    public int indxOff(Object v) {
        int index = 0;
        ListNodeF cursor;
        for (cursor = first; cursor != null && cursor.val != v; cursor = cursor.next) {
            index++;
        }
        if (cursor == null) {
            index = -1;
        }
        return index;
    }

    public void remove(int index) {
        if (index == 0) {
            first = first.next;
        } else {
            ListNodeF cursor = first;
        }

    }
    
    public void addLast(Pessoa v){
        ListNodeF cursor;
        for (cursor = first; cursor.next == null; cursor = cursor.next){
            
        }
         cursor.next = new ListNodeF(v, cursor.next);
    }
    
    public void addPrioridade(Pessoa v){
        if(v.getPrioridade()== 1){
            addFirst(v);
        }else{
            addLast(v);
        }
    }

    
    
}
