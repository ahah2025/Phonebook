package com.javaex.ex;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) throws IOException {

		Person p = new Person();
		System.out.print(p.toString());
		
		Scanner sc = new Scanner(System.in); 
		sc.nextLine();
		
		//리스트 만들기
		List<Person> pList = new ArrayList<Person>();
		
		//Stream 준비
		Reader fr = new FileReader("C:\\JavaStudy\\workspace\\Phonebook\\PhoneDB.txt");
		BufferedReader br =new BufferedReader(fr);
		
		while(true) {
			String s = br.readLine();
			
			if(s == "1") {
				System.out.print(p.toString());
				break;
			}
		}
		//출력
		System.out.println("------출력------------------------");
		System.out.println(pList.toString());
		
		System.out.println("------첫번째 사람의 이름,hp,company--------------");
		System.out.println(pList.get(0).getName());
		System.out.println(pList.get(0).getHp());
		System.out.println(pList.get(0).getCompany());
		
		//스트림 닫기
		sc.close();
		fr.close();
		br.close();
	}
}
