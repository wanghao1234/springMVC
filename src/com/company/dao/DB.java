package com.company.dao;

import java.util.HashMap;
import java.util.Map;

public class DB {
	//˼����һ�����⣺Ϊʲôģ�����ݿ����ʱ��Ҫʹ��Map������List
	//���磺findById�����������List��ֻ�ܱ���   �����Map<key,value>������key��ȡvalue��Ч�ʸ�
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
