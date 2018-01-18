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
public class Questao9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        BinaryTree bt = new BinaryTree();
       
       bt.right = new BinaryTree();
       bt.right.right = new BinaryTree();
       bt.right.left = new BinaryTree();
       
       bt.left = new BinaryTree();
       bt.left.left = new BinaryTree();
       bt.left.right = new BinaryTree();
       
       bt.valor=10;
       
       bt.right.valor=4;
       bt.right.right.valor=4;
       bt.right.left.valor=4;
       
       bt.left.valor=9;
       bt.left.left.valor=9;
       bt.left.right.valor=9;
       
       System.out.println(BinaryTree.somaDeElementos(bt));
    }
    
    
    
}
