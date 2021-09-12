/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ergastirio8;

/**
 *
 * @author user
 */
public class BSTree {
     private TreeNode root; 
     private int size;
     
     public BSTree( ) 
    { 
        root = null; 
    } 
    public boolean isEmpty( ) 
    { 
        return (root == null);   
    } 
    
    public int numberOfNodes()
    {
        return size;
    }
    
    public int treeHeight()
    {
        return treeHeight(root);
        
    }

    public int treeHeight(Object data)
    {
        if(data == null)
        {
            return 0;
        }

        int left = treeHeight(((TreeNode) data).getLeftNode());
        int right = treeHeight(((TreeNode) data).getRightNode());

        if(left > right)
        {
            return left + 1;
        }
        else
        {
            return right + 1;
        }
    }
//     public int treeHeightDeksi()
//    {
//        return treeHeightDeksi(root);
//        
//    }
//    public int treeHeightDeksi(Object data)
//    {
//        if(data == null)
//        {
//            return 0;
//        }
//
//        int left = treeHeightDeksi(((TreeNode) data).getLeftNode());
//        int right = treeHeightDeksi(((TreeNode) data).getRightNode());
//        
//             right =right+1;
//             
//             return right;
//    }
    
    public void insertNode(Object d,TreeNode node)
             {
                if (((Comparable)d).compareTo((Comparable)node.getNodeData())<0)
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
  
    
    public void insertElement(Object data) 
    { 
        if (isEmpty( )) 
            root = new TreeNode(data); 
        else 
        insertNode(data,root);  
        size++;
    }
    
   
    public void inOrderTraversal( ) 
    { 
  
        
        System.out.println("INORDER TRAVERSAL"); 
        inOrder(root);
        
        
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
