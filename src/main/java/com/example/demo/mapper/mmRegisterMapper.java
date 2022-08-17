package com.example.demo.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import com.example.demo.mmRegister.mmRegister;
import com.example.demo.mmRegister.mmRegisterForm;

@Mapper
public interface mmRegisterMapper {
	List<mmRegister> selectAll() ;
	
	void insert_member_master(mmRegister design);
	void insert_memberclient_master(mmRegister design);
	void insert_order_tran(mmRegister design);
}
