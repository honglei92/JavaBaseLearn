package math;

/**
 * @author Administrator Math类的常用api
 */
public class MathTest {
	public static void main(String[] args) {
		// 取绝对值
		System.out.println(Math.abs(-2));
		// 取较小值
		System.out.println(Math.min(3, 4));
		//round ceil floor  大于5
		System.out.println(Math.ceil(6.56));
		System.out.println(Math.round(6.56));
		System.out.println(Math.floor(6.56));
		System.out.println(Math.ceil(-6.56));
		System.out.println(Math.round(-6.56));
		System.out.println(Math.floor(-6.56));
		//小于5
		System.out.println(Math.ceil(6.46));
		System.out.println(Math.round(6.46));
		System.out.println(Math.floor(6.46));
		System.out.println(Math.ceil(-6.46));
		System.out.println(Math.round(-6.46));
		System.out.println(Math.floor(-6.46));
		//a的b次方
		System.out.println(Math.pow(2,3));
		System.out.println(Math.pow(2,3.01));
	}
}
