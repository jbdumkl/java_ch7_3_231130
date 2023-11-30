package com.mkl.ch11_1_apiclass;

import com.mkl.ch7_3_abstract.CameraPhone;
import com.mkl.ch7_3_abstract.Phone;

public class ClassClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Class clazz = String.class;
	
		Class phoneClass1 = Phone.class;//Phone 클래스의 정보를 가져와서 저장
		
		try {
			Class phoneClass2 = Class.forName("com.mkl.abstract.Phone");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Phone phone = new CameraPhone();
		Class phoneClass3 = phone.getClass();
		System.out.println(phoneClass1.getName());
		
		String str = "홍길동";
		
		String str2 = new String("김유신");
		
		System.out.println(str2);
	}

}
