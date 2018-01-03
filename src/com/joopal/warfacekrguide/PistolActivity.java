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
				"Browning High Power", "������");
		Array_Data.add(data);
		data = new Custom_List_Rifle(R.drawable.pw_k5, "Daewoo K5", "����");
		Array_Data.add(data);

		data = new Custom_List_Rifle(R.drawable.pw_steyr, "Steyr M9A1", "�Ϲ�");
		Array_Data.add(data);

		data = new Custom_List_Rifle(R.drawable.pw_beretta, "Berreta M9", "���");
		Array_Data.add(data);

		data = new Custom_List_Rifle(R.drawable.pw_colt, "COLT Python Elite",
				"���");
		Array_Data.add(data);

		data = new Custom_List_Rifle(R.drawable.pw_usp, "H&K USP", "�Ⱓ��");
		Array_Data.add(data);
		data = new Custom_List_Rifle(R.drawable.pw_degle, "Desert Eagle", "�Ⱓ��");
		Array_Data.add(data);
		data = new Custom_List_Rifle(R.drawable.pw_glock, "Glock 18C", "�Ⱓ��");
		Array_Data.add(data);
		data = new Custom_List_Rifle(R.drawable.pw_berettapc,
				"Beretta M9 ����(PC��)", "PC�� ����");
		Array_Data.add(data);
		data = new Custom_List_Rifle(R.drawable.pw_crowndegle,
				"Desert Eagle(ũ���)", "�Ⱓ��");
		Array_Data.add(data);

		data = new Custom_List_Rifle(R.drawable.pw_hand, "�հ��� ����", "�̺�Ʈ");
		Array_Data.add(data);
		data = new Custom_List_Rifle(R.drawable.ev_halsteckin,
				"������Ų Stechkin APS", "�̺�Ʈ");
		Array_Data.add(data);
		data = new Custom_List_Rifle(R.drawable.ev_winterusp, "�ܿ����嵵�� H&K USP",
				"�̺�Ʈ");
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
				// putExtra �� ������ �������� ������ ����Ʈ�� �Ѱ� �� �� �ִ�.
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
