package com.javaex.ex;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MainApp {

	public static void main(String[] args) throws IOException {

		Person p = new Person();
		System.out.println(p.toString());
		
		//Map 컬렉션 생성 --> 키(String), value 를 2가지를 정해줘야 한다
		Map<String ,Person> pMap = new HashMap<String,Person>();

		//Person
		Person ps1 = new Person(p.getName(),p.getHp(),p.getCompany());
		Person ps2 = new Person(p.getName(),p.getHp(),p.getCompany());
		Person ps3 = new Person(p.getName(),p.getHp(),p.getCompany());
		
		//Map에 주소 넣기 
		pMap.put("이효리", ps1);
		pMap.put("정우성", ps2);
		pMap.put("이정재", ps3);
		
		//pMap toString()
		System.out.println(pMap.toString());
		
		//이효리의 toString()
	 	System.out.println(pMap.get("이효리").toString());
	 	System.out.println(pMap.get("이효리").getName());
	 	System.out.println(pMap.get("이효리").getHp());
	 	System.out.println(pMap.get("이효리").getCompany());
	 	
	 	//이효리를 삭제
	 	pMap.remove("이효리"); 
	 	System.out.println(pMap.toString());
	 	
	 	Person ps4 = new Person("유재석","010-3333-3333","02-2222-2222");
	 	pMap.put("유재석", ps4);      
	 	System.out.println(pMap.toString());

	 	System.out.println("----------------------------");
	 	//같은 키값을 사용했을때
	 	Person ps5 = new Person("박명수","010-7777-7777","02-3333-3333");
	 	pMap.put("이효리", ps5);   				 	
	 	System.out.println(pMap.toString());

	 	//1. 키세트를 달라고 한다
	 	Set<String> keyset = pMap.keySet();
	 	
	 	//2. 키세트의 키값을 1개씩 꺼내서 해당 키값의 정보를 출력한다.
	 	for( String name : keyset) {
	 		System.out.println(pMap.get(name).toString());
	 	}
	 	
	 	System.out.println("----------------------------");
		
		Map<String,String> boardMap = new HashMap<String, String>();
		
		boardMap.put("title", "게시판 제목입니다");
		boardMap.put("date", "2025-05-14");
		boardMap.put("id", "jws");
		boardMap.put("contant", "게시판 글 내용입니다");
	 	
		System.out.println(boardMap.get("title"));
		System.out.println(boardMap.get("date"));
	 	
		//리스트 만들기
		List<Person> pList = new LinkedList<Person>();
		
		//Stream 준비
		Reader fr = new FileReader("C:\\JavaStudy\\workspace\\Phonebook\\PhoneDB.txt");
		BufferedReader br =new BufferedReader(fr);
		
		//스캐너 생성
		Scanner sc = new Scanner(System.in); 
		String a = sc.nextLine(); 
			/*
			while(true) {
				System.out.println(pList.toString());
				String a = sc.nextLine(); 
				
				if(a == null) {
					System.out.println(p.getName());
				}else {
					System.out.println(p.getHp());
				}
			}
			 */	
		//스트림 닫기
		fr.close();
		br.close();
		sc.close();
	}
}
