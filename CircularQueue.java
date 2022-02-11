
public class CircularQueue {
	int size;
	int front, rear;
	int items[];
	
	CircularQueue(int size) {
		front=-1;
		rear=-1;
		this.size=size;
		this.items=new int[size];
	}
	boolean isFull() {
		if (front==0 && rear == size-1) {
			return true;
		}
		if (front==rear+1) {
			return true;
		}
		return false;
	}
	
	boolean isEmpty() {
		if (front==-1) {
			return true;
		}
		else {
			return false;	
		}
	}
	void enQueue(int element) {
		if (isFull()) {
			System.out.println("Queue is full");
		}
		else {
			if (front==-1) {
				front=0;
			}
			rear=(rear+1)%size;
			items[rear]=element;
			System.out.println("Inserted" + element);
		}
	}
	
	int deQueue() {
		int element;
		if (isEmpty()) {
			System.out.println("Queue is empty");
			return (-1);
		}
		else {
			element=items[front];
			if (front==rear) {
				front=-1;
				rear=-1;
			}
			else {
				front=(front+1)%size;
			}
			return (element);
		}
	}
	
	void display() {
		int i;
		if (isEmpty()) {
			System.out.println("Empty Queue");
		}
		else {
			System.out.print("Items ->");
			for (i=front;i!=rear;i=(i+1)%size) {
				System.out.print(items[i] + " ");
			}
			System.out.println(items[i]);
		}
	}
	
	public static void main(String[] args) {
		CircularQueue q=new CircularQueue(8);
		q.deQueue();
		
		q.enQueue(1);
		q.enQueue(2);
		q.enQueue(3);
		q.enQueue(4);
		q.enQueue(5);
		q.enQueue(6);
		q.enQueue(7);
		q.enQueue(8);
		
		q.enQueue(9);
		q.display();
		int elem=q.deQueue();
		
		if (elem!=-1) {
			System.out.println("Deleetd Element is " + elem);
		}
		q.display();
		
		q.enQueue(10);
		
		q.display();
		
		q.enQueue(11);
	
	}

}
