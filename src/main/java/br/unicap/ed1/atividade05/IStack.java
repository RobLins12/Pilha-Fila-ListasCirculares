package br.unicap.ed1.atividade05;

public interface IStack<Value> {

	public boolean isEmpty();

	public void push(Value key);

	public Value pop() throws Exception;
}
