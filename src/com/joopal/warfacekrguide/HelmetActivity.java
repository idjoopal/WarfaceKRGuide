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

public class HelmetActivity extends TabActivity {
	TabHost myTab = null;

	private ArrayList<Custom_List_Sub> Array_Data;
	private Custom_List_Sub data;
	private CustomAdapterSub adapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_helmet);

		// ************************라이플맨 탭 추가*****************************//
		Array_Data = new ArrayList<Custom_List_Sub>();
		data = new Custom_List_Sub(R.drawable.hs_basicrifle, "기본 라이플맨 헬멧",
				"영구제 - 기능없음");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.hs_goodrifle, "고급 라이플맨 헬멧",
				"상점 - 높은 방어력");
		Array_Data.add(data);

		data = new Custom_List_Sub(R.drawable.hs_tacticalrifle, "전술 라이플맨 헬멧",
				"일반 - 높은 방어력, 섬광보호");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.hs_claymorerifle, "크레모아 탐지 헬멧",
				"고급 - 높은 방어력, 크레모아탐지");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.hs_flashrifle, "섬광 보호 헬멧",
				"기간제 - 초탄방어, 섬광보호");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.hs_crownspecialrifle,
				"특수 헬멧(크라운)", "기간제 - 초탄방어, 섬광보호, 크레모아탐지");
		Array_Data.add(data);

		data = new Custom_List_Sub(R.drawable.ev_devilhead, "데빌 마스크", "이벤트");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.ev_xmasrifle, "크리스마스 라이플헬멧",
				"이벤트");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.ev_laborrifle, "광부헬멧", "이벤트");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.ev_blueberet, "푸른 베레모", "이벤트");
		Array_Data.add(data);

		adapter = new CustomAdapterSub(this,
				android.R.layout.simple_list_item_1, Array_Data);

		ListView list1 = (ListView) findViewById(R.id.ListView01);

		list1.setAdapter(adapter);
		// *******************************************************************//

		// ************************메딕 탭 추가*****************************//
		Array_Data = new ArrayList<Custom_List_Sub>();

		Array_Data = new ArrayList<Custom_List_Sub>();
		data = new Custom_List_Sub(R.drawable.hs_basicmedic, "기본 메딕 헬멧",
				"영구제 - 기능없음");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.hs_goodmedic, "고급 메딕 헬멧",
				"상점 - 높은 방어력");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.hs_tacticalmedic, "전술 메딕 헬멧",
				"일반 - 높은 방어력, 섬광보호");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.hs_claymoremedic, "크레모아 탐지 헬멧",
				"고급 - 높은 방어력, 크레모아탐지");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.hs_flashmedic, "섬광 보호 헬멧",
				"기간제 - 초탄방어, 섬광보호");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.hs_crownspecialmedic,
				"특수 헬멧(크라운)", "기간제 - 초탄방어. 섬광보호, 크레모아탐지");
		Array_Data.add(data);
		
		data = new Custom_List_Sub(R.drawable.ev_devilhead, "데빌 마스크", "이벤트");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.ev_xmasmedic, "크리스마스 메딕헬멧",
				"이벤트");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.ev_labormedic, "잠수부헬멧", "이벤트");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.ev_blueberet, "푸른 베레모", "이벤트");
		Array_Data.add(data);

		adapter = new CustomAdapterSub(this,
				android.R.layout.simple_list_item_1, Array_Data);

		ListView list2 = (ListView) findViewById(R.id.ListView02);

		list2.setAdapter(adapter);
		// *******************************************************************//

		// ************************엔지니어 탭 추가*****************************//
		Array_Data = new ArrayList<Custom_List_Sub>();
		Array_Data = new ArrayList<Custom_List_Sub>();
		data = new Custom_List_Sub(R.drawable.hs_basicengi, "기본 엔지니어 헬멧",
				"영구제 - 기능없음");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.hs_goodengi, "고급 엔지니어 헬멧",
				"상점 - 높은 방어력");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.hs_tacticalengi, "전술 엔지니어 헬멧",
				"일반 - 높은 방어력, 섬광보호");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.hs_claymoreengi, "크레모아 탐지 헬멧",
				"고급 - 높은 방어력, 크레모아탐지");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.hs_flashengi, "섬광 보호 헬멧",
				"기간제 - 초탄방어, 섬광보호");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.hs_crownspecialengi,
				"특수 헬멧(크라운)", "기간제 - 초탄방어, 섬광보호, 크레모아탐지");
		Array_Data.add(data);
		
		data = new Custom_List_Sub(R.drawable.ev_devilhead, "데빌 마스크", "이벤트");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.ev_xmasengineer, "크리스마스 엔지니어헬멧",
				"이벤트");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.ev_laborengineer, "광산 작업용 헤드폰", "이벤트");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.ev_blueberet, "푸른 베레모", "이벤트");
		Array_Data.add(data);

		adapter = new CustomAdapterSub(this,
				android.R.layout.simple_list_item_1, Array_Data);

		ListView list3 = (ListView) findViewById(R.id.ListView03);

		list3.setAdapter(adapter);
		// *******************************************************************//

		// ************************스나이퍼 탭 추가*****************************//
		Array_Data = new ArrayList<Custom_List_Sub>();
		Array_Data = new ArrayList<Custom_List_Sub>();
		data = new Custom_List_Sub(R.drawable.hs_basicsniper, "기본 스나이퍼 헬멧",
				"영구제 - 기능없음");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.hs_goodsniper, "고급 스나이퍼 헬멧",
				"상점 - 높은 방어력");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.hs_tacticalsniper, "전술 스나이퍼 헬멧",
				"일반 - 높은 방어력, 섬광보호");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.hs_claymoresniper, "크레모아 탐지 헬멧",
				"고급 - 높은 방어력, 크레모아 탐지");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.hs_flashsniper, "섬광 보호 헬멧",
				"기간제 - 초탄방어. 섬광보호");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.hs_crownspecialsniper,
				"특수 헬멧(크라운)", "기간제 - 초탄방어, 섬과보호, 크레모아탐지");
		Array_Data.add(data);
		
		data = new Custom_List_Sub(R.drawable.ev_devilhead, "데빌 마스크", "이벤트");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.ev_xmassniper, "크리스마스 스나이퍼헬멧",
				"이벤트");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.ev_laborsniper, "트위드 모자", "이벤트");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.ev_blueberet, "푸른 베레모", "이벤트");
		Array_Data.add(data);
		
		adapter = new CustomAdapterSub(this,
				android.R.layout.simple_list_item_1, Array_Data);

		ListView list4 = (ListView) findViewById(R.id.ListView04);

		list4.setAdapter(adapter);
		// *******************************************************************//

		myTab = getTabHost(); // TabHost

		myTab.addTab(myTab.newTabSpec("Tag1").setIndicator("라이플맨")
				.setContent(R.id.ListView01)); // Tab 생성
		myTab.addTab(myTab.newTabSpec("Tag2").setIndicator("메딕")
				.setContent(R.id.ListView02));
		myTab.addTab(myTab.newTabSpec("Tag3").setIndicator("엔지니어")
				.setContent(R.id.ListView03));
		myTab.addTab(myTab.newTabSpec("Tag4").setIndicator("스나이퍼")
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
