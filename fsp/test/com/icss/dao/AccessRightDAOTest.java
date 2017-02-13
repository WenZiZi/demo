package com.icss.dao;

import org.junit.Ignore;
import org.junit.Test;

import com.icss.po.AccessRightPO;


public class AccessRightDAOTest {
	private AccessRightDAO dao=new AccessRightDAO();
	@Ignore
	@Test
	public void testAdd() throws Exception {
		AccessRightPO po = new AccessRightPO();
		po.setAccessRightName("中级");
		dao.add(po);
		 
	}
	@Ignore
	@Test
	public void testModify() throws Exception {
		AccessRightPO po = new AccessRightPO();
		po.setAccessRightId(2);
		po.setAccessRightName("高等级");
		dao.modify(po);
	}
	@Ignore
	@Test//accessright作为 usertype的外键，要先删除usertype才能删除accessright
	public void testDelete() throws Exception{
		AccessRightPO po = new AccessRightPO();
		po.setAccessRightName("高级");
		
		dao.delete(po);
	}
	
	@Test
	public void testFindAll() throws Exception {
		System.out.print(dao.findAll().size());
	}
	
	@Ignore
	@Test
	public void testFindByIdAccessRightPO() throws Exception {
		AccessRightPO po=new AccessRightPO();
		po.setAccessRightId(2);
		System.out.println(dao.findById(po).getAccessRightName());
	}
	
}
