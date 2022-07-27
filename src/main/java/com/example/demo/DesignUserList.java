package com.example.demo;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mapper.DesignUserMapper;

import com.example.demo.DesignUser;
import com.example.demo.DesignUserForm;
import mapper.DesignUserMapper;

@Service
@Transactional
public class DesignUserList {

	@Autowired
	DesignUserMapper designUserMapper;

	public List<DesignUser> getUserList() {
		List<DesignUser> userList = DesignUserMapper.selectAll();
		return userList;
	}
}