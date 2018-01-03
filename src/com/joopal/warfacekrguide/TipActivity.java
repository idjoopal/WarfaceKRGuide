package com.joopal.warfacekrguide;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ListView;

public class TipActivity extends Activity {

	private ArrayList<Custom_List_Tip> Array_Data;
	private Custom_List_Tip data;
	private CustomAdapterTip adapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Array_Data = new ArrayList<Custom_List_Tip>();
		
		data = new Custom_List_Tip("F5","������ǥ�� �����ϴ� ��ư. ��� �����ų�� �� �������� ����.");
		Array_Data.add(data);
		data = new Custom_List_Tip("��������","�����ϴ� ���� ���̽����� ��⸦ Ÿ�� �ȵǴ� ��, ������ ���������°� �����Ѵ�.");
		Array_Data.add(data);
		data = new Custom_List_Tip("��Ÿ��","�ڵ������� Tavor STAR-21�� ��Ī��.");
		Array_Data.add(data);
		data = new Custom_List_Tip("��Ⱓ��","��Ÿ��� ������ ���⸦ ����ϸ� �ȵǴ¹�. �ʺ��� �׵��� ������ ������ ��� ���� �ȴ�.");
		Array_Data.add(data);
		data = new Custom_List_Tip("�뽺","��Ų�� �����ϸ� �ȵǴ¹�.");
		Array_Data.add(data);
		data = new Custom_List_Tip("�����","Saiga Bullpup ����� �����ϴ� ��. ũ������ ���� ���ܾ���");
		Array_Data.add(data);
		data = new Custom_List_Tip("��Ŀ��","Į���� �������� ��, ����������� �ִ� Ŀ��� ��ź������ �����ϸ� �ȵǴ� ��.");
		Array_Data.add(data);
		data = new Custom_List_Tip("��ũ","ũ����, ���� �����ϸ� �ȵǴ� ��. ���⳪ �� ���� �ϳ��� �����ϱ⵵ �Ѵ�.");
		Array_Data.add(data);
		data = new Custom_List_Tip("��Ÿ��","�Ϲ������� �ڵ������� Tavor STAR-21�� ���� �ȵǴ� ��. �ٸ� Ÿ���� ����� ����.");
		Array_Data.add(data);
		data = new Custom_List_Tip("����","���� ������� �ʴ� �������� ��Ī��. ���ϸ鼭 �� ���ϸ� ��Դ´�.");
		Array_Data.add(data);
		data = new Custom_List_Tip("����","������ Ȯ�� ���ϰ� �ϴ� �츮���� �޵��� ��Ī, �ű⿡ �Ǳ��� ���ָ� �ְ��.");
		Array_Data.add(data);
		data = new Custom_List_Tip("����","���Ĺ̼ǿ��� ������ Ȯ�ξ��ϰ� C4�� ���ߴٰ� ���� ��ü���� ���� ��Ī��.");
		Array_Data.add(data);
		data = new Custom_List_Tip("��Ÿ��","���ڵ������� Tavor STAR-21 Navy Blue�� ��Ī��.");
		Array_Data.add(data);
		data = new Custom_List_Tip("��ź","���� �´� ù��° źȯ�� ������ִ� ��ź����� ���Ӹ�, �Ʊ��� �� �ѿ��� ���� �� ������ �����Ѵ�.");
		Array_Data.add(data);

		adapter = new CustomAdapterTip(this,
				android.R.layout.simple_list_item_1, Array_Data);

		ListView custom_list = (ListView) findViewById(R.id.listmain);

		custom_list.setAdapter(adapter);

		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
