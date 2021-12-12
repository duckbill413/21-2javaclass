package 실습7_9;
import java.util.*;
//Stack예제: 제네릭 메소드, Interface(implements), push, pop
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
			return l.remove(0); // 맨 앞에 있는 아이템 삭제
		}
	}

	@Override
	public boolean push(T ob) {
		l.add(0, ob); // 맨 끝에 삽입 
		return true;
	}
}
public class pr0709 {
	public static void main (String[] args) {
		IStack<Integer> stack = new MyStack<Integer>();
		for (int i=0; i<10; i++) stack.push(i); // 10개의 정수 푸시
		while (true) { // 스택이 빌 때까지 pop
			Integer n = stack.pop();
			if(n == null) break; // 스택이 빈 경우
			System.out.print(n + " ");
		}
	}
}
