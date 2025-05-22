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

		//리스트
		List<Person> psList = new ArrayList<Person>();
				
		//Stream 준비
		Reader fr = new FileReader("../PhoneDB.txt");
		BufferedReader br =new BufferedReader(fr);
				
		//반복
		while(true) {
			String str = br.readLine();
			
			if(str == null) {
				break;
			}
			String[] sArr = str.split(",");
			
			String name = sArr[0];
			String hp=sArr[1];
			String company = sArr[2];
			
			Person ps = new Person(name,hp, company);
			psList.add(ps);
		}
		
		///////////////////////////////////////////////////////////////
		System.out.println("*******************************************************");
		System.out.println("*                전화번호 관리 프로그램               *");
		System.out.println("*******************************************************");
		System.out.println();
		System.out.println("1.리스트   2.등록   3.삭제   4.검색   5.종료");
		
		///////////////////////////////////////////////////////////////
		
		//스캐너 생성
		Scanner sc = new Scanner(System.in); 
		///////////////////////////////////////////////////////////////
		//출력
		//<1.리스트>
		while(true) {
			
			System.out.println("-------------------------------------------------------");
			System.out.println("1.리스트   2.등록   3.삭제   4.검색   5.종료");
			System.out.print(">메뉴번호:");
			
			String number =  sc.nextLine();
			
			if(number.equals("1")) {
				System.out.println("<1.리스트>");
				
				for(int i=0; i<psList.size(); i++) {
					Person p = psList.get(i);
					System.out.println((i+1) + ".   "+ p.getName() + "  " + p.getHp() + "   " + p.getCompany());
				}
			}  else if(number.equals("2")) {				
				//<2.등록>
				
				System.out.println("<2.등록>");
				System.out.print(">이름:");
				String name = sc.nextLine();
				System.out.print(">휴대전화:");
				String hp = sc.nextLine();
				System.out.print(">회사번호:");
				String company = sc.nextLine();
				
				Person newPerson = new Person(name, hp, company);
				psList.add(newPerson);
				
				System.out.println("[등록되었습니다]");
			}else if (number.equals("3")) {
				System.out.println("<3.삭제>");
				System.out.print(">번호:");
				String pn = sc.nextLine();  
				
				int pNum = Integer.parseInt(pn)-1;
				
				if(pNum>=0) {
					psList.remove(pNum);
					System.out.println("[삭제되었습니다]");
				}
				
				
			} else if (number.equals("4")) {
				System.out.println("<4.검색>");
				System.out.print(">이름:");
				String sp = sc.nextLine();
				
				for(int i=0; i<psList.size(); i++) {
					Person p = psList.get(i);
					
					if(p.getName().contains(sp)) {
						System.out.println((i+1) + ".   "+ p.getName() + "  " + p.getHp() + "   " + p.getCompany());
					}
				}
				
			}else if (number.equals("5")) {
				System.out.println("*************************************************");
				System.out.println("*                   감사합니다                  *");
				System.out.println("*************************************************");
				break;
			} else {
				System.out.println("[다시 입력해 주세요]");
				System.out.println();
			}
		}

		//스트림 닫기
		fr.close();
		br.close();
		sc.close();
	}
}

