package com.tracking.lib.constants;

public class MaskingConstants {
	
	// 아이디 정보. 앞의 2자리 제외한 나머지 전체
	public static final String ID = "id";
	
	// 성명. 성명의 가운데 글자(단, 성명이 2글자인 경우 뒷글자, 성명이 4글자 이상인 경우 3번째 자리
	public static final String NAME = "name";
	
	// 유선 전화번호. 뒤에서부터 5 ~ 8번 째 자리
	public static final String TEL_NO = "telNo";
	
	// 휴대 전화번호. 뒤에서부터 5 ~ 8번 째 자리
	public static final String PHONE_NO = "phoneNo";
	
	// 이메일주소. 앞의 2자리 제외한 이메일 아이디 정보
	public static final String EMAIL = "email";
	
	// 도로명 주소. 도로명 이하의 건물번호 및 상세 주소의 숫자
	public static final String ADDRESS = "address";
	
	// 생년월일. 년을 제외한 월일
	public static final String BIRTH_DATE = "birthDate";
	
	// ip주소. 2번째, 3번재 구간
	public static final String IP_ADDRESS = "ipAddress";
	
	// 계좌번호. 뒤에서 5번째 자리
	public static final String ACCOUNT = "account";
	
	// 카드번호. 앞 4자리와 뒤 4자리를 제외한 나머지 전체
	public static final String CARD = "card";	
}
