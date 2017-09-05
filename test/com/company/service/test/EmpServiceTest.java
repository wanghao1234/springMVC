package com.company.service.test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.company.dao.Emp;
import com.company.service.EmpService;

public class EmpServiceTest {
	private EmpService empService;
	@Before
	public void setUp() throws Exception {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		empService = (EmpService) ctx.getBean("empService");
	}

	@Test
	public void testSave() {
		Emp emp = new Emp(1005,"zhou",7000);
		empService.save(emp);
		testFindAll();
	}

	@Test
	public void testDelete() {
		Emp emp = new Emp();
		emp.setEmpno(1004);
		empService.delete(emp);
		testFindAll();
	}

	@Test
	public void testUpdate() {
		Emp emp = new Emp(1003,"zhou",7000);
		empService.update(emp);
		testFindAll();
	}

	@Test
	public void testFindAll() {
		List<Emp> emps = empService.findAll();
		for(Emp emp:emps){
			System.out.println(emp);
		}
	}

	@Test
	public void testFindAll2() {
		List<Emp> emps = empService.findAll2();
		for(Emp emp:emps){
			System.out.println(emp);
		}
	}
	@Test
	public void testFindAll3() {
		List<Emp> emps = empService.findAll3();
		for(Emp emp:emps){
			System.out.println(emp);
		}
	}

	@Test
	public void testFindById() {
		Emp emp = empService.findById(1001);
		System.out.println(emp);
		Emp emp1 = empService.findById(1011);
		System.out.println(emp1);
	}

	@Test
	public void testFindByName() {
		List<Emp> emps = empService.findByName("n");
		for(Emp emp:emps){
			System.out.println(emp);
		}
	}

}
