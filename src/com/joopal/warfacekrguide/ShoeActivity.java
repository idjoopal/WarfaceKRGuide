package com.joopal.warfacekrguide;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

public class ShoeActivity extends Activity {

	private ArrayList<Custom_List_Sub> Array_Data;
	private Custom_List_Sub data;
	private CustomAdapterSub adapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Array_Data = new ArrayList<Custom_List_Sub>();
		data = new Custom_List_Sub(R.drawable.fs_basic, "기본 군화","영구제 - 기능없음");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.fs_safe, "보호 군화","상점 - 높은 방어력");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.fs_dash, "전력 질주 군화","고급 - 전력질주 시간증가");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.fs_sound, "소음 군화","고급 - 발소리 제거");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.fs_fast, "빠른 군화","희귀 - 전력질주, 앉은속도 증가");
		Array_Data.add(data);
		
		data = new Custom_List_Sub(R.drawable.fs_claymore, "크레모아 지연 군화","기간제 - 크레모아지연");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.fs_slide, "슬라이딩 군화","기간제 - 슬라이딩거리 증가");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.fs_light, "초경량 군화","기간제 - 전력질주속도증가");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.fs_crownspecial, "특수 군화(크라운)","기간제 - 전력질주속도,시간증가, 크레모아지연");
		Array_Data.add(data);
		
		data = new Custom_List_Sub(R.drawable.ev_xmasshoe, "크리스마스 군화","이벤트 - 전력질주속도증가");
		Array_Data.add(data);

		adapter = new CustomAdapterSub(this,
				android.R.layout.simple_list_item_1, Array_Data);

		ListView custom_list = (ListView) findViewById(R.id.listmain);

		custom_list.setAdapter(adapter);

		custom_list.setOnItemClickListener(new OnItemClickListener() {

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
