package com.javaex.ex;

public class Person {

	//필드
	private String name;
	private String hp;
	private String company;

	//생성자
	public Person() {
	}

	public Person(String name, String hp, String company) {
		this.name = name;
		this.hp = hp;
		this.company = company;
	}
	
	//메소드 gs
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHp() {
		return hp;
	}

	public void setHp(String hp) {
		this.hp = hp;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	//메소드 일반
	@Override
	public String toString() {
		return  "**********************************************"+"\n" +"*" + "\t" +
				"전화번호 관리 프로그램" + "\t" +"             *"+ "\n" + 
				"**********************************************"+"\n"+
				"1.리스트   "+"2.등록   "+"3.삭제   "+"4.검색   "+"5.종료"+"\n" +
				"----------------------------------------------"+ "\n"+
				">메뉴번호:"+"\n";
	}
}
