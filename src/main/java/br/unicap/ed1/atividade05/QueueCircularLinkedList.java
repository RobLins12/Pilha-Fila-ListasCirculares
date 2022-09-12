package br.unicap.ed1.atividade05;

public class QueueCircularLinkedList<Value> implements IQueue<Value>{

    private CircularLinkedList<Value> list;

    public QueueCircularLinkedList(){
        this.list = new CircularLinkedList<>();
    }

    @Override
    public boolean isEmpty() {
        //// Verify if is empty based of list isEmpty method
        return this.list.isEmpty();
    }

    @Override
    public void enqueue(Value key) {
        this.list.addFirst(key);
    }

    @Override
    public Value dequeue() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        }
        CircularListNode<Value> tail = this.list.getTail();
        var data = tail;
        this.list.delete(tail);
        return data.getValue();
    }
    
}
