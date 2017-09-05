package com.company.dao;

import java.util.HashMap;
import java.util.Map;

public class DB {
	//思考第一个问题：为什么模拟数据库操作时，要使用Map而不是List
	//例如：findById操作，如果是List，只能遍历   如果是Map<key,value>，根据key读取value，效率高
	public static Map<Integer,Emp> empTable;
	static{
		empTable = new HashMap<Integer,Emp>();
		Emp e1 = new Emp(1001,"zhao",4000);
		Emp e2 = new Emp(1002,"qian",3000);
		Emp e3 = new Emp(1003,"sun",5000);
		Emp e4 = new Emp(1004,"li",8000);
		empTable.put(e1.getEmpno(), e1);
		empTable.put(e2.getEmpno(), e2);
		empTable.put(e3.getEmpno(), e3);
		empTable.put(e4.getEmpno(), e4);
	}
	public static void main(String[] args) {
		Map<Integer,Emp> emps = DB.empTable;
		for(Map.Entry<Integer,Emp> entry:emps.entrySet()){
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
	}
}
