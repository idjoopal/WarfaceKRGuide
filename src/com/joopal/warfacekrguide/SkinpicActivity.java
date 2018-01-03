package com.joopal.warfacekrguide;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ImageView;
import android.widget.TextView;

public class SkinpicActivity extends Activity {

	private ArrayList<Custom_List_Main> Array_Data;
	private Custom_List_Main data;
	private CustomAdapterMain adapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_skin);

		TextView skin_title = (TextView) findViewById(R.id.skin_title);
		TextView skin_sub = (TextView) findViewById(R.id.skin_sub);
		ImageView skin_pic1 = (ImageView) findViewById(R.id.skin_1);
		ImageView skin_pic2 = (ImageView) findViewById(R.id.skin_2);
		ImageView skin_pic3 = (ImageView) findViewById(R.id.skin_3);
		ImageView skin_pic4 = (ImageView) findViewById(R.id.skin_4);

		Intent i = getIntent(); // 값을 받아온다.
		String title = i.getStringExtra("TITLE");

		skin_title.setText(title);

		if (title.equals("전신슈트")) {
			skin_sub.setText("멤버쉽 특정등급 이상 지급");
			skin_pic1.setBackgroundResource(R.drawable.skin_eliterifle);
			skin_pic2.setBackgroundResource(R.drawable.skin_elitemedic);
			skin_pic3.setBackgroundResource(R.drawable.skin_eliteengineer);
			skin_pic4.setBackgroundResource(R.drawable.skin_elitesniper);

		} else if (title.equals("저항군")) {
			skin_sub.setText("초보유저 이벤트로 지급");
			skin_pic1.setBackgroundResource(R.drawable.skin_resistrifle);
			skin_pic2.setBackgroundResource(R.drawable.skin_resistmedic);
			skin_pic3.setBackgroundResource(R.drawable.skin_resistengineer);
			skin_pic4.setBackgroundResource(R.drawable.skin_resistsniper);

		} else if (title.equals("공안 특수경찰부대")) {
			skin_sub.setText("쿠데타업데이트 직후 타워모드 클리어 했을때 지급");
			skin_pic1.setBackgroundResource(R.drawable.skin_chinarifle);
			skin_pic2.setBackgroundResource(R.drawable.skin_chinamedic);
			skin_pic3.setBackgroundResource(R.drawable.skin_chinaengineer);
			skin_pic4.setBackgroundResource(R.drawable.skin_chinasniper);

		} else if (title.equals("판도라")) {
			skin_sub.setText("판도라 업데이트 이후 지급, 본래 스킨 명칭은 '오로라'이며 러시아와 우리나라의 메딕스킨 모델링이 다름");
			skin_pic1.setBackgroundResource(R.drawable.skin_pandorarifle);
			skin_pic2.setBackgroundResource(R.drawable.skin_pandoramedic);
			skin_pic3.setBackgroundResource(R.drawable.skin_pandoraengineer);
			skin_pic4.setBackgroundResource(R.drawable.skin_pandorasniper);

		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
