package br.unicap.ed1.atividade05;

public interface IQueue<Value> {

	public void enqueue(Value key);

	public Value dequeue() throws Exception;

	public boolean isEmpty();

}
