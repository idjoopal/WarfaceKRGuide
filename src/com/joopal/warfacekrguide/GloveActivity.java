package com.joopal.warfacekrguide;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

public class GloveActivity extends Activity {

	private ArrayList<Custom_List_Sub> Array_Data;
	private Custom_List_Sub data;
	private CustomAdapterSub adapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Array_Data = new ArrayList<Custom_List_Sub>();
		data = new Custom_List_Sub(R.drawable.gs_basic, "기본 장갑","영구제 - 기능없음");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.gs_safe, "보호 장갑","상점 - 높은 방어력");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.gs_knock, "넉다운 장갑","일반 - 근접공격시 넉다운");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.gs_fastchange, "빠른 교체 장갑","일반 - 무기교체속도 증가");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.gs_knife, "근접공격 장갑","고급 - 근접공격속도 증가");
		Array_Data.add(data);
		
		data = new Custom_List_Sub(R.drawable.gs_light, "초경량장갑(메딕)","기간제 - 재장전, 무기교체속도 증가\n러시아에서는 메딕고급장갑이지만 우리나라에서 초경량장갑으로 명명");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.gs_kevlar, "케블라장갑","기간제 - 재장전, 근접공격속도 증가");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.gs_crownspecial, "특수장갑(크라운)","기간제 - 무기교체,장전속도증가, 높은 방어력");
		Array_Data.add(data);
		
		data = new Custom_List_Sub(R.drawable.ev_xmasglove, "크리스마스 장갑","이벤트 - 장전속도증가");
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
