package generic;

public class Test {
	public static void main(String[] args) {
		GClassTest<Integer> obj1 = new GClassTest<Integer>();
		obj1.data1=3;
		System.out.println(obj1.data1);
//		GClassTest<Integer> obj2 = new GClassTest<>();
//		GMethodTest.<Integer>function(10);
		GInterTest<Integer, Double> obj = new GInterTest<Integer, Double>() {
			
			@Override
			public Double sub(Integer data1, Double data2) {
				return data1 - data2;
			}
			
			@Override
			public Integer add(Integer data1, Integer data2) {
				return data1+data2;
			}
		};
		System.out.println(obj.sub(15, 0.2));
	}
}
