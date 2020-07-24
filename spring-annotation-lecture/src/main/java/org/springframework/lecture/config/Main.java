package org.springframework.lecture.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PersonBeanConfig.class);
		String[] beanDefinitionNames = context.getBeanDefinitionNames();
		//Arrays.asList(beanDefinitionNames).forEach(name -> log.info("bean:{}", name));

		Object person = context.getBean("person");

		//log.info("{}", person);
	}
}
