import java.util.EmptyStackException;
public class ListMain 
{
	
	private int length;
	private ListMain top;
	public ListMain(int data) 
	{
	length=0;
	top=null;
	}
	public void push(int data)
	{
		ListMain sl=new ListMain(data);
	sl.setNext(top);
	top=sl;
	length++;
	}
	public boolean isEmpty() {
	return (length==0);
	}
	public int pop()throws EmptyStackException{
	if(isEmpty()) {
	throw new EmptyStackException();
	}
	int res=top.getData();
	top=top.getNext();
	length--;
	return res;
	}
	public int size() {
	return length;
	}
	public String toString() {
	String str="";
	ListMain sl=top;
	while(sl!=null) {
	str=str+sl.toString()+"->>";
	}
	return str;
	}


}
