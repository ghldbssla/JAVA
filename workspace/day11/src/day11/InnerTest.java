package day11;

public class InnerTest {
	public static void main(String[] args) {
		Out out = new Out();
		Out.In in = out.new In();
		in.printInData();
		//in.printoutData();	--X
		// in.out				--X
		// 상속받은것 처럼 선언할 수 있지만 사용은 하지못한다.
		//System.out.println(out.inData); --X
	}
}

class Out {
	int outData;
	void printOutData() {
		System.out.println(outData);
	}
	class In {
		int inData;
		void printInData() {
			outData = 50;
			printOutData();
			System.out.println(inData);
			// 상속받은것 처럼 선언할 수 있지만 사용은 하지못한다.
		}
	}
}
