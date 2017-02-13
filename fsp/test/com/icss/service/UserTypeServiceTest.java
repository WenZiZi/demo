package com.icss.service;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.icss.dao.UserTypeDAO;
import com.icss.po.UserTypePO;

public class UserTypeServiceTest {
	UserTypeService service=new UserTypeService();
	@Test
	public void testFindAll() throws Exception {
		 List<UserTypePO> list=new ArrayList<UserTypePO>();
		 list=service.findAll();
		 for(UserTypePO po:list){
			 System.out.print("用户类型编号"+po.getUserTypeId()+"-----");
			 System.out.println("用户类型名称"+po.getUserTypeName());
			 
		 }
		 System.out.println("---------------------------");
		 for(int i=0;i<list.size();i++){
			 System.out.println(list.get(i).getUserTypeName());
		 }
	
	}

}
