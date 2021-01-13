package coolsms;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

import org.json.simple.JSONObject;
import net.nurigo.java_sdk.api.Message;
import net.nurigo.java_sdk.exceptions.CoolsmsException;

public class SendEx {
	public static void main(String[] args) {
		String api_key = "API_KEY";//본인 api_key 작성
		String api_secret = "SECRET_KEY";//본인 secret_key 작성
		Scanner sc = new Scanner(System.in);
		Message coolsms = new Message(api_key, api_secret);
		HashMap<String, String> set = new HashMap<String, String>();//옵션들 세팅할 HashMap
		
		//인증코드 구현(str을 랜덤으로 6자리를 뽑는다.)
		String str = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM0123456789~!@#$%^&*()_-";
		String code = "";
		Random r = new Random();
		for (int i = 0; i < 6; i++) {
			int idx = r.nextInt(str.length());
			code += str.charAt(idx);
		}

		set.put("to", "수신번호"); // 수신번호
		set.put("from", "발신번호"); // 발신번호
		set.put("text", "회원가입 인증을 위한 코드입니다. 입력해주세요.\n" + code); // 문자내용
		set.put("type", "sms"); // 문자 타입

		// 제이슨은 객체로 해쉬맵처럼 키와 벨류 값으로 생겼다.

		try {
			JSONObject result = coolsms.send(set); // 보내기&전송결과받기
			String resultMsg=result.get("success_count").toString();// {"error_count" : 전송실패한횟수}
			if(resultMsg.equals("1")) {
				System.out.print("인증코드 입력 : ");
				String input = sc.next();
				if(input.equals(code)) {
					System.out.println("인증 완료");
				}
			}
		} catch (CoolsmsException e) {
			e.printStackTrace();
		}
	}
}
