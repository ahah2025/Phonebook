package com.javaex.ex;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class MainApp {

	public static void main(String[] args) throws IOException {

		/*
		*리스트의 정보를 변경하고 모든 정보를 파일에 다시쓴다
		arrayList(메모리)-->phoneDB.txt
		 */
		
		Person p = new Person();
		System.out.println(p.toString());
		
		//주 Stream 준비
		Reader fr = new FileReader("C:\\JavaStudy\\workspace\\Phonebook\\PhoneDB.txt");
				
		//보조 스트림 준비
		BufferedReader br =new BufferedReader(fr);
		
		while(true) {
			String s = br.readLine();
			
			if(s == "1") {
				System.out.println("<1.리스트>"+"\n"+"1.	"+" 이효리	"+"010-2222-3333	"+"031-2323-4441");
				break;
			}
			System.out.println(s);
		}
		
		
		//스트림 닫기
		fr.close();
		br.close();
	}
}
