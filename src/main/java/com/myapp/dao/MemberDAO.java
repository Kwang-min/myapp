package com.myapp.dao;

import java.util.List;

import com.myapp.dto.MemberVO;
 
public interface MemberDAO {
    
    public List<MemberVO> selectMember() throws Exception;
}
 


