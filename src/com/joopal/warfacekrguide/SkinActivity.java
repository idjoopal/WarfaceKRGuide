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

public class SkinActivity extends Activity {

	private ArrayList<Custom_List_Main> Array_Data;
	private Custom_List_Main data;
	private CustomAdapterMain adapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Array_Data = new ArrayList<Custom_List_Main>();

		data = new Custom_List_Main(R.drawable.logo_skin, "전신슈트");
		Array_Data.add(data);
		data = new Custom_List_Main(R.drawable.ls_resist, "저항군");
		Array_Data.add(data);
		data = new Custom_List_Main(R.drawable.ls_china, "공안 특수경찰부대");
		Array_Data.add(data);
		data = new Custom_List_Main(R.drawable.ls_pandora, "판도라");
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

				intent = new Intent(getApplicationContext(),
						SkinpicActivity.class);
				intent.putExtra("TITLE", Array_Data.get(pos).getTitle1());
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
