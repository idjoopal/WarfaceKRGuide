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

public class ShieldActivity extends Activity {

	private ArrayList<Custom_List_Main> Array_Data;
	private Custom_List_Main data;
	private CustomAdapterMain adapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Array_Data = new ArrayList<Custom_List_Main>();
		data = new Custom_List_Main(R.drawable.bs_curundum, "πÊ≈∫¡∂≥¢");
		Array_Data.add(data);
		data = new Custom_List_Main(R.drawable.hs_claymoreengi, "«Ô∏‰");
		Array_Data.add(data);
		data = new Custom_List_Main(R.drawable.gs_knock, "¿Â∞©");
		Array_Data.add(data);
		data = new Custom_List_Main(R.drawable.fs_fast, "±∫»≠");
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
							BodyShieldActivity.class);
					startActivity(intent);
					break;
				case 1:
					intent = new Intent(getApplicationContext(),
							HelmetActivity.class);
					startActivity(intent);
					break;
				case 2:
					intent = new Intent(getApplicationContext(),
							GloveActivity.class);
					startActivity(intent);
					break;
				case 3:
					intent = new Intent(getApplicationContext(),
							ShoeActivity.class);
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
