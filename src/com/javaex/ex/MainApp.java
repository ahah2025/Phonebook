package com.javaex.ex;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class MainApp {

	public static void main(String[] args) throws IOException {

		//리스트 만들기
		List<Person> pList = new ArrayList<Person>();
		
		//Stream 준비
		Reader fr = new FileReader("C:\\JavaStudy\\workspace\\Phonebook\\PhoneDB.txt");
		BufferedReader br =new BufferedReader(fr);
		
		while(true) {
			String s = br.readLine();
			
			//마지막이면 끝
			if(s == null) {
				break;
			}
			System.out.println(s);
			
			String[] sArr = s.split(","); 
			
			String name = sArr[0];
			String hp = sArr[1];
			String company = sArr[2];
		
			//Person을 메모리에 올린다
			Person p = new Person(name,hp,company);
			
			//Person 주소를 List에 추가한다
			pList.add(p);
		}
		
		//출력
		System.out.println("------출력------------------------");
		//System.out.println(pList.toString());
		
		System.out.println("첫번째 사람의 이름,hp,company");
		
		Person p01 = pList.get(1);
		System.out.println(pList.get(1).getName());
		System.out.println(pList.get(1).getHp());
		System.out.println(pList.get(1).getCompany());
		
		//스트림 닫기
		fr.close();
		br.close();
	}
}
