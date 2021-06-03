package solflower.choi.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import solflower.choi.dao.test1Dao;
import solflower.choi.service.test1Service;

@Service
public class test1Serviceimpl implements test1Service {

	@Autowired
	private test1Dao test1dao;
	
	@Override
	public Map test1() {
		// TODO Auto-generated method stub
		return test1dao.test1();
	}

}
