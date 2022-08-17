package com.example.demo.mmRegister;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.sql.Timestamp;
import com.example.demo.common.PrintCommonUtil;
import com.example.demo.mapper.DesignUserMapper;
import com.example.demo.mapper.TorihikiUserMapper;
import com.example.demo.mapper.mmRegisterMapper;
import com.example.demo.member_master.DesignUser;

@Service
@Transactional
public class mmRegisterService {
	
	@Autowired
	DesignUserMapper designUserMapper;
	
	@Autowired
	mmRegisterMapper mmRegisterMapper;

	public List<mmRegister> getUserList() {
		List<mmRegister> userList = mmRegisterMapper.selectAll();
		return userList;
	}
}
