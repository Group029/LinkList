package Linklist;

public class SLinkedList {
	
	private SLlistNode head;
		
	public SLinkedList() {
		head = null; 
	}
	
	
	public SLlistNode getHead() {
		return head;
	}


	public void setHead(SLlistNode head) {
		this.head = head;
	}


	public void insertLast(int d) {
		SLlistNode newNode = new SLlistNode(d);
		if(head == null) {
			head = newNode;
			return;
		}
		else {
			SLlistNode iter = head;
			while(iter.getNext()!=null) {
				iter=iter.getNext();
			}
			iter.setNext(newNode);
		}
	}
	
	public void insertFirst(int d) {
		SLlistNode newNode = new SLlistNode(d);
		if(head==null) {
			head = newNode;
			return;
		}
		newNode.setNext(head);
		head = newNode;
	}
	
	public void insertByPosition(int d, int pos) {
		SLlistNode iter;
		SLlistNode newNode = new SLlistNode(d);
		if(head==null) {
			head = newNode;
			return;
		}
		iter = head;
		for(int i = 1;(i<=pos-1) && (iter.getNext()!=null);i++)
			iter=iter.getNext();
	
		newNode.setNext(iter.getNext());
		iter.setNext(newNode);
		return;
	}
	
	public void insertBefore(int d, int key) {
		SLlistNode iter = head;
		SLlistNode newNode = new SLlistNode(d);
		
		if(head==null) {
			System.out.println("List is empty");
			return;
		}
		if(iter.getData()==key) {
			newNode.setNext(head);
			head=newNode;
			return;
		}
		while(iter.getNext()!=null && iter.getNext().getData()!=key) 
			iter = iter.getNext();
		
		
		newNode.setNext(iter.getNext());
		iter.setNext(newNode);
		return;
	}
	
	public void insertAfter(int d, int key) {
		SLlistNode newNode = new SLlistNode();
		SLlistNode iter = head;
		
		if(head==null) {
			System.out.println("List is empty");
			return;
		}
		if(iter.getData()==key) {
			newNode.setNext(iter.getNext());
			iter.setNext(newNode);
			return;
		}
		while(iter.getNext()!=null && iter.getNext().getData()!=key) 
				iter=iter.getNext();
		
		newNode.setNext(iter.getNext().getNext());
		iter.setNext(newNode);
		return;
	}
	
	public int deleteFirst() {
		SLlistNode deletable = head;
		int d=-999;
		if(head==null) {
			return d;
		}
		d=head.getData();
		head=head.getNext();
		deletable=null;
		return d;
	}
	
	public int deleteLast() {
		int d=-999;
		SLlistNode deletable, iter;
		 if(head.getNext()==null) {
			 d=head.getData();
			 head = null;
			 return d;
		 }
		 iter=head;
		 while(iter.getNext().getNext()!=null) 
			 iter=iter.getNext();
		 
		 deletable= iter.getNext();
		 d=iter.getData();
		 iter.setNext(null);
		 
		 return d;
	}
	
	
	public String toStr() {
		String str = new String();
		SLlistNode iter ;
		for(iter=head;iter != null;iter=iter.getNext()) 
			str=str+" -> "+iter.getData();
		
		return str;
	}

	public void reverseLinklist() {
		SLlistNode prev,curr,next;
		prev =null;
		curr=head;
		 while(curr!=null) {
			 next=curr.getNext();
			 curr.setNext(prev);
			 prev=curr;
			 curr=next;
		 }
		 head=prev;
	}
	
	public int SumOfAll(SLinkedList ptr) {
		SLlistNode iter;
		int n, sum=0,temp;
		if(ptr.getHead()==null) {
			System.out.println("Empty list");
			return sum;
		}
		iter=ptr.getHead();
		while(iter!=null) {
			n=iter.getData();
			temp=n*10;
			sum= sum + temp;
			
			iter=iter.getNext();
		}
		return sum;
	}
	 
	public int deleteAfter(int key) {
		int d = -999;
		SLlistNode deletable,iter;
		if(head==null) {
			System.out.println("underflow");
			return d;
		}
		if(head.getData()==key) {
			System.out.println("1st if condition");
			deletable = head.getNext();
			d=deletable.getData();
			head.setNext(head.getNext().getNext());
			deletable=null;
			return d;
		}
		
		for(iter=head;iter.getNext()!=null && iter.getData()!=key;iter=iter.getNext());
			
		if(iter.getData()==key) {
			deletable = iter.getNext();
			d=deletable.getData();
			iter.setNext(iter.getNext().getNext());
			deletable = null;
			return d;
		}
		return d;	
	}
	
	public int deleteBefore(int key) {
		int d=-999;
		SLlistNode deletable, iter;
		if(head==null) {
			System.out.println("underflow");
			return d;
		}
		if(head.getNext().getData()==key) {
			deletable = head;
			d= head.getData();
			head=head.getNext();
			deletable= null;
			return d;
		}
		for(iter=head;iter.getNext()!=null && iter.getNext().getNext().getData()!=key;iter=iter.getNext());
		
		if(iter.getNext().getNext().getData()==key) {
			deletable=iter.getNext();
			d=deletable.getData();
			iter.setNext(iter.getNext().getNext());
			deletable=null;
			return d;
		}
		return d;
	}
	
}
