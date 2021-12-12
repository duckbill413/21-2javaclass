package �ǽ�7_9;
import java.util.*;
//Stack����: ���׸� �޼ҵ�, Interface(implements), push, pop
interface IStack<T>{
	boolean push(T ob);
	T pop();
}
class MyStack<T> implements IStack<T> {
	ArrayList<T> l = null;
	public MyStack() {
		l = new ArrayList<T>();
	}

	@Override
	public T pop() {
		if (l.size() == 0)
			return null; 
		else {
			return l.remove(0); // �� �տ� �ִ� ������ ����
		}
	}

	@Override
	public boolean push(T ob) {
		l.add(0, ob); // �� ���� ���� 
		return true;
	}
}
public class pr0709 {
	public static void main (String[] args) {
		IStack<Integer> stack = new MyStack<Integer>();
		for (int i=0; i<10; i++) stack.push(i); // 10���� ���� Ǫ��
		while (true) { // ������ �� ������ pop
			Integer n = stack.pop();
			if(n == null) break; // ������ �� ���
			System.out.print(n + " ");
		}
	}
}
