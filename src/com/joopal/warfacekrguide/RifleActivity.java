package com.joopal.warfacekrguide;

import java.util.ArrayList;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.TabHost;

public class RifleActivity extends TabActivity {
	TabHost myTab = null;

	//private ArrayList<Custom_List_Rifle> Array_DataR;
	private ArrayList<Custom_List_Rifle> Array_DataR;
	private Custom_List_Rifle dataR;
	private CustomAdapterRifle adapterR;

	private ArrayList<Custom_List_Medic> Array_DataM;
	private Custom_List_Medic dataM;
	private CustomAdapterMedic adapterM;

	private ArrayList<Custom_List_Engineer> Array_DataE;
	private Custom_List_Engineer dataE;
	private CustomAdapterEngineer adapterE;

	private ArrayList<Custom_List_Sniper> Array_DataS;
	private Custom_List_Sniper dataS;
	private CustomAdapterSniper adapterS;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_weapon);


		// ************************�����ø� �� �߰�*****************************//
		Array_DataR = new ArrayList<Custom_List_Rifle>();

		dataR = new Custom_List_Rifle(R.drawable.rw_m4a1, "M4A1", "������");
		Array_DataR.add(dataR);
		dataR = new Custom_List_Rifle(R.drawable.rw_m16a2, "M16A2 LMG", "����");
		Array_DataR.add(dataR);
		dataR = new Custom_List_Rifle(R.drawable.rw_daewook2, "Daewoo K2", "����");
		Array_DataR.add(dataR);

		dataR = new Custom_List_Rifle(R.drawable.rw_mg36, "H&K MG36", "�Ϲ�");
		Array_DataR.add(dataR);
		dataR = new Custom_List_Rifle(R.drawable.rw_g36k, "H&K G36K", "�Ϲ�");
		Array_DataR.add(dataR);
		dataR = new Custom_List_Rifle(R.drawable.rw_tar21, "Tavor TAR-21", "���");
		Array_DataR.add(dataR);
		dataR = new Custom_List_Rifle(R.drawable.rw_calico, "CALICO M955A",
				"���");
		Array_DataR.add(dataR);
		dataR = new Custom_List_Rifle(R.drawable.rw_galil, "Galil", "���");
		Array_DataR.add(dataR);
		dataR = new Custom_List_Rifle(R.drawable.rw_ak103, "AK103", "���");
		Array_DataR.add(dataR);
		dataR = new Custom_List_Rifle(R.drawable.rw_rpk, "RPK", "���");
		Array_DataR.add(dataR);

		dataR = new Custom_List_Rifle(R.drawable.rw_acr, "ACR", "�Ⱓ��");
		Array_DataR.add(dataR);
		dataR = new Custom_List_Rifle(R.drawable.rw_auga3, "AUG A3", "�Ⱓ��");
		Array_DataR.add(dataR);
		dataR = new Custom_List_Rifle(R.drawable.rw_auga3hbar, "AUG A3 H Bar",
				"�Ⱓ��");
		Array_DataR.add(dataR);
		dataR = new Custom_List_Rifle(R.drawable.rw_fnf2000, "FN F2000", "�Ⱓ��");
		Array_DataR.add(dataR);
		dataR = new Custom_List_Rifle(R.drawable.rw_fnscarh, "FN SCAR-H", "�Ⱓ��");
		Array_DataR.add(dataR);
		dataR = new Custom_List_Rifle(R.drawable.rw_xm8lmg, "XM8 LMG", "�Ⱓ��");
		Array_DataR.add(dataR);
		dataR = new Custom_List_Rifle(R.drawable.rw_sig551, "SIG 551(����)",
				"�Ⱓ��");
		Array_DataR.add(dataR);
		dataR = new Custom_List_Rifle(R.drawable.rw_k3, "Daewoo K3", "�Ⱓ��");
		Array_DataR.add(dataR);

		dataR = new Custom_List_Rifle(R.drawable.rw_ak47, "AK-47", "�Ⱓ��");
		Array_DataR.add(dataR);

		dataR = new Custom_List_Rifle(R.drawable.rw_m4a1pc, "M4A1 ����(PC��)",
				"PC������");
		Array_DataR.add(dataR);
		dataR = new Custom_List_Rifle(R.drawable.rw_crownscar,
				"FN SCAR-H(ũ���)", "�Ⱓ��");
		Array_DataR.add(dataR);
		dataR = new Custom_List_Rifle(R.drawable.ev_halg36k, "������Ų H&K G36K",
				"�̺�Ʈ");
		Array_DataR.add(dataR);
		dataR = new Custom_List_Rifle(R.drawable.ev_winterm4a1, "�ܿ����嵵�� M4A1",
				"�̺�Ʈ");
		Array_DataR.add(dataR);
		dataR = new Custom_List_Rifle(R.drawable.ev_xmasacr, "ũ�������� ACR",
				"�̺�Ʈ");
		Array_DataR.add(dataR);

		adapterR = new CustomAdapterRifle(this,
				android.R.layout.simple_list_item_1, Array_DataR);

		ListView list1 = (ListView) findViewById(R.id.ListView01);

		list1.setAdapter(adapterR);

		// *************************�����ø� ���� ���ý�*************************//
		list1.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View v, int pos,
					long arg3) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(getApplicationContext(),
						ExplainActivity.class);
				// putExtra �� ������ �������� ������ ����Ʈ�� �Ѱ� �� �� �ִ�.
				intent.putExtra("IMAGE", Array_DataR.get(pos).getImage_ID());
				intent.putExtra("TITLE", Array_DataR.get(pos).getTitle1());
				intent.putExtra("VENDOR", Array_DataR.get(pos).getTitle2());
				startActivity(intent);
			}
		});
		// *******************************************************************//

		// ************************�޵� �� �߰�*****************************//
		Array_DataM = new ArrayList<Custom_List_Medic>();
		dataM = new Custom_List_Medic(R.drawable.mw_rem870, "Remington 870",
				"������");
		Array_DataM.add(dataM);

		dataM = new Custom_List_Medic(R.drawable.mw_spas, "SPAS-12", "����");
		Array_DataM.add(dataM);

		dataM = new Custom_List_Medic(R.drawable.mw_rem870cb,
				"Remington 870CB", "�Ϲ�");
		Array_DataM.add(dataM);
		dataM = new Custom_List_Medic(R.drawable.mw_mc255, "MC 255 12", "�Ϲ�");
		Array_DataM.add(dataM);

		dataM = new Custom_List_Medic(R.drawable.mw_hawk, "Hawk Pump", "���");
		Array_DataM.add(dataM);
		dataM = new Custom_List_Medic(R.drawable.mw_saiga, "Saiga-12", "���");
		Array_DataM.add(dataM);

		dataM = new Custom_List_Medic(R.drawable.mw_superbe,
				"Super Benelli M4 90", "���");
		Array_DataM.add(dataM);
		dataM = new Custom_List_Medic(R.drawable.mw_nova,
				"Benelli Nova Tactical", "���");
		Array_DataM.add(dataM);
		dataM = new Custom_List_Medic(R.drawable.mw_vepr, "VEPR-12", "���");
		Array_DataM.add(dataM);

		dataM = new Custom_List_Medic(R.drawable.mw_cobray, "Cobray Striker",
				"�Ⱓ��");
		Array_DataM.add(dataM);
		dataM = new Custom_List_Medic(R.drawable.mw_jackhammer, "JackHammer",
				"�Ⱓ��");
		Array_DataM.add(dataM);
		dataM = new Custom_List_Medic(R.drawable.mw_keltec, "Kel-Tec KSG",
				"�Ⱓ��");
		Array_DataM.add(dataM);
		dataM = new Custom_List_Medic(R.drawable.mw_saigabp, "Saiga Bullpup",
				"�Ⱓ��");
		Array_DataM.add(dataM);

		dataM = new Custom_List_Medic(R.drawable.mw_rem870pc,
				"Remington 870 ����(PC��)", "PC������");
		Array_DataM.add(dataM);

		dataM = new Custom_List_Medic(R.drawable.mw_crownbull,
				"Saiga Bullpup(ũ���)", "�Ⱓ��");
		Array_DataM.add(dataM);
		
		dataM = new Custom_List_Medic(R.drawable.ev_halspas,
				"������Ų SPAS-12", "�̺�Ʈ");
		Array_DataM.add(dataM);
		dataM = new Custom_List_Medic(R.drawable.ev_wintersaiga,
				"�ܿ����嵵�� Saiga-12", "�̺�Ʈ");
		Array_DataM.add(dataM);
		dataM = new Custom_List_Medic(R.drawable.ev_xmasspas,
				"ũ�������� SPAS-12", "�̺�Ʈ");
		Array_DataM.add(dataM);

		adapterM = new CustomAdapterMedic(this,
				android.R.layout.simple_list_item_1, Array_DataM);

		ListView list2 = (ListView) findViewById(R.id.ListView02);

		list2.setAdapter(adapterM);

		// *************************�޵� ���� ���ý�*****************************//
		list2.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View v, int pos,
					long arg3) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(getApplicationContext(),
						ExplainActivity.class);
				// putExtra �� ������ �������� ������ ����Ʈ�� �Ѱ� �� �� �ִ�.
				intent.putExtra("IMAGE", Array_DataM.get(pos).getImage_ID());
				intent.putExtra("TITLE", Array_DataM.get(pos).getTitle1());
				intent.putExtra("VENDOR", Array_DataM.get(pos).getTitle2());
				startActivity(intent);

			}
		});
		// *******************************************************************//

		// ************************�����Ͼ� �� �߰�*****************************//
		Array_DataE = new ArrayList<Custom_List_Engineer>();
		dataE = new Custom_List_Engineer(R.drawable.ew_mp5, "H&K MP5", "������");
		Array_DataE.add(dataE);
		dataE = new Custom_List_Engineer(R.drawable.ew_m4cqb, "M4 CQB", "����");
		Array_DataE.add(dataE);

		dataE = new Custom_List_Engineer(R.drawable.ew_g36c, "H&K G36C", "�Ϲ�");
		Array_DataE.add(dataE);
		dataE = new Custom_List_Engineer(R.drawable.ew_k1, "Daewoo K1", "�Ϲ�");
		Array_DataE.add(dataE);

		dataE = new Custom_List_Engineer(R.drawable.ew_aug, "AUG A3 9mm XS",
				"���");
		Array_DataE.add(dataE);
		dataE = new Custom_List_Engineer(R.drawable.ew_mp7, "H&K MP7", "���");
		Array_DataE.add(dataE);

		dataE = new Custom_List_Engineer(R.drawable.ew_ak9, "AK9", "���");
		Array_DataE.add(dataE);
		dataE = new Custom_List_Engineer(R.drawable.ew_uzi, "Mini Uzi", "���");
		Array_DataE.add(dataE);
		dataE = new Custom_List_Engineer(R.drawable.ew_kriss, "Kriss Super V",
				"���");
		Array_DataE.add(dataE);

		dataE = new Custom_List_Engineer(R.drawable.ew_sig552, "SIG 552", "�Ⱓ��");
		Array_DataE.add(dataE);
		dataE = new Custom_List_Engineer(R.drawable.ew_calico, "Calico M960A",
				"�Ⱓ��");
		Array_DataE.add(dataE);
		dataE = new Custom_List_Engineer(R.drawable.ew_p90, "FN P90", "�Ⱓ��");
		Array_DataE.add(dataE);
		dataE = new Custom_List_Engineer(R.drawable.ew_tavor, "Tavor CTAR-21",
				"�Ⱓ��");
		Array_DataE.add(dataE);
		dataE = new Custom_List_Engineer(R.drawable.ew_compact, "XM8 Compact",
				"�Ⱓ��");
		Array_DataE.add(dataE);

		dataE = new Custom_List_Engineer(R.drawable.ew_cqbpc, "M4 CQB ����(PC��)",
				"PC�� ����");
		Array_DataE.add(dataE);
		dataE = new Custom_List_Engineer(R.drawable.ew_crowntavor,
				"Tavor CTAR-21(ũ���)", "�Ⱓ��");
		Array_DataE.add(dataE);
		
		dataE = new Custom_List_Engineer(R.drawable.ev_halg36c, "������Ų H&K G36C",
				"�̺�Ʈ");
		Array_DataE.add(dataE);
		dataE = new Custom_List_Engineer(R.drawable.ev_wintermp5, "�ܿ����嵵�� H&K MP5",
				"�̺�Ʈ");
		Array_DataE.add(dataE);
		dataE = new Custom_List_Engineer(R.drawable.ev_xmaskriss, "ũ�������� Kriss Super V",
				"�̺�Ʈ");
		Array_DataE.add(dataE);

		adapterE = new CustomAdapterEngineer(this,
				android.R.layout.simple_list_item_1, Array_DataE);

		ListView list3 = (ListView) findViewById(R.id.ListView03);

		list3.setAdapter(adapterE);

		// *************************�����Ͼ� ���� ���ý�*****************************//
		list3.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View v, int pos,
					long arg3) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(getApplicationContext(),
						ExplainActivity.class);
				// putExtra �� ������ �������� ������ ����Ʈ�� �Ѱ� �� �� �ִ�.
				intent.putExtra("IMAGE", Array_DataE.get(pos).getImage_ID());
				intent.putExtra("TITLE", Array_DataE.get(pos).getTitle1());
				intent.putExtra("VENDOR", Array_DataE.get(pos).getTitle2());
				startActivity(intent);

			}
		});
		// *******************************************************************//

		// ************************�������� �� �߰�*****************************//
		Array_DataS = new ArrayList<Custom_List_Sniper>();
		dataS = new Custom_List_Sniper(R.drawable.sw_dragu, "Dragunov SR",
				"������");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Sniper(R.drawable.sw_m16, "M16A2 Custom SPR",
				"����");
		Array_DataS.add(dataS);

		dataS = new Custom_List_Sniper(R.drawable.sw_sl8, "H&K SL8", "�Ϲ�");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Sniper(R.drawable.sw_xm8, "XM8 Sharpshooter",
				"�Ϲ�");
		Array_DataS.add(dataS);

		dataS = new Custom_List_Sniper(R.drawable.sw_acr, "ACR SPR", "���");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Sniper(R.drawable.sw_sig550, "SIG 550", "���");
		Array_DataS.add(dataS);

		dataS = new Custom_List_Sniper(R.drawable.sw_alpine, "Alpine", "���");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Sniper(R.drawable.sw_wa2000, "Walther WA 2000",
				"���");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Sniper(R.drawable.sw_tavornb,
				"Tavor STAR-21 Navy Blue", "���");
		Array_DataS.add(dataS);

		dataS = new Custom_List_Sniper(R.drawable.sw_awm, "AWM", "�Ⱓ��");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Sniper(R.drawable.sw_cheytac, "Cheytac M200",
				"�Ⱓ��");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Sniper(R.drawable.sw_m14ebr, "M14 EBR", "�Ⱓ��");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Sniper(R.drawable.sw_vss, "VSS Vintorez", "�Ⱓ��");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Sniper(R.drawable.sw_star, "Tavor STAR-21(����)",
				"�Ⱓ��");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Sniper(R.drawable.sw_qbu, "QBU-88", "�Ⱓ��");
		Array_DataS.add(dataS);

		dataS = new Custom_List_Sniper(R.drawable.sw_m16pc,
				"M16A2 Custom SPR ����(PC��)", "PC�� ����");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Sniper(R.drawable.sw_crownas50, "AS50(ũ���)",
				"�Ⱓ��");
		Array_DataS.add(dataS);
		
		dataS = new Custom_List_Sniper(R.drawable.ev_halsl8, "������Ų H&K SL8",
				"�̺�Ʈ");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Sniper(R.drawable.ev_winterawm, "�ܿ����嵵�� AWM",
				"�̺�Ʈ");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Sniper(R.drawable.ev_xmasalpine, "ũ�������� Alpine",
				"�̺�Ʈ");
		Array_DataS.add(dataS);

		adapterS = new CustomAdapterSniper(this,
				android.R.layout.simple_list_item_1, Array_DataS);

		ListView list4 = (ListView) findViewById(R.id.ListView04);

		list4.setAdapter(adapterS);

		// *************************�������� ���� ���ý�*****************************//
		list4.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View v, int pos,
					long arg3) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(getApplicationContext(),
						ExplainActivity.class);
				// putExtra �� ������ �������� ������ ����Ʈ�� �Ѱ� �� �� �ִ�.
				intent.putExtra("IMAGE", Array_DataS.get(pos).getImage_ID());
				intent.putExtra("TITLE", Array_DataS.get(pos).getTitle1());
				intent.putExtra("VENDOR", Array_DataS.get(pos).getTitle2());
				startActivity(intent);

			}
		});
		// *******************************************************************//

		myTab = getTabHost(); // TabHost

		myTab.addTab(myTab.newTabSpec("Tag1").setIndicator("�����ø�")
				.setContent(R.id.ListView01)); // Tab ����
		myTab.addTab(myTab.newTabSpec("Tag2").setIndicator("�޵�")
				.setContent(R.id.ListView02));
		myTab.addTab(myTab.newTabSpec("Tag3").setIndicator("�����Ͼ�")
				.setContent(R.id.ListView03));
		myTab.addTab(myTab.newTabSpec("Tag4").setIndicator("��������")
				.setContent(R.id.ListView04));

		myTab.setCurrentTab(0); // ù ������

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
