
public class Queue {
	int queue[]=new int[5];
	int size;
	int front;
	int rear;
	
	public void enQueue(int data) {
		queue[rear]=data;
		rear=rear+1;
		size=size+1;
	}
	
	public void show() {
		System.out.println("Elements : ");
		for (int i=0;i<size;i++) {
			System.out.print(queue[i] + " ");
		}
	}
	public static void main(String[] args) {
		Queue q=new Queue();
		q.enQueue(5);
		q.enQueue(2);

		q.show();

	}

}
