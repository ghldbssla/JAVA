package day02;

public class VarTest2 {
	public static void main(String[] args) {
		//�̸� : ��ȸ��
		//���� : 24��
		//Ű : 179.55cm
		//������ : 71.2kg
		//�ֿϵ��� �̸� : �ǻ�
		String name="��ȸ��";
		int age = 24;
		double height = 179.55;
		float weight = 71.2F;
		//**float(4����Ʈ)�� �������� �⺻���� double(8����Ʈ)�� F�� �ٿ� 4����Ʈ�� �ٲ��ش�. 
		String petName = "�ǻ�";
		//syso + Ctrl + spaceBar - System.out.println(); �ڵ��ϼ�
		System.out.println("�̸� : "+name);
		System.out.println("���� : "+age+"��");
		System.out.println("Ű : "+height+"cm");
		System.out.printf("������ : %.3fkg\n",weight);
		//�Ǽ��� ���������� ���Ĺ��� %.3f��� �Ҽ��� ��°�ڸ������� ������
		System.out.printf("�ֿϵ��� �̸� : %s\n",petName);
	}
}
