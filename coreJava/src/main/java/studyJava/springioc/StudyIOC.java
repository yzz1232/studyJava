package studyJava.springioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudyIOC {
	
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-ioc.xml");
		String[] names = context.getBeanDefinitionNames();
		System.out.println(names.length);
	}
	
	
}
