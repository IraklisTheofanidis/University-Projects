/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package askisi4_1;


public class SLListNode 
{
    private Object data;
    private SLListNode nextNode;
    
    
    public SLListNode()
    {
        this(null,null);
    }

    public SLListNode(Object data, SLListNode nextNode) {
        this.data = data;
        this.nextNode = nextNode;
    }

    public Object getData() {
        return(data);
    }

    public SLListNode getNextNode() {
        return(nextNode);
    }

    public void setData(Object data) {
        this.data = data;
    }

    public void setNextNode(SLListNode nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public String toString() {
        return "SLListNode{" + "data=" + data + ", nextNode=" + nextNode + '}';
    }
    
}
