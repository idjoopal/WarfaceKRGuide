package com.joopal.warfacekrguide;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

public class GrenadeActivity extends Activity {

	private ArrayList<Custom_List_Sub> Array_Data;
	private Custom_List_Sub data;
	private CustomAdapterSub adapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Array_Data = new ArrayList<Custom_List_Sub>();
		data = new Custom_List_Sub(R.drawable.fw_m26grenade, "M26 ����ź","������");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.fw_m18smog, "M18 ����ź","����");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.fw_m84flash, "M84 ����ź","����");
		Array_Data.add(data);
		
		data = new Custom_List_Sub(R.drawable.ev_xmasgrenade, "ũ�������� ����ź","�̺�Ʈ");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.ev_ricegrenade, "�ָԹ� ����ź","�̺�Ʈ");
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
