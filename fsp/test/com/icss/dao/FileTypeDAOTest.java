package com.icss.dao;

import static org.junit.Assert.*;

import javax.persistence.Id;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Categories.IncludeCategory;

import com.icss.po.FileTypePO;

public class FileTypeDAOTest {

	private FileTypeDAO dao=new FileTypeDAO();
	
	@Ignore
	@Test
	public void testFindAll() throws Exception {
		System.out.print(dao.findAll().size());
	}

	@Ignore 
	@Test
	public void testFindByIdFileTypePO() throws Exception {
		FileTypePO po=new FileTypePO();
		po.setFileTypeId(2);
		System.out.println(dao.findById(po).getFileTypeName());
	}

	@Test
	public void testAdd() throws Exception{
		FileTypePO po=new FileTypePO();
		po.setFileTypeName("12");
		dao.add(po);
	}
}
