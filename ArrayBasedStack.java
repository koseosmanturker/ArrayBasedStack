
public class ArrayBasedStack<T> implements Stack<T>{
	
	private static final int MAX_SIZE = 20;
	private T[] items =  setArraySize(MAX_SIZE);
	private int size = -1;

	@Override
	public boolean isEmpty() {
		return (size == -1);
	}

	@Override
	public boolean isFull() {
		return (size == MAX_SIZE - 1);
	}

	@Override
	public void push(T itm) {
		
		if(isFull()) {
			throw new RuntimeException("Stack Overflow");
		}
		
		size++;
		items[size] = itm;
		
	}

	@Override
	public T pop() {
		
		if(isEmpty()) {
			throw new RuntimeException("Stack Underflow");
		}
		
		T popValue = items[size];
		size--;
		
		return popValue;
	}

	@Override
	public T peek() {
		
		if(isEmpty()) {
			throw new RuntimeException("Stack Underflow");
		}
		
		return items[size];
	}
	
	public String toString() {
		
		if(isEmpty()) {
			return null;
		}
		
		String str = "¯¯¯¯¯";
		for(int i = 0; i <= size; i++) {
			str = "| " + items[i] + " |" + "\n" + str;
		}
		str = "_   _" + "\n" + str;
		
		return str;
	}
	
	public T[] setArraySize(int size) {
	    Object[] genericArray = new Object[size];
	    return (T[]) genericArray;
	}
	

}
