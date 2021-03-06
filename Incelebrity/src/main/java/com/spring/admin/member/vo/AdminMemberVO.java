package com.spring.admin.member.vo;

import com.spring.common.vo.CommonVO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdminMemberVO extends CommonVO {
	
	public AdminMemberVO(int total, int nowPage, int cntPerPage, String search, String keyword) {
		super(total,nowPage,cntPerPage,search,keyword);
	}
	
	// member
	private int member_no = 0;
	private String member_id = "";
	private String member_passwd = "";
	private String member_name = "";
	private String member_address = "";
	private String member_email = "";
	private String member_phone = "";
	private String member_birth = "";
	private String member_passhint = "";
	private String member_passanswer = "";
	private int member_state = 0;
	
	// member_detail
	private int member_detail_no = 0;
	private String member_detail_loginday = "";
	private String member_detail_modday = "";
	private String member_detail_writeday = "";
}
