package com.spring.common.vo;

<<<<<<< HEAD
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
=======
import lombok.Data;
>>>>>>> branch 'master' of https://github.com/songyongjoon/teamProject.git

@Data
<<<<<<< HEAD
@AllArgsConstructor
=======
>>>>>>> branch 'master' of https://github.com/songyongjoon/teamProject.git
public class CommonVO {
<<<<<<< HEAD

	// 검색 키워드 필드
=======
	private String page; // �럹�씠吏� 踰덊샇
	private String pageSize; // �럹�씠吏��뿉 蹂댁뿬二쇰뒗 以� �닔
	private String start_row; // �떆�옉 �젅肄붾뱶 踰덊샇
	private String end_row; // 醫낅즺 �젅肄붾뱶 踰덊샇

	// 議곌굔寃��깋�떆 �궗�슜�븷 �븘�뱶
>>>>>>> branch 'master' of https://github.com/songyongjoon/teamProject.git
	private String search = "";
	private String keyword = "";
<<<<<<< HEAD
	
	
	private int nowPage; // 현재페이지
	private int startPage;// 시작페이지
	private int endPage; // 끝페이지
	private int total; // 게시글 총 갯수
	private int cntPerPage; // 페이지당 글 갯수
	private int lastPage; // 마지막페이지
	private int start; // SQL쿼리에 쓸 start
	private int end; // SQL쿼리에 쓸 end
	private int cntPage=5;

	public CommonVO() {
	}

	public CommonVO(int total, int nowPage, int cntPerPage, String search, String keyword) {
		setSearch(search);
		setKeyword(keyword);
		setNowPage(nowPage);
		setCntPerPage(cntPerPage);
		setTotal(total);
		calcLastPage(getTotal(), getCntPerPage());
		calcStartEndPage(getNowPage(), cntPage);
		calcStartEnd(getNowPage(), getCntPerPage());
	}

	// 제일 마지막 페이지 계산
	public void calcLastPage(int total, int cntPerPage) {
		setLastPage((int) Math.ceil((double) total / (double) cntPerPage));
	}

	// 시작, 끝 페이지 계산
	public void calcStartEndPage(int nowPage, int cntPage) {
		setEndPage(((int) Math.ceil((double) nowPage / (double) cntPage)) * cntPage);
		if (getLastPage() < getEndPage()) {
			setEndPage(getLastPage());
		}
		setStartPage(getEndPage() - cntPage + 1);
		if (getStartPage() < 1) {
			setStartPage(1);
		}
	}

	// DB 쿼리에서 사용할 start, end값 계산
	public void calcStartEnd(int nowPage, int cntPerPage) {
		setEnd(nowPage * cntPerPage);
		setStart(getEnd() - cntPerPage + 1);
	}
}
=======

	private int pageNum = 0;		//占쎈읂占쎌뵠筌욑옙甕곕뜇�깈
	private int amount = 0;			//占쎈읂占쎌뵠筌욑옙占쎈퓠 癰귣똻肉т빳占� 占쎈쑓占쎌뵠占쎄숲占쎈땾
	
	// 占쎌겱占쎌삺占쎈읂占쎌뵠筌욑옙, 占쎈뻻占쎌삂占쎈읂占쎌뵠筌욑옙, 占쎄국占쎈읂占쎌뵠筌욑옙, 野껊슣�뻻疫뀐옙 �룯占� 揶쏉옙占쎈땾, 占쎈읂占쎌뵠筌욑옙占쎈뼣 疫뀐옙 揶쏉옙占쎈땾, 筌띾뜆占쏙쭕�맪�읂占쎌뵠筌욑옙, SQL�뜎�눖�봺占쎈퓠 占쎈쿈 start, end
    private int nowPage, startPage, endPage, total, cntPerPage, lastPage, start, end;
    private int cntPage = 5;
    //野껓옙占쎄퉳 占쎈뼊占쎈선 占쎈툡占쎈굡
    private String profitStart = "";
    private String profitEnd = "";
    private int profitTotal;
    
    public CommonVO() {
    }
    public CommonVO(int total, int nowPage, int cntPerPage, String profitStart, String profitEnd) {
       setNowPage(nowPage);
       setCntPerPage(cntPerPage);
       setTotal(total);
       calcLastPage(getTotal(), getCntPerPage());
       calcStartEndPage(getNowPage(), cntPage);
       calcStartEnd(getNowPage(), getCntPerPage());
    }
    // 占쎌젫占쎌뵬 筌띾뜆占쏙쭕占� 占쎈읂占쎌뵠筌욑옙 ��④쑴沅�
    public void calcLastPage(int total, int cntPerPage) {
       setLastPage((int) Math.ceil((double)total / (double)cntPerPage));
    }
    // 占쎈뻻占쎌삂, 占쎄국 占쎈읂占쎌뵠筌욑옙 ��④쑴沅�
    public void calcStartEndPage(int nowPage, int cntPage) {
       setEndPage(((int)Math.ceil((double)nowPage / (double)cntPage)) * cntPage);
       if (getLastPage() < getEndPage()) {
          setEndPage(getLastPage());
       }
       setStartPage(getEndPage() - cntPage + 1);
       if (getStartPage() < 1) {
          setStartPage(1);
       }
    }
    // DB �뜎�눖�봺占쎈퓠占쎄퐣 占쎄텢占쎌뒠占쎈막 start, end揶쏉옙 ��④쑴沅�
    public void calcStartEnd(int nowPage, int cntPerPage) {
       setEnd(nowPage * cntPerPage);
       setStart(getEnd() - cntPerPage + 1);
    }

	// �궇吏� 寃��깋�떆 �궗�슜�븷 �븘�뱶
	private String start_date = "";
	private String end_date = "";
}
>>>>>>> branch 'master' of https://github.com/songyongjoon/teamProject.git
