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

		// ************************∏∂≈© ≈« √ﬂ∞°*****************************//
		Array_Data = new ArrayList<Custom_List_Sub>();

		data = new Custom_List_Sub(R.drawable.rank1, "»∆∑√∫¥", "0");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.rank2, "¿Ã∫¥", "700");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.rank3, "¿œ∫¥", "1400");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.rank4, "ªÛ∫¥", "2400");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.rank5, "∫¥¿Â", "3900");
		Array_Data.add(data);
		
		data = new Custom_List_Sub(R.drawable.rank6, "«œªÁ", "5800");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.rank7, "¡ﬂªÁ", "8100");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.rank8, "ªÛªÁ 1»£∫¿", "11000");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.rank9, "ªÛªÁ 2»£∫¿", "14600");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.rank10, "ªÛªÁ 3»£∫¿", "18800");
		Array_Data.add(data);
		
		data = new Custom_List_Sub(R.drawable.rank11, "ø¯ªÁ 1»£∫¿", "23800");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.rank12, "ø¯ªÁ 2»£∫¿", "29600");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.rank13, "ø¯ªÁ 3»£∫¿", "36300");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.rank14, "ø¯ªÁ 4»£∫¿", "44100");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.rank15, "ø¯ªÁ 5»£∫¿", "53000");
		Array_Data.add(data);
		
		data = new Custom_List_Sub(R.drawable.rank16, "¡ÿ¿ß 1»£∫¿", "63000");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.rank17, "¡ÿ¿ß 2»£∫¿", "74500");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.rank18, "¡ÿ¿ß 3»£∫¿", "87400");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.rank19, "¡ÿ¿ß 4»£∫¿", "102000");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.rank20, "¡ÿ¿ß 5»£∫¿", "118400");
		Array_Data.add(data);
		
		data = new Custom_List_Sub(R.drawable.rank21, "º“¿ß 1»£∫¿", "136700");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.rank22, "º“¿ß 2»£∫¿", "157200");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.rank23, "º“¿ß 3»£∫¿", "180000");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.rank24, "º“¿ß 4»£∫¿", "205200");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.rank25, "º“¿ß 5»£∫¿", "233300");
		Array_Data.add(data);
		
		data = new Custom_List_Sub(R.drawable.rank26, "¡ﬂ¿ß 1»£∫¿", "264400");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.rank27, "¡ﬂ¿ß 2»£∫¿", "298700");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.rank28, "¡ﬂ¿ß 3»£∫¿", "336500");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.rank29, "¡ﬂ¿ß 4»£∫¿", "378000");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.rank30, "¡ﬂ¿ß 5»£∫¿", "423700");
		Array_Data.add(data);
		
		data = new Custom_List_Sub(R.drawable.rank31, "¥Î¿ß 1»£∫¿", "473700");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.rank32, "¥Î¿ß 2»£∫¿", "528400");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.rank33, "¥Î¿ß 3»£∫¿", "588100");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.rank34, "¥Î¿ß 4»£∫¿", "653400");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.rank35, "¥Î¿ß 5»£∫¿", "724400");
		Array_Data.add(data);
		
		data = new Custom_List_Sub(R.drawable.rank36, "º“∑… 1»£∫¿", "801600");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.rank37, "º“∑… 2»£∫¿", "885500");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.rank38, "º“∑… 3»£∫¿", "976400");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.rank39, "º“∑… 4»£∫¿", "1074800");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.rank40, "º“∑… 5»£∫¿", "1181100");
		Array_Data.add(data);
		
		data = new Custom_List_Sub(R.drawable.rank41, "¡ﬂ∑… 1»£∫¿", "1296000");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.rank42, "¡ﬂ∑… 2»£∫¿", "1419700");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.rank43, "¡ﬂ∑… 3»£∫¿", "1552900");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.rank44, "¡ﬂ∑… 4»£∫¿", "1696200");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.rank45, "¡ﬂ∑… 5»£∫¿", "1849900");
		Array_Data.add(data);
		
		data = new Custom_List_Sub(R.drawable.rank46, "¥Î∑… 1»£∫¿", "2014800");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.rank47, "¥Î∑… 2»£∫¿", "2191200");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.rank48, "¥Î∑… 3»£∫¿", "2380000");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.rank49, "¥Î∑… 4»£∫¿", "2581500");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.rank50, "¥Î∑… 5»£∫¿", "2796400");
		Array_Data.add(data);
		
		data = new Custom_List_Sub(R.drawable.rank51, "¡ÿ¿Â 1»£∫¿", "3025300");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.rank52, "¡ÿ¿Â 2»£∫¿", "3268800");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.rank53, "¡ÿ¿Â 3»£∫¿", "3527500");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.rank54, "¡ÿ¿Â 4»£∫¿", "3801900");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.rank55, "¡ÿ¿Â 5»£∫¿", "4092800");
		Array_Data.add(data);
		
		data = new Custom_List_Sub(R.drawable.rank56, "º“¿Â 1»£∫¿", "4400600");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.rank57, "º“¿Â 2»£∫¿", "4726000");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.rank58, "º“¿Â 3»£∫¿", "5069500");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.rank59, "º“¿Â 4»£∫¿", "5431800");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.rank60, "º“¿Â 5»£∫¿", "6000000");
		Array_Data.add(data);
		
		data = new Custom_List_Sub(R.drawable.rank61, "¡ﬂ¿Â 1»£∫¿", "6568200");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.rank62, "¡ﬂ¿Â 2»£∫¿", "7136400");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.rank63, "¡ﬂ¿Â 3»£∫¿", "7704600");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.rank64, "¡ﬂ¿Â 4»£∫¿", "8272800");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.rank65, "¡ﬂ¿Â 5»£∫¿", "8841000");
		Array_Data.add(data);
		
		data = new Custom_List_Sub(R.drawable.rank66, "¥Î¿Â 1»£∫¿", "9409200");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.rank67, "¥Î¿Â 2»£∫¿", "9977400");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.rank68, "¥Î¿Â 3»£∫¿", "10545600");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.rank69, "¥Î¿Â 4»£∫¿", "11113800");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.rank70, "ø¯ºˆ", "11692000");
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
