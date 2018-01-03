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

public class MainActivity extends Activity {

	private ArrayList<Custom_List_Main> Array_Data;
	private Custom_List_Main data;
	private CustomAdapterMain adapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Array_Data = new ArrayList<Custom_List_Main>();
		data = new Custom_List_Main(R.drawable.mb_weapon, "무기");
		Array_Data.add(data);
		data = new Custom_List_Main(R.drawable.mb_shield, "방어구");
		Array_Data.add(data);
		data = new Custom_List_Main(R.drawable.mb_equip, "장비");
		Array_Data.add(data);
		data = new Custom_List_Main(R.drawable.logo_skin, "스킨");
		Array_Data.add(data);
		data = new Custom_List_Main(R.drawable.mb_challenge, "도전과제");
		Array_Data.add(data);
		data = new Custom_List_Main(R.drawable.mb_grade, "계급체계");
		Array_Data.add(data);
		data = new Custom_List_Main(R.drawable.bp_medickit, "인게임 용어사전");
		Array_Data.add(data);
		data = new Custom_List_Main(R.drawable.mb_patch, "도움말 및 패치노트");
		Array_Data.add(data);

		adapter = new CustomAdapterMain(this,
				android.R.layout.simple_list_item_1, Array_Data);

		ListView custom_list = (ListView) findViewById(R.id.listmain);

		custom_list.setAdapter(adapter);

		custom_list.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View v, int pos,
					long arg3) {
				// TODO Auto-generated method stub
				Intent intent;

				switch (pos) {
				case 0:
					intent = new Intent(getApplicationContext(),
							WeaponActivity.class);
					startActivity(intent);
					break;
				case 1:
					intent = new Intent(getApplicationContext(),
							ShieldActivity.class);
					startActivity(intent);
					break;
				case 2:
					intent = new Intent(getApplicationContext(),
							ToolActivity.class);
					startActivity(intent);
					break;
				case 3:
					intent = new Intent(getApplicationContext(),
							SkinActivity.class);
					startActivity(intent);
					break;
				case 4:
					intent = new Intent(getApplicationContext(),
							ChallengeActivity.class);
					startActivity(intent);
					break;
				case 5:
					intent = new Intent(getApplicationContext(),
							GradeActivity.class);
					startActivity(intent);
					break;
				case 6:
					intent = new Intent(getApplicationContext(),
							TipActivity.class);
					startActivity(intent);
					break;
				case 7:
					intent = new Intent(getApplicationContext(),
							PatchActivity.class);
					startActivity(intent);
					break;
				}

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
