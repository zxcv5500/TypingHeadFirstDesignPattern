package headfirst.templatemethod.barista;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TeaWithHook extends CaffineBeverageWithHook {

	@Override
	void brew() {
		System.out.println("차를 우려내는 중");
	}

	@Override
	void addCondiments() {
		System.out.println("레몬을 추가함.");
	}

	@Override
	boolean custommerWantsCondiments() {
		
		if (getUserInput().toLowerCase().startsWith("y")) {
			return true;
		} else {
			return false;
		}
		
	}

	private String getUserInput() {
		// 사용자의 응답을 얻어낸다.
		String answer = null;
		
		System.out.println("우유와 설탕을 커피에 넣을까요? (y/n)? ");
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			answer = in.readLine();
		} catch (IOException ioe) {
			System.err.println("IO error 당신의 응답을 읽어보세요.");
		}
		if (answer == null) {
			return "no";
		}
		
		return answer;
	}
	
	

}
