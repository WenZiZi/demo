package com.icss.dao;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

import com.icss.po.UserInfoPO;

public class UserInfoDAOTest {

	private UserInfoDAO dao=new UserInfoDAO();
	
	@Ignore
	@Test
	public void testAddUserInfoPO() throws Exception {
		UserInfoPO po=null;
		for(int i=10;i<20;i++){
			po=new UserInfoPO();
			po.setUserName("test"+i);
			po.setUserPwd("123456");
			po.setUserTypeId(4);
			po.setUserRealName("测试用户"+i);
			dao.add(po); 
		}
		
	}

	@Test
	public void testModify() throws Exception {
		UserInfoPO po=new UserInfoPO();
		po.setUserId(2);
		po.setUserTypeId(1);
		po.setUserName("SHINT");
		po.setUserPwd("999");
		po.setUserRealName("heyhey");
		
		dao.modify(po);
	}
	@Test
	public void testDeleteUserInfoPO() throws Exception {
		UserInfoPO po=new UserInfoPO();
		po.setUserId(1);
		dao.delete(po);
	}

	@Ignore
	@Test
	public void testFindAll() throws Exception {
		System.out.println( dao.findAll().size());
	}

	@Test
	public void testFindByIdUserInfoPO() {
		 
	}

	@Test
	public void testFindByUserName()throws Exception{
		 
		System.out.println(dao.findByUserName("admin","admin").getUserName());
	}
	@Test
	public void testFindByUserNameExist() throws Exception {
		System.out.println(dao.findByUserNameExist("crook").getUserRealName());
	}
}
