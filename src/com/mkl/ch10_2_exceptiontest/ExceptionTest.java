package com.mkl.ch10_2_exceptiontest;

import java.lang.*;//java의 기본 클래스로 생략 가능

public class ExceptionTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		int a = 10;
		int[] arr = {1,2,3};
		
		//예외처리
		try {
			int result = a / 0;
		} catch (Exception e) {//모든 에러 catch
			System.out.println("모든 수는 0으로 나눌 수 없습니다.");
			System.out.println(e);
		}
		try {
			try {
				System.out.println(arr[7]);
			} catch (ArithmeticException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();//에러메시지 출력
			}
			try {
				int result2 = a / 0;
			} catch (ArrayIndexOutOfBoundsException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();//에러메시지 출력
			}
		} finally {
			System.out.println("에러의 발생여부와 상관없이 반드시 실행됨!");
		}
		
		ThrowsTest throwsTest = new ThrowsTest();
		//test 메소드에 throws 에러 떠넘기기가 선언되어 있으므로 test 메소드를 호출하는 측에서 예외처리를 진행해야 함
//		try {
//			throwsTest.test(10);
//		}
		}
		String a = "korea";

}
