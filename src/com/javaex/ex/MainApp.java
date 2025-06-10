//--------
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
		Reader fr = new FileReader("C:\\JavaStudy\\workspace\\Phonebook\\PhoneDB.txt");
		//Reader fr = new FileReader("../PhoneDB.txt");
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

package com.project;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TableSales {

	private static String sa;
	private static String s1;

	public static void main(String[] args) throws IOException  {
		
		//리스트
		List<Day> DList = new ArrayList<Day>();
				
		//Stream 준비
		Reader fr = new FileReader("C:\\JavaStudy\\workspace\\MiniProject\\Category.txt");
		BufferedReader br = new BufferedReader(fr);
				
		//반복
		while(true) {
			String str = br.readLine();
			
			if(str == null) {
				break;
			}
			String[] sArr = str.split(",");
			
			try {
				
			} catch (Exception e) {
				String da = sArr[0];
				String sa = sArr[1];
				String s1 = sArr[2];

				Day d = new Day(da,sa,s1);
				DList.add(d);
			}
			
			
		}
		
		///////////////////////////////////////////////////////////////
		System.out.println("=======================================================");
		System.out.println("1.테이블 확인  2.메뉴관리  3.카테고리관리  4.매출표확인");
		System.out.println("=======================================================");
		System.out.println("입력>");
		
		///////////////////////////////////////////////////////////////
		
		//스캐너 생성
		Scanner sc = new Scanner(System.in); 
		///////////////////////////////////////////////////////////////
		//출력
		//<1.카테고리별 매출표 확인>
		while(true) {
			
			System.out.println("-------------------------------------------------------");
			System.out.println("1.테이블 확인  2.메뉴관리  3.카테고리관리  4.매출표확인");
			System.out.println("=======================================================");
			System.out.println("입력>");
			
			String number =  sc.nextLine();
			
			if(number.equals("1")) {
				System.out.println("<1.카테고리별 매출표 확인>");
				
				for(int i=0; i<DList.size(); i++) {
					Day d = DList.get(i);
					System.out.println((i+1) + ".   "+ d.getDa() + "  " + d.getSa() + "   " + d.getS());
				}
			}  else if(number.equals("2")) {				
				//<2.날짜별 매출표 확인>
				
				System.out.println("<2.날짜별 매출표 확인>");
				System.out.print("날짜");
				String da = sc.nextLine();
				System.out.print("매출");
				String sa = sc.nextLine();
				
				Day newDay = new Day(da, sa, s1);
				DList.add(newDay);
				
				System.out.println("=======================");
				System.out.println("   <조회되었습니다>    ");
			}else if (number.equals("5")) {
				System.out.println("==================================");
				System.out.println("          <조회되었습니다>        ");
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

package com.project;

public class Day {

	//필드
	private String da; //일별 날짜
	private String sa; //판매
	private String s; //일별 매출
	
	//생성자
	public Day() {	}
	
	public Day(String da, String sa, String s) {
		this.da = da;
		this.sa = sa;
		this.s = s;
	}
	
	//메소드gs
	public String getDa() {
		return da;
	}

	public void setDa(String da) {
		this.da = da;
	}

	public String getSa() {
		return sa;
	}

	public void setSa(String sa) {
		this.sa = sa;
	}

	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}
	
	//메소드 일반
	@Override
	public String toString() {
		return "Day [days=" + da + ", sales=" + sa + ", summary=" + s + "]";
	}

	

}
