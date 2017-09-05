package com.company.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.company.dao.DB;
import com.company.dao.Emp;

@Service
//自动将EmpService取名为empService注入到IOC容器中
public class EmpService {

	public String save(Emp emp) {
		DB.empTable.put(emp.getEmpno(), emp);
		System.out.println("save " + emp + " success!");
		return "success";
	}

	public String delete(Emp emp) {
		DB.empTable.remove(emp.getEmpno());
		System.out.println("delete " + emp.getEmpno() + " success!");
		return "success";
	}

	public String update(Emp emp) {
		DB.empTable.put(emp.getEmpno(), emp);
		System.out.println("update " + emp + " success!");
		return "success";
	}

	public List<Emp> findAll() {
		List<Emp> emps = new ArrayList<Emp>();
		Set<Integer> keys = DB.empTable.keySet();
		for (Integer key : keys) {
			emps.add(DB.empTable.get(key));
		}
		return emps;
	}

	public List<Emp> findAll2() {
		List<Emp> emps = new ArrayList<Emp>();
		for (Map.Entry<Integer, Emp> entry : DB.empTable.entrySet()) {
			emps.add(entry.getValue());
		}
		return emps;
	}

	public List<Emp> findAll3() {
		return new ArrayList<Emp>(DB.empTable.values());
	}

	public Emp findById(int id) {
		return DB.empTable.get(id);
	}

	public List<Emp> findByName(String name) {
		List<Emp> emps = new ArrayList<Emp>();
		for (Map.Entry<Integer, Emp> entry : DB.empTable.entrySet()) {
			if (entry.getValue().getEname().indexOf(name) != -1) {
				emps.add(entry.getValue());
			}
		}
		return emps;
	}
}
