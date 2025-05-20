package com.javaex.ex;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) throws IOException {

		Person p = new Person();
		System.out.print(p.toString());
		
		//리스트 만들기
		List<Person> pList = new ArrayList<Person>();
		
		//Stream 준비
		Reader fr = new FileReader("C:\\JavaStudy\\workspace\\Phonebook\\PhoneDB.txt");
		BufferedReader br =new BufferedReader(fr);
		
		//스캐너 생성
		Scanner sc = new Scanner(System.in); 
		
			while(true) {
				System.out.println(pList.toString());
				System.out.println();
			
				//메뉴번호 선택
				String no = sc.nextLine(); 
				switch(no) {
					case "1": 
						System.out.println(p.getName());
						break;
					case "2": 
						System.out.println(p.getHp());
						break;
					case "3": 
						System.out.println(p.getCompany());
						break;
					default:
						System.out.println("파일이 없습니다");
						break;
				}
			}
		/*
		//Stream 준비
		Reader fr = new FileReader("C:\\JavaStudy\\workspace\\Phonebook\\PhoneDB.txt");
		BufferedReader br =new BufferedReader(fr);
		
		while(true) {
			String i = sc.nextLine();
			
			if(i=="1") {
				System.out.print("파일이 있습니다");
				System.out.println(fr.read());
				break;
			}else {
				System.out.print("파일 X");
			}
		}
		
		//스트림 닫기
		sc.close();
		fr.close();
		br.close();
		*/
	}
}
