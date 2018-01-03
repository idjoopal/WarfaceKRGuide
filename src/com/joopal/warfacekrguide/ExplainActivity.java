package com.joopal.warfacekrguide;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ImageView;
import android.widget.TextView;

public class ExplainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_explain);

		ImageView ex_mainimage = (ImageView) findViewById(R.id.ex_mainimage);
		TextView ex_gunname = (TextView) findViewById(R.id.ex_gunname);
		TextView ex_damage = (TextView) findViewById(R.id.ex_damage);
		TextView ex_distance = (TextView) findViewById(R.id.ex_distance);
		TextView ex_firerate = (TextView) findViewById(R.id.ex_firerate);
		TextView ex_accur_aim = (TextView) findViewById(R.id.ex_accur_aim);
		TextView ex_accur_nonaim = (TextView) findViewById(R.id.ex_accur_nonaim);
		TextView ex_bullet = (TextView) findViewById(R.id.ex_bullet);
		TextView ex_supply = (TextView) findViewById(R.id.ex_supply);
		TextView ex_guntype = (TextView) findViewById(R.id.ex_guntype);
		TextView ex_vendor = (TextView) findViewById(R.id.ex_vendor);
		TextView ex_price = (TextView) findViewById(R.id.ex_price);
		TextView ex_explain = (TextView) findViewById(R.id.ex_explain);
		TextView ex_dampersec = (TextView) findViewById(R.id.ex_dampersec);

		TextView ex_hole = (TextView) findViewById(R.id.ex_hole);
		TextView ex_rail = (TextView) findViewById(R.id.ex_rail);
		TextView ex_sight = (TextView) findViewById(R.id.ex_sight);

		//WebView ex_video = (WebView) findViewById(R.id.ex_video);

		Intent i = getIntent(); // 값을 받아온다.
		int image = i.getIntExtra("IMAGE", 0);
		String title = i.getStringExtra("TITLE");
		String vendor = i.getStringExtra("VENDOR");

		ex_mainimage.setBackgroundResource(image);
		ex_gunname.setText(title);
		ex_vendor.setText(vendor);

		/******************** 총이름에 따라 정보 입력 *******************/
		if (title.equals("M4A1")) {
			ex_damage.setText("55");
			ex_distance.setText("11");
			ex_firerate.setText("680");
			ex_accur_aim.setText("30");
			ex_accur_nonaim.setText("21");
			ex_bullet.setText("30");
			ex_supply.setText("120");
			ex_dampersec.setText("62.33");
			ex_guntype.setText("돌격소총");
			ex_price.setText("-");
			ex_explain.setText("-");
			ex_hole.setText("표준형 소음기");
			ex_rail.setText("-");
			ex_sight.setText("이오텍 553 조준기");
			//ex_video.loadUrl("http://www.youtube.com/watch?feature=player_detailpage&v=Y4qe4A1InEY");

		} else if (title.equals("M16A2 LMG")) {
			ex_damage.setText("58");
			ex_distance.setText("11.5");
			ex_firerate.setText("680");
			ex_accur_aim.setText("30");
			ex_accur_nonaim.setText("17");
			ex_bullet.setText("30");
			ex_supply.setText("300");
			ex_dampersec.setText("65.73");
			ex_guntype.setText("기관총");
			ex_price.setText("2340");
			ex_explain.setText("-");
			ex_hole.setText("표준형 소음기, 퀵마운트 소음기");
			ex_rail.setText("기관총 양각대, 블랙폴리머 수직손잡이");
			ex_sight.setText("이오텍 553 조준기, 엘칸 스펙터 광학 조준경");

		} else if (title.equals("Daewoo K2")) {
			ex_damage.setText("60");
			ex_distance.setText("11");
			ex_firerate.setText("670");
			ex_accur_aim.setText("31");
			ex_accur_nonaim.setText("20");
			ex_bullet.setText("30");
			ex_supply.setText("120");
			ex_dampersec.setText("67");
			ex_guntype.setText("돌격소총");
			ex_price.setText("2340");
			ex_explain.setText("-");
			ex_hole.setText("표준형 소음기, 퀵마운트 소음기");
			ex_rail.setText("블랙폴리머 수직손잡이");
			ex_sight.setText("엘칸 스펙터 광학 조준경");

		} else if (title.equals("H&K MG36")) {
			ex_damage.setText("63");
			ex_distance.setText("12");
			ex_firerate.setText("570");
			ex_accur_aim.setText("30");
			ex_accur_nonaim.setText("17");
			ex_bullet.setText("100");
			ex_supply.setText("300");
			ex_dampersec.setText("59.85");
			ex_guntype.setText("기관총");
			ex_price.setText("2730");
			ex_explain.setText("-");
			ex_hole.setText("표준형 소음기, 퀵마운트 소음기");
			ex_rail.setText("기관총 양각대, 블랙폴리머 수직손잡이");
			ex_sight.setText("이오텍 553 조준기, 엘칸 스펙터 광학 조준경");

		} else if (title.equals("H&K G36K")) {
			ex_damage.setText("63");
			ex_distance.setText("12");
			ex_firerate.setText("650");
			ex_accur_aim.setText("30");
			ex_accur_nonaim.setText("20");
			ex_bullet.setText("30");
			ex_supply.setText("120");
			ex_dampersec.setText("68.25");
			ex_guntype.setText("돌격소총");
			ex_price.setText("2730");
			ex_explain.setText("-");
			ex_hole.setText("표준형 소음기, 퀵마운트 소음기");
			ex_rail.setText("블랙폴리머 수직손잡이");
			ex_sight.setText("이오텍 553 조준경, 엘칸 스펙터 광학 조준경");

		} else if (title.equals("Tavor TAR-21")) {
			ex_damage.setText("70");
			ex_distance.setText("12");
			ex_firerate.setText("620");
			ex_accur_aim.setText("29");
			ex_accur_nonaim.setText("20");
			ex_bullet.setText("30");
			ex_supply.setText("120");
			ex_dampersec.setText("72.33");
			ex_guntype.setText("돌격소총");
			ex_price.setText("4390");
			ex_explain.setText("-");
			ex_hole.setText("표준형 소음기, 퀵마운트 소음기, 돌격 소염기");
			ex_rail.setText("블랙폴리머 수직손잡이, 돌격 수직손잡이");
			ex_sight.setText("이오텍 553 조준경, 엘칸 스펙터 광학 조준경, 엘칸 스펙터 듀얼 롤 조준경, 트루글루 레드닷 조준기");

		} else if (title.equals("CALICO M955A")) {
			ex_damage.setText("62");
			ex_distance.setText("12");
			ex_firerate.setText("810");
			ex_accur_aim.setText("29");
			ex_accur_nonaim.setText("16");
			ex_bullet.setText("50");
			ex_supply.setText("150");
			ex_dampersec.setText("83.7");
			ex_guntype.setText("돌격소총");
			ex_price.setText("4875");
			ex_explain.setText("반동을 제어하기 힘든 초보자가 쓰기 좋은 총");
			ex_hole.setText("표준형 소음기, 퀵마운트 소음기, 돌격 소염기");
			ex_rail.setText("블랙폴리머 수직손잡이, 돌격 수직손잡이");
			ex_sight.setText("이오텍 553 조준경, 엘칸 스펙터 광학 조준경, 엘칸 스펙터 듀얼 롤 조준경, 트루글루 레드닷 조준기");

		} else if (title.equals("Galil")) {
			ex_damage.setText("78");
			ex_distance.setText("12");
			ex_firerate.setText("650");
			ex_accur_aim.setText("31");
			ex_accur_nonaim.setText("18");
			ex_bullet.setText("25");
			ex_supply.setText("125");
			ex_dampersec.setText("84.5");
			ex_guntype.setText("돌격소총");
			ex_price.setText("4390");
			ex_explain.setText("-");
			ex_hole.setText("표준형 소음기, 퀵마운트 소음기, 돌격 소염기");
			ex_rail.setText("블랙폴리머 수직손잡이, 돌격 수직손잡이");
			ex_sight.setText("이오텍 553 조준경, 엘칸 스펙터 광학 조준경, 엘칸 스펙터 듀얼 롤 조준경, 트루글루 레드닷 조준기");

		} else if (title.equals("AK103")) {
			ex_damage.setText("80");
			ex_distance.setText("14");
			ex_firerate.setText("600");
			ex_accur_aim.setText("31");
			ex_accur_nonaim.setText("18");
			ex_bullet.setText("30");
			ex_supply.setText("120");
			ex_dampersec.setText("80");
			ex_guntype.setText("돌격소총");
			ex_price.setText("7800");
			ex_explain.setText("반동이 매우 세다.");
			ex_hole.setText("표준형 소음기, 퀵마운트 소음기, 돌격 소염기, 돌격 총검");
			ex_rail.setText("블랙폴리머 수직손잡이, 돌격 수직손잡이, 돌격 수직양각대, 유탄발사기");
			ex_sight.setText("이오텍 553 조준경, 엘칸 스펙터 광학 조준경, 엘칸 스펙터 듀얼 롤 조준경, 트루글루 레드닷 조준기, 트릿지컨 고등전투광학조준경");

		} else if (title.equals("RPK")) {
			ex_damage.setText("78");
			ex_distance.setText("14.5");
			ex_firerate.setText("530");
			ex_accur_aim.setText("31");
			ex_accur_nonaim.setText("10");
			ex_bullet.setText("75");
			ex_supply.setText("300");
			ex_dampersec.setText("68.9");
			ex_guntype.setText("기관총");
			ex_price.setText("7800");
			ex_explain.setText("기본적으로 양각대가 달려있어 양각대를 달수없으나 반동은 매우 세다.");
			ex_hole.setText("표준형 소음기, 퀵마운트 소음기, 돌격 소염기, 돌격 총검");
			ex_rail.setText("블랙폴리머 수직손잡이, 돌격 수직손잡이");
			ex_sight.setText("이오텍 553 조준경, 엘칸 스펙터 광학 조준경, 엘칸 스펙터 듀얼 롤 조준경, 트루글루 레드닷 조준기, 트릿지컨 고등전투광학조준경");

		} else if (title.equals("ACR")) {
			ex_damage.setText("77");
			ex_distance.setText("16");
			ex_firerate.setText("700");
			ex_accur_aim.setText("31");
			ex_accur_nonaim.setText("19");
			ex_bullet.setText("30");
			ex_supply.setText("120");
			ex_dampersec.setText("89.83");
			ex_guntype.setText("돌격소총");
			ex_price.setText("-");
			ex_explain.setText("-");
			ex_hole.setText("표준형 소음기, 퀵마운트 소음기, 돌격 소염기, 돌격 총검");
			ex_rail.setText("블랙폴리머 수직손잡이, 돌격 수직손잡이, 돌격 수직양각대, 유탄발사기");
			ex_sight.setText("이오텍 553 조준경, 엘칸 스펙터 광학 조준경, 엘칸 스펙터 듀얼 롤 조준경, 트루글루 레드닷 조준기, 트릿지컨 고등전투광학조준경");

		} else if (title.equals("AUG A3")) {
			ex_damage.setText("70");
			ex_distance.setText("13");
			ex_firerate.setText("700");
			ex_accur_aim.setText("30");
			ex_accur_nonaim.setText("18");
			ex_bullet.setText("30");
			ex_supply.setText("120");
			ex_dampersec.setText("81.66");
			ex_guntype.setText("돌격소총");
			ex_price.setText("-");
			ex_explain.setText("-");
			ex_hole.setText("표준형 소음기, 퀵마운트 소음기, 돌격 소염기");
			ex_rail.setText("블랙폴리머 수직손잡이, 돌격 수직손잡이");
			ex_sight.setText("이오텍 553 조준경, 엘칸 스펙터 광학 조준경, 엘칸 스펙터 듀얼 롤 조준경, 트루글루 레드닷 조준기");

		} else if (title.equals("AUG A3 H Bar")) {
			ex_damage.setText("72");
			ex_distance.setText("13");
			ex_firerate.setText("560");
			ex_accur_aim.setText("31");
			ex_accur_nonaim.setText("17");
			ex_bullet.setText("50");
			ex_supply.setText("300");
			ex_dampersec.setText("67.2");
			ex_guntype.setText("기관총");
			ex_price.setText("-");
			ex_explain.setText("기본적으로 양각대가 달려있다.");
			ex_hole.setText("표준형 소음기, 퀵마운트 소음기, 돌격 소염기");
			ex_rail.setText("블랙폴리머 수직손잡이, 돌격 수직손잡이");
			ex_sight.setText("이오텍 553 조준경, 엘칸 스펙터 광학 조준경, 엘칸 스펙터 듀얼 롤 조준경, 트루글루 레드닷 조준기");

		} else if (title.equals("FN F2000")) {
			ex_damage.setText("68");
			ex_distance.setText("14");
			ex_firerate.setText("850");
			ex_accur_aim.setText("31");
			ex_accur_nonaim.setText("16");
			ex_bullet.setText("30");
			ex_supply.setText("120");
			ex_dampersec.setText("96.3");
			ex_guntype.setText("돌격소총");
			ex_price.setText("-");
			ex_explain.setText("-");
			ex_hole.setText("표준형 소음기, 퀵마운트 소음기, 돌격 소염기");
			ex_rail.setText("블랙폴리머 수직손잡이, 돌격 수직손잡이");
			ex_sight.setText("이오텍 553 조준경, 엘칸 스펙터 광학 조준경, 엘칸 스펙터 듀얼 롤 조준경, 트루글루 레드닷 조준기");

		} else if (title.equals("FN SCAR-H")) {
			ex_damage.setText("90");
			ex_distance.setText("16");
			ex_firerate.setText("620");
			ex_accur_aim.setText("31");
			ex_accur_nonaim.setText("18");
			ex_bullet.setText("20");
			ex_supply.setText("120");
			ex_dampersec.setText("93");
			ex_guntype.setText("돌격소총");
			ex_price.setText("-");
			ex_explain.setText("-");
			ex_hole.setText("표준형 소음기, 퀵마운트 소음기, 돌격 소염기, 돌격 총검");
			ex_rail.setText("블랙폴리머 수직손잡이, 돌격 수직손잡이, 돌격 수직양각대, 유탄발사기");
			ex_sight.setText("이오텍 553 조준경, 엘칸 스펙터 광학 조준경, 엘칸 스펙터 듀얼 롤 조준경, 트루글루 레드닷 조준기, 트릿지컨 고등전투광학조준경");

		} else if (title.equals("XM8 LMG")) {
			ex_damage.setText("74");
			ex_distance.setText("15");
			ex_firerate.setText("600");
			ex_accur_aim.setText("29");
			ex_accur_nonaim.setText("14");
			ex_bullet.setText("100");
			ex_supply.setText("300");
			ex_dampersec.setText("74");
			ex_guntype.setText("기관총");
			ex_price.setText("-");
			ex_explain.setText("-");
			ex_hole.setText("표준형 소음기, 퀵마운트 소음기, 돌격 소염기");
			ex_rail.setText("블랙폴리머 수직손잡이, 돌격 수직손잡이, 돌격 수직양각대, 유탄발사기");
			ex_sight.setText("이오텍 553 조준경, 엘칸 스펙터 광학 조준경, 엘칸 스펙터 듀얼 롤 조준경, 트루글루 레드닷 조준기, 트릿지컨 고등전투광학조준경");

		} else if (title.equals("SIG 551(삭제)")) {
			ex_damage.setText("61");
			ex_distance.setText("12.3");
			ex_firerate.setText("670");
			ex_accur_aim.setText("30");
			ex_accur_nonaim.setText("19");
			ex_bullet.setText("30");
			ex_supply.setText("120");
			ex_dampersec.setText("68.11");
			ex_guntype.setText("돌격소총");
			ex_price.setText("-");
			ex_explain.setText("러시아서버에 존재하지 않음");
			ex_hole.setText("표준형 소음기, 퀵마운트 소음기, 돌격 소염기, 돌격 총검");
			ex_rail.setText("블랙폴리머 수직손잡이, 돌격 수직손잡이, 돌격 수직양각대, 유탄발사기");
			ex_sight.setText("이오텍 553 조준경, 엘칸 스펙터 광학 조준경, 엘칸 스펙터 듀얼 롤 조준경, 트루글루 레드닷 조준기, 트릿지컨 고등전투광학조준경");

		} else if (title.equals("Daewoo K3")) {
			ex_damage.setText("63");
			ex_distance.setText("11");
			ex_firerate.setText("666");
			ex_accur_aim.setText("30");
			ex_accur_nonaim.setText("16");
			ex_bullet.setText("50");
			ex_supply.setText("250");
			ex_dampersec.setText("69.93");
			ex_guntype.setText("기관총");
			ex_price.setText("-");
			ex_explain.setText("-");
			ex_hole.setText("표준형 소음기, 퀵마운트 소음기");
			ex_rail.setText("블랙폴리머 수직손잡이, 기관총 양각대");
			ex_sight.setText("이오텍 553 조준경, 엘칸 스펙터 광학 조준경");

		} else if (title.equals("AK-47")) {
			ex_damage.setText("84");
			ex_distance.setText("12.5");
			ex_firerate.setText("600");
			ex_accur_aim.setText("30");
			ex_accur_nonaim.setText("15");
			ex_bullet.setText("30");
			ex_supply.setText("120");
			ex_dampersec.setText("84");
			ex_guntype.setText("돌격소총");
			ex_price.setText("-");
			ex_explain.setText("멤버쉽 아이템으로 지급, 현재는 지급하지않음. 이름은 AK47이지만 모델링은 AKM이라고 한다.");
			ex_hole.setText("표준형 소음기, 퀵마운트 소음기, 돌격 소염기, 돌격 총검");
			ex_rail.setText("-");
			ex_sight.setText("-");

		} else if (title.equals("M4A1 도색(PC방)")) {
			ex_damage.setText("65");
			ex_distance.setText("13");
			ex_firerate.setText("700");
			ex_accur_aim.setText("31");
			ex_accur_nonaim.setText("20");
			ex_bullet.setText("30");
			ex_supply.setText("120");
			ex_dampersec.setText("75.83");
			ex_guntype.setText("돌격소총");
			ex_price.setText("-");
			ex_explain.setText("-");
			ex_hole.setText("표준형 소음기, 퀵마운트 소음기, 돌격 소염기");
			ex_rail.setText("블랙폴리머 수직손잡이, 돌격 수직손잡이");
			ex_sight.setText("이오텍 553 조준경, 엘칸 스펙터 광학 조준경, 엘칸 스펙터 듀얼 롤 조준경, 트루글루 레드닷 조준기");

		} else if (title.equals("FN SCAR-H(크라운)")) {
			ex_damage.setText("90");
			ex_distance.setText("14");
			ex_firerate.setText("620");
			ex_accur_aim.setText("31");
			ex_accur_nonaim.setText("18");
			ex_bullet.setText("30");
			ex_supply.setText("120");
			ex_dampersec.setText("93");
			ex_guntype.setText("돌격소총");
			ex_price.setText("1000크라운");
			ex_explain.setText("-");
			ex_hole.setText("표준형 소음기, 퀵마운트 소음기, 돌격 소염기, 돌격 총검");
			ex_rail.setText("블랙폴리머 수직손잡이, 돌격 수직손잡이, 돌격 수직양각대, 유탄발사기");
			ex_sight.setText("이오텍 553 조준경, 엘칸 스펙터 광학 조준경, 엘칸 스펙터 듀얼 롤 조준경, 트루글루 레드닷 조준기, 트릿지컨 고등전투광학조준경");

			/************************** 메딕 *****************************/
		} else if (title.equals("Remington 870")) {
			ex_damage.setText("600");
			ex_distance.setText("4.5");
			ex_firerate.setText("80");
			ex_accur_aim.setText("71");
			ex_accur_nonaim.setText("53");
			ex_bullet.setText("8");
			ex_supply.setText("48");
			ex_dampersec.setText("80");
			ex_guntype.setText("펌프액션");
			ex_price.setText("-");
			ex_explain.setText("-");
			ex_hole.setText("표준형 소음기");
			ex_rail.setText("-");
			ex_sight.setText("이오텍 553 조준경");

		} else if (title.equals("SPAS-12")) {
			ex_damage.setText("650");
			ex_distance.setText("5.3");
			ex_firerate.setText("59");
			ex_accur_aim.setText("73");
			ex_accur_nonaim.setText("57");
			ex_bullet.setText("8");
			ex_supply.setText("48");
			ex_dampersec.setText("63.91");
			ex_guntype.setText("펌프액션");
			ex_price.setText("2340");
			ex_explain.setText("-");
			ex_hole.setText("표준형 소음기, 산탄총 소음기");
			ex_rail.setText("-");
			ex_sight.setText("이오텍 553 조준경, 에임 콤프 M4S");

		} else if (title.equals("Remington 870CB")) {
			ex_damage.setText("640");
			ex_distance.setText("5");
			ex_firerate.setText("89");
			ex_accur_aim.setText("72");
			ex_accur_nonaim.setText("56");
			ex_bullet.setText("8");
			ex_supply.setText("48");
			ex_dampersec.setText("94.99");
			ex_guntype.setText("펌프액션");
			ex_price.setText("2730");
			ex_explain.setText("-");
			ex_hole.setText("표준형 소음기, 산탄총 소음기");
			ex_rail.setText("-");
			ex_sight.setText("이오텍 553 조준경, 에임 콤프 M4S");

		} else if (title.equals("MC 255 12")) {
			ex_damage.setText("650");
			ex_distance.setText("3.2");
			ex_firerate.setText("130");
			ex_accur_aim.setText("70");
			ex_accur_nonaim.setText("51");
			ex_bullet.setText("5");
			ex_supply.setText("40");
			ex_dampersec.setText("140.83");
			ex_guntype.setText("자동샷건");
			ex_price.setText("2730");
			ex_explain.setText("-");
			ex_hole.setText("표준형 소음기, 산탄총 소음기");
			ex_rail.setText("-");
			ex_sight.setText("이오텍 553 조준경, 에임 콤프 M4S");

		} else if (title.equals("Hawk Pump")) {
			ex_damage.setText("630");
			ex_distance.setText("5.2");
			ex_firerate.setText("80");
			ex_accur_aim.setText("74");
			ex_accur_nonaim.setText("60");
			ex_bullet.setText("12");
			ex_supply.setText("60");
			ex_dampersec.setText("84");
			ex_guntype.setText("펌프액션");
			ex_price.setText("4390");
			ex_explain.setText("-");
			ex_hole.setText("표준형 소음기, 산탄총 소음기, 산탄총 소염기, 산탄총 총검");
			ex_rail.setText("-");
			ex_sight.setText("이오텍 553 조준경, 에임 콤프 M4S, 모지제로 조준기, 트루글루 레드닷 조준기");

		} else if (title.equals("Saiga-12")) {
			ex_damage.setText("544");
			ex_distance.setText("4.3");
			ex_firerate.setText("180");
			ex_accur_aim.setText("68");
			ex_accur_nonaim.setText("48");
			ex_bullet.setText("8");
			ex_supply.setText("56");
			ex_dampersec.setText("163.2");
			ex_guntype.setText("반자동샷건");
			ex_price.setText("-");
			ex_explain.setText("-");
			ex_hole.setText("표준형 소음기, 산탄총 소음기, 산탄총 소염기");
			ex_rail.setText("-");
			ex_sight.setText("이오텍 553 조준경, 에임 콤프 M4S, 모지제로 조준기, 트루글루 레드닷 조준기");

		} else if (title.equals("Super Benelli M4 90")) {
			ex_damage.setText("536");
			ex_distance.setText("5.6");
			ex_firerate.setText("225");
			ex_accur_aim.setText("72");
			ex_accur_nonaim.setText("56");
			ex_bullet.setText("6");
			ex_supply.setText("40");
			ex_dampersec.setText("201");
			ex_guntype.setText("반자동샷건");
			ex_price.setText("4390");
			ex_explain.setText("-");
			ex_hole.setText("표준형 소음기, 산탄총 소음기, 산탄총 소염기");
			ex_rail.setText("-");
			ex_sight.setText("이오텍 553 조준경, 에임 콤프 M4S, 모지제로 조준기, 트루글루 레드닷 조준기");

		} else if (title.equals("Benelli Nova Tactical")) {
			ex_damage.setText("682");
			ex_distance.setText("5.6");
			ex_firerate.setText("89");
			ex_accur_aim.setText("73");
			ex_accur_nonaim.setText("58");
			ex_bullet.setText("5");
			ex_supply.setText("40");
			ex_dampersec.setText("101.16");
			ex_guntype.setText("펌프액션");
			ex_price.setText("4390");
			ex_explain.setText("-");
			ex_hole.setText("표준형 소음기, 산탄총 소음기, 산탄총 소염기");
			ex_rail.setText("-");
			ex_sight.setText("이오텍 553 조준경, 에임 콤프 M4S, 모지제로 조준기, 트루글루 레드닷 조준기");

		} else if (title.equals("VEPR-12")) {
			ex_damage.setText("544");
			ex_distance.setText("3.2");
			ex_firerate.setText("300");
			ex_accur_aim.setText("62");
			ex_accur_nonaim.setText("36");
			ex_bullet.setText("8");
			ex_supply.setText("56");
			ex_dampersec.setText("272");
			ex_guntype.setText("자동샷건");
			ex_price.setText("8580");
			ex_explain.setText("-");
			ex_hole.setText("표준형 소음기, 산탄총 소음기, 산탄총 소염기, 산탄총 총검");
			ex_rail.setText("-");
			ex_sight.setText("이오텍 553 조준경, 에임 콤프 M4S, 모지제로 조준기, 트루글루 레드닷 조준기");

		} else if (title.equals("Cobray Striker")) {
			ex_damage.setText("540");
			ex_distance.setText("4");
			ex_firerate.setText("240");
			ex_accur_aim.setText("68");
			ex_accur_nonaim.setText("47");
			ex_bullet.setText("12");
			ex_supply.setText("40");
			ex_dampersec.setText("216");
			ex_guntype.setText("반자동샷건");
			ex_price.setText("-");
			ex_explain.setText("-");
			ex_hole.setText("표준형 소음기, 산탄총 소음기, 산탄총 소염기");
			ex_rail.setText("-");
			ex_sight.setText("이오텍 553 조준경, 에임 콤프 M4S, 모지제로 조준기, 트루글루 레드닷 조준기");

		} else if (title.equals("JackHammer")) {
			ex_damage.setText("520");
			ex_distance.setText("4");
			ex_firerate.setText("240");
			ex_accur_aim.setText("67");
			ex_accur_nonaim.setText("45");
			ex_bullet.setText("10");
			ex_supply.setText("50");
			ex_dampersec.setText("208");
			ex_guntype.setText("자동샷건");
			ex_price.setText("-");
			ex_explain.setText("-");
			ex_hole.setText("-");
			ex_rail.setText("-");
			ex_sight.setText("-");

		} else if (title.equals("Kel-Tec KSG")) {
			ex_damage.setText("670");
			ex_distance.setText("5.8");
			ex_firerate.setText("122");
			ex_accur_aim.setText("72");
			ex_accur_nonaim.setText("56");
			ex_bullet.setText("7");
			ex_supply.setText("48");
			ex_dampersec.setText("136.23");
			ex_guntype.setText("펌프액션");
			ex_price.setText("-");
			ex_explain.setText("-");
			ex_hole.setText("표준형 소음기, 산탄총 소음기, 산탄총 소염기");
			ex_rail.setText("-");
			ex_sight.setText("이오텍 553 조준경, 에임 콤프 M4S, 모지제로 조준기, 트루글루 레드닷 조준기");

		} else if (title.equals("Saiga Bullpup")) {
			ex_damage.setText("660");
			ex_distance.setText("6.5");
			ex_firerate.setText("300");
			ex_accur_aim.setText("69");
			ex_accur_nonaim.setText("49");
			ex_bullet.setText("8");
			ex_supply.setText("48");
			ex_dampersec.setText("330");
			ex_guntype.setText("반자동샷건");
			ex_price.setText("-");
			ex_explain.setText("-");
			ex_hole.setText("표준형 소음기, 산탄총 소음기, 산탄총 소염기, 산탄총 총검");
			ex_rail.setText("-");
			ex_sight.setText("이오텍 553 조준경, 에임 콤프 M4S, 모지제로 조준기, 트루글루 레드닷 조준기");

		} else if (title.equals("Remington 870 도색(PC방)")) {
			ex_damage.setText("600");
			ex_distance.setText("5");
			ex_firerate.setText("90");
			ex_accur_aim.setText("71");
			ex_accur_nonaim.setText("53");
			ex_bullet.setText("8");
			ex_supply.setText("48");
			ex_dampersec.setText("90");
			ex_guntype.setText("펌프액션");
			ex_price.setText("-");
			ex_explain.setText("-");
			ex_hole.setText("표준형 소음기, 산탄총 소음기");
			ex_rail.setText("-");
			ex_sight.setText("이오텍 553 조준경, 에임 콤프 M4S");

		} else if (title.equals("Saiga Bullpup(크라운)")) {
			ex_damage.setText("660");
			ex_distance.setText("7.5");
			ex_firerate.setText("300");
			ex_accur_aim.setText("69");
			ex_accur_nonaim.setText("49");
			ex_bullet.setText("10");
			ex_supply.setText("40");
			ex_dampersec.setText("330");
			ex_guntype.setText("반자동샷건");
			ex_price.setText("1000크라운");
			ex_explain.setText("-");
			ex_hole.setText("표준형 소음기, 산탄총 소음기, 산탄총 소염기, 산탄총 총검");
			ex_rail.setText("-");
			ex_sight.setText("이오텍 553 조준경, 에임 콤프 M4S, 모지제로 조준기, 트루글루 레드닷 조준기");
		}

		/************************** 엔지니어 *****************************/

		else if (title.equals("H&K MP5")) {
			ex_damage.setText("50");
			ex_distance.setText("8");
			ex_firerate.setText("800");
			ex_accur_aim.setText("30");
			ex_accur_nonaim.setText("21");
			ex_bullet.setText("30");
			ex_supply.setText("180");
			ex_dampersec.setText("66.66");
			ex_guntype.setText("기관단총");
			ex_price.setText("-");
			ex_explain.setText("-");
			ex_hole.setText("표준형 소음기");
			ex_rail.setText("-");
			ex_sight.setText("이오텍 553 조준경");
		} else if (title.equals("M4 CQB")) {
			ex_damage.setText("55");
			ex_distance.setText("8");
			ex_firerate.setText("840");
			ex_accur_aim.setText("27");
			ex_accur_nonaim.setText("20");
			ex_bullet.setText("30");
			ex_supply.setText("180");
			ex_dampersec.setText("77");
			ex_guntype.setText("기관단총");
			ex_price.setText("2340");
			ex_explain.setText("-");
			ex_hole.setText("표준형 소음기, 기관단총 소음기");
			ex_rail.setText("블랙폴리머 수직손잡이");
			ex_sight.setText("이오텍 553 조준경, 류폴드 마크4 CQ/T");

		} else if (title.equals("H&K G36C")) {
			ex_damage.setText("57");
			ex_distance.setText("8.3");
			ex_firerate.setText("750");
			ex_accur_aim.setText("30");
			ex_accur_nonaim.setText("21");
			ex_bullet.setText("30");
			ex_supply.setText("180");
			ex_dampersec.setText("71.25");
			ex_guntype.setText("기관단총");
			ex_price.setText("2730");
			ex_explain.setText("-");
			ex_hole.setText("표준형 소음기, 기관단총 소음기");
			ex_rail.setText("블랙폴리머 수직손잡이");
			ex_sight.setText("이오텍 553 조준경, 류폴드 마크4 CQ/T");

		} else if (title.equals("Daewoo K1")) {
			ex_damage.setText("60");
			ex_distance.setText("8.5");
			ex_firerate.setText("670");
			ex_accur_aim.setText("30");
			ex_accur_nonaim.setText("21");
			ex_bullet.setText("30");
			ex_supply.setText("180");
			ex_dampersec.setText("67");
			ex_guntype.setText("기관단총");
			ex_price.setText("2730");
			ex_explain.setText("-");
			ex_hole.setText("표준형 소음기, 기관단총 소음기");
			ex_rail.setText("-");
			ex_sight.setText("이오텍 553 조준경, 류폴드 마크4 CQ/T");

		} else if (title.equals("AUG A3 9mm XS")) {
			ex_damage.setText("62");
			ex_distance.setText("9.5");
			ex_firerate.setText("830");
			ex_accur_aim.setText("31");
			ex_accur_nonaim.setText("21");
			ex_bullet.setText("30");
			ex_supply.setText("180");
			ex_dampersec.setText("85.76");
			ex_guntype.setText("기관단총");
			ex_price.setText("4390");
			ex_explain.setText("-");
			ex_hole.setText("표준형 소음기, 기관단총 소음기, 기관단총 소염기");
			ex_rail.setText("블랙폴리머 수직손잡이, 기관단총 수직손잡이");
			ex_sight.setText("이오텍 553 조준경, 류폴드 마크4 CQ/T. CQB 전술조준경, 트루글루 레드닷 조준기");

		} else if (title.equals("H&K MP7")) {
			ex_damage.setText("60");
			ex_distance.setText("9.5");
			ex_firerate.setText("860");
			ex_accur_aim.setText("26");
			ex_accur_nonaim.setText("21");
			ex_bullet.setText("30");
			ex_supply.setText("180");
			ex_dampersec.setText("86");
			ex_guntype.setText("기관단총");
			ex_price.setText("4390");
			ex_explain.setText("기본으로 수직손잡이가 달려있어서 손잡이를 달수없다. 하지만 떼버리고 싶다.");
			ex_hole.setText("표준형 소음기, 기관단총 소음기, 기관단총 소염기");
			ex_rail.setText("-");
			ex_sight.setText("이오텍 553 조준경, 류폴드 마크4 CQ/T. CQB 전술조준경, 트루글루 레드닷 조준기");

		} else if (title.equals("AK9")) {
			ex_damage.setText("70");
			ex_distance.setText("11");
			ex_firerate.setText("720");
			ex_accur_aim.setText("31");
			ex_accur_nonaim.setText("18");
			ex_bullet.setText("20");
			ex_supply.setText("180");
			ex_dampersec.setText("84");
			ex_guntype.setText("기관단총");
			ex_price.setText("4390");
			ex_explain.setText("-");
			ex_hole.setText("표준형 소음기, 기관단총 소음기, 기관단총 소염기");
			ex_rail.setText("블랙폴리머 수직손잡이, 기관단총 수직손잡이");
			ex_sight.setText("이오텍 553 조준경, 류폴드 마크4 CQ/T. CQB 전술조준경, 트루글루 레드닷 조준기");

		} else if (title.equals("Mini Uzi")) {
			ex_damage.setText("61");
			ex_distance.setText("6.5");
			ex_firerate.setText("1000");
			ex_accur_aim.setText("29");
			ex_accur_nonaim.setText("17");
			ex_bullet.setText("30");
			ex_supply.setText("180");
			ex_dampersec.setText("101.66");
			ex_guntype.setText("기관단총");
			ex_price.setText("7800");
			ex_explain.setText("-");
			ex_hole.setText("표준형 소음기, 기관단총 소음기, 기관단총 소염기. 기관단총 총검");
			ex_rail.setText("블랙폴리머 수직손잡이, 기관단총 수직손잡이, 블랙폴리머 수직양각대");
			ex_sight.setText("이오텍 553 조준경, 류폴드 마크4 CQ/T. CQB 전술조준경, 트루글루 레드닷 조준기, 고정 3배 전술 조준경");

		} else if (title.equals("Kriss Super V")) {
			ex_damage.setText("65");
			ex_distance.setText("11");
			ex_firerate.setText("820");
			ex_accur_aim.setText("31");
			ex_accur_nonaim.setText("19");
			ex_bullet.setText("30");
			ex_supply.setText("180");
			ex_dampersec.setText("88.83");
			ex_guntype.setText("기관단총");
			ex_price.setText("7800");
			ex_explain.setText("사거리는 11이지만 오류인지 버그인지 실제 사거리는 짧다.");
			ex_hole.setText("표준형 소음기, 기관단총 소음기, 기관단총 소염기. 기관단총 총검");
			ex_rail.setText("블랙폴리머 수직손잡이, 기관단총 수직손잡이, 블랙폴리머 수직양각대");
			ex_sight.setText("이오텍 553 조준경, 류폴드 마크4 CQ/T. CQB 전술조준경, 트루글루 레드닷 조준기, 고정 3배 전술 조준경");

		} else if (title.equals("SIG 552")) {
			ex_damage.setText("63");
			ex_distance.setText("9");
			ex_firerate.setText("750");
			ex_accur_aim.setText("31");
			ex_accur_nonaim.setText("21");
			ex_bullet.setText("30");
			ex_supply.setText("180");
			ex_dampersec.setText("78.75");
			ex_guntype.setText("기관단총");
			ex_price.setText("-");
			ex_explain.setText("-");
			ex_hole.setText("표준형 소음기, 기관단총 소음기, 기관단총 소염기. 기관단총 총검");
			ex_rail.setText("블랙폴리머 수직손잡이, 기관단총 수직손잡이");
			ex_sight.setText("이오텍 553 조준경, 류폴드 마크4 CQ/T. CQB 전술조준경, 트루글루 레드닷 조준기");

		} else if (title.equals("Calico M960A")) {
			ex_damage.setText("60");
			ex_distance.setText("9");
			ex_firerate.setText("900");
			ex_accur_aim.setText("31");
			ex_accur_nonaim.setText("18");
			ex_bullet.setText("50");
			ex_supply.setText("200");
			ex_dampersec.setText("90");
			ex_guntype.setText("기관단총");
			ex_price.setText("-");
			ex_explain.setText("-");
			ex_hole.setText("표준형 소음기, 기관단총 소음기, 기관단총 소염기. 기관단총 총검");
			ex_rail.setText("블랙폴리머 수직손잡이, 기관단총 수직손잡이");
			ex_sight.setText("이오텍 553 조준경, 류폴드 마크4 CQ/T. CQB 전술조준경, 트루글루 레드닷 조준기");

		} else if (title.equals("FN P90")) {
			ex_damage.setText("60");
			ex_distance.setText("8.5");
			ex_firerate.setText("750");
			ex_accur_aim.setText("31");
			ex_accur_nonaim.setText("20");
			ex_bullet.setText("50");
			ex_supply.setText("200");
			ex_dampersec.setText("75");
			ex_guntype.setText("기관단총");
			ex_price.setText("-");
			ex_explain.setText("-");
			ex_hole.setText("표준형 소음기, 기관단총 소음기, 기관단총 소염기");
			ex_rail.setText("-");
			ex_sight.setText("이오텍 553 조준경, 류폴드 마크4 CQ/T. CQB 전술조준경, 트루글루 레드닷 조준기");

		} else if (title.equals("Tavor CTAR-21")) {
			ex_damage.setText("75");
			ex_distance.setText("11");
			ex_firerate.setText("840");
			ex_accur_aim.setText("31");
			ex_accur_nonaim.setText("21");
			ex_bullet.setText("31");
			ex_supply.setText("180");
			ex_dampersec.setText("105");
			ex_guntype.setText("기관단총");
			ex_price.setText("-");
			ex_explain.setText("타워모드 클리어시 지급됨.");
			ex_hole.setText("표준형 소음기, 기관단총 소음기, 기관단총 소염기. 기관단총 총검");
			ex_rail.setText("블랙폴리머 수직손잡이, 기관단총 수직손잡이, 블랙폴리머 수직양각대");
			ex_sight.setText("이오텍 553 조준경, 류폴드 마크4 CQ/T. CQB 전술조준경, 트루글루 레드닷 조준기, 고정 3배 전술 조준경");

		} else if (title.equals("XM8 Compact")) {
			ex_damage.setText("78");
			ex_distance.setText("12");
			ex_firerate.setText("780");
			ex_accur_aim.setText("31");
			ex_accur_nonaim.setText("19");
			ex_bullet.setText("30");
			ex_supply.setText("180");
			ex_dampersec.setText("101.4");
			ex_guntype.setText("기관단총");
			ex_price.setText("-");
			ex_explain.setText("-");
			ex_hole.setText("표준형 소음기, 기관단총 소음기, 기관단총 소염기. 기관단총 총검");
			ex_rail.setText("블랙폴리머 수직손잡이, 기관단총 수직손잡이, 블랙폴리머 수직양각대");
			ex_sight.setText("이오텍 553 조준경, 류폴드 마크4 CQ/T, CQB 전술조준경, 트루글루 레드닷 조준기, 고정 3배 전술 조준경");

		} else if (title.equals("M4 CQB 도색(PC방)")) {
			ex_damage.setText("65");
			ex_distance.setText("10");
			ex_firerate.setText("840");
			ex_accur_aim.setText("29");
			ex_accur_nonaim.setText("23");
			ex_bullet.setText("30");
			ex_supply.setText("120");
			ex_dampersec.setText("91");
			ex_guntype.setText("기관단총");
			ex_price.setText("-");
			ex_explain.setText("-");
			ex_hole.setText("표준형 소음기, 기관단총 소음기");
			ex_rail.setText("블랙폴리머 수직손잡이");
			ex_sight.setText("이오텍 553 조준경, 류폴드 마크4 CQ/T");

		} else if (title.equals("Tavor CTAR-21(크라운)")) {
			ex_damage.setText("80");
			ex_distance.setText("13");
			ex_firerate.setText("840");
			ex_accur_aim.setText("31");
			ex_accur_nonaim.setText("21");
			ex_bullet.setText("30");
			ex_supply.setText("180");
			ex_dampersec.setText("112");
			ex_guntype.setText("기관단총");
			ex_price.setText("1000크라운");
			ex_explain.setText("-");
			ex_hole.setText("표준형 소음기, 기관단총 소음기, 기관단총 소염기. 기관단총 총검");
			ex_rail.setText("블랙폴리머 수직손잡이, 기관단총 수직손잡이, 블랙폴리머 수직양각대");
			ex_sight.setText("이오텍 553 조준경, 류폴드 마크4 CQ/T. CQB 전술조준경, 트루글루 레드닷 조준기, 고정 3배 전술 조준경");

		}
		/**************************** 스나이퍼 **********************************/
		else if (title.equals("Dragunov SR")) {
			ex_damage.setText("135");
			ex_distance.setText("60");
			ex_firerate.setText("370");
			ex_accur_aim.setText("104");
			ex_accur_nonaim.setText("55");
			ex_bullet.setText("10");
			ex_supply.setText("50");
			ex_dampersec.setText("83.25");
			ex_guntype.setText("반자동저격총");
			ex_price.setText("-");
			ex_explain.setText("-");
			ex_hole.setText("표준형 소음기");
			ex_rail.setText("-");
			ex_sight.setText("표준 5.5배줌");

		} else if (title.equals("M16A2 Custom SPR")) {
			ex_damage.setText("155");
			ex_distance.setText("65");
			ex_firerate.setText("370");
			ex_accur_aim.setText("104");
			ex_accur_nonaim.setText("55");
			ex_bullet.setText("10");
			ex_supply.setText("50");
			ex_dampersec.setText("95.58");
			ex_guntype.setText("반자동저격총");
			ex_price.setText("2340");
			ex_explain.setText("-");
			ex_hole.setText("-");
			ex_rail.setText("저격총 양각대");
			ex_sight.setText("표준 5.5배줌, 중거리 4.5배줌");

		} else if (title.equals("H&K SL8")) {
			ex_damage.setText("180");
			ex_distance.setText("65");
			ex_firerate.setText("350");
			ex_accur_aim.setText("104");
			ex_accur_nonaim.setText("55");
			ex_bullet.setText("10");
			ex_supply.setText("50");
			ex_dampersec.setText("105");
			ex_guntype.setText("반자동저격총");
			ex_price.setText("2730");
			ex_explain.setText("-");
			ex_hole.setText("-");
			ex_rail.setText("저격총 양각대");
			ex_sight.setText("표준 5.5배줌, 중거리 4.5배줌");

		} else if (title.equals("XM8 Sharpshooter")) {
			ex_damage.setText("150");
			ex_distance.setText("60");
			ex_firerate.setText("400");
			ex_accur_aim.setText("104");
			ex_accur_nonaim.setText("55");
			ex_bullet.setText("10");
			ex_supply.setText("50");
			ex_dampersec.setText("100");
			ex_guntype.setText("반자동저격총");
			ex_price.setText("2730");
			ex_explain.setText("-");
			ex_hole.setText("-");
			ex_rail.setText("저격총 양각대");
			ex_sight.setText("표준 5.5배줌, 중거리 4.5배줌");

		} else if (title.equals("ACR SPR")) {
			ex_damage.setText("190");
			ex_distance.setText("60");
			ex_firerate.setText("300");
			ex_accur_aim.setText("104");
			ex_accur_nonaim.setText("55");
			ex_bullet.setText("20");
			ex_supply.setText("60");
			ex_dampersec.setText("95");
			ex_guntype.setText("반자동저격소총");
			ex_price.setText("4390");
			ex_explain.setText("-");
			ex_hole.setText("저격총 소염기");
			ex_rail.setText("저격총 양각대");
			ex_sight.setText("표준 5.5배줌, 중거리 4.5배줌");

		} else if (title.equals("SIG 550")) {
			ex_damage.setText("170");
			ex_distance.setText("65");
			ex_firerate.setText("370");
			ex_accur_aim.setText("104");
			ex_accur_nonaim.setText("55");
			ex_bullet.setText("20");
			ex_supply.setText("60");
			ex_dampersec.setText("104.83");
			ex_guntype.setText("반자동저격총");
			ex_price.setText("4875");
			ex_explain.setText("-");
			ex_hole.setText("저격총 소염기");
			ex_rail.setText("저격총 양각대");
			ex_sight.setText("표준 5.5배줌, 중거리 4.5배줌");

		} else if (title.equals("Alpine")) {
			ex_damage.setText("320");
			ex_distance.setText("70");
			ex_firerate.setText("39");
			ex_accur_aim.setText("104");
			ex_accur_nonaim.setText("55");
			ex_bullet.setText("5");
			ex_supply.setText("25");
			ex_dampersec.setText("20.8");
			ex_guntype.setText("볼트액션");
			ex_price.setText("7800");
			ex_explain.setText("-");
			ex_hole.setText("저격총 소염기");
			ex_rail.setText("저격총 양각대, 반동감소 양각대");
			ex_sight.setText("표준 5.5배줌, 중거리 4.5배줌, 단거리 4배줌, 빠른 중거리 5배줌");

		} else if (title.equals("Walther WA 2000")) {
			ex_damage.setText("250");
			ex_distance.setText("70");
			ex_firerate.setText("150");
			ex_accur_aim.setText("104");
			ex_accur_nonaim.setText("55");
			ex_bullet.setText("20");
			ex_supply.setText("60");
			ex_dampersec.setText("62.5");
			ex_guntype.setText("반자동저격총");
			ex_price.setText("4390");
			ex_explain.setText("크라운을 제외한 반자동스나중 데미지가 가장 강함.");
			ex_hole.setText("저격총 소염기, 저격총 소음기");
			ex_rail.setText("저격총 양각대, 반동감소 양각대");
			ex_sight.setText("표준 5.5배줌, 중거리 4.5배줌, 단거리 4배줌, 빠른 중거리 5배줌");

		} else if (title.equals("Tavor STAR-21 Navy Blue")) {
			ex_damage.setText("180");
			ex_distance.setText("70");
			ex_firerate.setText("390");
			ex_accur_aim.setText("104");
			ex_accur_nonaim.setText("55");
			ex_bullet.setText("20");
			ex_supply.setText("60");
			ex_dampersec.setText("117");
			ex_guntype.setText("반자동저격총");
			ex_price.setText("7800");
			ex_explain.setText("-");
			ex_hole.setText("표준형 소음기, 저격총 소염기, 저격총 소음기");
			ex_rail.setText("저격총 양각대, 반동감소 양각대");
			ex_sight.setText("표준 5.5배줌, 중거리 4.5배줌, 단거리 4배줌, 빠른 중거리 5배줌");

		} else if (title.equals("AWM")) {
			ex_damage.setText("300");
			ex_distance.setText("70");
			ex_firerate.setText("42");
			ex_accur_aim.setText("104");
			ex_accur_nonaim.setText("51");
			ex_bullet.setText("5");
			ex_supply.setText("40");
			ex_dampersec.setText("21");
			ex_guntype.setText("볼트액션");
			ex_price.setText("-");
			ex_explain.setText("-");
			ex_hole.setText("저격총 소염기, 저격총 소음기");
			ex_rail.setText("저격총 양각대");
			ex_sight.setText("표준 5.5배줌, 중거리 4.5배줌, 단거리 4배줌");

		} else if (title.equals("Cheytac M200")) {
			ex_damage.setText("340");
			ex_distance.setText("70");
			ex_firerate.setText("44");
			ex_accur_aim.setText("104");
			ex_accur_nonaim.setText("45");
			ex_bullet.setText("7");
			ex_supply.setText("35");
			ex_dampersec.setText("24.93");
			ex_guntype.setText("볼트액션");
			ex_price.setText("-");
			ex_explain.setText("소음기를 낄수없으며 소리가 매우 크다. 또한 줌속도가 매우 느리다.");
			ex_hole.setText("-");
			ex_rail.setText("-");
			ex_sight.setText("표준 5.5배줌, 중거리 4.5배줌, 단거리 4배줌, 빠른 중거리 5배줌");

		} else if (title.equals("M14 EBR")) {
			ex_damage.setText("225");
			ex_distance.setText("70");
			ex_firerate.setText("380");
			ex_accur_aim.setText("104");
			ex_accur_nonaim.setText("55");
			ex_bullet.setText("20");
			ex_supply.setText("60");
			ex_dampersec.setText("142.5");
			ex_guntype.setText("반자동저격총");
			ex_price.setText("-");
			ex_explain.setText("소리가 매우 크고 연사력이 빠르다. 처음 업데이트 당시 워낙에 스펙이 낮아서 쿠데타업데이트 이후 삭제된 지금은의외로 가지고있는 사람이 없음");
			ex_hole.setText("저격총 소염기, 저격총 소음기");
			ex_rail.setText("저격총 양각대, 반동감소 양각대");
			ex_sight.setText("표준 5.5배줌, 중거리 4.5배줌, 단거리 4배줌, 빠른 중거리 5배줌");

		} else if (title.equals("VSS Vintorez")) {
			ex_damage.setText("200");
			ex_distance.setText("70");
			ex_firerate.setText("400");
			ex_accur_aim.setText("104");
			ex_accur_nonaim.setText("55");
			ex_bullet.setText("10");
			ex_supply.setText("50");
			ex_dampersec.setText("133.33");
			ex_guntype.setText("자동저격총");
			ex_price.setText("-");
			ex_explain.setText("자체 소음기가 있고, 연사력이 빠름.");
			ex_hole.setText("-");
			ex_rail.setText("저격총 양각대, 반동감소 양각대");
			ex_sight.setText("표준 5.5배줌, 중거리 4.5배줌, 단거리 4배줌");

		} else if (title.equals("Tavor STAR-21(삭제)")) {
			ex_damage.setText("190");
			ex_distance.setText("65");
			ex_firerate.setText("450");
			ex_accur_aim.setText("104");
			ex_accur_nonaim.setText("55");
			ex_bullet.setText("20");
			ex_supply.setText("60");
			ex_dampersec.setText("142.5");
			ex_guntype.setText("자동저격총");
			ex_price.setText("-");
			ex_explain.setText("근접 메딕도 씹어먹는다는 연사력을 가졌음. 밸런스 문제로 러시아에서도 영구삭제됨.");
			ex_hole.setText("저격총 소염기, 저격총 소음기");
			ex_rail.setText("저격총 양각대, 반동감소 양각대");
			ex_sight.setText("표준 5.5배줌, 중거리 4.5배줌, 단거리 4배줌, 빠른 중거리 5배줌");

		} else if (title.equals("QBU-88")) {
			ex_damage.setText("200");
			ex_distance.setText("70");
			ex_firerate.setText("270");
			ex_accur_aim.setText("104");
			ex_accur_nonaim.setText("38");
			ex_bullet.setText("10");
			ex_supply.setText("50");
			ex_dampersec.setText("90");
			ex_guntype.setText("반자동저격총");
			ex_price.setText("-");
			ex_explain.setText("중국서버에만 존재하는 총.");
			ex_hole.setText("저격총 소염기, 저격총 소음기");
			ex_rail.setText("저격총 양각대");
			ex_sight.setText("표준 5.5배줌, 중거리 4.5배줌, 단거리 4배줌, 빠른 중거리 5배줌");

		} else if (title.equals("M16A2 Custom SPR 도색(PC방)")) {
			ex_damage.setText("180");
			ex_distance.setText("65");
			ex_firerate.setText("370");
			ex_accur_aim.setText("104");
			ex_accur_nonaim.setText("55");
			ex_bullet.setText("10");
			ex_supply.setText("50");
			ex_dampersec.setText("111");
			ex_guntype.setText("반자동저격총");
			ex_price.setText("-");
			ex_explain.setText("-");
			ex_hole.setText("저격총 소염기");
			ex_rail.setText("저격총 양각대");
			ex_sight.setText("표준 5.5배줌, 중거리 4.5배줌, 단거리 4배줌");

		} else if (title.equals("AS50(크라운)")) {
			ex_damage.setText("350");
			ex_distance.setText("70");
			ex_firerate.setText("320");
			ex_accur_aim.setText("104");
			ex_accur_nonaim.setText("70");
			ex_bullet.setText("7");
			ex_supply.setText("350");
			ex_dampersec.setText("186.66");
			ex_guntype.setText("반자동저격총");
			ex_price.setText("1000크라운");
			ex_explain.setText("-");
			ex_hole.setText("-");
			ex_rail.setText("저격총 양각대, 반동감소 양각대");
			ex_sight.setText("표준 5.5배줌, 중거리 4.5배줌, 단거리 4배줌, 빠른 중거리 5배줌");

		}
		/****************************** 권총 *********************************/
		else if (title.equals("Browning High Power")) {
			ex_damage.setText("55");
			ex_distance.setText("8.5");
			ex_firerate.setText("435");
			ex_accur_aim.setText("13");
			ex_accur_nonaim.setText("8");
			ex_bullet.setText("15");
			ex_supply.setText("63");
			ex_dampersec.setText("39.87");
			ex_guntype.setText("반자동권총");
			ex_price.setText("-");
			ex_explain.setText("-");
			ex_hole.setText("표준형 소음기");
			ex_rail.setText("-");
			ex_sight.setText("-");

		} else if (title.equals("Daewoo K5")) {
			ex_damage.setText("60");
			ex_distance.setText("9.5");
			ex_firerate.setText("415");
			ex_accur_aim.setText("13");
			ex_accur_nonaim.setText("8");
			ex_bullet.setText("13");
			ex_supply.setText("65");
			ex_dampersec.setText("41.5");
			ex_guntype.setText("반자동권총");
			ex_price.setText("975");
			ex_explain.setText("-");
			ex_hole.setText("표준형 소음기, 커스텀 권총소음기");
			ex_rail.setText("-");
			ex_sight.setText("-");

		} else if (title.equals("Steyr M9A1")) {
			ex_damage.setText("72");
			ex_distance.setText("9");
			ex_firerate.setText("430");
			ex_accur_aim.setText("13");
			ex_accur_nonaim.setText("9");
			ex_bullet.setText("12");
			ex_supply.setText("60");
			ex_dampersec.setText("51.6");
			ex_guntype.setText("반자동권총");
			ex_price.setText("1950");
			ex_explain.setText("러시아에서는 희귀등급에 속함");
			ex_hole.setText("표준형 소음기");
			ex_rail.setText("-");
			ex_sight.setText("-");

		} else if (title.equals("Berreta M9")) {
			ex_damage.setText("65");
			ex_distance.setText("9.8");
			ex_firerate.setText("425");
			ex_accur_aim.setText("14");
			ex_accur_nonaim.setText("9");
			ex_bullet.setText("13");
			ex_supply.setText("65");
			ex_dampersec.setText("46.04");
			ex_guntype.setText("반자동권총");
			ex_price.setText("1950");
			ex_explain.setText("-");
			ex_hole.setText("표준형 소음기, 커스텀 권총소음기");
			ex_rail.setText("-");
			ex_sight.setText("-");

		} else if (title.equals("COLT Python Elite")) {
			ex_damage.setText("127");
			ex_distance.setText("9");
			ex_firerate.setText("430");
			ex_accur_aim.setText("13");
			ex_accur_nonaim.setText("4");
			ex_bullet.setText("6");
			ex_supply.setText("54");
			ex_dampersec.setText("91.01");
			ex_guntype.setText("리볼버권총");
			ex_price.setText("5850");
			ex_explain.setText("-");
			ex_hole.setText("-");
			ex_rail.setText("-");
			ex_sight.setText("이오텟 553 조준기, 트루글루 레드닷 조준기, 권총 조준경 1.5X");

		} else if (title.equals("H&K USP")) {
			ex_damage.setText("60");
			ex_distance.setText("10");
			ex_firerate.setText("450");
			ex_accur_aim.setText("13");
			ex_accur_nonaim.setText("9");
			ex_bullet.setText("13");
			ex_supply.setText("65");
			ex_dampersec.setText("45");
			ex_guntype.setText("반자동권총");
			ex_price.setText("-");
			ex_explain.setText("-");
			ex_hole.setText("표준형 소음기, 커스텀 권총 소음기, 권총 소염기, 권총 총검");
			ex_rail.setText("-");
			ex_sight.setText("이오텟 553 조준기, 트루글루 레드닷 조준기, 권총 조준경 1.5X");

		} else if (title.equals("Desert Eagle")) {
			ex_damage.setText("113");
			ex_distance.setText("10");
			ex_firerate.setText("410");
			ex_accur_aim.setText("15");
			ex_accur_nonaim.setText("6");
			ex_bullet.setText("7");
			ex_supply.setText("56");
			ex_dampersec.setText("77.21");
			ex_guntype.setText("반자동권총");
			ex_price.setText("-");
			ex_explain.setText("-");
			ex_hole.setText("표준형 소음기, 커스텀 권총 소음기, 권총 소염기, 권총 총검");
			ex_rail.setText("-");
			ex_sight.setText("이오텟 553 조준기, 트루글루 레드닷 조준기, 권총 조준경 1.5X");

		} else if (title.equals("Glock 18C")) {
			ex_damage.setText("45");
			ex_distance.setText("9");
			ex_firerate.setText("700");
			ex_accur_aim.setText("11");
			ex_accur_nonaim.setText("5");
			ex_bullet.setText("33");
			ex_supply.setText("99");
			ex_dampersec.setText("52.5");
			ex_guntype.setText("자동권총");
			ex_price.setText("-");
			ex_explain.setText("총자체는 약하지만 가끔 스나이퍼가 글록만 들고 돌진하기도 한다. 호러물");
			ex_hole.setText("커스텀 권총 소음기");
			ex_rail.setText("-");
			ex_sight.setText("-");

		} else if (title.equals("손가락 권총")) {
			ex_damage.setText("135");
			ex_distance.setText("11");
			ex_firerate.setText("410");
			ex_accur_aim.setText("14");
			ex_accur_nonaim.setText("6");
			ex_bullet.setText("7");
			ex_supply.setText("56");
			ex_dampersec.setText("92.25");
			ex_guntype.setText("반자동권총");
			ex_price.setText("-");
			ex_explain.setText("2013 추석이벤트, 2014 설날이벤트 당시 지급, 조준시에 손가락으로 원을 그려 조준한다.");
			ex_hole.setText("-");
			ex_rail.setText("-");
			ex_sight.setText("-");

		} else if (title.equals("Beretta M9 도색(PC방)")) {
			ex_damage.setText("70");
			ex_distance.setText("12");
			ex_firerate.setText("425");
			ex_accur_aim.setText("15");
			ex_accur_nonaim.setText("9");
			ex_bullet.setText("15");
			ex_supply.setText("65");
			ex_dampersec.setText("49.58");
			ex_guntype.setText("반자동권총");
			ex_price.setText("-");
			ex_explain.setText("-");
			ex_hole.setText("표준형 소음기, 커스텀 권총 소음기, 권총 총검");
			ex_rail.setText("-");
			ex_sight.setText("-");

		} else if (title.equals("Desert Eagle(크라운)")) {
			ex_damage.setText("140");
			ex_distance.setText("12");
			ex_firerate.setText("410");
			ex_accur_aim.setText("15");
			ex_accur_nonaim.setText("9");
			ex_bullet.setText("9");
			ex_supply.setText("54");
			ex_dampersec.setText("95.66");
			ex_guntype.setText("반자동권총");
			ex_price.setText("600크라운");
			ex_explain.setText("-");
			ex_hole.setText("표준형 소음기, 커스텀 권총 소음기, 권총 소염기, 권총 총검");
			ex_rail.setText("-");
			ex_sight.setText("이오텟 553 조준기, 트루글루 레드닷 조준기, 권총 조준경 1.5X");

			/******************************* 근접무기 ******************************/
		} else if (title.equals("기본대검")) {
			ex_damage.setText("-");
			ex_distance.setText("-");
			ex_firerate.setText("-");
			ex_accur_aim.setText("-");
			ex_accur_nonaim.setText("-");
			ex_bullet.setText("-");
			ex_supply.setText("-");
			ex_dampersec.setText("-");
			ex_guntype.setText("-");
			ex_price.setText("-");
			ex_explain.setText("현실에서 이 칼은 찌른 후 부러져 상처를 깊게 만드는 용도이다.");
			ex_hole.setText("-");
			ex_rail.setText("-");
			ex_sight.setText("-");
		} else if (title.equals("울트라마린")) {
			ex_damage.setText("-");
			ex_distance.setText("증가");
			ex_firerate.setText("-");
			ex_accur_aim.setText("-");
			ex_accur_nonaim.setText("-");
			ex_bullet.setText("-");
			ex_supply.setText("-");
			ex_dampersec.setText("-");
			ex_guntype.setText("-");
			ex_price.setText("585");
			ex_explain.setText("-");
			ex_hole.setText("-");
			ex_rail.setText("-");
			ex_sight.setText("-");
		} else if (title.equals("KA Bar Utility Knife")) {
			ex_damage.setText("-");
			ex_distance.setText("증가");
			ex_firerate.setText("-");
			ex_accur_aim.setText("-");
			ex_accur_nonaim.setText("-");
			ex_bullet.setText("-");
			ex_supply.setText("-");
			ex_dampersec.setText("-");
			ex_guntype.setText("-");
			ex_price.setText("-");
			ex_explain.setText("러시아에선 캐쉬아이템으로 출시되었음.");
			ex_hole.setText("-");
			ex_rail.setText("-");
			ex_sight.setText("-");
		} else if (title.equals("야전삽")) {
			ex_damage.setText("-");
			ex_distance.setText("매우증가");
			ex_firerate.setText("증가");
			ex_accur_aim.setText("-");
			ex_accur_nonaim.setText("-");
			ex_bullet.setText("-");
			ex_supply.setText("-");
			ex_dampersec.setText("-");
			ex_guntype.setText("-");
			ex_price.setText("2400");
			ex_explain.setText("-");
			ex_hole.setText("-");
			ex_rail.setText("-");
			ex_sight.setText("-");
		} else if (title.equals("블랙 호크")) {
			ex_damage.setText("-");
			ex_distance.setText("증가");
			ex_firerate.setText("-");
			ex_accur_aim.setText("-");
			ex_accur_nonaim.setText("-");
			ex_bullet.setText("-");
			ex_supply.setText("-");
			ex_dampersec.setText("-");
			ex_guntype.setText("-");
			ex_price.setText("-");
			ex_explain.setText("러시아에서는 이벤트아이템으로만 등장. 실제로는 던지기도 한다지만 게임에선 구현 안됨.");
			ex_hole.setText("-");
			ex_rail.setText("-");
			ex_sight.setText("-");
		} else if (title.equals("택툴")) {
			ex_damage.setText("-");
			ex_distance.setText("증가");
			ex_firerate.setText("증가");
			ex_accur_aim.setText("-");
			ex_accur_nonaim.setText("-");
			ex_bullet.setText("-");
			ex_supply.setText("-");
			ex_dampersec.setText("-");
			ex_guntype.setText("-");
			ex_price.setText("-");
			ex_explain.setText("-");
			ex_hole.setText("-");
			ex_rail.setText("-");
			ex_sight.setText("-");
		} else if (title.equals("고드름 송곳")) {
			ex_damage.setText("-");
			ex_distance.setText("매우증가");
			ex_firerate.setText("매우증가");
			ex_accur_aim.setText("-");
			ex_accur_nonaim.setText("-");
			ex_bullet.setText("-");
			ex_supply.setText("-");
			ex_dampersec.setText("-");
			ex_guntype.setText("-");
			ex_price.setText("-");
			ex_explain.setText("14.03월 PC방 쿠폰으로 지급");
			ex_hole.setText("-");
			ex_rail.setText("-");
			ex_sight.setText("-");
		} else if (title.equals("망치")) {
			ex_damage.setText("-");
			ex_distance.setText("-");
			ex_firerate.setText("-");
			ex_accur_aim.setText("-");
			ex_accur_nonaim.setText("-");
			ex_bullet.setText("-");
			ex_supply.setText("-");
			ex_dampersec.setText("-");
			ex_guntype.setText("-");
			ex_price.setText("-");
			ex_explain.setText("14.04월 PC방 쿠폰으로 지급");
			ex_hole.setText("-");
			ex_rail.setText("-");
			ex_sight.setText("-");
		} else if (title.equals("나무망치")) {
			ex_damage.setText("-");
			ex_distance.setText("-");
			ex_firerate.setText("-");
			ex_accur_aim.setText("-");
			ex_accur_nonaim.setText("-");
			ex_bullet.setText("-");
			ex_supply.setText("-");
			ex_dampersec.setText("-");
			ex_guntype.setText("-");
			ex_price.setText("-");
			ex_explain.setText("14.04.01 만우절 이벤트로 지급");
			ex_hole.setText("-");
			ex_rail.setText("-");
			ex_sight.setText("-");
			/************************ 이벤트 ***********************************/

		} else if (title.equals("데빌스킨 H&K G36K")) {
			ex_damage.setText("63");
			ex_distance.setText("12");
			ex_firerate.setText("650");
			ex_accur_aim.setText("30");
			ex_accur_nonaim.setText("20");
			ex_bullet.setText("30");
			ex_supply.setText("120");
			ex_dampersec.setText("68.25");
			ex_guntype.setText("돌격소총");
			ex_price.setText("-");
			ex_explain.setText("-");
			ex_hole.setText("표준형 소음기, 퀵마운트 소음기");
			ex_rail.setText("블랙폴리머 수직손잡이");
			ex_sight.setText("이오텍 553 조준경, 엘칸 스펙터 광학 조준경");

		} else if (title.equals("겨울위장도색 M4A1")) {
			ex_damage.setText("67");
			ex_distance.setText("14");
			ex_firerate.setText("680");
			ex_accur_aim.setText("30");
			ex_accur_nonaim.setText("21");
			ex_bullet.setText("30");
			ex_supply.setText("120");
			ex_dampersec.setText("75.93");
			ex_guntype.setText("돌격소총");
			ex_price.setText("-");
			ex_explain.setText("-");
			ex_hole.setText("표준형 소음기, 퀵마운트 소음기, 돌격 소염기, 돌격 총검");
			ex_rail.setText("블랙폴리머 수직손잡이, 돌격 수직손잡이, 돌격 수직양각대, 유탄발사기");
			ex_sight.setText("에임콤프 M4S 겨울위장도색, 트루글루 레드닷 조준기 겨울위장도색 (언락필요없이 사용가능)");

		} else if (title.equals("크리스마스 ACR")) {
			ex_damage.setText("63");
			ex_distance.setText("11");
			ex_firerate.setText("700");
			ex_accur_aim.setText("31");
			ex_accur_nonaim.setText("18");
			ex_bullet.setText("30");
			ex_supply.setText("150");
			ex_dampersec.setText("73.5");
			ex_guntype.setText("돌격소총");
			ex_price.setText("-");
			ex_explain.setText("-");
			ex_hole.setText("표준형 소음기, 퀵마운트 소음기, 돌격 소염기, 돌격 총검");
			ex_rail.setText("블랙폴리머 수직손잡이, 돌격 수직손잡이, 돌격 수직양각대, 유탄발사기");
			ex_sight.setText("이오텍 553 조준경, 엘칸 스펙터 광학 조준경, 엘칸 스펙터 듀얼 롤 조준경, 트루글루 레드닷 조준기, 트릿지컨 고등전투광학조준경");

		} else if (title.equals("데빌스킨 SPAS-12")) {
			ex_damage.setText("650");
			ex_distance.setText("5.3");
			ex_firerate.setText("59");
			ex_accur_aim.setText("73");
			ex_accur_nonaim.setText("57");
			ex_bullet.setText("8");
			ex_supply.setText("48");
			ex_dampersec.setText("63.91");
			ex_guntype.setText("펌프액션");
			ex_price.setText("-");
			ex_explain.setText("-");
			ex_hole.setText("표준형 소음기, 산탄총 소음기");
			ex_rail.setText("-");
			ex_sight.setText("이오텍 553 조준경, 에임 콤프 M4S");

		} else if (title.equals("겨울위장도색 Saiga-12")) {
			ex_damage.setText("620");
			ex_distance.setText("7.2");
			ex_firerate.setText("210");
			ex_accur_aim.setText("71");
			ex_accur_nonaim.setText("48");
			ex_bullet.setText("8");
			ex_supply.setText("56");
			ex_dampersec.setText("217");
			ex_guntype.setText("반자동샷건");
			ex_price.setText("-");
			ex_explain.setText("-");
			ex_hole.setText("표준형 소음기, 산탄총 소음기, 산탄총 소염기");
			ex_rail.setText("-");
			ex_sight.setText("에임콤프 M4S 겨울위장도색, 트루글루 레드닷 조준기 겨울위장도색 (언락필요없이 사용가능)");

		} else if (title.equals("크리스마스 SPAS-12")) {
			ex_damage.setText("650");
			ex_distance.setText("6.5");
			ex_firerate.setText("60");
			ex_accur_aim.setText("73");
			ex_accur_nonaim.setText("57");
			ex_bullet.setText("8");
			ex_supply.setText("56");
			ex_dampersec.setText("65");
			ex_guntype.setText("펌프액션");
			ex_price.setText("-");
			ex_explain.setText("-");
			ex_hole.setText("표준형 소음기, 산탄총 소음기, 산탄총 소염기");
			ex_rail.setText("-");
			ex_sight.setText("이오텍 553 조준경, 트루글루 레드닷 조준기, 에임 콤프 M4S, 모지제로 조준기");

		} else if (title.equals("데빌스킨 H&K G36C")) {
			ex_damage.setText("57");
			ex_distance.setText("8.3");
			ex_firerate.setText("750");
			ex_accur_aim.setText("30");
			ex_accur_nonaim.setText("21");
			ex_bullet.setText("30");
			ex_supply.setText("180");
			ex_dampersec.setText("71.25");
			ex_guntype.setText("기관단총");
			ex_price.setText("-");
			ex_explain.setText("-");
			ex_hole.setText("표준형 소음기, 기관단총 소음기");
			ex_rail.setText("블랙폴리머 수직손잡이");
			ex_sight.setText("이오텍 553 조준경, 류폴드 마크4 CQ/T");

		} else if (title.equals("겨울위장도색 H&K MP5")) {
			ex_damage.setText("62");
			ex_distance.setText("12");
			ex_firerate.setText("800");
			ex_accur_aim.setText("30");
			ex_accur_nonaim.setText("21");
			ex_bullet.setText("30");
			ex_supply.setText("180");
			ex_dampersec.setText("82.66");
			ex_guntype.setText("기관단총");
			ex_price.setText("-");
			ex_explain.setText("-");
			ex_hole.setText("표준형 소음기, 기관단총 소음기, 기관단총 소염기");
			ex_rail.setText("블랙폴리머 수직손잡이, 기관단총 수직손잡이, 블랙폴리머 수직양각대");
			ex_sight.setText("에임콤프 M4S 겨울위장도색, 트루글루 레드닷 조준기 겨울위장도색 (언락필요없이 사용가능)");

		} else if (title.equals("크리스마스 Kriss Super V")) {
			ex_damage.setText("65");
			ex_distance.setText("12");
			ex_firerate.setText("820");
			ex_accur_aim.setText("31");
			ex_accur_nonaim.setText("19");
			ex_bullet.setText("30");
			ex_supply.setText("210");
			ex_dampersec.setText("88.83");
			ex_guntype.setText("기관단총");
			ex_price.setText("-");
			ex_explain.setText("-");
			ex_hole.setText("표준형 소음기, 기관단총 소음기, 기관단총 소염기");
			ex_rail.setText("블랙폴리머 수직손잡이, 기관단총 수직손잡이, 블랙폴리머 수직양각대");
			ex_sight.setText("이오텍 553 조준경, 류폴드 마크4 CQ/T. CQB 전술조준경, 트루글루 레드닷 조준기, 고정 3배 전술 조준경");

		} else if (title.equals("데빌스킨 H&K SL8")) {
			ex_damage.setText("180");
			ex_distance.setText("65");
			ex_firerate.setText("350");
			ex_accur_aim.setText("104");
			ex_accur_nonaim.setText("55");
			ex_bullet.setText("10");
			ex_supply.setText("50");
			ex_dampersec.setText("105");
			ex_guntype.setText("반자동저격총");
			ex_price.setText("-");
			ex_explain.setText("-");
			ex_hole.setText("-");
			ex_rail.setText("저격총 양각대");
			ex_sight.setText("표준 5.5배줌, 중거리 4.5배줌");

		} else if (title.equals("겨울위장도색 AWM")) {
			ex_damage.setText("300");
			ex_distance.setText("70");
			ex_firerate.setText("49");
			ex_accur_aim.setText("104");
			ex_accur_nonaim.setText("51");
			ex_bullet.setText("5");
			ex_supply.setText("40");
			ex_dampersec.setText("24.5");
			ex_guntype.setText("볼트액션");
			ex_price.setText("-");
			ex_explain.setText("-");
			ex_hole.setText("표준형 소음기, 저격총 소염기, 저격총 소음기");
			ex_rail.setText("저격총 양각대, 반동감소 양각대");
			ex_sight.setText("빠른 중거리 5배줌 겨울위장도색(변경불가)");

		} else if (title.equals("크리스마스 Alpine")) {
			ex_damage.setText("320");
			ex_distance.setText("70");
			ex_firerate.setText("39");
			ex_accur_aim.setText("104");
			ex_accur_nonaim.setText("55");
			ex_bullet.setText("5");
			ex_supply.setText("30");
			ex_dampersec.setText("20.8");
			ex_guntype.setText("볼트액션");
			ex_price.setText("-");
			ex_explain.setText("-");
			ex_hole.setText("저격총 소염기");
			ex_rail.setText("저격총 양각대, 반동감소 양각대");
			ex_sight.setText("표준 5.5배줌, 중거리 4.5배줌, 단거리 4배줌, 빠른 중거리 5배줌");

		} else if (title.equals("데빌스킨 Stechkin APS")) {
			ex_damage.setText("59");
			ex_distance.setText("10");
			ex_firerate.setText("650");
			ex_accur_aim.setText("14");
			ex_accur_nonaim.setText("7");
			ex_bullet.setText("20");
			ex_supply.setText("40");
			ex_dampersec.setText("63.91");
			ex_guntype.setText("자동권총");
			ex_price.setText("-");
			ex_explain.setText("할로윈 이벤트, 권총 총검이 한방이던 당시 권총전에서 상위권은 항상 이총이었음.");
			ex_hole.setText("표준형 소음기, 커스텀 권총 소음기, 권총 소염기, 권총 총검");
			ex_rail.setText("-");
			ex_sight.setText("-");

		} else if (title.equals("겨울위장도색 H&K USP")) {
			ex_damage.setText("64");
			ex_distance.setText("12");
			ex_firerate.setText("450");
			ex_accur_aim.setText("14");
			ex_accur_nonaim.setText("9");
			ex_bullet.setText("13");
			ex_supply.setText("65");
			ex_dampersec.setText("48");
			ex_guntype.setText("반자동권총");
			ex_price.setText("-");
			ex_explain.setText("-");
			ex_hole.setText("표준형 소음기, 커스텀 권총 소음기, 권총 소염기, 권총 총검");
			ex_rail.setText("-");
			ex_sight.setText("트루글루 레드닷 조준기 겨울위장도색");

		} else if (title.equals("데빌스킨 택툴")) {
			ex_damage.setText("-");
			ex_distance.setText("증가");
			ex_firerate.setText("증가");
			ex_accur_aim.setText("-");
			ex_accur_nonaim.setText("-");
			ex_bullet.setText("-");
			ex_supply.setText("-");
			ex_dampersec.setText("-");
			ex_guntype.setText("-");
			ex_price.setText("-");
			ex_explain.setText("-");
			ex_hole.setText("-");
			ex_rail.setText("-");
			ex_sight.setText("-");

		} else if (title.equals("사탕 나이프")) {
			ex_damage.setText("");
			ex_distance.setText("증가");
			ex_firerate.setText("증가");
			ex_accur_aim.setText("-");
			ex_accur_nonaim.setText("-");
			ex_bullet.setText("-");
			ex_supply.setText("-");
			ex_dampersec.setText("-");
			ex_guntype.setText("-");
			ex_price.setText("-");
			ex_explain.setText("블랙호크에서 스킨만 바꾼것으로 보임");
			ex_hole.setText("-");
			ex_rail.setText("-");
			ex_sight.setText("-");

		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
