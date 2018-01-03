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
		data = new Custom_List_Sub(R.drawable.gs_basic, "�⺻ �尩","������ - ��ɾ���");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.gs_safe, "��ȣ �尩","���� - ���� ����");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.gs_knock, "�˴ٿ� �尩","�Ϲ� - �������ݽ� �˴ٿ�");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.gs_fastchange, "���� ��ü �尩","�Ϲ� - ���ⱳü�ӵ� ����");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.gs_knife, "�������� �尩","��� - �������ݼӵ� ����");
		Array_Data.add(data);
		
		data = new Custom_List_Sub(R.drawable.gs_light, "�ʰ淮�尩(�޵�)","�Ⱓ�� - ������, ���ⱳü�ӵ� ����\n���þƿ����� �޵����尩������ �츮���󿡼� �ʰ淮�尩���� ���");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.gs_kevlar, "�ɺ���尩","�Ⱓ�� - ������, �������ݼӵ� ����");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.gs_crownspecial, "Ư���尩(ũ���)","�Ⱓ�� - ���ⱳü,�����ӵ�����, ���� ����");
		Array_Data.add(data);
		
		data = new Custom_List_Sub(R.drawable.ev_xmasglove, "ũ�������� �尩","�̺�Ʈ - �����ӵ�����");
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
