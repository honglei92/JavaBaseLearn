package operator;

public class Test {
	// a++ a-- --a ++b
	public static void main(String[] args) {
		int a = 2;
		++a;
		System.out.println(a); // +2
		--a;
		System.out.println(a);// -1
		a++;
		System.out.println(a);// +1
		a--;
		System.out.println(a);// -1
		int b = 5;
		System.out.println(b++);// c=b++;c==5;b==6
		System.out.println(b--);// c=b--;c==6;b==5
		System.out.println(++b);// c=++b;c==6;b==6
		System.out.println(--b);// c=--b;c==5;b=5
		System.out.println(b);// b==5
	}
}
