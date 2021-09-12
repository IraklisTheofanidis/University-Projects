/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ergastirio7;

/**
 *
 * @author user
 */
public class BSTree {
     private TreeNode root; 
     
     public BSTree( ) 
    { 
        root = null; 
    } 
    public boolean isEmpty( ) 
    { 
        return (root == null);   
    } 
    
    public void insertNode(int d,TreeNode node)
             {
                if(d < node.getNodeData()) 
                {
                    if(node.getLeftNode() == null)
                        node.setLeftNode(new TreeNode(d)) ;
                    else
                      insertNode(d,node.getLeftNode());
                }
                else
                    if(node.getRightNode() == null)
                       node.setRightNode(new TreeNode(d)) ;
                    else
                       insertNode(d,node.getRightNode());
            }
             
    private int taksinomisi(TreeNode node,int pinakas[], int i)         
    {   
        
        if(node == null)
               return i;
          taksinomisi(node.getLeftNode(),pinakas,i);
          
           pinakas[i]= node.getNodeData();
           
          System.out.print(pinakas[i]+ " ");
           i++;
           taksinomisi(node.getRightNode(),pinakas,i);
          
          return i;
    }
    
    
    
    
    private void inOrder(TreeNode node)
     {
            if(node == null)
               return;
            inOrder(node.getLeftNode());
            System.out.print(node.getNodeData() + " ");
             inOrder(node.getRightNode());
     }
             
      private void preOrder(TreeNode node)
       {
                if(node == null)
                    return;
                System.out.print(node. getNodeData() + " ");
                preOrder(node.getLeftNode());
                preOrder(node.getRightNode());
            }
             
             private void postOrder(TreeNode node)
            {
                if(node == null)
                    return;
                postOrder(node.getLeftNode());
                postOrder(node.getRightNode());
                System.out.print(node.getNodeData() + " ");
            }
  
    
    public void insertElement(int data) 
    { 
        if (isEmpty( )) 
            root = new TreeNode(data); 
        else 
        insertNode(data,root);  
    }
    
   
    public void inOrderTraversal( ) 
    { 
        int pinakas[] = new int[10];
        int i=0;
        
        System.out.println("INORDER TRAVERSAL"); 
        inOrder(root);
        System.out.println( );
        System.out.println("TAKSINOMISI PINAKA");
        taksinomisi(root,pinakas,i);
        System.out.println( );  
    }
    
    public void preOrderTraversal( ) 
    { 
        System.out.println("PREORDER TRAVERSAL"); 
        preOrder(root); 
        System.out.println( );  
    } 
    
    public void postOrderTraversal( ) 
    { 
        System.out.println("POSTORDER TRAVERSAL"); 
        postOrder(root); 
        System.out.println( );    
    } 
    
    
    
    
    
    
    
}
