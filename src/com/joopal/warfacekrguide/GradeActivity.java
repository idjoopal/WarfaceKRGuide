package com.joopal.warfacekrguide;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

public class GradeActivity extends Activity {

	private ArrayList<Custom_List_Sub> Array_Data;
	private Custom_List_Sub data;
	private CustomAdapterSub adapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		// ************************��ũ �� �߰�*****************************//
		Array_Data = new ArrayList<Custom_List_Sub>();

		data = new Custom_List_Sub(R.drawable.rank1, "�Ʒú�", "0");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.rank2, "�̺�", "700");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.rank3, "�Ϻ�", "1400");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.rank4, "��", "2400");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.rank5, "����", "3900");
		Array_Data.add(data);
		
		data = new Custom_List_Sub(R.drawable.rank6, "�ϻ�", "5800");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.rank7, "�߻�", "8100");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.rank8, "��� 1ȣ��", "11000");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.rank9, "��� 2ȣ��", "14600");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.rank10, "��� 3ȣ��", "18800");
		Array_Data.add(data);
		
		data = new Custom_List_Sub(R.drawable.rank11, "���� 1ȣ��", "23800");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.rank12, "���� 2ȣ��", "29600");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.rank13, "���� 3ȣ��", "36300");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.rank14, "���� 4ȣ��", "44100");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.rank15, "���� 5ȣ��", "53000");
		Array_Data.add(data);
		
		data = new Custom_List_Sub(R.drawable.rank16, "���� 1ȣ��", "63000");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.rank17, "���� 2ȣ��", "74500");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.rank18, "���� 3ȣ��", "87400");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.rank19, "���� 4ȣ��", "102000");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.rank20, "���� 5ȣ��", "118400");
		Array_Data.add(data);
		
		data = new Custom_List_Sub(R.drawable.rank21, "���� 1ȣ��", "136700");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.rank22, "���� 2ȣ��", "157200");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.rank23, "���� 3ȣ��", "180000");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.rank24, "���� 4ȣ��", "205200");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.rank25, "���� 5ȣ��", "233300");
		Array_Data.add(data);
		
		data = new Custom_List_Sub(R.drawable.rank26, "���� 1ȣ��", "264400");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.rank27, "���� 2ȣ��", "298700");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.rank28, "���� 3ȣ��", "336500");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.rank29, "���� 4ȣ��", "378000");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.rank30, "���� 5ȣ��", "423700");
		Array_Data.add(data);
		
		data = new Custom_List_Sub(R.drawable.rank31, "���� 1ȣ��", "473700");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.rank32, "���� 2ȣ��", "528400");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.rank33, "���� 3ȣ��", "588100");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.rank34, "���� 4ȣ��", "653400");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.rank35, "���� 5ȣ��", "724400");
		Array_Data.add(data);
		
		data = new Custom_List_Sub(R.drawable.rank36, "�ҷ� 1ȣ��", "801600");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.rank37, "�ҷ� 2ȣ��", "885500");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.rank38, "�ҷ� 3ȣ��", "976400");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.rank39, "�ҷ� 4ȣ��", "1074800");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.rank40, "�ҷ� 5ȣ��", "1181100");
		Array_Data.add(data);
		
		data = new Custom_List_Sub(R.drawable.rank41, "�߷� 1ȣ��", "1296000");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.rank42, "�߷� 2ȣ��", "1419700");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.rank43, "�߷� 3ȣ��", "1552900");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.rank44, "�߷� 4ȣ��", "1696200");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.rank45, "�߷� 5ȣ��", "1849900");
		Array_Data.add(data);
		
		data = new Custom_List_Sub(R.drawable.rank46, "��� 1ȣ��", "2014800");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.rank47, "��� 2ȣ��", "2191200");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.rank48, "��� 3ȣ��", "2380000");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.rank49, "��� 4ȣ��", "2581500");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.rank50, "��� 5ȣ��", "2796400");
		Array_Data.add(data);
		
		data = new Custom_List_Sub(R.drawable.rank51, "���� 1ȣ��", "3025300");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.rank52, "���� 2ȣ��", "3268800");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.rank53, "���� 3ȣ��", "3527500");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.rank54, "���� 4ȣ��", "3801900");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.rank55, "���� 5ȣ��", "4092800");
		Array_Data.add(data);
		
		data = new Custom_List_Sub(R.drawable.rank56, "���� 1ȣ��", "4400600");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.rank57, "���� 2ȣ��", "4726000");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.rank58, "���� 3ȣ��", "5069500");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.rank59, "���� 4ȣ��", "5431800");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.rank60, "���� 5ȣ��", "6000000");
		Array_Data.add(data);
		
		data = new Custom_List_Sub(R.drawable.rank61, "���� 1ȣ��", "6568200");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.rank62, "���� 2ȣ��", "7136400");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.rank63, "���� 3ȣ��", "7704600");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.rank64, "���� 4ȣ��", "8272800");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.rank65, "���� 5ȣ��", "8841000");
		Array_Data.add(data);
		
		data = new Custom_List_Sub(R.drawable.rank66, "���� 1ȣ��", "9409200");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.rank67, "���� 2ȣ��", "9977400");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.rank68, "���� 3ȣ��", "10545600");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.rank69, "���� 4ȣ��", "11113800");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.rank70, "����", "11692000");
		Array_Data.add(data);

		adapter = new CustomAdapterSub(this,
				android.R.layout.simple_list_item_1, Array_Data);

		ListView list1 = (ListView) findViewById(R.id.listmain);

		list1.setAdapter(adapter);
		// *******************************************************************//

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
