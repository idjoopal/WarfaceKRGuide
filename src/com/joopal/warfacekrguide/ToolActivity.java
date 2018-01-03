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

public class ToolActivity extends TabActivity {
	TabHost myTab = null;

	private ArrayList<Custom_List_Sub> Array_Data;
	private Custom_List_Sub data;
	private CustomAdapterSub adapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_content);

		// ************************공용 탭 추가*****************************//
		Array_Data = new ArrayList<Custom_List_Sub>();
		data = new Custom_List_Sub(R.drawable.tool_blackpolimeri,
				"블랙폴리머 수직손잡이","일반 - 정확도 약간증가, 반동 약간감소");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.tool_basicsound, "표준형 소음기","일반 - 데미지 큰폭감소, 소음 감소");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.tool_iotec553, "이오텍 553 조준기","일반 - 1.2배 줌");
		Array_Data.add(data);

		data = new Custom_List_Sub(R.drawable.tool_pistolknife, "권총 총검","고급 - 반동, 근접공격력 증가");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.tool_reddot, "트루글루 레드닷 조준기","고급 - 1.2배");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.tool_pistolcustom,
				"커스텀 권총 소음기","고급 - 정확도 증가, 소음, 데미지 감소");
		Array_Data.add(data);

		data = new Custom_List_Sub(R.drawable.tool_pistolgas, "권총 소염기","희귀 - 관통력, 사거리 증가");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.tool_pistolglass,
				"권총 조준경 1.5X","희귀 - 1.5배 줌");
		Array_Data.add(data);

		adapter = new CustomAdapterSub(this,
				android.R.layout.simple_list_item_1, Array_Data);

		ListView list5 = (ListView) findViewById(R.id.ListView05);

		list5.setAdapter(adapter);
		// *******************************************************************//

		// ************************라이플맨 탭 추가*****************************//
		Array_Data = new ArrayList<Custom_List_Sub>();

		data = new Custom_List_Sub(R.drawable.tool_elkanspectorlight,
				"엘칸 스펙터 광학 조준경","일반 - 2배 줌");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.tool_quickmount, "퀵 마운트 소음기","일반 - 정확도 증가, 소음, 데미지 감소");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.tool_macguny, "기관총 양각대","일반 - (엎드린 상태에서) 정확도 증가, 반동 감소");
		Array_Data.add(data);

		data = new Custom_List_Sub(R.drawable.tool_assaulti, "돌격 수직손잡이","고급 - (선 자세에서 더)정확도 증가, 반동 감소");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.tool_elkanspectordualroll,
				"엘칸 스펙터 듀얼 롤 조준경","고급 - 2배 줌");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.tool_assaultgas, "돌격 소염기","고급 - 관통력, 사거리 증가");
		Array_Data.add(data);

		data = new Custom_List_Sub(R.drawable.tool_assaulty, "돌격 수직 양각대","희귀 - (엎드린 상태에서 더)정확도 증가, 반동 감소");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.tool_grenade, "유탄 발사기","희귀 - 유탄발사 가능");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.tool_assaultknife, "돌격 총검","희귀 - 근접공격력, 반동 증가");
		Array_Data.add(data);
		data = new Custom_List_Sub(
				R.drawable.tool_tridgekunhighbattlelight, "트릿지컨 고등전투광학조준경","희귀 - 3배 줌");
		Array_Data.add(data);

		adapter = new CustomAdapterSub(this,
				android.R.layout.simple_list_item_1, Array_Data);

		ListView list1 = (ListView) findViewById(R.id.ListView01);

		list1.setAdapter(adapter);
		// *******************************************************************//

		// ************************메딕 탭 추가*****************************//
		Array_Data = new ArrayList<Custom_List_Sub>();

		data = new Custom_List_Sub(R.drawable.tool_aimcompm4s, "에임 콤프 M4S","일반 - 1.2배 줌");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.tool_shotgunsound, "산탄총 소음기","일반 - 정확도 증가, 소음, 데미지 감소");
		Array_Data.add(data);

		data = new Custom_List_Sub(R.drawable.tool_mozizero, "모지 제로 조준기","고급 - 빠른 1.2배 줌, 정확도 증가, 반동 감소");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.tool_shotgungas, "산탄총 소염기","고급 - 사거리, 관통력 감소");
		Array_Data.add(data);

		data = new Custom_List_Sub(R.drawable.tool_shotgunknife, "산탄총 총검","희귀 - 근접공격력, 반동 증가");
		Array_Data.add(data);

		adapter = new CustomAdapterSub(this,
				android.R.layout.simple_list_item_1, Array_Data);

		ListView list2 = (ListView) findViewById(R.id.ListView02);

		list2.setAdapter(adapter);
		// *******************************************************************//

		// ************************엔지니어 탭 추가*****************************//
		Array_Data = new ArrayList<Custom_List_Sub>();

		data = new Custom_List_Sub(R.drawable.tool_ryupordmark4cqt,
				"류폴드 마크4 CQ/T","일반 - 3배 줌");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.tool_engisound, "기관단총 소음기","일반 - 정확도 증가, 데미지, 소음 감소");
		Array_Data.add(data);

		data = new Custom_List_Sub(R.drawable.tool_cqb, "CQB 전술 조준경","고급 - 2배 줌");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.tool_engii, "기관단총 수직손잡이","고급 - (선 자세에서 더)정확도 증가, 반동감소");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.tool_engigas, "기관단총 소염기","고급 - 관통력, 사거리 증가");
		Array_Data.add(data);

		data = new Custom_List_Sub(R.drawable.tool_engiknife, "기관단총 총검","희귀 - 근접공격력, 반동 증가");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.tool_fix3xtacticalglass,
				"고정 3배 전술 조준경","희귀 - 빠른 3배줌");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.tool_blackpolimery,
				"블랙폴리머 수직양각대","희귀 - (엎드린 상태에서 더)정확도 증가, 반동 감소");
		Array_Data.add(data);

		adapter = new CustomAdapterSub(this,
				android.R.layout.simple_list_item_1, Array_Data);

		ListView list3 = (ListView) findViewById(R.id.ListView03);

		list3.setAdapter(adapter);
		// *******************************************************************//

		// ************************스나이퍼 탭 추가*****************************//
		Array_Data = new ArrayList<Custom_List_Sub>();
		data = new Custom_List_Sub(R.drawable.tool_basic55, "표준 5.5배줌","기본 - 5.5배 줌");
		Array_Data.add(data);

		data = new Custom_List_Sub(R.drawable.tool_snipery, "저격총 양각대","일반 - (엎드린 상태에서)정확도, 반동 약간 감소");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.tool_mid45, "중거리 4.5배줌","일반 - 4.5배 줌");
		Array_Data.add(data);

		data = new Custom_List_Sub(R.drawable.tool_short4, "단거리 4배줌","고급 - 4배 줌");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.tool_snipergas, "저격총 소염기","고급 - 사거리, 관통력 증가");
		Array_Data.add(data);

		data = new Custom_List_Sub(R.drawable.tool_cusiony, "반동감소 양각대","희귀 - (엎드린 상태에서)정확도, 반동 감소");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.tool_snipersound, "저격총 소음기","희귀 - 정확도 증가, 데미지,소음 감소");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.tool_fastmid5, "빠른 중거리 5배줌","희귀 - 빠른 5배 줌");
		Array_Data.add(data);

		adapter = new CustomAdapterSub(this,
				android.R.layout.simple_list_item_1, Array_Data);

		ListView list4 = (ListView) findViewById(R.id.ListView04);

		list4.setAdapter(adapter);
		// *******************************************************************//

		myTab = getTabHost(); // TabHost

		myTab.addTab(myTab.newTabSpec("Tag1").setIndicator("공용")
				.setContent(R.id.ListView05));
		myTab.addTab(myTab.newTabSpec("Tag2").setIndicator("라이플맨")
				.setContent(R.id.ListView01)); // Tab 생성
		myTab.addTab(myTab.newTabSpec("Tag3").setIndicator("메딕")
				.setContent(R.id.ListView02));
		myTab.addTab(myTab.newTabSpec("Tag4").setIndicator("엔지니어")
				.setContent(R.id.ListView03));
		myTab.addTab(myTab.newTabSpec("Tag5").setIndicator("스나이퍼")
				.setContent(R.id.ListView04));

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
