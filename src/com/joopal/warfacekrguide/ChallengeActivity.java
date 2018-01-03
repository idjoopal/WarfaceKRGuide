package com.joopal.warfacekrguide;

import java.util.ArrayList;

import android.app.TabActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.TabHost;

public class ChallengeActivity extends TabActivity {
	TabHost myTab = null;

	private ArrayList<Custom_List_Sub> Array_Data;
	private Custom_List_Sub data;
	private CustomAdapterSub adapter;
	
	private ArrayList<Custom_List_Strife> Array_DataS;
	private Custom_List_Strife dataS;
	private CustomAdapterStrife adapterS;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sub);

		// ************************마크 탭 추가*****************************//
		Array_Data = new ArrayList<Custom_List_Sub>();

		data = new Custom_List_Sub(R.drawable.chm_gotcha, "잡았다! Gacha!",
				"타워모드에서 기본무기로 한번도 죽지않고 헤비거너 헤드샷 4001번 (나무망치로 401킬)");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_5, "김미 어 파이브!", "타워모드 5층 클리어");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_6, "끄떡없어", "타워모드 6층 클리어");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_7, "훨씬 더 높은", "타워모드 7층 클리어");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_8, "사악한 거주민", "타워모드 8층 클리어");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_9, "문제해결사", "타워모드 9층 클리어");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_10, "사무실 노예사냥꾼", "타워모드 10층 클리어");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_11, "조그만 하늘", "타워모드 11층 클리어");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_12, "오염된 12층", "타워모드 12층 클리어");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_13, "행운의 숫자", "타워모드 13층 클리어");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_14, "무도회의 왕", "타워모드 14층 클리어");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_15, "말썽꾼", "타워모드 15층 클리어");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_16, "죽은자들의 파티", "타워모드 16층 클리어");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_17, "졸업", "타워모드 17층 클리어");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_18, "수확", "타워모드 18층 클리어");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_19, "생존자", "타워모드 19층 클리어");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_hg1, "엘리베이터를 타기엔 너무 큰", "타워모드에서 헤비거너 1킬");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_storm1, "소형핵폭탄", "총데미지량 100,000");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_storm2, "대형핵폭탄",
				"총데미지량 1,000,000");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_storm3, "초대형 핵폭탄",
				"총데미지량 20,000,000");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_rank10, "거물로 인정받다", "상사3호봉(레벨 10) 진급");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_rank30, "진급의 기쁨", "중위5호봉(레벨 30) 진급");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_rank60, "더이상 올라갈곳이 없다", "대장(레벨 66) 진급");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_rank70, "워페이스", "원수(레벨 70) 진급");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_sound100, "침묵의 사냥꾼",
				"소음기를 낀 상태로 100명 사살");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_sound1000, "죽음의 속삭임",
				"소음기를 낀 상태로 1000명 사살");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_sound10000, "조용하지만 치명적인 무기",
				"소음기를 낀 상태로 10000명 사살");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_butt100, "짖궂은 장난꾸러기", "주무기 근접공격 100킬");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_dosal50, "푸주한", "도살자 50번");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_dosal250, "살인마", "도살자 250번");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_dosal1000, "연쇄살인마", "도살자 1000번");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_move100, "전달자",
				"탈취미션에서 핵무기 100번 운반");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_capt10, "추적자", "탈취미션 10번 승리");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_capt100, "탈취전문가", "탈취미션 100번 승리");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_capt1000, "(한국없음)",
				"탈취미션 1000번 승리");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_bodyguard10, "트랜스포터",
				"탈취미션에서 핵무기를 든 상태로 10명 사살");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_bodyguard100, "프랭크마틴",
				"탈취미션에서 핵무기를 든 상태로 100명 사살");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_bodyguard1000, "비밀요원",
				"탈취미션에서 핵무기를 든 상태로 1000명 사살");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_boom100, "폭파전문가",
				"폭파미션에서 C4 설치후 폭파성공 100번");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_quest10, "공습요청의 달인", "공습요청 10번 승리");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_quest100, "공습요청의 베테랑", "공습요청 100번 승리");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_quest1000, "(한국없음)",
				"공습요청 1000번 승리");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_run10, "수퍼셀", "돌격미션 10번 승리");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_run100, "허리케인", "돌격미션 100번 승리");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_run1000, "토네이도", "돌격미션 1000번 승리");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_death10, "팀데스매치의 달인", "팀데스매치 10번 승리");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_death100, "팀데스매치의 베테랑",
				"팀데스매치 100번 승리");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_death1000, "연대장님 오시지 말입니다",
				"팀데스매치 1000번 승리");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_pok10, "폭파미션의 달인", "폭파미션 10번 승리");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_pok100, "폭파미션의 베테랑", "폭파미션 100번 승리");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_pok1000, "(한국없음)", "폭파미션 1000번 승리");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_surv50, "라스트 맨 스탠딩", "서바이벌 1등 50번");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_surv250, "학살기계", "서바이벌 1등 250번");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_surv1000, "피로 물든 유목민족",
				"서바이벌 1등 1000번");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_100, "진정한 챔피언",
				"대전모드에서 승리팀 1등 100번");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_sniperhs100, "보이지 않는 치명적 위험",
				"대전모드에서 스나이퍼로 헤드샷 100회");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_ma1000, "최고의 암살자",
				"대전모드에서 근접무기로 1000회 암살");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_h10, "머리를 노려라", "대전모드에서 근접공격 10회");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_h100, "(한국없음)", "대전모드에서 개머리판 100회");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_h1000, "(한국없음)",
				"대전모드에서 개머리판 1000회");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_lie100, "풀숲에 숨은 뱀",
				"엎드린 상태로 100명 죽이기");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_10000grenade, "수류탄 마스터",
				"수류탄 10000킬");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_10000colt, "파이썬 엘리트 부대",
				"COLT Python 10000킬");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_10000desert, "13전대",
				"Desert Eagle 10000킬");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_10000usp, "코만도",
				"H&K USP 10000킬");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_10000k5, "빠른조치",
				"Daewoo K5 10000킬");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_10000browing, "Browning High Power 마스터",
				"Browning High Power 10000킬");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_10000beretta, "해병대 대령",
				"Beretta M9 10000킬");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_10000glock, "완벽해",
				"Glock 18c 10000킬");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_10000steyr, "재기드 코만도",
				"Steyr M9-A1 10000킬");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_10000crowndesert, "Desert Eagle 엘리트",
				"Desert Eagle 크라운 5000킬");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_10000crownberetta, "USMC 장교",
				"Beretta M9 크라운 5000킬");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_hgpistol10, "방치된 꼬마",
				"권총으로 헤비거너 10킬");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_hgpistol100, "무시당한 꼬마",
				"권총으로 헤비거너 100킬");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_hgpistol1000, "얕볼수 없는 꼬마",
				"권총으로 헤비거너 500킬");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_10000sig, "단축의 미학",
				"SIG 552 10000킬");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_10000mp7, "국경수비대 제9집단",
				"H&K MP7 10000킬");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_10000m4, "M4 CQB 마스터", "M4 CQB 10000킬");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_10000kriss, "레인보우식스",
				"Kriss Super V 10000킬");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_10000ak9, "스페츠나츠", "AK-9 10000킬");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_10000aug, "AUG 미니",
				"AUG A3 9mm XS 10000킬");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_10000tavor, "(한국없음)",
				"Tavor CTAR-21 10000킬");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_10000daewook1, "Daewoo K1 마스터",
				"Daewoo K1 10000킬");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_10000p90, "관통탄",
				"FN P90 10000킬");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_10000g36c, "만기제대",
				"H&K G36C 10000킬");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_10000calico, "Calico M960A 마스터",
				"Calico M960A 10000킬");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_10000mp5, "H&K MP5 마스터",
				"H&K MP5 10000킬");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_10000auzi, "우지사랑",
				"Mini Uzi 10000킬");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_10000compact, "소형 살인기계",
				"XM8 Compact 10000킬");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_10000crowntavor, "Tavor CTAR-21 엘리트",
				"Tavor CTAR-21 크라운 5000킬");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_10000crownkriss, "(한국없음)",
				"Kriss Super V 크라운 5000킬");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_10000crownk1, "기갑사단 보병의 애인",
				"Daewoo K1 크라운 5000킬");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_rank100, "우수한 병사",
				"협동모드 순위 100위 진입");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_rankin10, "내가 제일 잘나가!",
				"협동모드 순위 10위 진입");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_rankin1, "나는 세상의 왕이다!",
				"협동모드 순위 1위");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_xmas, "크리스마스 이브의 악몽",
				"크리스마스무기로 1000킬");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_kor, "날개모양의 철제마크",
				"CBT때 도전과제 3종달성");
		Array_Data.add(data);

		adapter = new CustomAdapterSub(this,
				android.R.layout.simple_list_item_1, Array_Data);

		ListView list1 = (ListView) findViewById(R.id.ListView01);

		list1.setAdapter(adapter);
		// *******************************************************************//

		// ************************배지 탭 추가*****************************//
		Array_Data = new ArrayList<Custom_List_Sub>();
		
		data = new Custom_List_Sub(R.drawable.chb_th250, "헤드헌터",
				"타워모드 헤드샷 250회");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chb_th1000, "브레인크래셔",
				"타워모드 헤드샷 1000회");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chb_th2500, "블로우오프 마스터",
				"타워모드 헤드샷 2500회");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chb_t500, "사무실의 쥐", "타워모드에서 500킬");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chb_t2500, "시리어스샘",
				"타워모드에서 2500킬");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chb_th10000, "블랙 오버로드",
				"타워모드에서 10000킬");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chb_thg10, "병사를 좀 더 보내줘",
				"타워모드에서 헤비거너 10킬");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chb_ice500, "화난 눈사람",
				"고드름 송곳으로 500킬");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chb_aim100, "조준사격의 달인", "조준상태로 100킬");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chb_aim1000, "조준사격의 제왕", "조준상태로 1000킬");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chb_aim10000, "죽음을 피할수 없는 자들",
				"조준상태로 10000킬");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chb_crown100, "크라운 사냥꾼",
				"크라운 누적 획득량 100");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chb_crown1000, "크라운 귀족",
				"크라운 누적 획득량 1000");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chb_crown10000, "크라운의 제왕",
				"크라운 누적 획득량 10000");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chb_money100000, "부자가 된 병사",
				"게임머니 누적 획득량 100,000");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chb_money500000, "재벌이 된 병사",
				"게임머니 누적 획득량 500,000");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chb_cure10000, "응급 처치요원",
				"누적 치료량 10,000HP");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chb_cure100000, "의무병",
				"누적 치료량 100,000HP");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chb_cure1000000, "야전의사",
				"누적 치료량 1,000,000HP");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chb_revive100, "야전군의관", "팀원 부활 100번");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chb_revive1000, "소생술전문가", "팀원 부활 1000번");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chb_revive10000, "구세주",
				"팀원 부활 10000번");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chb_elect10, "치명적인 쇼크",
				"제세동기로 10회 죽이기");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chb_elect100, "전기충격의 달인",
				"제세동기로 100회 죽이기");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chb_elect500, "죽음의 천사",
				"제세동기로 500회 죽이기");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chb_hc50, "해골을 부수는 자", "헤드크래셔 50번");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chb_hc500, "해골을 모으는 자", "헤드크래셔 500번");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chb_hc2500, "해골의 신", "헤드크래셔 2500번");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chb_gc10, "수류탄의 달인", "수류탄콤보 10번");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chb_gc100, "수류탄의 제왕", "수류탄콤보 100번");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chb_gc1000, "수류탄의 신", "수류탄콤보 1000번");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chb_gc10000, "핵폭발",
				"수류탄콤보 10000번");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chb_boom5, "다중폭격탄", "수류탄 1개로 5킬");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chb_clay10, "완소선물",
				"크레모아 더블킬 10번");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chb_clay100, "적에게 자비를",
				"크레모아 더블킬 100번");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chb_clay1000, "매복공격의 마스터",
				"크레모아 더블킬 1000번");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chb_knock10, "이대로 죽을 수 없다",
				"넉다운 상태로 헤드샷 10번");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chb_knock50, "구사일생",
				"넉다운 상태로 헤드샷 50번");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chb_knock500, "위기일발",
				"넉다운 상태로 헤드샷 500번");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chb_nozoom100, "원샷원킬",
				"스나이퍼로 조준하지 않고 100번 사살");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chb_nozoom500, "매의 눈",
				"스나이퍼로 조준하지 않고 500번 사살");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chb_killsniper100, "스나이퍼의 천적",
				"스나이퍼 100번 사살");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chb_vender1, "고객님 사랑합니다", "한가지 벤더를 언락");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chb_vender3, "쇼핑중독", "모든 벤더를 언락");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chb_ehg10, "임전무퇴",
				"이지모드에서 헤비거너 10킬");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chb_nhg10, "일당백",
				"노말모드에서 헤비거너 10킬");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chb_hhg10, "일기당천",
				"하드모드에서 헤비거너 10킬");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chb_coupdeta, "쿠데타 이벤트",
				"쿠데타 이벤트 기념 배지");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chb_10000claymore, "크레모아 마스터", "크레모아 10000킬");
		Array_Data.add(data);
		
		data = new Custom_List_Sub(R.drawable.chb_10000m16a2, "해안경비대",
				"M16A2 10000킬");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chb_10000mg36, "머쉬넨게베슈쯔",
				"H&K MG36 10000킬");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chb_10000rpk, "레닌의 명령", "RPK 10000킬");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chb_10000auga3hbar, "무거운 AUG",
				"AUG A3 H Bar 10000킬");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chb_10000xm8, "지독한 제거자",
				"XM8 LMG 10000킬");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chb_10000k3, "인도네시아 해병대 코파스카",
				"Daewoo K3 10000킬");
		Array_Data.add(data);
		
		data = new Custom_List_Sub(R.drawable.chb_10000jackhammer, "블랙잭",
				"JackHammer 10000킬");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chb_10000keltec, "Kel-Tec 산탄총 마스터",
				"Kel-Tec KSG 10000킬");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chb_10000hawkpump, "Hawk Pump 마스터",
				"Hawk Pump 10000킬");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chb_10000cobray, "거리의 청소부",
				"Cobray Striker 10000킬");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chb_10000superm4, "법 집행관",
				"Benelli M4 Super 90 10000킬");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chb_10000nova, "살짝만 스쳐도 골로가지요",
				"Benelli Nova Tactical 10000킬");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chb_10000saigabp, "쿠슈나펍",
				"Saiga Bullpup 10000킬");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chb_10000mc255, "리볼버",
				"MC 255 12 10000킬");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chb_10000remingtoncb, "Remington 870 CB 마스터",
				"Remington 870 CB 10000킬");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chb_10000remington, "산탄총계의 불후의 명작",
				"Remington 870 10000킬");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chb_10000vepr, "총열에서 연기나",
				"VEPR-12 10000킬");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chb_10000saiga, "야생 멧돼지",
				"Saiga 10000킬");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chb_10000spas, "SPAS-12 마스터",
				"SPAS-12 10000킬");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chb_10000crownsaigabp, "Saiga Bullpup 엘리트",
				"Saiga Bullpup 크라운 5000킬");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chb_10000crownspas, "SPAS-12 엘리트",
				"SPAS-12 크라운 5000킬");
		Array_Data.add(data);
		
		data = new Custom_List_Sub(R.drawable.chb_kor, "태극모양의 금색배지",
				"CBT때 도전과제 3종달성");
		Array_Data.add(data);

		adapter = new CustomAdapterSub(this,
				android.R.layout.simple_list_item_1, Array_Data);

		ListView list2 = (ListView) findViewById(R.id.ListView02);

		list2.setAdapter(adapter);
		// *******************************************************************//

		
		// ************************스트라이프 탭 추가*****************************//
		Array_DataS = new ArrayList<Custom_List_Strife>();

		dataS = new Custom_List_Strife(R.drawable.cs_tr, "더 높은 곳으로 가자구!",
				"라이플맨으로 타워모드 클리어");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_tm, "마취제 없이 수술하기",
				"메딕으로 타워모드 클리어");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_te, "나를 믿어, 나는야 엔지니어!",
				"엔지니어로 타워모드 클리어");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_ts, "여기서 우리집이 보여!",
				"스나이퍼로 타워모드 클리어");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_thg25, "오베론 잡기",
				"타워모드에서 헤비거너 25킬");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_winter1000, "원터폴",
				"겨울 위장 무기로 1000킬");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_pc, "디지털워리어",
				"PC방 무기로 10000킬");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_sg50, "내 앞을 막지마라!", "실드가이 50킬");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_sg500, "방패를 부수는자", "실드가이 500킬");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_slide50, "슬라이딩의 달인", "슬라이딩킬 50번");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_slide500, "슬라이딩의 제왕", "슬라이딩킬 500번");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_slide2500, "슬라이딩의 신", "슬라이딩킬 2500번");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_help10, "친절한 전우",
				"협동오르기 및 보조 10번");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_help100, "여럿이 함께라면 두렵지않다!",
				"협동오르기 및 보조 100번");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_help1000, "전우야 함께 가자!",
				"협동오르기 및 보조 1000번");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_e5, "하이스코어",
				"이지모드 킬콤보 5x 20번");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_n5, "슈퍼스코어",
				"노말모드 킬콤보 5x 20번");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_h5, "울트라스코어",
				"하드모드 킬콤보 5x 20번");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_e5250, "고득점자",
				"이지모드 킬콤보 5x 250번");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_n5250, "초고득점자",
				"노말모드 킬콤보 5x 250번");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_h5250, "극초고득점자",
				"하드모드 킬콤보 5x 250번");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_e5500, "초음파",
				"이지모드 킬콤보 5x 500번");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_n5500, "극초음파",
				"노말모드 킬콤보 5x 500번");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_h5500, "초고주파",
				"하드모드 킬콤보 5x 500번");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_e51000, "추격자",
				"이지모드 킬콤보 5x 1000번");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_n51000, "추격자 위에 나는 자",
				"노말모드 킬콤보 5x 1000번");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_h51000, "추격자를 괴롭히는 자",
				"하드모드 킬콤보 5x 1000번");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_friend20, "붙임성 좋은 녀석", "친구 20명달성");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_1enodie, "총알을 피하는 자",
				"죽지않고 이지모드 클리어");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_1nnodie, "하드타겟",
				"죽지않고 노말모드 클리어");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_1hnodie, "불사의 병사",
				"죽지않고 하드모드 클리어");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_10enodie, "텀블러",
				"10번 죽지않고 이지모드 클리어");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_10nnodie, "줄타는 곡예사",
				"10번 죽지않고 노말모드 클리어");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_10hnodie, "요가하는 곡예사",
				"10번 죽지않고 하드모드 클리어");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_100enodie, "일단은 살고보자",
				"100번 죽지않고 이지모드 클리어");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_100nnodie, "어쨌던 살아남자",
				"100번 죽지않고 노말모드 클리어");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_100hnodie, "난 죽지 않아",
				"100번 죽지않고 하드모드 클리어");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_hell, "지옥에서 온 악마",
				"죽지 않은 채 한번에 10000데미지입히기");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_clay50, "크레모아의 달인", "크레모아킬 50번");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_clay200, "크레모아의 제왕", "크레모아킬 200번");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_clay1000, "크레모아의 신", "크레모아킬 1000번");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_hgsniper10, "샤프슈터",
				"스나이퍼로 헤비거너 10킬");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_hgsniper100, "불스아이",
				"스나이퍼로 헤비거너 100킬");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_hgsniper500, "뼈까지 파괴",
				"스나이퍼로 헤비거너 500킬");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_hgek, "칼잡이",
				"이지모드에서 기본대검으로 헤비거너 5킬");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_hgnk, "도끼의 달인",
				"노말모드에서 블랙호크로 헤비거너 5킬");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_hghk, "식은죽 먹기",
				"하드모드에서 야전삽으로 헤비거너 5킬");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_10000m4a1, "M4A1 마스터", "M4A1 10000킬");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_10000aug, "코브라",
				"AUG A3 10000킬");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_10000g36k, "독일의 우수함",
				"H&K G36K 10000킬");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_10000k2, "대한민국 국군",
				"Daewoo K2 10000킬");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_10000scar, "특수작전부대",
				"FN SCAR-H 10000킬");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_10000acr, "(한국없음)", "ACR 10000킬");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_10000calico, "반자동의 함정",
				"Calico M955A 10000킬");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_10000ak103, "시베리아 탈출",
				"AK-103 10000킬");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_10000ak47, "AK",
				"AK-47 10000킬");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_10000sig551, "스위스군",
				"SIG551 10000킬");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_10000tavortar, "타보르산",
				"Tavor TAR-21 10000킬");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_10000galil, "건조한 상태",
				"Galil AR 10000킬");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_10000f2000, "벨기에군",
				"FN F2000 10000킬");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_10000dragu, "Dragunov SR 마스터",
				"Dragunov SR 10000킬");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_10000qbu, "시민들의 혁명군인",
				"QBU-88 10000킬");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_10000sig550, "스위스보안부대",
				"SIG 550 10000킬");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_10000m16spr, "M16 SPR Custom 마스터",
				"M16 SPR Custom 10000킬");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_10000tavorstar, "네이비 블루",
				"Tavor STAR-21 10000킬");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_10000chetyac, "참전",
				"Cheytac M200 10000킬");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_10000alpine, "알프스의 암살자",
				"Alpine 10000킬");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_10000xm8ss, "XM8 Sharpshooter 마스터",
				"XM8 Sharpshooter 10000킬");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_10000vss, "은밀한 저격수",
				"VSS Vintorez 10000킬");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_10000acrspr, "21세기 군인",
				"ACR SPR 10000킬");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_10000sl8, "H&K SL8 마스터",
				"H&K SL8 10000킬");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_10000m14ebr, "한층 더 강화된 전투력",
				"M14 EBR 10000킬");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_10000awm, "겨울 전쟁", "AWM 10000킬");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_10000wa2000, "(한국없음)",
				"Walther WA 2000 10000킬");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_10000knife, "집행자", "기본대검 10000킬");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_10000ultra, "울트라마린 마스터",
				"울트라마린 10000킬");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_10000kabar, "기능성 칼, 진짜?", "KA Bar Utility knife 10000킬");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_10000tactool, "택툴 마스터", "택툴 10000킬");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_10000space, "무덤을 파는 자", "야전삽 10000킬");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_10000blackhawk, "통통한 사나이", "블랙호크 10000킬");
		Array_DataS.add(dataS);
		
		dataS = new Custom_List_Strife(R.drawable.cs_10000crownas50, "AS50 엘리트",
				"AS50 크라운 5000킬");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_10000crownscar, "FN SCAR-H 엘리트",
				"FN SCAR-H 크라운 5000킬");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_10000crownacr, "ACR 엘리트",
				"ACR 크라운 5000킬");
		Array_DataS.add(dataS);
		
		dataS = new Custom_List_Strife(R.drawable.cs_kor, "시베리안 타이거",
				"CBT때 도전과제 3종달성");
		Array_DataS.add(dataS);
		
		adapterS = new CustomAdapterStrife(this,
				android.R.layout.simple_list_item_1, Array_DataS);

		ListView list3 = (ListView) findViewById(R.id.ListView03);

		list3.setAdapter(adapterS);
		// *******************************************************************//

		myTab = getTabHost(); // TabHost

		myTab.addTab(myTab.newTabSpec("Tag1").setIndicator("마크")
				.setContent(R.id.ListView01)); // Tab 생성
		myTab.addTab(myTab.newTabSpec("Tag2").setIndicator("배지")
				.setContent(R.id.ListView02));
		myTab.addTab(myTab.newTabSpec("Tag3").setIndicator("스트라이프")
				.setContent(R.id.ListView03));

		myTab.setCurrentTab(0); // 첫 페이지

		list1.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View v, int pos,
					long arg3) {
				// TODO Auto-generated method stub

			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
