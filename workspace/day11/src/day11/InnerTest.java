package day11;

public class InnerTest {
	public static void main(String[] args) {
		Out out = new Out();
		Out.In in = out.new In();
		in.printInData();
		//in.printoutData();	--X
		// in.out				--X
		// ��ӹ����� ó�� ������ �� ������ ����� �������Ѵ�.
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
			// ��ӹ����� ó�� ������ �� ������ ����� �������Ѵ�.
		}
	}
}
