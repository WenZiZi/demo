package com.icss.service;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.icss.po.UserInfoPO;


public class UserInfoServiceTest {
	
	UserInfoService service= new UserInfoService();
	
	@Test
	public void testAdd(){
		 List<UserInfoPO> list=new ArrayList<UserInfoPO>();
		
	}
	@Test
	public void testModify() throws Exception{
		UserInfoPO po=new UserInfoPO();
		po.setUserId(2);
		po.setUserPwd("147");
		service.modify(po);
		System.out.println(po.getUserName());
		System.out.println(po.getUserPwd());
	}
	
}
