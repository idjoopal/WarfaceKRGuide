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

public class KnifeActivity extends Activity {

	private ArrayList<Custom_List_Rifle> Array_Data;
	private Custom_List_Rifle data;
	private CustomAdapterRifle adapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Array_Data = new ArrayList<Custom_List_Rifle>();
		data = new Custom_List_Rifle(R.drawable.nw_basic, "기본대검", "영구제");
		Array_Data.add(data);
		data = new Custom_List_Rifle(R.drawable.nw_ultra, "울트라마린", "상점");
		Array_Data.add(data);

		data = new Custom_List_Rifle(R.drawable.nw_kabar, "KA Bar Utility Knife",
				"고급");
		Array_Data.add(data);

		data = new Custom_List_Rifle(R.drawable.nb_space, "야전삽", "희귀");
		Array_Data.add(data);

		data = new Custom_List_Rifle(R.drawable.nw_bh, "블랙 호크", "기간제");
		Array_Data.add(data);
		data = new Custom_List_Rifle(R.drawable.nw_tactool, "택툴", "기간제");
		Array_Data.add(data);
		data = new Custom_List_Rifle(R.drawable.nw_ice, "고드름 송곳", "이벤트");
		Array_Data.add(data);
		data = new Custom_List_Rifle(R.drawable.nw_hammer, "망치", "이벤트");
		Array_Data.add(data);
		data = new Custom_List_Rifle(R.drawable.nw_woodhammer, "나무망치", "이벤트");
		Array_Data.add(data);
		
		data = new Custom_List_Rifle(R.drawable.ev_haltactool, "데빌스킨 택툴", "이벤트");
		Array_Data.add(data);
		data = new Custom_List_Rifle(R.drawable.ev_xmascandy, "사탕 나이프", "이벤트");
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
