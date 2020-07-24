package org.springframework.lecture.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.lecture.bean.Person;

/**
 * @author zhaoyunxing
 * @date 2020/7/23 15:04
 */
@Configuration
public class PersonBeanConfig {

	@Bean(name = "zhangsan", initMethod = "init", destroyMethod = "destroy")
	public Person person() {
		return new Person("zhangsan", 20);
	}
}
