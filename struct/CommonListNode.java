package struct;

public class CommonListNode<E> {
	E value;
	CommonListNode<E> next;
	
	public CommonListNode() {
		// TODO Auto-generated constructor stub
	}
	public CommonListNode(E value){
		this.value = value;
	}
	public CommonListNode(E value,CommonListNode<E> next){
		this.value = value;
		this.next = next;
	}
}
