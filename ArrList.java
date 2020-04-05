package Report03;

import java.util.NoSuchElementException;

public class ArrList <E> {
		private E a[];		// 리스트의 항목들을 저장할 배열
		private int size;	// 리스트의 항목 수
	
		public ArrList( ) { // 생성자
			a = (E[]) new Object[1];	// 최초로 1개의 원소를 가진 배열 생성
			size = 0;					// 항목 수를 0으로 초기화
		}
		public boolean isEmpty() {return size == 0;} //리스트가 empty면 true 리턴
		
		public void insertLast(E newltem) {		//가장 뒤에 새 항목 삽입
			if(size == a.length)		//배열에 빈 공간이 없으면
				resize(2*a.length);		//배열 크기 2배 확장
			a[size++] = newltem;		//새 항목 삽입
		}
		
		public void insert(E newltem, int k) { //새 항목을 k-1번째 항목 다음에 삽입
			if (size == a.length)			//배열에 빈 공간이 없으면
				resize(2*a.length);				//배열 크기가 2배로 확장
			for(int i = size-1;i>=k;i--) a[i+1] = a[i];	//한칸씩 뒤로 이동
			a[k] = newltem;
			size++;
		}
		public E delete(int k) {
			if (isEmpty()) throw new NoSuchElementException();
			E item = a[k];
			for (int i = k; i <size; i++) a[i] = a[i+1];
			size--;
			if (size > 0 && size == a.length/4)
						  resize(a.length/2);
			return item;
		}
		public E peek(int k) {
			if (isEmpty()) throw new NoSuchElementException();
			return a[k];
		}
		private void resize(int newSize) {
			Object[] t = new Object[newSize];
			for (int i = 0; i < size; i++)
						 t[i] = a[i];
			a = (E[]) t;
		}
		public void print() {
			if (isEmpty())
					System.out.print("배열이 비어있음.");
			else
					for(int i = 0; i < a.length; i++)	System.out.print(a[i] + "\t ");
			System.out.println();
		}
			public static void main(String[] args) {
				ArrList<String> s = new ArrList<String>();
				s.insertLast("apple"); 	s.print(); 	s.insertLast("orange"); s.print();
				s.insertLast("cherry"); s.print(); 	s.insertLast("pear"); 	s.print();
				s.insert("grape", 1); 	s.print(); 	s.insert("lemon",4);	s.print();
				s.insertLast("kiwi"); 	s.print();
				s.delete(4); s.print(); s.delete(0);s.print();
				s.delete(0); s.print();	s.delete(3);s.print();
				s.delete(0); s.print();
				
				System.out.println("1번째 항목은 "+s.peek(1)+"이다."); System.out.println();
				
				ArrList<Integer> t = new ArrList<Integer>();
				t.insertLast(100); t.insertLast(200); t.insertLast(300); t.insertLast(400); t.print();
				t.insert(350,3);	t.print();
				t.insert(250,2);	t.print();
				t.insertLast(500);	t.print();
			}
}