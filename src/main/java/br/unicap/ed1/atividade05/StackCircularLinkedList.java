package br.unicap.ed1.atividade05;

public class StackCircularLinkedList<Value> implements IStack<Value>{

    private CircularLinkedList<Value> list;

    public StackCircularLinkedList() {
        this.list = new CircularLinkedList<>();
    }

    @Override
    public boolean isEmpty() {
        // Verify if is empty based of list isEmpty method
        return this.list.isEmpty();
    }

    @Override
    public void push(Value key) {
        this.list.addLast(key);
    }

    @Override
    public Value pop() throws Exception {
        if (isEmpty()){
            throw new Exception("Stack is empty");
        }
        CircularListNode<Value> tail = this.list.getTail();
        var data = tail;
        this.list.delete(tail);
        return data.getValue();
    }

}
