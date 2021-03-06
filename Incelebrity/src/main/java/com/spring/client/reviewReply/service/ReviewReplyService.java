package com.spring.client.reviewReply.service;

import java.util.List;

import com.spring.client.reviewReply.vo.ReviewReplyVO;

public interface ReviewReplyService {

	public List<ReviewReplyVO> reviewReplyList(Integer review_no);

	public int replyInsert(ReviewReplyVO rrvo);

	public ReviewReplyVO replySelect(Integer review_reply_no);

	public int replyUpdate(ReviewReplyVO rrvo);


	public int replyDelete(Integer review_reply_no);

}
