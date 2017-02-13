package com.icss.dao;

import org.junit.Ignore;
import org.junit.Test;

import com.icss.po.FileTypePO;
import com.icss.po.UserTypePO;

public class UserTypeDAOTest {

	private UserTypeDAO dao=new UserTypeDAO();
	
	@Ignore
	@Test
	public  void testAdd() throws Exception{
		UserTypePO po=new UserTypePO();
		po.setAccessRightId(2);
		po.setUserTypeName("无敌用户");
		dao.add(po);
	}
	@Ignore
	@Test
	public void testModify() throws Exception{
		UserTypePO po=new UserTypePO();
		po.setUserTypeId(1);
		po.setUserTypeName("低级用户");
		po.setAccessRightId(3);
		dao.modify(po);
		
	}
	
	@Ignore
	@Test
	public void testDelete() throws Exception{
		UserTypePO po=new UserTypePO();
		po.setUserTypeName("低级用户");
		dao.delete(po);
	}
	@Ignore
	@Test//涉及到主外键问题，忽略
	public void testFindAll() throws Exception {
		System.out.print(dao.findAll().size());
	}
	
	
	@Test
	public void testFindByIdFileTypePO() throws Exception {
		UserTypePO po=new UserTypePO();
		po.setUserTypeId(1);
		System.out.println(dao.findById(po).getUserTypeName());
	}
	
	
}