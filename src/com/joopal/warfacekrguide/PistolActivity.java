package com.joopal.warfacekrguide;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

public class PistolActivity extends Activity {

	private ArrayList<Custom_List_Rifle> Array_Data;
	private Custom_List_Rifle data;
	private CustomAdapterRifle adapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Array_Data = new ArrayList<Custom_List_Rifle>();
		data = new Custom_List_Rifle(R.drawable.pw_browning,
				"Browning High Power", "영구제");
		Array_Data.add(data);
		data = new Custom_List_Rifle(R.drawable.pw_k5, "Daewoo K5", "상점");
		Array_Data.add(data);

		data = new Custom_List_Rifle(R.drawable.pw_steyr, "Steyr M9A1", "일반");
		Array_Data.add(data);

		data = new Custom_List_Rifle(R.drawable.pw_beretta, "Berreta M9", "고급");
		Array_Data.add(data);

		data = new Custom_List_Rifle(R.drawable.pw_colt, "COLT Python Elite",
				"희귀");
		Array_Data.add(data);

		data = new Custom_List_Rifle(R.drawable.pw_usp, "H&K USP", "기간제");
		Array_Data.add(data);
		data = new Custom_List_Rifle(R.drawable.pw_degle, "Desert Eagle", "기간제");
		Array_Data.add(data);
		data = new Custom_List_Rifle(R.drawable.pw_glock, "Glock 18C", "기간제");
		Array_Data.add(data);
		data = new Custom_List_Rifle(R.drawable.pw_berettapc,
				"Beretta M9 도색(PC방)", "PC방 전용");
		Array_Data.add(data);
		data = new Custom_List_Rifle(R.drawable.pw_crowndegle,
				"Desert Eagle(크라운)", "기간제");
		Array_Data.add(data);

		data = new Custom_List_Rifle(R.drawable.pw_hand, "손가락 권총", "이벤트");
		Array_Data.add(data);
		data = new Custom_List_Rifle(R.drawable.ev_halsteckin,
				"데빌스킨 Stechkin APS", "이벤트");
		Array_Data.add(data);
		data = new Custom_List_Rifle(R.drawable.ev_winterusp, "겨울위장도색 H&K USP",
				"이벤트");
		Array_Data.add(data);

		adapter = new CustomAdapterRifle(this,
				android.R.layout.simple_list_item_1, Array_Data);

		ListView custom_list = (ListView) findViewById(R.id.listmain);

		custom_list.setAdapter(adapter);

		custom_list.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View v, int pos,
					long arg3) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(getApplicationContext(),
						ExplainActivity.class);
				// putExtra 로 선택한 아이템의 정보를 인텐트로 넘겨 줄 수 있다.
				intent.putExtra("IMAGE", Array_Data.get(pos).getImage_ID());
				intent.putExtra("TITLE", Array_Data.get(pos).getTitle1());
				intent.putExtra("VENDOR", Array_Data.get(pos).getTitle2());
				startActivity(intent);
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
