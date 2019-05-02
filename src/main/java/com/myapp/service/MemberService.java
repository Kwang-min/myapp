package com.myapp.service;

import java.util.List;

import com.myapp.dto.MemberVO;
 
public interface MemberService {
    
    public List<MemberVO> selectMember() throws Exception;
}

