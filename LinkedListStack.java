public class LinkedListStack

	{
	public int data;
	public LinkedListStack next;
	public LinkedListStack(int data)
	{
	this.data=data;
	this.next=null;
	}
	public int getData() {
	return data;
	}
	public void setData(int data)
	{
	this.data = data;
	}
	public LinkedListStack getNext() {
	return next;
	}
	public void setNext(LinkedListStack next) {
	this.next = next;
	}
	public String toString() {
	return data +"-->>";
	}
	}

