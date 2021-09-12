/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ergastirio7;

/**
 *
 * @author user
 */
public class TreeNode {
             
             private TreeNode left; 
             private int item; 
             private TreeNode right; 
           
             
             public TreeNode(int data) 
             {
                 item = data;
                 left = right = null;
             }
             
             public int getNodeData( ) 
             {
                 return item;
             }
             public TreeNode getLeftNode( ) 
             {
                 return left;
             }
             public TreeNode getRightNode( ) 
             {
                 return right;
             }
             public boolean isLeaf( ) 
             {
                 if(left==null && right==null)
                 {
                     return true;
                 }
                 else 
                 {
                     return false;
                 }
                
             }
             public void setLeftNode(TreeNode node) 
             {
                  left=node ;
             }
             public void setRightNode(TreeNode node) 
             {
                  right=node;
             }

   
             
             
             
             
}



