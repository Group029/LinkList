package Linklist;

public class SLlistNode {
	
	private int data;
	private SLlistNode next;
	
	public SLlistNode() {
		data=0;
		next=null;
	}
	
	public SLlistNode(int data) {
		this.data=data;
		next = null;
	}
	
	public void setData(int d) {
		this.data=d;
	}
	
	public int getData() {
		return data;
	}
	
	public void setNext(SLlistNode next) {
		this.next = next;
	}
	
	public SLlistNode getNext() {
		return next;
	}
}
