package day12;
/**
 * 
 * @author admin
 * @since JDK 8
 * <br>Calculator
 * @version 1.0
 *Ŭ������ ������ ���� ĭ
 */

public class Clac {
	/**
	 * To add the following numbers.<br>
	 * @param num1 : first Integer for add
	 * @param num2 : Second Integer for add
	 * @return value(int type)
	 * �޼ҵ��� ������ ���� ĭ
	 */
	int add(int num1, int num2) {
		return num1+num2;
	}
	int sub(int num1, int num2) {
		return num1-num2;
	}
	int mul(int num1, int num2) {
		return num1*num2;
	}
	/**
	 * To divide the following numbers.<br>
	 * @param num1 : first Integer for add
	 * @param num2 : Second Integer for add
	 * @return value(int type)
	 * @throws ArithmeticException
	 * @see Math
	 */
	int div(int num1, int num2) {
		return num1/num2;
	}
}
