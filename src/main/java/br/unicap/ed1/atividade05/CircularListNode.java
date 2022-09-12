package br.unicap.ed1.atividade05;

public class CircularListNode<Value> {
    private CircularListNode<Value>  previous;
    private CircularListNode<Value>  next;
    private Value value;

    public CircularListNode(Value value, CircularListNode<Value>  next, CircularListNode<Value>  previous) {
        this.value = value;
        this.next = next;
        this.previous = previous;
    }

    public CircularListNode<Value>  getPrevious() {
        return previous;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    public CircularListNode<Value>  getNext() {
        return next;
    }

    public void setNext(CircularListNode<Value>  next) {
        this.next = next;
    }

    public void setPrevious(CircularListNode<Value>  previous) {
        this.previous = previous;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if(obj instanceof CircularListNode<?>){
            CircularListNode<?>  other = (CircularListNode<?>) obj;
            return this.value.equals(other.value);
        }   
        return false;
    } 
}

