/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ergastirio8;

/**
 *
 * @author user
 */
public class TreeNode {
     private TreeNode left; 
             private Object item; 
             private TreeNode right; 
           
             
             public TreeNode(Object data) 
             {
                 item = data;
                 left = right = null;
             }
             
             public Object getNodeData( ) 
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
