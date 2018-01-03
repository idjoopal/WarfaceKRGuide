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

public class BodyShieldActivity extends TabActivity {
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
		data = new Custom_List_Sub(R.drawable.bs_basic, "기본 방탄조끼", "영구제 - 기능없음");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.bs_shield, "보호 방탄조끼",
				"상점 - 높은 방어력");
		Array_Data.add(data);

		data = new Custom_List_Sub(R.drawable.bs_shieldexplosion, "폭발보호 방탄조끼",
				"일반 - 폭발방어");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.bs_curundum, "커룬덤 방탄조끼",
				"고급 - 근접방어, AP+50%");
		Array_Data.add(data);

		data = new Custom_List_Sub(R.drawable.bs_gidratwo, "가이드라-II 방탄조끼(삭제)",
				"기간제 - HP,AP재생, AP+50%");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.bs_mashield, "근접공격 보호방탄조끼",
				"기간제 - 근접방어");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.bs_specialassault,
				"강습부대 연사보호 방탄조끼", "기간제 - 연사, 근접방어");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.bs_arma, "아르마-I 방탄조끼",
				"기간제 - AP재생, AP+50%");
		Array_Data.add(data);

		data = new Custom_List_Sub(R.drawable.bs_crownspecial, "특수 방탄조끼(크라운)",
				"기간제 - HP,AP재생, 폭발방어, AP+25%");
		Array_Data.add(data);

		data = new Custom_List_Sub(R.drawable.ev_devilvest, "데빌 방탄조끼",
				"이벤트 - 폭발방어, AP+25%");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.ev_xmasvest, "크리스마스 방탄조끼",
				"이벤트 - 폭발방어, AP+25%");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.ev_laborvest, "공사 조끼",
				"이벤트 - 폭발방어, AP+25%");
		Array_Data.add(data);

		adapter = new CustomAdapterSub(this,
				android.R.layout.simple_list_item_1, Array_Data);

		ListView list5 = (ListView) findViewById(R.id.ListView05);

		list5.setAdapter(adapter);
		// *******************************************************************//

		// ************************라이플맨 탭 추가*****************************//
		Array_Data = new ArrayList<Custom_List_Sub>();
		data = new Custom_List_Sub(R.drawable.bs_specialrifle, "특수 라이플맨 방탄조끼",
				"일반 - 연사방어");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.bs_gladiatortwo, "글레디에이터II 방탄조끼",
				"희귀 - 연사, 폭발방어");
		Array_Data.add(data);

		adapter = new CustomAdapterSub(this,
				android.R.layout.simple_list_item_1, Array_Data);

		ListView list1 = (ListView) findViewById(R.id.ListView01);

		list1.setAdapter(adapter);
		// *******************************************************************//

		// ************************메딕 탭 추가*****************************//
		Array_Data = new ArrayList<Custom_List_Sub>();

		data = new Custom_List_Sub(R.drawable.bs_specialmedic, "특수 메딕 방탄조끼",
				"일반 - AP+50%");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.bs_armatwo, "아르마II 방탄조끼",
				"희귀 - 초탄, 연사방어");
		Array_Data.add(data);

		adapter = new CustomAdapterSub(this,
				android.R.layout.simple_list_item_1, Array_Data);

		ListView list2 = (ListView) findViewById(R.id.ListView02);

		list2.setAdapter(adapter);
		// *******************************************************************//

		// ************************엔지니어 탭 추가*****************************//
		Array_Data = new ArrayList<Custom_List_Sub>();
		data = new Custom_List_Sub(R.drawable.bs_specialengi, "특수 엔지니어 방탄조끼",
				"일반 - 초탄방어");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.bs_diamondtwo, "다이어먼II 방탄조끼",
				"희귀 - 초탄, 폭발방어");
		Array_Data.add(data);

		adapter = new CustomAdapterSub(this,
				android.R.layout.simple_list_item_1, Array_Data);

		ListView list3 = (ListView) findViewById(R.id.ListView03);

		list3.setAdapter(adapter);
		// *******************************************************************//

		// ************************스나이퍼 탭 추가*****************************//
		Array_Data = new ArrayList<Custom_List_Sub>();
		data = new Custom_List_Sub(R.drawable.bs_specialsniper, "특수 스나이퍼 방탄조끼",
				"일반 - 탄창증가");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.bs_atlanta, "애틀란타 방탄조끼",
				"희귀 - 폭발방어, 탄창증가");
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
