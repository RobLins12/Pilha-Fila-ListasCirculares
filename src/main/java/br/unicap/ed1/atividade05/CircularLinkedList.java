package br.unicap.ed1.atividade05;

public class CircularLinkedList<Value>  {
    private CircularListNode<Value>  sentinel;

    public CircularLinkedList(){
        this.sentinel = new CircularListNode<Value>(null, null, null);
        this.sentinel.setNext(this.sentinel);
        this.sentinel.setPrevious(this.sentinel);
    }

    public CircularListNode<Value> getHead() {
        return this.sentinel.getNext();
    }
    public CircularListNode<Value> getTail() {
        return this.sentinel.getPrevious();
    }
    public void setTail(CircularListNode<Value> tail) {
        this.sentinel.setPrevious(tail);
    }
    public void setHead(CircularListNode<Value> head) {
        this.sentinel.setNext(head);
    }

    public boolean isEmpty(){
        return this.getHead() == this.sentinel && this.getTail() == this.sentinel;
    }

    public void addFirst(Value value){
        CircularListNode<Value>  currentNode = this.getHead();
        CircularListNode<Value>  newHead = new CircularListNode<Value>(value, currentNode, sentinel);
        sentinel.setNext(newHead);
        currentNode.setPrevious(newHead);
    }  

    public int size() {
        int size = 0;
        if (isEmpty()){
            return 0;
        }
        CircularListNode<Value>  node = this.getHead();
        while (node != sentinel){
            size++;
            node = node.getNext();
        }
        return size;
    }


    public void addLast(Value value) {
        CircularListNode<Value>  currentNode = this.getTail();
        CircularListNode<Value>  newTail = new CircularListNode<Value> (value, sentinel, currentNode);
        currentNode.setNext(newTail);
        sentinel.setPrevious(newTail);
        
    }  

    public void delete(CircularListNode<Value>  nodeDelete) {
        CircularListNode<Value>  nextNode = nodeDelete.getNext();
        CircularListNode<Value>  previous = nodeDelete.getPrevious();
        nextNode.setPrevious(previous);
        previous.setNext(nextNode);
    }

    public CircularListNode<Value>  getSuccessor(CircularListNode<Value>  currentNode) {
        //Should jump sentinel
        if (isEmpty()) {
            throw new RuntimeException ("Circular list is empty");
        }
        if (currentNode.getNext() == sentinel) {
            currentNode = currentNode.getNext();
        }
        return currentNode.getNext();
    }
}
