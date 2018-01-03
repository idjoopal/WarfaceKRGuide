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

		Intent i = getIntent(); // ���� �޾ƿ´�.
		String title = i.getStringExtra("TITLE");

		skin_title.setText(title);

		if (title.equals("���Ž�Ʈ")) {
			skin_sub.setText("����� Ư����� �̻� ����");
			skin_pic1.setBackgroundResource(R.drawable.skin_eliterifle);
			skin_pic2.setBackgroundResource(R.drawable.skin_elitemedic);
			skin_pic3.setBackgroundResource(R.drawable.skin_eliteengineer);
			skin_pic4.setBackgroundResource(R.drawable.skin_elitesniper);

		} else if (title.equals("���ױ�")) {
			skin_sub.setText("�ʺ����� �̺�Ʈ�� ����");
			skin_pic1.setBackgroundResource(R.drawable.skin_resistrifle);
			skin_pic2.setBackgroundResource(R.drawable.skin_resistmedic);
			skin_pic3.setBackgroundResource(R.drawable.skin_resistengineer);
			skin_pic4.setBackgroundResource(R.drawable.skin_resistsniper);

		} else if (title.equals("���� Ư�������δ�")) {
			skin_sub.setText("��Ÿ������Ʈ ���� Ÿ����� Ŭ���� ������ ����");
			skin_pic1.setBackgroundResource(R.drawable.skin_chinarifle);
			skin_pic2.setBackgroundResource(R.drawable.skin_chinamedic);
			skin_pic3.setBackgroundResource(R.drawable.skin_chinaengineer);
			skin_pic4.setBackgroundResource(R.drawable.skin_chinasniper);

		} else if (title.equals("�ǵ���")) {
			skin_sub.setText("�ǵ��� ������Ʈ ���� ����, ���� ��Ų ��Ī�� '���ζ�'�̸� ���þƿ� �츮������ �޵�Ų �𵨸��� �ٸ�");
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
