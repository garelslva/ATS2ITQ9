/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;
import questao9.BinaryTree;

/**
 *
 * @author garel
 */
public class Questao9Test {
    
    public Questao9Test() {
    }
    
   @Test
   public void testSomaDeElementos() throws Exception{
       BinaryTree bt = new BinaryTree();
       assertEquals(BinaryTree.somaDeElementos(bt),0);
   }
       
   @Test
   public void testSomaDeElementos10() throws Exception{
       BinaryTree bt = new BinaryTree();
       bt.valor=10;
       assertEquals(BinaryTree.somaDeElementos(bt),10);
   }
   
   @Test
   public void testSomaDeElementos14() throws Exception{
       BinaryTree bt = new BinaryTree();
       bt.right = new BinaryTree();
       bt.valor=10;
       bt.right.valor=4;
       //bt.left.valor=9;
       assertEquals(BinaryTree.somaDeElementos(bt),14);
   }
   
   @Test
   public void testSomaDeElementos23() throws Exception{
       BinaryTree bt = new BinaryTree();
       bt.right = new BinaryTree();
       bt.left = new BinaryTree();
       bt.valor=10;
       bt.right.valor=4;
       bt.left.valor=9;
       assertEquals(BinaryTree.somaDeElementos(bt),23);
   }
   
   @Test
   public void testSomaDeElementos49() throws Exception{
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
       
       assertEquals(BinaryTree.somaDeElementos(bt),49);
   }
   
}
