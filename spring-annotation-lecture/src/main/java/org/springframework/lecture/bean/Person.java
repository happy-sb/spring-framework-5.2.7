package org.springframework.lecture.bean;

/**
 * @author zhaoyunxing
 */
public class Person {

	private String name;

	private Integer age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Person(String name, Integer age) {
		this.name = name;
		this.age = age;
	}

	public void init() {
		System.out.println(".....person init.......");
	}

	public void destroy() {
		System.out.println("......person destroy ....");
	}

}
