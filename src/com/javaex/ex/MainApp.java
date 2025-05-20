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
			
				String a = sc.nextLine(); 
				if(a == 1) {
					System.out.println(p.toString());
				}else if(a == 2) {
					
				}
			}
		//스트림 닫기
		fr.close();
		br.close();
		sc.close();
	}
}
