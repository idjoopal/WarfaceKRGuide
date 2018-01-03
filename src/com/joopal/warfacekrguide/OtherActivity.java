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

public class OtherActivity extends TabActivity {
	TabHost myTab = null;

	private ArrayList<Custom_List_Sub> Array_Data;
	private Custom_List_Sub data;
	private CustomAdapterSub adapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_content);

		// ************************�����ø� �� �߰�*****************************//
		Array_Data = new ArrayList<Custom_List_Sub>();
		data = new Custom_List_Sub(R.drawable.bp_supply, "�⺻ ź����","������");
		Array_Data.add(data);

		adapter = new CustomAdapterSub(this,
				android.R.layout.simple_list_item_1, Array_Data);

		ListView list1 = (ListView) findViewById(R.id.ListView01);

		list1.setAdapter(adapter);
		// *******************************************************************//

		// ************************�޵� �� �߰�*****************************//
		Array_Data = new ArrayList<Custom_List_Sub>();
		data = new Custom_List_Sub(R.drawable.bp_medickit, "�⺻ �޵�Ŷ","������");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.bp_electric, "�⺻ ��������","������");
		Array_Data.add(data);
		
		adapter = new CustomAdapterSub(this,
				android.R.layout.simple_list_item_1, Array_Data);

		ListView list2 = (ListView) findViewById(R.id.ListView02);

		list2.setAdapter(adapter);
		// *******************************************************************//

		// ************************�����Ͼ� �� �߰�*****************************//
		Array_Data = new ArrayList<Custom_List_Sub>();
		data = new Custom_List_Sub(R.drawable.bp_m18claymore, "M18 ũ�����","������");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.bp_armorkit, "�⺻ �Ƹ�Ŷ","������");

		Array_Data.add(data);

		adapter = new CustomAdapterSub(this,
				android.R.layout.simple_list_item_1, Array_Data);

		ListView list3 = (ListView) findViewById(R.id.ListView03);

		list3.setAdapter(adapter);
		// *******************************************************************//

		// ************************�������� �� �߰�*****************************//
		Array_Data = new ArrayList<Custom_List_Sub>();

		adapter = new CustomAdapterSub(this,
				android.R.layout.simple_list_item_1, Array_Data);

		ListView list4 = (ListView) findViewById(R.id.ListView04);

		list4.setAdapter(adapter);
		// *******************************************************************//

		myTab = getTabHost(); // TabHost

		myTab.addTab(myTab.newTabSpec("Tag1").setIndicator("�����ø�")
				.setContent(R.id.ListView01)); // Tab ����
		myTab.addTab(myTab.newTabSpec("Tag2").setIndicator("�޵�")
				.setContent(R.id.ListView02));
		myTab.addTab(myTab.newTabSpec("Tag3").setIndicator("�����Ͼ�")
				.setContent(R.id.ListView03));
		myTab.addTab(myTab.newTabSpec("Tag4").setIndicator("��������")
				.setContent(R.id.ListView04));

		myTab.setCurrentTab(0); // ù ������

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