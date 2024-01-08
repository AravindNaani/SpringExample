package com.springDIExp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springExp.Car;

public class Application {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//		User user = context.getBean("user",User.class);
//		System.out.println(user);
		
//		Car car = context.getBean("car",Car.class);
//		System.out.println(car.getCarModel()+"  "+car.getCarNumber()+"  "+car.getCarColor());
		
		Student student = context.getBean("student",Student.class);
		System.out.println(student);
	}

}
