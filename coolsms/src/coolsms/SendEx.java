package coolsms;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

import org.json.simple.JSONObject;
import net.nurigo.java_sdk.api.Message;
import net.nurigo.java_sdk.exceptions.CoolsmsException;

public class SendEx {
	public static void main(String[] args) {
		String api_key = "API_KEY";//���� api_key �ۼ�
		String api_secret = "SECRET_KEY";//���� secret_key �ۼ�
		Scanner sc = new Scanner(System.in);
		Message coolsms = new Message(api_key, api_secret);
		HashMap<String, String> set = new HashMap<String, String>();//�ɼǵ� ������ HashMap
		
		//�����ڵ� ����(str�� �������� 6�ڸ��� �̴´�.)
		String str = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM0123456789~!@#$%^&*()_-";
		String code = "";
		Random r = new Random();
		for (int i = 0; i < 6; i++) {
			int idx = r.nextInt(str.length());
			code += str.charAt(idx);
		}

		set.put("to", "���Ź�ȣ"); // ���Ź�ȣ
		set.put("from", "�߽Ź�ȣ"); // �߽Ź�ȣ
		set.put("text", "ȸ������ ������ ���� �ڵ��Դϴ�. �Է����ּ���.\n" + code); // ���ڳ���
		set.put("type", "sms"); // ���� Ÿ��

		// ���̽��� ��ü�� �ؽ���ó�� Ű�� ���� ������ �����.

		try {
			JSONObject result = coolsms.send(set); // ������&���۰���ޱ�
			String resultMsg=result.get("success_count").toString();// {"error_count" : ���۽�����Ƚ��}
			if(resultMsg.equals("1")) {
				System.out.print("�����ڵ� �Է� : ");
				String input = sc.next();
				if(input.equals(code)) {
					System.out.println("���� �Ϸ�");
				}
			}
		} catch (CoolsmsException e) {
			e.printStackTrace();
		}
	}
}
