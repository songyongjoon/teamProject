package com.spring.client.notice.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.spring.client.notice.service.NoticeService;
import com.spring.client.notice.vo.NoticeVO;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("/notice/*")
@AllArgsConstructor
public class NoticeController {
	private NoticeService noticeService;
		
		//글목록
	   @RequestMapping(value="/noticeList", method=RequestMethod.GET)
	   public String noticeList(@ModelAttribute("data") NoticeVO nvo, Model model) {
	      log.info("noticeList 호출 성공");
	      List<NoticeVO> noticeList = noticeService.noticeList(nvo);
	      model.addAttribute("noticeList", noticeList);
	      
	      return "notice/noticeList";
	   }
	   
	   @RequestMapping(value="/writeForm")
	   public String writeForm(@ModelAttribute("data") NoticeVO nvo) {
	      log.info("writeForm 호출 성공");
	      
	      return "notice/writeForm";
	   }
	   
	   //글쓰기
	   /*
	   @RequestMapping(value="/noticeInsert", method=RequestMethod.POST)
	   public String noticeInsert(NoticeVO nvo, Model model) {
	      log.info("noticeInsert 호출 성공");
	      
	      int result = 0;
	      String url = "";
	      result = noticeService.noticeInsert(nvo);
	      if(result == 1) {
	         url = "/notice/noticeList";
	      }
	      else {
	         url = "/notice/writeForm";
	      }
	      
	      return "redirect:" + url;
	   }
	   */
	   
	   //글상세 페이지
	   @RequestMapping(value="/noticeDetail", method=RequestMethod.GET)
	   public String boardDetail(@ModelAttribute("data") NoticeVO nvo, Model model) {
	      log.info("noticeDetail 호출 성공");
	      
	      NoticeVO detail = noticeService.noticeDetail(nvo);
	      model.addAttribute("detail", detail);
	      
	      return "board/boardDetail";
	   }
	   
	   //글삭제
	   /*
	   @RequestMapping(value="/noticeDelete")
	   public String noticeDelete(@ModelAttribute NoticeVO nvo, RedirectAttributes ras) {
	      log.info("noticeDelete 호출 성공");
	      
	      int result = 0;
	      String url = "";
	      result = noticeService.noticeDelete(nvo.getNotice_no());
	      ras.addFlashAttribute("noticeVO", nvo);
	      
	      if(result == 1) {
	         url="/notice/noticeList";
	      }
	      else{
	         url="/notice/noticeDetail";
	      }
	      return "redirect:" + url;
	   }
	   
	   //글 수정폼
	   @RequestMapping(value="/updateForm")
	   public String updateForm(@ModelAttribute("data") NoticeVO nvo, Model model) {
	      log.info("updateForm 호출 성공");
	      log.info("notice_no= " + nvo.getNotice_no());
	      
	      NoticeVO updateData = noticeService.updateForm(nvo);
	      
	      model.addAttribute("updateData", updateData);
	      return "notice/updateForm";
	   }
	   
	   //글수정
	   @RequestMapping(value="/noticeUpdate", method=RequestMethod.POST)
	   public String noticeUpdate(@ModelAttribute NoticeVO nvo, RedirectAttributes ras) {
	      log.info("noticeUpdate 호출 성공");
	      
	      int result = 0;
	      String url = "";
	      
	      result = noticeService.noticeUpdate(nvo);
	      ras.addFlashAttribute("data", nvo);
	      
	      if(result ==1) {
	         url="/notice/noticeDetail";
	      }
	      else {
	         url="/notice/updateForm";
	      }
	      
	      return "redirect:" + url;
	   }   
	   */
}
