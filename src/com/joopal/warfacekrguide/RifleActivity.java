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


		// ************************라이플맨 탭 추가*****************************//
		Array_DataR = new ArrayList<Custom_List_Rifle>();

		dataR = new Custom_List_Rifle(R.drawable.rw_m4a1, "M4A1", "영구제");
		Array_DataR.add(dataR);
		dataR = new Custom_List_Rifle(R.drawable.rw_m16a2, "M16A2 LMG", "상점");
		Array_DataR.add(dataR);
		dataR = new Custom_List_Rifle(R.drawable.rw_daewook2, "Daewoo K2", "상점");
		Array_DataR.add(dataR);

		dataR = new Custom_List_Rifle(R.drawable.rw_mg36, "H&K MG36", "일반");
		Array_DataR.add(dataR);
		dataR = new Custom_List_Rifle(R.drawable.rw_g36k, "H&K G36K", "일반");
		Array_DataR.add(dataR);
		dataR = new Custom_List_Rifle(R.drawable.rw_tar21, "Tavor TAR-21", "고급");
		Array_DataR.add(dataR);
		dataR = new Custom_List_Rifle(R.drawable.rw_calico, "CALICO M955A",
				"고급");
		Array_DataR.add(dataR);
		dataR = new Custom_List_Rifle(R.drawable.rw_galil, "Galil", "희귀");
		Array_DataR.add(dataR);
		dataR = new Custom_List_Rifle(R.drawable.rw_ak103, "AK103", "희귀");
		Array_DataR.add(dataR);
		dataR = new Custom_List_Rifle(R.drawable.rw_rpk, "RPK", "희귀");
		Array_DataR.add(dataR);

		dataR = new Custom_List_Rifle(R.drawable.rw_acr, "ACR", "기간제");
		Array_DataR.add(dataR);
		dataR = new Custom_List_Rifle(R.drawable.rw_auga3, "AUG A3", "기간제");
		Array_DataR.add(dataR);
		dataR = new Custom_List_Rifle(R.drawable.rw_auga3hbar, "AUG A3 H Bar",
				"기간제");
		Array_DataR.add(dataR);
		dataR = new Custom_List_Rifle(R.drawable.rw_fnf2000, "FN F2000", "기간제");
		Array_DataR.add(dataR);
		dataR = new Custom_List_Rifle(R.drawable.rw_fnscarh, "FN SCAR-H", "기간제");
		Array_DataR.add(dataR);
		dataR = new Custom_List_Rifle(R.drawable.rw_xm8lmg, "XM8 LMG", "기간제");
		Array_DataR.add(dataR);
		dataR = new Custom_List_Rifle(R.drawable.rw_sig551, "SIG 551(삭제)",
				"기간제");
		Array_DataR.add(dataR);
		dataR = new Custom_List_Rifle(R.drawable.rw_k3, "Daewoo K3", "기간제");
		Array_DataR.add(dataR);

		dataR = new Custom_List_Rifle(R.drawable.rw_ak47, "AK-47", "기간제");
		Array_DataR.add(dataR);

		dataR = new Custom_List_Rifle(R.drawable.rw_m4a1pc, "M4A1 도색(PC방)",
				"PC방전용");
		Array_DataR.add(dataR);
		dataR = new Custom_List_Rifle(R.drawable.rw_crownscar,
				"FN SCAR-H(크라운)", "기간제");
		Array_DataR.add(dataR);
		dataR = new Custom_List_Rifle(R.drawable.ev_halg36k, "데빌스킨 H&K G36K",
				"이벤트");
		Array_DataR.add(dataR);
		dataR = new Custom_List_Rifle(R.drawable.ev_winterm4a1, "겨울위장도색 M4A1",
				"이벤트");
		Array_DataR.add(dataR);
		dataR = new Custom_List_Rifle(R.drawable.ev_xmasacr, "크리스마스 ACR",
				"이벤트");
		Array_DataR.add(dataR);

		adapterR = new CustomAdapterRifle(this,
				android.R.layout.simple_list_item_1, Array_DataR);

		ListView list1 = (ListView) findViewById(R.id.ListView01);

		list1.setAdapter(adapterR);

		// *************************라이플맨 무기 선택시*************************//
		list1.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View v, int pos,
					long arg3) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(getApplicationContext(),
						ExplainActivity.class);
				// putExtra 로 선택한 아이템의 정보를 인텐트로 넘겨 줄 수 있다.
				intent.putExtra("IMAGE", Array_DataR.get(pos).getImage_ID());
				intent.putExtra("TITLE", Array_DataR.get(pos).getTitle1());
				intent.putExtra("VENDOR", Array_DataR.get(pos).getTitle2());
				startActivity(intent);
			}
		});
		// *******************************************************************//

		// ************************메딕 탭 추가*****************************//
		Array_DataM = new ArrayList<Custom_List_Medic>();
		dataM = new Custom_List_Medic(R.drawable.mw_rem870, "Remington 870",
				"영구제");
		Array_DataM.add(dataM);

		dataM = new Custom_List_Medic(R.drawable.mw_spas, "SPAS-12", "상점");
		Array_DataM.add(dataM);

		dataM = new Custom_List_Medic(R.drawable.mw_rem870cb,
				"Remington 870CB", "일반");
		Array_DataM.add(dataM);
		dataM = new Custom_List_Medic(R.drawable.mw_mc255, "MC 255 12", "일반");
		Array_DataM.add(dataM);

		dataM = new Custom_List_Medic(R.drawable.mw_hawk, "Hawk Pump", "고급");
		Array_DataM.add(dataM);
		dataM = new Custom_List_Medic(R.drawable.mw_saiga, "Saiga-12", "고급");
		Array_DataM.add(dataM);

		dataM = new Custom_List_Medic(R.drawable.mw_superbe,
				"Super Benelli M4 90", "희귀");
		Array_DataM.add(dataM);
		dataM = new Custom_List_Medic(R.drawable.mw_nova,
				"Benelli Nova Tactical", "희귀");
		Array_DataM.add(dataM);
		dataM = new Custom_List_Medic(R.drawable.mw_vepr, "VEPR-12", "희귀");
		Array_DataM.add(dataM);

		dataM = new Custom_List_Medic(R.drawable.mw_cobray, "Cobray Striker",
				"기간제");
		Array_DataM.add(dataM);
		dataM = new Custom_List_Medic(R.drawable.mw_jackhammer, "JackHammer",
				"기간제");
		Array_DataM.add(dataM);
		dataM = new Custom_List_Medic(R.drawable.mw_keltec, "Kel-Tec KSG",
				"기간제");
		Array_DataM.add(dataM);
		dataM = new Custom_List_Medic(R.drawable.mw_saigabp, "Saiga Bullpup",
				"기간제");
		Array_DataM.add(dataM);

		dataM = new Custom_List_Medic(R.drawable.mw_rem870pc,
				"Remington 870 도색(PC방)", "PC방전용");
		Array_DataM.add(dataM);

		dataM = new Custom_List_Medic(R.drawable.mw_crownbull,
				"Saiga Bullpup(크라운)", "기간제");
		Array_DataM.add(dataM);
		
		dataM = new Custom_List_Medic(R.drawable.ev_halspas,
				"데빌스킨 SPAS-12", "이벤트");
		Array_DataM.add(dataM);
		dataM = new Custom_List_Medic(R.drawable.ev_wintersaiga,
				"겨울위장도색 Saiga-12", "이벤트");
		Array_DataM.add(dataM);
		dataM = new Custom_List_Medic(R.drawable.ev_xmasspas,
				"크리스마스 SPAS-12", "이벤트");
		Array_DataM.add(dataM);

		adapterM = new CustomAdapterMedic(this,
				android.R.layout.simple_list_item_1, Array_DataM);

		ListView list2 = (ListView) findViewById(R.id.ListView02);

		list2.setAdapter(adapterM);

		// *************************메딕 무기 선택시*****************************//
		list2.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View v, int pos,
					long arg3) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(getApplicationContext(),
						ExplainActivity.class);
				// putExtra 로 선택한 아이템의 정보를 인텐트로 넘겨 줄 수 있다.
				intent.putExtra("IMAGE", Array_DataM.get(pos).getImage_ID());
				intent.putExtra("TITLE", Array_DataM.get(pos).getTitle1());
				intent.putExtra("VENDOR", Array_DataM.get(pos).getTitle2());
				startActivity(intent);

			}
		});
		// *******************************************************************//

		// ************************엔지니어 탭 추가*****************************//
		Array_DataE = new ArrayList<Custom_List_Engineer>();
		dataE = new Custom_List_Engineer(R.drawable.ew_mp5, "H&K MP5", "영구제");
		Array_DataE.add(dataE);
		dataE = new Custom_List_Engineer(R.drawable.ew_m4cqb, "M4 CQB", "상점");
		Array_DataE.add(dataE);

		dataE = new Custom_List_Engineer(R.drawable.ew_g36c, "H&K G36C", "일반");
		Array_DataE.add(dataE);
		dataE = new Custom_List_Engineer(R.drawable.ew_k1, "Daewoo K1", "일반");
		Array_DataE.add(dataE);

		dataE = new Custom_List_Engineer(R.drawable.ew_aug, "AUG A3 9mm XS",
				"고급");
		Array_DataE.add(dataE);
		dataE = new Custom_List_Engineer(R.drawable.ew_mp7, "H&K MP7", "고급");
		Array_DataE.add(dataE);

		dataE = new Custom_List_Engineer(R.drawable.ew_ak9, "AK9", "희귀");
		Array_DataE.add(dataE);
		dataE = new Custom_List_Engineer(R.drawable.ew_uzi, "Mini Uzi", "희귀");
		Array_DataE.add(dataE);
		dataE = new Custom_List_Engineer(R.drawable.ew_kriss, "Kriss Super V",
				"희귀");
		Array_DataE.add(dataE);

		dataE = new Custom_List_Engineer(R.drawable.ew_sig552, "SIG 552", "기간제");
		Array_DataE.add(dataE);
		dataE = new Custom_List_Engineer(R.drawable.ew_calico, "Calico M960A",
				"기간제");
		Array_DataE.add(dataE);
		dataE = new Custom_List_Engineer(R.drawable.ew_p90, "FN P90", "기간제");
		Array_DataE.add(dataE);
		dataE = new Custom_List_Engineer(R.drawable.ew_tavor, "Tavor CTAR-21",
				"기간제");
		Array_DataE.add(dataE);
		dataE = new Custom_List_Engineer(R.drawable.ew_compact, "XM8 Compact",
				"기간제");
		Array_DataE.add(dataE);

		dataE = new Custom_List_Engineer(R.drawable.ew_cqbpc, "M4 CQB 도색(PC방)",
				"PC방 전용");
		Array_DataE.add(dataE);
		dataE = new Custom_List_Engineer(R.drawable.ew_crowntavor,
				"Tavor CTAR-21(크라운)", "기간제");
		Array_DataE.add(dataE);
		
		dataE = new Custom_List_Engineer(R.drawable.ev_halg36c, "데빌스킨 H&K G36C",
				"이벤트");
		Array_DataE.add(dataE);
		dataE = new Custom_List_Engineer(R.drawable.ev_wintermp5, "겨울위장도색 H&K MP5",
				"이벤트");
		Array_DataE.add(dataE);
		dataE = new Custom_List_Engineer(R.drawable.ev_xmaskriss, "크리스마스 Kriss Super V",
				"이벤트");
		Array_DataE.add(dataE);

		adapterE = new CustomAdapterEngineer(this,
				android.R.layout.simple_list_item_1, Array_DataE);

		ListView list3 = (ListView) findViewById(R.id.ListView03);

		list3.setAdapter(adapterE);

		// *************************엔지니어 무기 선택시*****************************//
		list3.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View v, int pos,
					long arg3) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(getApplicationContext(),
						ExplainActivity.class);
				// putExtra 로 선택한 아이템의 정보를 인텐트로 넘겨 줄 수 있다.
				intent.putExtra("IMAGE", Array_DataE.get(pos).getImage_ID());
				intent.putExtra("TITLE", Array_DataE.get(pos).getTitle1());
				intent.putExtra("VENDOR", Array_DataE.get(pos).getTitle2());
				startActivity(intent);

			}
		});
		// *******************************************************************//

		// ************************스나이퍼 탭 추가*****************************//
		Array_DataS = new ArrayList<Custom_List_Sniper>();
		dataS = new Custom_List_Sniper(R.drawable.sw_dragu, "Dragunov SR",
				"영구제");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Sniper(R.drawable.sw_m16, "M16A2 Custom SPR",
				"상점");
		Array_DataS.add(dataS);

		dataS = new Custom_List_Sniper(R.drawable.sw_sl8, "H&K SL8", "일반");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Sniper(R.drawable.sw_xm8, "XM8 Sharpshooter",
				"일반");
		Array_DataS.add(dataS);

		dataS = new Custom_List_Sniper(R.drawable.sw_acr, "ACR SPR", "고급");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Sniper(R.drawable.sw_sig550, "SIG 550", "고급");
		Array_DataS.add(dataS);

		dataS = new Custom_List_Sniper(R.drawable.sw_alpine, "Alpine", "희귀");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Sniper(R.drawable.sw_wa2000, "Walther WA 2000",
				"희귀");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Sniper(R.drawable.sw_tavornb,
				"Tavor STAR-21 Navy Blue", "희귀");
		Array_DataS.add(dataS);

		dataS = new Custom_List_Sniper(R.drawable.sw_awm, "AWM", "기간제");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Sniper(R.drawable.sw_cheytac, "Cheytac M200",
				"기간제");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Sniper(R.drawable.sw_m14ebr, "M14 EBR", "기간제");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Sniper(R.drawable.sw_vss, "VSS Vintorez", "기간제");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Sniper(R.drawable.sw_star, "Tavor STAR-21(삭제)",
				"기간제");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Sniper(R.drawable.sw_qbu, "QBU-88", "기간제");
		Array_DataS.add(dataS);

		dataS = new Custom_List_Sniper(R.drawable.sw_m16pc,
				"M16A2 Custom SPR 도색(PC방)", "PC방 전용");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Sniper(R.drawable.sw_crownas50, "AS50(크라운)",
				"기간제");
		Array_DataS.add(dataS);
		
		dataS = new Custom_List_Sniper(R.drawable.ev_halsl8, "데빌스킨 H&K SL8",
				"이벤트");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Sniper(R.drawable.ev_winterawm, "겨울위장도색 AWM",
				"이벤트");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Sniper(R.drawable.ev_xmasalpine, "크리스마스 Alpine",
				"이벤트");
		Array_DataS.add(dataS);

		adapterS = new CustomAdapterSniper(this,
				android.R.layout.simple_list_item_1, Array_DataS);

		ListView list4 = (ListView) findViewById(R.id.ListView04);

		list4.setAdapter(adapterS);

		// *************************스나이퍼 무기 선택시*****************************//
		list4.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View v, int pos,
					long arg3) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(getApplicationContext(),
						ExplainActivity.class);
				// putExtra 로 선택한 아이템의 정보를 인텐트로 넘겨 줄 수 있다.
				intent.putExtra("IMAGE", Array_DataS.get(pos).getImage_ID());
				intent.putExtra("TITLE", Array_DataS.get(pos).getTitle1());
				intent.putExtra("VENDOR", Array_DataS.get(pos).getTitle2());
				startActivity(intent);

			}
		});
		// *******************************************************************//

		myTab = getTabHost(); // TabHost

		myTab.addTab(myTab.newTabSpec("Tag1").setIndicator("라이플맨")
				.setContent(R.id.ListView01)); // Tab 생성
		myTab.addTab(myTab.newTabSpec("Tag2").setIndicator("메딕")
				.setContent(R.id.ListView02));
		myTab.addTab(myTab.newTabSpec("Tag3").setIndicator("엔지니어")
				.setContent(R.id.ListView03));
		myTab.addTab(myTab.newTabSpec("Tag4").setIndicator("스나이퍼")
				.setContent(R.id.ListView04));

		myTab.setCurrentTab(0); // 첫 페이지

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
