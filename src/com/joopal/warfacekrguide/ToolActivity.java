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

public class ToolActivity extends TabActivity {
	TabHost myTab = null;

	private ArrayList<Custom_List_Sub> Array_Data;
	private Custom_List_Sub data;
	private CustomAdapterSub adapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_content);

		// ************************���� �� �߰�*****************************//
		Array_Data = new ArrayList<Custom_List_Sub>();
		data = new Custom_List_Sub(R.drawable.tool_blackpolimeri,
				"�������� ����������","�Ϲ� - ��Ȯ�� �ణ����, �ݵ� �ణ����");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.tool_basicsound, "ǥ���� ������","�Ϲ� - ������ ū������, ���� ����");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.tool_iotec553, "�̿��� 553 ���ر�","�Ϲ� - 1.2�� ��");
		Array_Data.add(data);

		data = new Custom_List_Sub(R.drawable.tool_pistolknife, "���� �Ѱ�","��� - �ݵ�, �������ݷ� ����");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.tool_reddot, "Ʈ��۷� ����� ���ر�","��� - 1.2��");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.tool_pistolcustom,
				"Ŀ���� ���� ������","��� - ��Ȯ�� ����, ����, ������ ����");
		Array_Data.add(data);

		data = new Custom_List_Sub(R.drawable.tool_pistolgas, "���� �ҿ���","��� - �����, ��Ÿ� ����");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.tool_pistolglass,
				"���� ���ذ� 1.5X","��� - 1.5�� ��");
		Array_Data.add(data);

		adapter = new CustomAdapterSub(this,
				android.R.layout.simple_list_item_1, Array_Data);

		ListView list5 = (ListView) findViewById(R.id.ListView05);

		list5.setAdapter(adapter);
		// *******************************************************************//

		// ************************�����ø� �� �߰�*****************************//
		Array_Data = new ArrayList<Custom_List_Sub>();

		data = new Custom_List_Sub(R.drawable.tool_elkanspectorlight,
				"��ĭ ������ ���� ���ذ�","�Ϲ� - 2�� ��");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.tool_quickmount, "�� ����Ʈ ������","�Ϲ� - ��Ȯ�� ����, ����, ������ ����");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.tool_macguny, "����� �簢��","�Ϲ� - (���帰 ���¿���) ��Ȯ�� ����, �ݵ� ����");
		Array_Data.add(data);

		data = new Custom_List_Sub(R.drawable.tool_assaulti, "���� ����������","��� - (�� �ڼ����� ��)��Ȯ�� ����, �ݵ� ����");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.tool_elkanspectordualroll,
				"��ĭ ������ ��� �� ���ذ�","��� - 2�� ��");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.tool_assaultgas, "���� �ҿ���","��� - �����, ��Ÿ� ����");
		Array_Data.add(data);

		data = new Custom_List_Sub(R.drawable.tool_assaulty, "���� ���� �簢��","��� - (���帰 ���¿��� ��)��Ȯ�� ����, �ݵ� ����");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.tool_grenade, "��ź �߻��","��� - ��ź�߻� ����");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.tool_assaultknife, "���� �Ѱ�","��� - �������ݷ�, �ݵ� ����");
		Array_Data.add(data);
		data = new Custom_List_Sub(
				R.drawable.tool_tridgekunhighbattlelight, "Ʈ������ ��������������ذ�","��� - 3�� ��");
		Array_Data.add(data);

		adapter = new CustomAdapterSub(this,
				android.R.layout.simple_list_item_1, Array_Data);

		ListView list1 = (ListView) findViewById(R.id.ListView01);

		list1.setAdapter(adapter);
		// *******************************************************************//

		// ************************�޵� �� �߰�*****************************//
		Array_Data = new ArrayList<Custom_List_Sub>();

		data = new Custom_List_Sub(R.drawable.tool_aimcompm4s, "���� ���� M4S","�Ϲ� - 1.2�� ��");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.tool_shotgunsound, "��ź�� ������","�Ϲ� - ��Ȯ�� ����, ����, ������ ����");
		Array_Data.add(data);

		data = new Custom_List_Sub(R.drawable.tool_mozizero, "���� ���� ���ر�","��� - ���� 1.2�� ��, ��Ȯ�� ����, �ݵ� ����");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.tool_shotgungas, "��ź�� �ҿ���","��� - ��Ÿ�, ����� ����");
		Array_Data.add(data);

		data = new Custom_List_Sub(R.drawable.tool_shotgunknife, "��ź�� �Ѱ�","��� - �������ݷ�, �ݵ� ����");
		Array_Data.add(data);

		adapter = new CustomAdapterSub(this,
				android.R.layout.simple_list_item_1, Array_Data);

		ListView list2 = (ListView) findViewById(R.id.ListView02);

		list2.setAdapter(adapter);
		// *******************************************************************//

		// ************************�����Ͼ� �� �߰�*****************************//
		Array_Data = new ArrayList<Custom_List_Sub>();

		data = new Custom_List_Sub(R.drawable.tool_ryupordmark4cqt,
				"������ ��ũ4 CQ/T","�Ϲ� - 3�� ��");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.tool_engisound, "������� ������","�Ϲ� - ��Ȯ�� ����, ������, ���� ����");
		Array_Data.add(data);

		data = new Custom_List_Sub(R.drawable.tool_cqb, "CQB ���� ���ذ�","��� - 2�� ��");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.tool_engii, "������� ����������","��� - (�� �ڼ����� ��)��Ȯ�� ����, �ݵ�����");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.tool_engigas, "������� �ҿ���","��� - �����, ��Ÿ� ����");
		Array_Data.add(data);

		data = new Custom_List_Sub(R.drawable.tool_engiknife, "������� �Ѱ�","��� - �������ݷ�, �ݵ� ����");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.tool_fix3xtacticalglass,
				"���� 3�� ���� ���ذ�","��� - ���� 3����");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.tool_blackpolimery,
				"�������� �����簢��","��� - (���帰 ���¿��� ��)��Ȯ�� ����, �ݵ� ����");
		Array_Data.add(data);

		adapter = new CustomAdapterSub(this,
				android.R.layout.simple_list_item_1, Array_Data);

		ListView list3 = (ListView) findViewById(R.id.ListView03);

		list3.setAdapter(adapter);
		// *******************************************************************//

		// ************************�������� �� �߰�*****************************//
		Array_Data = new ArrayList<Custom_List_Sub>();
		data = new Custom_List_Sub(R.drawable.tool_basic55, "ǥ�� 5.5����","�⺻ - 5.5�� ��");
		Array_Data.add(data);

		data = new Custom_List_Sub(R.drawable.tool_snipery, "������ �簢��","�Ϲ� - (���帰 ���¿���)��Ȯ��, �ݵ� �ణ ����");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.tool_mid45, "�߰Ÿ� 4.5����","�Ϲ� - 4.5�� ��");
		Array_Data.add(data);

		data = new Custom_List_Sub(R.drawable.tool_short4, "�ܰŸ� 4����","��� - 4�� ��");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.tool_snipergas, "������ �ҿ���","��� - ��Ÿ�, ����� ����");
		Array_Data.add(data);

		data = new Custom_List_Sub(R.drawable.tool_cusiony, "�ݵ����� �簢��","��� - (���帰 ���¿���)��Ȯ��, �ݵ� ����");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.tool_snipersound, "������ ������","��� - ��Ȯ�� ����, ������,���� ����");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.tool_fastmid5, "���� �߰Ÿ� 5����","��� - ���� 5�� ��");
		Array_Data.add(data);

		adapter = new CustomAdapterSub(this,
				android.R.layout.simple_list_item_1, Array_Data);

		ListView list4 = (ListView) findViewById(R.id.ListView04);

		list4.setAdapter(adapter);
		// *******************************************************************//

		myTab = getTabHost(); // TabHost

		myTab.addTab(myTab.newTabSpec("Tag1").setIndicator("����")
				.setContent(R.id.ListView05));
		myTab.addTab(myTab.newTabSpec("Tag2").setIndicator("�����ø�")
				.setContent(R.id.ListView01)); // Tab ����
		myTab.addTab(myTab.newTabSpec("Tag3").setIndicator("�޵�")
				.setContent(R.id.ListView02));
		myTab.addTab(myTab.newTabSpec("Tag4").setIndicator("�����Ͼ�")
				.setContent(R.id.ListView03));
		myTab.addTab(myTab.newTabSpec("Tag5").setIndicator("��������")
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
