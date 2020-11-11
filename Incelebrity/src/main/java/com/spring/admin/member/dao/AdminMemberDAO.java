package com.spring.admin.member.dao;

import java.util.List;

import com.spring.admin.member.vo.AdminMemberVO;

public interface AdminMemberDAO {

	// ����¡ ó�� �Խñ� ��ȸ
	public List<AdminMemberVO> memberList(AdminMemberVO vo);

	// �Խù� �� ����
	public int countBoard();

	// ȸ������ ����ȸ
	public AdminMemberVO memberDetail(AdminMemberVO vo);
	
	// ȸ������ ����
	public int memberUpdate(AdminMemberVO vo);
}