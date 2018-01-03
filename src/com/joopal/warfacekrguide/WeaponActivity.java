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
import android.widget.Toast;

public class WeaponActivity extends Activity {

	private ArrayList<Custom_List_Main> Array_Data;
	private Custom_List_Main data;
	private CustomAdapterMain adapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Array_Data = new ArrayList<Custom_List_Main>();
		data = new Custom_List_Main(R.drawable.lw_major, "주무기");
		Array_Data.add(data);
		data = new Custom_List_Main(R.drawable.lw_sub, "보조무기");
		Array_Data.add(data);
		data = new Custom_List_Main(R.drawable.lw_melee, "근접무기");
		Array_Data.add(data);
		data = new Custom_List_Main(R.drawable.fw_m26grenade, "투척무기");
		Array_Data.add(data);
		data = new Custom_List_Main(R.drawable.bp_medickit, "기타");
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
					Toast.makeText(getApplicationContext(), "주무기",
							Toast.LENGTH_SHORT).show();
					intent = new Intent(getApplicationContext(),
							RifleActivity.class);
					startActivity(intent);
					break;
				case 1:
					Toast.makeText(getApplicationContext(), "보조무기",
							Toast.LENGTH_SHORT).show();
					intent = new Intent(getApplicationContext(),
							PistolActivity.class);
					startActivity(intent);
					break;
				case 2:
					Toast.makeText(getApplicationContext(), "근접무기",
							Toast.LENGTH_SHORT).show();
					intent = new Intent(getApplicationContext(),
							KnifeActivity.class);
					startActivity(intent);
					break;
				case 3:
					Toast.makeText(getApplicationContext(), "투척무기",
							Toast.LENGTH_SHORT).show();
					intent = new Intent(getApplicationContext(),
							GrenadeActivity.class);
					startActivity(intent);
					break;
				case 4:
					Toast.makeText(getApplicationContext(), "기타",
							Toast.LENGTH_SHORT).show();
					intent = new Intent(getApplicationContext(),
							OtherActivity.class);
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
