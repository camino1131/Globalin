package com.gameex;

public class DictionApp extends Dictionary {

	public DictionApp() {
		
	}
	
	@Override
	void put(String key, String value) {
		super.put(key, value);
	}
	
	public static void main(String[] args) {
		
		Dictionary dic = new Dictionary(10);
        dic.put("가길동", "자바");
        dic.put("나길동", "파이썬");
        dic.put("나길동", "C++");

        System.out.println("나길동의 값은 " + dic.get("나길동"));
        System.out.println("가길동의 값은 " + dic.get("가길동"));
        dic.delete("가길동");
        System.out.println("가길동의 값은 " + dic.get("가길동"));

        System.out.println("현재 개수 : " + dic.length());
        /*
         * 나길동의 값은 C++;
          가길동의 값은 자바;
          가길동의 값은 null;
         */
	}

}
