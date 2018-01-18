/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao9;

/**
 *
 * @author garel
 */

public class BinaryTree {
    public int valor;
    public BinaryTree left;
    public BinaryTree right;   
    
    public BinaryTree(){
    }
    
    static public int somaDeElementos(BinaryTree no)throws Exception{
                
        if(no == null) return 0;
        else           return no.valor + somaDeElementos(no.left)+somaDeElementos(no.right); 
    }
}
