package ch22_LambdasStreamsFun;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdasStreamsFunApp {

	public static void main(String[] args) {
//		/*
//		 * Syntax of Lambda Expression (parameter/argumentList) -> { statements }
//		 * 
//		 */
//		// Anonymous Class
//		new Thread(() -> {
//			System.out.println("Printing from the Runnable");
//			System.out.println("Line 2");
//			System.out.format("This is line %d\n", 3);
//		}).start();

//		List<LambdasStreamsFunApp.Employee> employees = new ArrayList<>();
		List<Employee> employees = new ArrayList<>();

		employees.add(new Employee("Boris Chen", 28));
		employees.add(new Employee("Amanda Johnson", 27));
		employees.add(new Employee("Elizabeth Kuhn", 34));
		employees.add(new Employee("Glenn Hodge", 65));
		employees.add(new Employee("Frederick Duff", 52));

		for (Employee e : employees) {
			System.out.println(e);
		}
	}

	static class Employee {
		private String name;
		private int age;

		public Employee(String name, int age) {
			super();
			this.name = name;
			this.age = age;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		@Override
		public String toString() {
			return "Employee [name=" + name + ", age=" + age + "]";
		}

	}

}
