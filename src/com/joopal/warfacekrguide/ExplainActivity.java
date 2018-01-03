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

		Intent i = getIntent(); // ���� �޾ƿ´�.
		int image = i.getIntExtra("IMAGE", 0);
		String title = i.getStringExtra("TITLE");
		String vendor = i.getStringExtra("VENDOR");

		ex_mainimage.setBackgroundResource(image);
		ex_gunname.setText(title);
		ex_vendor.setText(vendor);

		/******************** ���̸��� ���� ���� �Է� *******************/
		if (title.equals("M4A1")) {
			ex_damage.setText("55");
			ex_distance.setText("11");
			ex_firerate.setText("680");
			ex_accur_aim.setText("30");
			ex_accur_nonaim.setText("21");
			ex_bullet.setText("30");
			ex_supply.setText("120");
			ex_dampersec.setText("62.33");
			ex_guntype.setText("���ݼ���");
			ex_price.setText("-");
			ex_explain.setText("-");
			ex_hole.setText("ǥ���� ������");
			ex_rail.setText("-");
			ex_sight.setText("�̿��� 553 ���ر�");
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
			ex_guntype.setText("�����");
			ex_price.setText("2340");
			ex_explain.setText("-");
			ex_hole.setText("ǥ���� ������, ������Ʈ ������");
			ex_rail.setText("����� �簢��, �������� ����������");
			ex_sight.setText("�̿��� 553 ���ر�, ��ĭ ������ ���� ���ذ�");

		} else if (title.equals("Daewoo K2")) {
			ex_damage.setText("60");
			ex_distance.setText("11");
			ex_firerate.setText("670");
			ex_accur_aim.setText("31");
			ex_accur_nonaim.setText("20");
			ex_bullet.setText("30");
			ex_supply.setText("120");
			ex_dampersec.setText("67");
			ex_guntype.setText("���ݼ���");
			ex_price.setText("2340");
			ex_explain.setText("-");
			ex_hole.setText("ǥ���� ������, ������Ʈ ������");
			ex_rail.setText("�������� ����������");
			ex_sight.setText("��ĭ ������ ���� ���ذ�");

		} else if (title.equals("H&K MG36")) {
			ex_damage.setText("63");
			ex_distance.setText("12");
			ex_firerate.setText("570");
			ex_accur_aim.setText("30");
			ex_accur_nonaim.setText("17");
			ex_bullet.setText("100");
			ex_supply.setText("300");
			ex_dampersec.setText("59.85");
			ex_guntype.setText("�����");
			ex_price.setText("2730");
			ex_explain.setText("-");
			ex_hole.setText("ǥ���� ������, ������Ʈ ������");
			ex_rail.setText("����� �簢��, �������� ����������");
			ex_sight.setText("�̿��� 553 ���ر�, ��ĭ ������ ���� ���ذ�");

		} else if (title.equals("H&K G36K")) {
			ex_damage.setText("63");
			ex_distance.setText("12");
			ex_firerate.setText("650");
			ex_accur_aim.setText("30");
			ex_accur_nonaim.setText("20");
			ex_bullet.setText("30");
			ex_supply.setText("120");
			ex_dampersec.setText("68.25");
			ex_guntype.setText("���ݼ���");
			ex_price.setText("2730");
			ex_explain.setText("-");
			ex_hole.setText("ǥ���� ������, ������Ʈ ������");
			ex_rail.setText("�������� ����������");
			ex_sight.setText("�̿��� 553 ���ذ�, ��ĭ ������ ���� ���ذ�");

		} else if (title.equals("Tavor TAR-21")) {
			ex_damage.setText("70");
			ex_distance.setText("12");
			ex_firerate.setText("620");
			ex_accur_aim.setText("29");
			ex_accur_nonaim.setText("20");
			ex_bullet.setText("30");
			ex_supply.setText("120");
			ex_dampersec.setText("72.33");
			ex_guntype.setText("���ݼ���");
			ex_price.setText("4390");
			ex_explain.setText("-");
			ex_hole.setText("ǥ���� ������, ������Ʈ ������, ���� �ҿ���");
			ex_rail.setText("�������� ����������, ���� ����������");
			ex_sight.setText("�̿��� 553 ���ذ�, ��ĭ ������ ���� ���ذ�, ��ĭ ������ ��� �� ���ذ�, Ʈ��۷� ����� ���ر�");

		} else if (title.equals("CALICO M955A")) {
			ex_damage.setText("62");
			ex_distance.setText("12");
			ex_firerate.setText("810");
			ex_accur_aim.setText("29");
			ex_accur_nonaim.setText("16");
			ex_bullet.setText("50");
			ex_supply.setText("150");
			ex_dampersec.setText("83.7");
			ex_guntype.setText("���ݼ���");
			ex_price.setText("4875");
			ex_explain.setText("�ݵ��� �����ϱ� ���� �ʺ��ڰ� ���� ���� ��");
			ex_hole.setText("ǥ���� ������, ������Ʈ ������, ���� �ҿ���");
			ex_rail.setText("�������� ����������, ���� ����������");
			ex_sight.setText("�̿��� 553 ���ذ�, ��ĭ ������ ���� ���ذ�, ��ĭ ������ ��� �� ���ذ�, Ʈ��۷� ����� ���ر�");

		} else if (title.equals("Galil")) {
			ex_damage.setText("78");
			ex_distance.setText("12");
			ex_firerate.setText("650");
			ex_accur_aim.setText("31");
			ex_accur_nonaim.setText("18");
			ex_bullet.setText("25");
			ex_supply.setText("125");
			ex_dampersec.setText("84.5");
			ex_guntype.setText("���ݼ���");
			ex_price.setText("4390");
			ex_explain.setText("-");
			ex_hole.setText("ǥ���� ������, ������Ʈ ������, ���� �ҿ���");
			ex_rail.setText("�������� ����������, ���� ����������");
			ex_sight.setText("�̿��� 553 ���ذ�, ��ĭ ������ ���� ���ذ�, ��ĭ ������ ��� �� ���ذ�, Ʈ��۷� ����� ���ر�");

		} else if (title.equals("AK103")) {
			ex_damage.setText("80");
			ex_distance.setText("14");
			ex_firerate.setText("600");
			ex_accur_aim.setText("31");
			ex_accur_nonaim.setText("18");
			ex_bullet.setText("30");
			ex_supply.setText("120");
			ex_dampersec.setText("80");
			ex_guntype.setText("���ݼ���");
			ex_price.setText("7800");
			ex_explain.setText("�ݵ��� �ſ� ����.");
			ex_hole.setText("ǥ���� ������, ������Ʈ ������, ���� �ҿ���, ���� �Ѱ�");
			ex_rail.setText("�������� ����������, ���� ����������, ���� �����簢��, ��ź�߻��");
			ex_sight.setText("�̿��� 553 ���ذ�, ��ĭ ������ ���� ���ذ�, ��ĭ ������ ��� �� ���ذ�, Ʈ��۷� ����� ���ر�, Ʈ������ ��������������ذ�");

		} else if (title.equals("RPK")) {
			ex_damage.setText("78");
			ex_distance.setText("14.5");
			ex_firerate.setText("530");
			ex_accur_aim.setText("31");
			ex_accur_nonaim.setText("10");
			ex_bullet.setText("75");
			ex_supply.setText("300");
			ex_dampersec.setText("68.9");
			ex_guntype.setText("�����");
			ex_price.setText("7800");
			ex_explain.setText("�⺻������ �簢�밡 �޷��־� �簢�븦 �޼������� �ݵ��� �ſ� ����.");
			ex_hole.setText("ǥ���� ������, ������Ʈ ������, ���� �ҿ���, ���� �Ѱ�");
			ex_rail.setText("�������� ����������, ���� ����������");
			ex_sight.setText("�̿��� 553 ���ذ�, ��ĭ ������ ���� ���ذ�, ��ĭ ������ ��� �� ���ذ�, Ʈ��۷� ����� ���ر�, Ʈ������ ��������������ذ�");

		} else if (title.equals("ACR")) {
			ex_damage.setText("77");
			ex_distance.setText("16");
			ex_firerate.setText("700");
			ex_accur_aim.setText("31");
			ex_accur_nonaim.setText("19");
			ex_bullet.setText("30");
			ex_supply.setText("120");
			ex_dampersec.setText("89.83");
			ex_guntype.setText("���ݼ���");
			ex_price.setText("-");
			ex_explain.setText("-");
			ex_hole.setText("ǥ���� ������, ������Ʈ ������, ���� �ҿ���, ���� �Ѱ�");
			ex_rail.setText("�������� ����������, ���� ����������, ���� �����簢��, ��ź�߻��");
			ex_sight.setText("�̿��� 553 ���ذ�, ��ĭ ������ ���� ���ذ�, ��ĭ ������ ��� �� ���ذ�, Ʈ��۷� ����� ���ر�, Ʈ������ ��������������ذ�");

		} else if (title.equals("AUG A3")) {
			ex_damage.setText("70");
			ex_distance.setText("13");
			ex_firerate.setText("700");
			ex_accur_aim.setText("30");
			ex_accur_nonaim.setText("18");
			ex_bullet.setText("30");
			ex_supply.setText("120");
			ex_dampersec.setText("81.66");
			ex_guntype.setText("���ݼ���");
			ex_price.setText("-");
			ex_explain.setText("-");
			ex_hole.setText("ǥ���� ������, ������Ʈ ������, ���� �ҿ���");
			ex_rail.setText("�������� ����������, ���� ����������");
			ex_sight.setText("�̿��� 553 ���ذ�, ��ĭ ������ ���� ���ذ�, ��ĭ ������ ��� �� ���ذ�, Ʈ��۷� ����� ���ر�");

		} else if (title.equals("AUG A3 H Bar")) {
			ex_damage.setText("72");
			ex_distance.setText("13");
			ex_firerate.setText("560");
			ex_accur_aim.setText("31");
			ex_accur_nonaim.setText("17");
			ex_bullet.setText("50");
			ex_supply.setText("300");
			ex_dampersec.setText("67.2");
			ex_guntype.setText("�����");
			ex_price.setText("-");
			ex_explain.setText("�⺻������ �簢�밡 �޷��ִ�.");
			ex_hole.setText("ǥ���� ������, ������Ʈ ������, ���� �ҿ���");
			ex_rail.setText("�������� ����������, ���� ����������");
			ex_sight.setText("�̿��� 553 ���ذ�, ��ĭ ������ ���� ���ذ�, ��ĭ ������ ��� �� ���ذ�, Ʈ��۷� ����� ���ر�");

		} else if (title.equals("FN F2000")) {
			ex_damage.setText("68");
			ex_distance.setText("14");
			ex_firerate.setText("850");
			ex_accur_aim.setText("31");
			ex_accur_nonaim.setText("16");
			ex_bullet.setText("30");
			ex_supply.setText("120");
			ex_dampersec.setText("96.3");
			ex_guntype.setText("���ݼ���");
			ex_price.setText("-");
			ex_explain.setText("-");
			ex_hole.setText("ǥ���� ������, ������Ʈ ������, ���� �ҿ���");
			ex_rail.setText("�������� ����������, ���� ����������");
			ex_sight.setText("�̿��� 553 ���ذ�, ��ĭ ������ ���� ���ذ�, ��ĭ ������ ��� �� ���ذ�, Ʈ��۷� ����� ���ر�");

		} else if (title.equals("FN SCAR-H")) {
			ex_damage.setText("90");
			ex_distance.setText("16");
			ex_firerate.setText("620");
			ex_accur_aim.setText("31");
			ex_accur_nonaim.setText("18");
			ex_bullet.setText("20");
			ex_supply.setText("120");
			ex_dampersec.setText("93");
			ex_guntype.setText("���ݼ���");
			ex_price.setText("-");
			ex_explain.setText("-");
			ex_hole.setText("ǥ���� ������, ������Ʈ ������, ���� �ҿ���, ���� �Ѱ�");
			ex_rail.setText("�������� ����������, ���� ����������, ���� �����簢��, ��ź�߻��");
			ex_sight.setText("�̿��� 553 ���ذ�, ��ĭ ������ ���� ���ذ�, ��ĭ ������ ��� �� ���ذ�, Ʈ��۷� ����� ���ر�, Ʈ������ ��������������ذ�");

		} else if (title.equals("XM8 LMG")) {
			ex_damage.setText("74");
			ex_distance.setText("15");
			ex_firerate.setText("600");
			ex_accur_aim.setText("29");
			ex_accur_nonaim.setText("14");
			ex_bullet.setText("100");
			ex_supply.setText("300");
			ex_dampersec.setText("74");
			ex_guntype.setText("�����");
			ex_price.setText("-");
			ex_explain.setText("-");
			ex_hole.setText("ǥ���� ������, ������Ʈ ������, ���� �ҿ���");
			ex_rail.setText("�������� ����������, ���� ����������, ���� �����簢��, ��ź�߻��");
			ex_sight.setText("�̿��� 553 ���ذ�, ��ĭ ������ ���� ���ذ�, ��ĭ ������ ��� �� ���ذ�, Ʈ��۷� ����� ���ر�, Ʈ������ ��������������ذ�");

		} else if (title.equals("SIG 551(����)")) {
			ex_damage.setText("61");
			ex_distance.setText("12.3");
			ex_firerate.setText("670");
			ex_accur_aim.setText("30");
			ex_accur_nonaim.setText("19");
			ex_bullet.setText("30");
			ex_supply.setText("120");
			ex_dampersec.setText("68.11");
			ex_guntype.setText("���ݼ���");
			ex_price.setText("-");
			ex_explain.setText("���þƼ����� �������� ����");
			ex_hole.setText("ǥ���� ������, ������Ʈ ������, ���� �ҿ���, ���� �Ѱ�");
			ex_rail.setText("�������� ����������, ���� ����������, ���� �����簢��, ��ź�߻��");
			ex_sight.setText("�̿��� 553 ���ذ�, ��ĭ ������ ���� ���ذ�, ��ĭ ������ ��� �� ���ذ�, Ʈ��۷� ����� ���ر�, Ʈ������ ��������������ذ�");

		} else if (title.equals("Daewoo K3")) {
			ex_damage.setText("63");
			ex_distance.setText("11");
			ex_firerate.setText("666");
			ex_accur_aim.setText("30");
			ex_accur_nonaim.setText("16");
			ex_bullet.setText("50");
			ex_supply.setText("250");
			ex_dampersec.setText("69.93");
			ex_guntype.setText("�����");
			ex_price.setText("-");
			ex_explain.setText("-");
			ex_hole.setText("ǥ���� ������, ������Ʈ ������");
			ex_rail.setText("�������� ����������, ����� �簢��");
			ex_sight.setText("�̿��� 553 ���ذ�, ��ĭ ������ ���� ���ذ�");

		} else if (title.equals("AK-47")) {
			ex_damage.setText("84");
			ex_distance.setText("12.5");
			ex_firerate.setText("600");
			ex_accur_aim.setText("30");
			ex_accur_nonaim.setText("15");
			ex_bullet.setText("30");
			ex_supply.setText("120");
			ex_dampersec.setText("84");
			ex_guntype.setText("���ݼ���");
			ex_price.setText("-");
			ex_explain.setText("����� ���������� ����, ����� ������������. �̸��� AK47������ �𵨸��� AKM�̶�� �Ѵ�.");
			ex_hole.setText("ǥ���� ������, ������Ʈ ������, ���� �ҿ���, ���� �Ѱ�");
			ex_rail.setText("-");
			ex_sight.setText("-");

		} else if (title.equals("M4A1 ����(PC��)")) {
			ex_damage.setText("65");
			ex_distance.setText("13");
			ex_firerate.setText("700");
			ex_accur_aim.setText("31");
			ex_accur_nonaim.setText("20");
			ex_bullet.setText("30");
			ex_supply.setText("120");
			ex_dampersec.setText("75.83");
			ex_guntype.setText("���ݼ���");
			ex_price.setText("-");
			ex_explain.setText("-");
			ex_hole.setText("ǥ���� ������, ������Ʈ ������, ���� �ҿ���");
			ex_rail.setText("�������� ����������, ���� ����������");
			ex_sight.setText("�̿��� 553 ���ذ�, ��ĭ ������ ���� ���ذ�, ��ĭ ������ ��� �� ���ذ�, Ʈ��۷� ����� ���ر�");

		} else if (title.equals("FN SCAR-H(ũ���)")) {
			ex_damage.setText("90");
			ex_distance.setText("14");
			ex_firerate.setText("620");
			ex_accur_aim.setText("31");
			ex_accur_nonaim.setText("18");
			ex_bullet.setText("30");
			ex_supply.setText("120");
			ex_dampersec.setText("93");
			ex_guntype.setText("���ݼ���");
			ex_price.setText("1000ũ���");
			ex_explain.setText("-");
			ex_hole.setText("ǥ���� ������, ������Ʈ ������, ���� �ҿ���, ���� �Ѱ�");
			ex_rail.setText("�������� ����������, ���� ����������, ���� �����簢��, ��ź�߻��");
			ex_sight.setText("�̿��� 553 ���ذ�, ��ĭ ������ ���� ���ذ�, ��ĭ ������ ��� �� ���ذ�, Ʈ��۷� ����� ���ر�, Ʈ������ ��������������ذ�");

			/************************** �޵� *****************************/
		} else if (title.equals("Remington 870")) {
			ex_damage.setText("600");
			ex_distance.setText("4.5");
			ex_firerate.setText("80");
			ex_accur_aim.setText("71");
			ex_accur_nonaim.setText("53");
			ex_bullet.setText("8");
			ex_supply.setText("48");
			ex_dampersec.setText("80");
			ex_guntype.setText("�����׼�");
			ex_price.setText("-");
			ex_explain.setText("-");
			ex_hole.setText("ǥ���� ������");
			ex_rail.setText("-");
			ex_sight.setText("�̿��� 553 ���ذ�");

		} else if (title.equals("SPAS-12")) {
			ex_damage.setText("650");
			ex_distance.setText("5.3");
			ex_firerate.setText("59");
			ex_accur_aim.setText("73");
			ex_accur_nonaim.setText("57");
			ex_bullet.setText("8");
			ex_supply.setText("48");
			ex_dampersec.setText("63.91");
			ex_guntype.setText("�����׼�");
			ex_price.setText("2340");
			ex_explain.setText("-");
			ex_hole.setText("ǥ���� ������, ��ź�� ������");
			ex_rail.setText("-");
			ex_sight.setText("�̿��� 553 ���ذ�, ���� ���� M4S");

		} else if (title.equals("Remington 870CB")) {
			ex_damage.setText("640");
			ex_distance.setText("5");
			ex_firerate.setText("89");
			ex_accur_aim.setText("72");
			ex_accur_nonaim.setText("56");
			ex_bullet.setText("8");
			ex_supply.setText("48");
			ex_dampersec.setText("94.99");
			ex_guntype.setText("�����׼�");
			ex_price.setText("2730");
			ex_explain.setText("-");
			ex_hole.setText("ǥ���� ������, ��ź�� ������");
			ex_rail.setText("-");
			ex_sight.setText("�̿��� 553 ���ذ�, ���� ���� M4S");

		} else if (title.equals("MC 255 12")) {
			ex_damage.setText("650");
			ex_distance.setText("3.2");
			ex_firerate.setText("130");
			ex_accur_aim.setText("70");
			ex_accur_nonaim.setText("51");
			ex_bullet.setText("5");
			ex_supply.setText("40");
			ex_dampersec.setText("140.83");
			ex_guntype.setText("�ڵ�����");
			ex_price.setText("2730");
			ex_explain.setText("-");
			ex_hole.setText("ǥ���� ������, ��ź�� ������");
			ex_rail.setText("-");
			ex_sight.setText("�̿��� 553 ���ذ�, ���� ���� M4S");

		} else if (title.equals("Hawk Pump")) {
			ex_damage.setText("630");
			ex_distance.setText("5.2");
			ex_firerate.setText("80");
			ex_accur_aim.setText("74");
			ex_accur_nonaim.setText("60");
			ex_bullet.setText("12");
			ex_supply.setText("60");
			ex_dampersec.setText("84");
			ex_guntype.setText("�����׼�");
			ex_price.setText("4390");
			ex_explain.setText("-");
			ex_hole.setText("ǥ���� ������, ��ź�� ������, ��ź�� �ҿ���, ��ź�� �Ѱ�");
			ex_rail.setText("-");
			ex_sight.setText("�̿��� 553 ���ذ�, ���� ���� M4S, �������� ���ر�, Ʈ��۷� ����� ���ر�");

		} else if (title.equals("Saiga-12")) {
			ex_damage.setText("544");
			ex_distance.setText("4.3");
			ex_firerate.setText("180");
			ex_accur_aim.setText("68");
			ex_accur_nonaim.setText("48");
			ex_bullet.setText("8");
			ex_supply.setText("56");
			ex_dampersec.setText("163.2");
			ex_guntype.setText("���ڵ�����");
			ex_price.setText("-");
			ex_explain.setText("-");
			ex_hole.setText("ǥ���� ������, ��ź�� ������, ��ź�� �ҿ���");
			ex_rail.setText("-");
			ex_sight.setText("�̿��� 553 ���ذ�, ���� ���� M4S, �������� ���ر�, Ʈ��۷� ����� ���ر�");

		} else if (title.equals("Super Benelli M4 90")) {
			ex_damage.setText("536");
			ex_distance.setText("5.6");
			ex_firerate.setText("225");
			ex_accur_aim.setText("72");
			ex_accur_nonaim.setText("56");
			ex_bullet.setText("6");
			ex_supply.setText("40");
			ex_dampersec.setText("201");
			ex_guntype.setText("���ڵ�����");
			ex_price.setText("4390");
			ex_explain.setText("-");
			ex_hole.setText("ǥ���� ������, ��ź�� ������, ��ź�� �ҿ���");
			ex_rail.setText("-");
			ex_sight.setText("�̿��� 553 ���ذ�, ���� ���� M4S, �������� ���ر�, Ʈ��۷� ����� ���ر�");

		} else if (title.equals("Benelli Nova Tactical")) {
			ex_damage.setText("682");
			ex_distance.setText("5.6");
			ex_firerate.setText("89");
			ex_accur_aim.setText("73");
			ex_accur_nonaim.setText("58");
			ex_bullet.setText("5");
			ex_supply.setText("40");
			ex_dampersec.setText("101.16");
			ex_guntype.setText("�����׼�");
			ex_price.setText("4390");
			ex_explain.setText("-");
			ex_hole.setText("ǥ���� ������, ��ź�� ������, ��ź�� �ҿ���");
			ex_rail.setText("-");
			ex_sight.setText("�̿��� 553 ���ذ�, ���� ���� M4S, �������� ���ر�, Ʈ��۷� ����� ���ر�");

		} else if (title.equals("VEPR-12")) {
			ex_damage.setText("544");
			ex_distance.setText("3.2");
			ex_firerate.setText("300");
			ex_accur_aim.setText("62");
			ex_accur_nonaim.setText("36");
			ex_bullet.setText("8");
			ex_supply.setText("56");
			ex_dampersec.setText("272");
			ex_guntype.setText("�ڵ�����");
			ex_price.setText("8580");
			ex_explain.setText("-");
			ex_hole.setText("ǥ���� ������, ��ź�� ������, ��ź�� �ҿ���, ��ź�� �Ѱ�");
			ex_rail.setText("-");
			ex_sight.setText("�̿��� 553 ���ذ�, ���� ���� M4S, �������� ���ر�, Ʈ��۷� ����� ���ر�");

		} else if (title.equals("Cobray Striker")) {
			ex_damage.setText("540");
			ex_distance.setText("4");
			ex_firerate.setText("240");
			ex_accur_aim.setText("68");
			ex_accur_nonaim.setText("47");
			ex_bullet.setText("12");
			ex_supply.setText("40");
			ex_dampersec.setText("216");
			ex_guntype.setText("���ڵ�����");
			ex_price.setText("-");
			ex_explain.setText("-");
			ex_hole.setText("ǥ���� ������, ��ź�� ������, ��ź�� �ҿ���");
			ex_rail.setText("-");
			ex_sight.setText("�̿��� 553 ���ذ�, ���� ���� M4S, �������� ���ر�, Ʈ��۷� ����� ���ر�");

		} else if (title.equals("JackHammer")) {
			ex_damage.setText("520");
			ex_distance.setText("4");
			ex_firerate.setText("240");
			ex_accur_aim.setText("67");
			ex_accur_nonaim.setText("45");
			ex_bullet.setText("10");
			ex_supply.setText("50");
			ex_dampersec.setText("208");
			ex_guntype.setText("�ڵ�����");
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
			ex_guntype.setText("�����׼�");
			ex_price.setText("-");
			ex_explain.setText("-");
			ex_hole.setText("ǥ���� ������, ��ź�� ������, ��ź�� �ҿ���");
			ex_rail.setText("-");
			ex_sight.setText("�̿��� 553 ���ذ�, ���� ���� M4S, �������� ���ر�, Ʈ��۷� ����� ���ر�");

		} else if (title.equals("Saiga Bullpup")) {
			ex_damage.setText("660");
			ex_distance.setText("6.5");
			ex_firerate.setText("300");
			ex_accur_aim.setText("69");
			ex_accur_nonaim.setText("49");
			ex_bullet.setText("8");
			ex_supply.setText("48");
			ex_dampersec.setText("330");
			ex_guntype.setText("���ڵ�����");
			ex_price.setText("-");
			ex_explain.setText("-");
			ex_hole.setText("ǥ���� ������, ��ź�� ������, ��ź�� �ҿ���, ��ź�� �Ѱ�");
			ex_rail.setText("-");
			ex_sight.setText("�̿��� 553 ���ذ�, ���� ���� M4S, �������� ���ر�, Ʈ��۷� ����� ���ر�");

		} else if (title.equals("Remington 870 ����(PC��)")) {
			ex_damage.setText("600");
			ex_distance.setText("5");
			ex_firerate.setText("90");
			ex_accur_aim.setText("71");
			ex_accur_nonaim.setText("53");
			ex_bullet.setText("8");
			ex_supply.setText("48");
			ex_dampersec.setText("90");
			ex_guntype.setText("�����׼�");
			ex_price.setText("-");
			ex_explain.setText("-");
			ex_hole.setText("ǥ���� ������, ��ź�� ������");
			ex_rail.setText("-");
			ex_sight.setText("�̿��� 553 ���ذ�, ���� ���� M4S");

		} else if (title.equals("Saiga Bullpup(ũ���)")) {
			ex_damage.setText("660");
			ex_distance.setText("7.5");
			ex_firerate.setText("300");
			ex_accur_aim.setText("69");
			ex_accur_nonaim.setText("49");
			ex_bullet.setText("10");
			ex_supply.setText("40");
			ex_dampersec.setText("330");
			ex_guntype.setText("���ڵ�����");
			ex_price.setText("1000ũ���");
			ex_explain.setText("-");
			ex_hole.setText("ǥ���� ������, ��ź�� ������, ��ź�� �ҿ���, ��ź�� �Ѱ�");
			ex_rail.setText("-");
			ex_sight.setText("�̿��� 553 ���ذ�, ���� ���� M4S, �������� ���ر�, Ʈ��۷� ����� ���ر�");
		}

		/************************** �����Ͼ� *****************************/

		else if (title.equals("H&K MP5")) {
			ex_damage.setText("50");
			ex_distance.setText("8");
			ex_firerate.setText("800");
			ex_accur_aim.setText("30");
			ex_accur_nonaim.setText("21");
			ex_bullet.setText("30");
			ex_supply.setText("180");
			ex_dampersec.setText("66.66");
			ex_guntype.setText("�������");
			ex_price.setText("-");
			ex_explain.setText("-");
			ex_hole.setText("ǥ���� ������");
			ex_rail.setText("-");
			ex_sight.setText("�̿��� 553 ���ذ�");
		} else if (title.equals("M4 CQB")) {
			ex_damage.setText("55");
			ex_distance.setText("8");
			ex_firerate.setText("840");
			ex_accur_aim.setText("27");
			ex_accur_nonaim.setText("20");
			ex_bullet.setText("30");
			ex_supply.setText("180");
			ex_dampersec.setText("77");
			ex_guntype.setText("�������");
			ex_price.setText("2340");
			ex_explain.setText("-");
			ex_hole.setText("ǥ���� ������, ������� ������");
			ex_rail.setText("�������� ����������");
			ex_sight.setText("�̿��� 553 ���ذ�, ������ ��ũ4 CQ/T");

		} else if (title.equals("H&K G36C")) {
			ex_damage.setText("57");
			ex_distance.setText("8.3");
			ex_firerate.setText("750");
			ex_accur_aim.setText("30");
			ex_accur_nonaim.setText("21");
			ex_bullet.setText("30");
			ex_supply.setText("180");
			ex_dampersec.setText("71.25");
			ex_guntype.setText("�������");
			ex_price.setText("2730");
			ex_explain.setText("-");
			ex_hole.setText("ǥ���� ������, ������� ������");
			ex_rail.setText("�������� ����������");
			ex_sight.setText("�̿��� 553 ���ذ�, ������ ��ũ4 CQ/T");

		} else if (title.equals("Daewoo K1")) {
			ex_damage.setText("60");
			ex_distance.setText("8.5");
			ex_firerate.setText("670");
			ex_accur_aim.setText("30");
			ex_accur_nonaim.setText("21");
			ex_bullet.setText("30");
			ex_supply.setText("180");
			ex_dampersec.setText("67");
			ex_guntype.setText("�������");
			ex_price.setText("2730");
			ex_explain.setText("-");
			ex_hole.setText("ǥ���� ������, ������� ������");
			ex_rail.setText("-");
			ex_sight.setText("�̿��� 553 ���ذ�, ������ ��ũ4 CQ/T");

		} else if (title.equals("AUG A3 9mm XS")) {
			ex_damage.setText("62");
			ex_distance.setText("9.5");
			ex_firerate.setText("830");
			ex_accur_aim.setText("31");
			ex_accur_nonaim.setText("21");
			ex_bullet.setText("30");
			ex_supply.setText("180");
			ex_dampersec.setText("85.76");
			ex_guntype.setText("�������");
			ex_price.setText("4390");
			ex_explain.setText("-");
			ex_hole.setText("ǥ���� ������, ������� ������, ������� �ҿ���");
			ex_rail.setText("�������� ����������, ������� ����������");
			ex_sight.setText("�̿��� 553 ���ذ�, ������ ��ũ4 CQ/T. CQB �������ذ�, Ʈ��۷� ����� ���ر�");

		} else if (title.equals("H&K MP7")) {
			ex_damage.setText("60");
			ex_distance.setText("9.5");
			ex_firerate.setText("860");
			ex_accur_aim.setText("26");
			ex_accur_nonaim.setText("21");
			ex_bullet.setText("30");
			ex_supply.setText("180");
			ex_dampersec.setText("86");
			ex_guntype.setText("�������");
			ex_price.setText("4390");
			ex_explain.setText("�⺻���� ���������̰� �޷��־ �����̸� �޼�����. ������ �������� �ʹ�.");
			ex_hole.setText("ǥ���� ������, ������� ������, ������� �ҿ���");
			ex_rail.setText("-");
			ex_sight.setText("�̿��� 553 ���ذ�, ������ ��ũ4 CQ/T. CQB �������ذ�, Ʈ��۷� ����� ���ر�");

		} else if (title.equals("AK9")) {
			ex_damage.setText("70");
			ex_distance.setText("11");
			ex_firerate.setText("720");
			ex_accur_aim.setText("31");
			ex_accur_nonaim.setText("18");
			ex_bullet.setText("20");
			ex_supply.setText("180");
			ex_dampersec.setText("84");
			ex_guntype.setText("�������");
			ex_price.setText("4390");
			ex_explain.setText("-");
			ex_hole.setText("ǥ���� ������, ������� ������, ������� �ҿ���");
			ex_rail.setText("�������� ����������, ������� ����������");
			ex_sight.setText("�̿��� 553 ���ذ�, ������ ��ũ4 CQ/T. CQB �������ذ�, Ʈ��۷� ����� ���ر�");

		} else if (title.equals("Mini Uzi")) {
			ex_damage.setText("61");
			ex_distance.setText("6.5");
			ex_firerate.setText("1000");
			ex_accur_aim.setText("29");
			ex_accur_nonaim.setText("17");
			ex_bullet.setText("30");
			ex_supply.setText("180");
			ex_dampersec.setText("101.66");
			ex_guntype.setText("�������");
			ex_price.setText("7800");
			ex_explain.setText("-");
			ex_hole.setText("ǥ���� ������, ������� ������, ������� �ҿ���. ������� �Ѱ�");
			ex_rail.setText("�������� ����������, ������� ����������, �������� �����簢��");
			ex_sight.setText("�̿��� 553 ���ذ�, ������ ��ũ4 CQ/T. CQB �������ذ�, Ʈ��۷� ����� ���ر�, ���� 3�� ���� ���ذ�");

		} else if (title.equals("Kriss Super V")) {
			ex_damage.setText("65");
			ex_distance.setText("11");
			ex_firerate.setText("820");
			ex_accur_aim.setText("31");
			ex_accur_nonaim.setText("19");
			ex_bullet.setText("30");
			ex_supply.setText("180");
			ex_dampersec.setText("88.83");
			ex_guntype.setText("�������");
			ex_price.setText("7800");
			ex_explain.setText("��Ÿ��� 11������ �������� �������� ���� ��Ÿ��� ª��.");
			ex_hole.setText("ǥ���� ������, ������� ������, ������� �ҿ���. ������� �Ѱ�");
			ex_rail.setText("�������� ����������, ������� ����������, �������� �����簢��");
			ex_sight.setText("�̿��� 553 ���ذ�, ������ ��ũ4 CQ/T. CQB �������ذ�, Ʈ��۷� ����� ���ر�, ���� 3�� ���� ���ذ�");

		} else if (title.equals("SIG 552")) {
			ex_damage.setText("63");
			ex_distance.setText("9");
			ex_firerate.setText("750");
			ex_accur_aim.setText("31");
			ex_accur_nonaim.setText("21");
			ex_bullet.setText("30");
			ex_supply.setText("180");
			ex_dampersec.setText("78.75");
			ex_guntype.setText("�������");
			ex_price.setText("-");
			ex_explain.setText("-");
			ex_hole.setText("ǥ���� ������, ������� ������, ������� �ҿ���. ������� �Ѱ�");
			ex_rail.setText("�������� ����������, ������� ����������");
			ex_sight.setText("�̿��� 553 ���ذ�, ������ ��ũ4 CQ/T. CQB �������ذ�, Ʈ��۷� ����� ���ر�");

		} else if (title.equals("Calico M960A")) {
			ex_damage.setText("60");
			ex_distance.setText("9");
			ex_firerate.setText("900");
			ex_accur_aim.setText("31");
			ex_accur_nonaim.setText("18");
			ex_bullet.setText("50");
			ex_supply.setText("200");
			ex_dampersec.setText("90");
			ex_guntype.setText("�������");
			ex_price.setText("-");
			ex_explain.setText("-");
			ex_hole.setText("ǥ���� ������, ������� ������, ������� �ҿ���. ������� �Ѱ�");
			ex_rail.setText("�������� ����������, ������� ����������");
			ex_sight.setText("�̿��� 553 ���ذ�, ������ ��ũ4 CQ/T. CQB �������ذ�, Ʈ��۷� ����� ���ر�");

		} else if (title.equals("FN P90")) {
			ex_damage.setText("60");
			ex_distance.setText("8.5");
			ex_firerate.setText("750");
			ex_accur_aim.setText("31");
			ex_accur_nonaim.setText("20");
			ex_bullet.setText("50");
			ex_supply.setText("200");
			ex_dampersec.setText("75");
			ex_guntype.setText("�������");
			ex_price.setText("-");
			ex_explain.setText("-");
			ex_hole.setText("ǥ���� ������, ������� ������, ������� �ҿ���");
			ex_rail.setText("-");
			ex_sight.setText("�̿��� 553 ���ذ�, ������ ��ũ4 CQ/T. CQB �������ذ�, Ʈ��۷� ����� ���ر�");

		} else if (title.equals("Tavor CTAR-21")) {
			ex_damage.setText("75");
			ex_distance.setText("11");
			ex_firerate.setText("840");
			ex_accur_aim.setText("31");
			ex_accur_nonaim.setText("21");
			ex_bullet.setText("31");
			ex_supply.setText("180");
			ex_dampersec.setText("105");
			ex_guntype.setText("�������");
			ex_price.setText("-");
			ex_explain.setText("Ÿ����� Ŭ����� ���޵�.");
			ex_hole.setText("ǥ���� ������, ������� ������, ������� �ҿ���. ������� �Ѱ�");
			ex_rail.setText("�������� ����������, ������� ����������, �������� �����簢��");
			ex_sight.setText("�̿��� 553 ���ذ�, ������ ��ũ4 CQ/T. CQB �������ذ�, Ʈ��۷� ����� ���ر�, ���� 3�� ���� ���ذ�");

		} else if (title.equals("XM8 Compact")) {
			ex_damage.setText("78");
			ex_distance.setText("12");
			ex_firerate.setText("780");
			ex_accur_aim.setText("31");
			ex_accur_nonaim.setText("19");
			ex_bullet.setText("30");
			ex_supply.setText("180");
			ex_dampersec.setText("101.4");
			ex_guntype.setText("�������");
			ex_price.setText("-");
			ex_explain.setText("-");
			ex_hole.setText("ǥ���� ������, ������� ������, ������� �ҿ���. ������� �Ѱ�");
			ex_rail.setText("�������� ����������, ������� ����������, �������� �����簢��");
			ex_sight.setText("�̿��� 553 ���ذ�, ������ ��ũ4 CQ/T, CQB �������ذ�, Ʈ��۷� ����� ���ر�, ���� 3�� ���� ���ذ�");

		} else if (title.equals("M4 CQB ����(PC��)")) {
			ex_damage.setText("65");
			ex_distance.setText("10");
			ex_firerate.setText("840");
			ex_accur_aim.setText("29");
			ex_accur_nonaim.setText("23");
			ex_bullet.setText("30");
			ex_supply.setText("120");
			ex_dampersec.setText("91");
			ex_guntype.setText("�������");
			ex_price.setText("-");
			ex_explain.setText("-");
			ex_hole.setText("ǥ���� ������, ������� ������");
			ex_rail.setText("�������� ����������");
			ex_sight.setText("�̿��� 553 ���ذ�, ������ ��ũ4 CQ/T");

		} else if (title.equals("Tavor CTAR-21(ũ���)")) {
			ex_damage.setText("80");
			ex_distance.setText("13");
			ex_firerate.setText("840");
			ex_accur_aim.setText("31");
			ex_accur_nonaim.setText("21");
			ex_bullet.setText("30");
			ex_supply.setText("180");
			ex_dampersec.setText("112");
			ex_guntype.setText("�������");
			ex_price.setText("1000ũ���");
			ex_explain.setText("-");
			ex_hole.setText("ǥ���� ������, ������� ������, ������� �ҿ���. ������� �Ѱ�");
			ex_rail.setText("�������� ����������, ������� ����������, �������� �����簢��");
			ex_sight.setText("�̿��� 553 ���ذ�, ������ ��ũ4 CQ/T. CQB �������ذ�, Ʈ��۷� ����� ���ر�, ���� 3�� ���� ���ذ�");

		}
		/**************************** �������� **********************************/
		else if (title.equals("Dragunov SR")) {
			ex_damage.setText("135");
			ex_distance.setText("60");
			ex_firerate.setText("370");
			ex_accur_aim.setText("104");
			ex_accur_nonaim.setText("55");
			ex_bullet.setText("10");
			ex_supply.setText("50");
			ex_dampersec.setText("83.25");
			ex_guntype.setText("���ڵ�������");
			ex_price.setText("-");
			ex_explain.setText("-");
			ex_hole.setText("ǥ���� ������");
			ex_rail.setText("-");
			ex_sight.setText("ǥ�� 5.5����");

		} else if (title.equals("M16A2 Custom SPR")) {
			ex_damage.setText("155");
			ex_distance.setText("65");
			ex_firerate.setText("370");
			ex_accur_aim.setText("104");
			ex_accur_nonaim.setText("55");
			ex_bullet.setText("10");
			ex_supply.setText("50");
			ex_dampersec.setText("95.58");
			ex_guntype.setText("���ڵ�������");
			ex_price.setText("2340");
			ex_explain.setText("-");
			ex_hole.setText("-");
			ex_rail.setText("������ �簢��");
			ex_sight.setText("ǥ�� 5.5����, �߰Ÿ� 4.5����");

		} else if (title.equals("H&K SL8")) {
			ex_damage.setText("180");
			ex_distance.setText("65");
			ex_firerate.setText("350");
			ex_accur_aim.setText("104");
			ex_accur_nonaim.setText("55");
			ex_bullet.setText("10");
			ex_supply.setText("50");
			ex_dampersec.setText("105");
			ex_guntype.setText("���ڵ�������");
			ex_price.setText("2730");
			ex_explain.setText("-");
			ex_hole.setText("-");
			ex_rail.setText("������ �簢��");
			ex_sight.setText("ǥ�� 5.5����, �߰Ÿ� 4.5����");

		} else if (title.equals("XM8 Sharpshooter")) {
			ex_damage.setText("150");
			ex_distance.setText("60");
			ex_firerate.setText("400");
			ex_accur_aim.setText("104");
			ex_accur_nonaim.setText("55");
			ex_bullet.setText("10");
			ex_supply.setText("50");
			ex_dampersec.setText("100");
			ex_guntype.setText("���ڵ�������");
			ex_price.setText("2730");
			ex_explain.setText("-");
			ex_hole.setText("-");
			ex_rail.setText("������ �簢��");
			ex_sight.setText("ǥ�� 5.5����, �߰Ÿ� 4.5����");

		} else if (title.equals("ACR SPR")) {
			ex_damage.setText("190");
			ex_distance.setText("60");
			ex_firerate.setText("300");
			ex_accur_aim.setText("104");
			ex_accur_nonaim.setText("55");
			ex_bullet.setText("20");
			ex_supply.setText("60");
			ex_dampersec.setText("95");
			ex_guntype.setText("���ڵ����ݼ���");
			ex_price.setText("4390");
			ex_explain.setText("-");
			ex_hole.setText("������ �ҿ���");
			ex_rail.setText("������ �簢��");
			ex_sight.setText("ǥ�� 5.5����, �߰Ÿ� 4.5����");

		} else if (title.equals("SIG 550")) {
			ex_damage.setText("170");
			ex_distance.setText("65");
			ex_firerate.setText("370");
			ex_accur_aim.setText("104");
			ex_accur_nonaim.setText("55");
			ex_bullet.setText("20");
			ex_supply.setText("60");
			ex_dampersec.setText("104.83");
			ex_guntype.setText("���ڵ�������");
			ex_price.setText("4875");
			ex_explain.setText("-");
			ex_hole.setText("������ �ҿ���");
			ex_rail.setText("������ �簢��");
			ex_sight.setText("ǥ�� 5.5����, �߰Ÿ� 4.5����");

		} else if (title.equals("Alpine")) {
			ex_damage.setText("320");
			ex_distance.setText("70");
			ex_firerate.setText("39");
			ex_accur_aim.setText("104");
			ex_accur_nonaim.setText("55");
			ex_bullet.setText("5");
			ex_supply.setText("25");
			ex_dampersec.setText("20.8");
			ex_guntype.setText("��Ʈ�׼�");
			ex_price.setText("7800");
			ex_explain.setText("-");
			ex_hole.setText("������ �ҿ���");
			ex_rail.setText("������ �簢��, �ݵ����� �簢��");
			ex_sight.setText("ǥ�� 5.5����, �߰Ÿ� 4.5����, �ܰŸ� 4����, ���� �߰Ÿ� 5����");

		} else if (title.equals("Walther WA 2000")) {
			ex_damage.setText("250");
			ex_distance.setText("70");
			ex_firerate.setText("150");
			ex_accur_aim.setText("104");
			ex_accur_nonaim.setText("55");
			ex_bullet.setText("20");
			ex_supply.setText("60");
			ex_dampersec.setText("62.5");
			ex_guntype.setText("���ڵ�������");
			ex_price.setText("4390");
			ex_explain.setText("ũ����� ������ ���ڵ������� �������� ���� ����.");
			ex_hole.setText("������ �ҿ���, ������ ������");
			ex_rail.setText("������ �簢��, �ݵ����� �簢��");
			ex_sight.setText("ǥ�� 5.5����, �߰Ÿ� 4.5����, �ܰŸ� 4����, ���� �߰Ÿ� 5����");

		} else if (title.equals("Tavor STAR-21 Navy Blue")) {
			ex_damage.setText("180");
			ex_distance.setText("70");
			ex_firerate.setText("390");
			ex_accur_aim.setText("104");
			ex_accur_nonaim.setText("55");
			ex_bullet.setText("20");
			ex_supply.setText("60");
			ex_dampersec.setText("117");
			ex_guntype.setText("���ڵ�������");
			ex_price.setText("7800");
			ex_explain.setText("-");
			ex_hole.setText("ǥ���� ������, ������ �ҿ���, ������ ������");
			ex_rail.setText("������ �簢��, �ݵ����� �簢��");
			ex_sight.setText("ǥ�� 5.5����, �߰Ÿ� 4.5����, �ܰŸ� 4����, ���� �߰Ÿ� 5����");

		} else if (title.equals("AWM")) {
			ex_damage.setText("300");
			ex_distance.setText("70");
			ex_firerate.setText("42");
			ex_accur_aim.setText("104");
			ex_accur_nonaim.setText("51");
			ex_bullet.setText("5");
			ex_supply.setText("40");
			ex_dampersec.setText("21");
			ex_guntype.setText("��Ʈ�׼�");
			ex_price.setText("-");
			ex_explain.setText("-");
			ex_hole.setText("������ �ҿ���, ������ ������");
			ex_rail.setText("������ �簢��");
			ex_sight.setText("ǥ�� 5.5����, �߰Ÿ� 4.5����, �ܰŸ� 4����");

		} else if (title.equals("Cheytac M200")) {
			ex_damage.setText("340");
			ex_distance.setText("70");
			ex_firerate.setText("44");
			ex_accur_aim.setText("104");
			ex_accur_nonaim.setText("45");
			ex_bullet.setText("7");
			ex_supply.setText("35");
			ex_dampersec.setText("24.93");
			ex_guntype.setText("��Ʈ�׼�");
			ex_price.setText("-");
			ex_explain.setText("�����⸦ ���������� �Ҹ��� �ſ� ũ��. ���� �ܼӵ��� �ſ� ������.");
			ex_hole.setText("-");
			ex_rail.setText("-");
			ex_sight.setText("ǥ�� 5.5����, �߰Ÿ� 4.5����, �ܰŸ� 4����, ���� �߰Ÿ� 5����");

		} else if (title.equals("M14 EBR")) {
			ex_damage.setText("225");
			ex_distance.setText("70");
			ex_firerate.setText("380");
			ex_accur_aim.setText("104");
			ex_accur_nonaim.setText("55");
			ex_bullet.setText("20");
			ex_supply.setText("60");
			ex_dampersec.setText("142.5");
			ex_guntype.setText("���ڵ�������");
			ex_price.setText("-");
			ex_explain.setText("�Ҹ��� �ſ� ũ�� ������� ������. ó�� ������Ʈ ��� ������ ������ ���Ƽ� ��Ÿ������Ʈ ���� ������ �������ǿܷ� �������ִ� ����� ����");
			ex_hole.setText("������ �ҿ���, ������ ������");
			ex_rail.setText("������ �簢��, �ݵ����� �簢��");
			ex_sight.setText("ǥ�� 5.5����, �߰Ÿ� 4.5����, �ܰŸ� 4����, ���� �߰Ÿ� 5����");

		} else if (title.equals("VSS Vintorez")) {
			ex_damage.setText("200");
			ex_distance.setText("70");
			ex_firerate.setText("400");
			ex_accur_aim.setText("104");
			ex_accur_nonaim.setText("55");
			ex_bullet.setText("10");
			ex_supply.setText("50");
			ex_dampersec.setText("133.33");
			ex_guntype.setText("�ڵ�������");
			ex_price.setText("-");
			ex_explain.setText("��ü �����Ⱑ �ְ�, ������� ����.");
			ex_hole.setText("-");
			ex_rail.setText("������ �簢��, �ݵ����� �簢��");
			ex_sight.setText("ǥ�� 5.5����, �߰Ÿ� 4.5����, �ܰŸ� 4����");

		} else if (title.equals("Tavor STAR-21(����)")) {
			ex_damage.setText("190");
			ex_distance.setText("65");
			ex_firerate.setText("450");
			ex_accur_aim.setText("104");
			ex_accur_nonaim.setText("55");
			ex_bullet.setText("20");
			ex_supply.setText("60");
			ex_dampersec.setText("142.5");
			ex_guntype.setText("�ڵ�������");
			ex_price.setText("-");
			ex_explain.setText("���� �޵� �þ�Դ´ٴ� ������� ������. �뷱�� ������ ���þƿ����� ����������.");
			ex_hole.setText("������ �ҿ���, ������ ������");
			ex_rail.setText("������ �簢��, �ݵ����� �簢��");
			ex_sight.setText("ǥ�� 5.5����, �߰Ÿ� 4.5����, �ܰŸ� 4����, ���� �߰Ÿ� 5����");

		} else if (title.equals("QBU-88")) {
			ex_damage.setText("200");
			ex_distance.setText("70");
			ex_firerate.setText("270");
			ex_accur_aim.setText("104");
			ex_accur_nonaim.setText("38");
			ex_bullet.setText("10");
			ex_supply.setText("50");
			ex_dampersec.setText("90");
			ex_guntype.setText("���ڵ�������");
			ex_price.setText("-");
			ex_explain.setText("�߱��������� �����ϴ� ��.");
			ex_hole.setText("������ �ҿ���, ������ ������");
			ex_rail.setText("������ �簢��");
			ex_sight.setText("ǥ�� 5.5����, �߰Ÿ� 4.5����, �ܰŸ� 4����, ���� �߰Ÿ� 5����");

		} else if (title.equals("M16A2 Custom SPR ����(PC��)")) {
			ex_damage.setText("180");
			ex_distance.setText("65");
			ex_firerate.setText("370");
			ex_accur_aim.setText("104");
			ex_accur_nonaim.setText("55");
			ex_bullet.setText("10");
			ex_supply.setText("50");
			ex_dampersec.setText("111");
			ex_guntype.setText("���ڵ�������");
			ex_price.setText("-");
			ex_explain.setText("-");
			ex_hole.setText("������ �ҿ���");
			ex_rail.setText("������ �簢��");
			ex_sight.setText("ǥ�� 5.5����, �߰Ÿ� 4.5����, �ܰŸ� 4����");

		} else if (title.equals("AS50(ũ���)")) {
			ex_damage.setText("350");
			ex_distance.setText("70");
			ex_firerate.setText("320");
			ex_accur_aim.setText("104");
			ex_accur_nonaim.setText("70");
			ex_bullet.setText("7");
			ex_supply.setText("350");
			ex_dampersec.setText("186.66");
			ex_guntype.setText("���ڵ�������");
			ex_price.setText("1000ũ���");
			ex_explain.setText("-");
			ex_hole.setText("-");
			ex_rail.setText("������ �簢��, �ݵ����� �簢��");
			ex_sight.setText("ǥ�� 5.5����, �߰Ÿ� 4.5����, �ܰŸ� 4����, ���� �߰Ÿ� 5����");

		}
		/****************************** ���� *********************************/
		else if (title.equals("Browning High Power")) {
			ex_damage.setText("55");
			ex_distance.setText("8.5");
			ex_firerate.setText("435");
			ex_accur_aim.setText("13");
			ex_accur_nonaim.setText("8");
			ex_bullet.setText("15");
			ex_supply.setText("63");
			ex_dampersec.setText("39.87");
			ex_guntype.setText("���ڵ�����");
			ex_price.setText("-");
			ex_explain.setText("-");
			ex_hole.setText("ǥ���� ������");
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
			ex_guntype.setText("���ڵ�����");
			ex_price.setText("975");
			ex_explain.setText("-");
			ex_hole.setText("ǥ���� ������, Ŀ���� ���Ѽ�����");
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
			ex_guntype.setText("���ڵ�����");
			ex_price.setText("1950");
			ex_explain.setText("���þƿ����� ��͵�޿� ����");
			ex_hole.setText("ǥ���� ������");
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
			ex_guntype.setText("���ڵ�����");
			ex_price.setText("1950");
			ex_explain.setText("-");
			ex_hole.setText("ǥ���� ������, Ŀ���� ���Ѽ�����");
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
			ex_guntype.setText("����������");
			ex_price.setText("5850");
			ex_explain.setText("-");
			ex_hole.setText("-");
			ex_rail.setText("-");
			ex_sight.setText("�̿��� 553 ���ر�, Ʈ��۷� ����� ���ر�, ���� ���ذ� 1.5X");

		} else if (title.equals("H&K USP")) {
			ex_damage.setText("60");
			ex_distance.setText("10");
			ex_firerate.setText("450");
			ex_accur_aim.setText("13");
			ex_accur_nonaim.setText("9");
			ex_bullet.setText("13");
			ex_supply.setText("65");
			ex_dampersec.setText("45");
			ex_guntype.setText("���ڵ�����");
			ex_price.setText("-");
			ex_explain.setText("-");
			ex_hole.setText("ǥ���� ������, Ŀ���� ���� ������, ���� �ҿ���, ���� �Ѱ�");
			ex_rail.setText("-");
			ex_sight.setText("�̿��� 553 ���ر�, Ʈ��۷� ����� ���ر�, ���� ���ذ� 1.5X");

		} else if (title.equals("Desert Eagle")) {
			ex_damage.setText("113");
			ex_distance.setText("10");
			ex_firerate.setText("410");
			ex_accur_aim.setText("15");
			ex_accur_nonaim.setText("6");
			ex_bullet.setText("7");
			ex_supply.setText("56");
			ex_dampersec.setText("77.21");
			ex_guntype.setText("���ڵ�����");
			ex_price.setText("-");
			ex_explain.setText("-");
			ex_hole.setText("ǥ���� ������, Ŀ���� ���� ������, ���� �ҿ���, ���� �Ѱ�");
			ex_rail.setText("-");
			ex_sight.setText("�̿��� 553 ���ر�, Ʈ��۷� ����� ���ر�, ���� ���ذ� 1.5X");

		} else if (title.equals("Glock 18C")) {
			ex_damage.setText("45");
			ex_distance.setText("9");
			ex_firerate.setText("700");
			ex_accur_aim.setText("11");
			ex_accur_nonaim.setText("5");
			ex_bullet.setText("33");
			ex_supply.setText("99");
			ex_dampersec.setText("52.5");
			ex_guntype.setText("�ڵ�����");
			ex_price.setText("-");
			ex_explain.setText("����ü�� �������� ���� �������۰� �۷ϸ� ��� �����ϱ⵵ �Ѵ�. ȣ����");
			ex_hole.setText("Ŀ���� ���� ������");
			ex_rail.setText("-");
			ex_sight.setText("-");

		} else if (title.equals("�հ��� ����")) {
			ex_damage.setText("135");
			ex_distance.setText("11");
			ex_firerate.setText("410");
			ex_accur_aim.setText("14");
			ex_accur_nonaim.setText("6");
			ex_bullet.setText("7");
			ex_supply.setText("56");
			ex_dampersec.setText("92.25");
			ex_guntype.setText("���ڵ�����");
			ex_price.setText("-");
			ex_explain.setText("2013 �߼��̺�Ʈ, 2014 �����̺�Ʈ ��� ����, ���ؽÿ� �հ������� ���� �׷� �����Ѵ�.");
			ex_hole.setText("-");
			ex_rail.setText("-");
			ex_sight.setText("-");

		} else if (title.equals("Beretta M9 ����(PC��)")) {
			ex_damage.setText("70");
			ex_distance.setText("12");
			ex_firerate.setText("425");
			ex_accur_aim.setText("15");
			ex_accur_nonaim.setText("9");
			ex_bullet.setText("15");
			ex_supply.setText("65");
			ex_dampersec.setText("49.58");
			ex_guntype.setText("���ڵ�����");
			ex_price.setText("-");
			ex_explain.setText("-");
			ex_hole.setText("ǥ���� ������, Ŀ���� ���� ������, ���� �Ѱ�");
			ex_rail.setText("-");
			ex_sight.setText("-");

		} else if (title.equals("Desert Eagle(ũ���)")) {
			ex_damage.setText("140");
			ex_distance.setText("12");
			ex_firerate.setText("410");
			ex_accur_aim.setText("15");
			ex_accur_nonaim.setText("9");
			ex_bullet.setText("9");
			ex_supply.setText("54");
			ex_dampersec.setText("95.66");
			ex_guntype.setText("���ڵ�����");
			ex_price.setText("600ũ���");
			ex_explain.setText("-");
			ex_hole.setText("ǥ���� ������, Ŀ���� ���� ������, ���� �ҿ���, ���� �Ѱ�");
			ex_rail.setText("-");
			ex_sight.setText("�̿��� 553 ���ر�, Ʈ��۷� ����� ���ر�, ���� ���ذ� 1.5X");

			/******************************* �������� ******************************/
		} else if (title.equals("�⺻���")) {
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
			ex_explain.setText("���ǿ��� �� Į�� � �� �η��� ��ó�� ��� ����� �뵵�̴�.");
			ex_hole.setText("-");
			ex_rail.setText("-");
			ex_sight.setText("-");
		} else if (title.equals("��Ʈ�󸶸�")) {
			ex_damage.setText("-");
			ex_distance.setText("����");
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
			ex_distance.setText("����");
			ex_firerate.setText("-");
			ex_accur_aim.setText("-");
			ex_accur_nonaim.setText("-");
			ex_bullet.setText("-");
			ex_supply.setText("-");
			ex_dampersec.setText("-");
			ex_guntype.setText("-");
			ex_price.setText("-");
			ex_explain.setText("���þƿ��� ĳ������������ ��õǾ���.");
			ex_hole.setText("-");
			ex_rail.setText("-");
			ex_sight.setText("-");
		} else if (title.equals("������")) {
			ex_damage.setText("-");
			ex_distance.setText("�ſ�����");
			ex_firerate.setText("����");
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
		} else if (title.equals("�� ȣũ")) {
			ex_damage.setText("-");
			ex_distance.setText("����");
			ex_firerate.setText("-");
			ex_accur_aim.setText("-");
			ex_accur_nonaim.setText("-");
			ex_bullet.setText("-");
			ex_supply.setText("-");
			ex_dampersec.setText("-");
			ex_guntype.setText("-");
			ex_price.setText("-");
			ex_explain.setText("���þƿ����� �̺�Ʈ���������θ� ����. �����δ� �����⵵ �Ѵ����� ���ӿ��� ���� �ȵ�.");
			ex_hole.setText("-");
			ex_rail.setText("-");
			ex_sight.setText("-");
		} else if (title.equals("����")) {
			ex_damage.setText("-");
			ex_distance.setText("����");
			ex_firerate.setText("����");
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
		} else if (title.equals("��帧 �۰�")) {
			ex_damage.setText("-");
			ex_distance.setText("�ſ�����");
			ex_firerate.setText("�ſ�����");
			ex_accur_aim.setText("-");
			ex_accur_nonaim.setText("-");
			ex_bullet.setText("-");
			ex_supply.setText("-");
			ex_dampersec.setText("-");
			ex_guntype.setText("-");
			ex_price.setText("-");
			ex_explain.setText("14.03�� PC�� �������� ����");
			ex_hole.setText("-");
			ex_rail.setText("-");
			ex_sight.setText("-");
		} else if (title.equals("��ġ")) {
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
			ex_explain.setText("14.04�� PC�� �������� ����");
			ex_hole.setText("-");
			ex_rail.setText("-");
			ex_sight.setText("-");
		} else if (title.equals("������ġ")) {
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
			ex_explain.setText("14.04.01 ������ �̺�Ʈ�� ����");
			ex_hole.setText("-");
			ex_rail.setText("-");
			ex_sight.setText("-");
			/************************ �̺�Ʈ ***********************************/

		} else if (title.equals("������Ų H&K G36K")) {
			ex_damage.setText("63");
			ex_distance.setText("12");
			ex_firerate.setText("650");
			ex_accur_aim.setText("30");
			ex_accur_nonaim.setText("20");
			ex_bullet.setText("30");
			ex_supply.setText("120");
			ex_dampersec.setText("68.25");
			ex_guntype.setText("���ݼ���");
			ex_price.setText("-");
			ex_explain.setText("-");
			ex_hole.setText("ǥ���� ������, ������Ʈ ������");
			ex_rail.setText("�������� ����������");
			ex_sight.setText("�̿��� 553 ���ذ�, ��ĭ ������ ���� ���ذ�");

		} else if (title.equals("�ܿ����嵵�� M4A1")) {
			ex_damage.setText("67");
			ex_distance.setText("14");
			ex_firerate.setText("680");
			ex_accur_aim.setText("30");
			ex_accur_nonaim.setText("21");
			ex_bullet.setText("30");
			ex_supply.setText("120");
			ex_dampersec.setText("75.93");
			ex_guntype.setText("���ݼ���");
			ex_price.setText("-");
			ex_explain.setText("-");
			ex_hole.setText("ǥ���� ������, ������Ʈ ������, ���� �ҿ���, ���� �Ѱ�");
			ex_rail.setText("�������� ����������, ���� ����������, ���� �����簢��, ��ź�߻��");
			ex_sight.setText("�������� M4S �ܿ����嵵��, Ʈ��۷� ����� ���ر� �ܿ����嵵�� (����ʿ���� ��밡��)");

		} else if (title.equals("ũ�������� ACR")) {
			ex_damage.setText("63");
			ex_distance.setText("11");
			ex_firerate.setText("700");
			ex_accur_aim.setText("31");
			ex_accur_nonaim.setText("18");
			ex_bullet.setText("30");
			ex_supply.setText("150");
			ex_dampersec.setText("73.5");
			ex_guntype.setText("���ݼ���");
			ex_price.setText("-");
			ex_explain.setText("-");
			ex_hole.setText("ǥ���� ������, ������Ʈ ������, ���� �ҿ���, ���� �Ѱ�");
			ex_rail.setText("�������� ����������, ���� ����������, ���� �����簢��, ��ź�߻��");
			ex_sight.setText("�̿��� 553 ���ذ�, ��ĭ ������ ���� ���ذ�, ��ĭ ������ ��� �� ���ذ�, Ʈ��۷� ����� ���ر�, Ʈ������ ��������������ذ�");

		} else if (title.equals("������Ų SPAS-12")) {
			ex_damage.setText("650");
			ex_distance.setText("5.3");
			ex_firerate.setText("59");
			ex_accur_aim.setText("73");
			ex_accur_nonaim.setText("57");
			ex_bullet.setText("8");
			ex_supply.setText("48");
			ex_dampersec.setText("63.91");
			ex_guntype.setText("�����׼�");
			ex_price.setText("-");
			ex_explain.setText("-");
			ex_hole.setText("ǥ���� ������, ��ź�� ������");
			ex_rail.setText("-");
			ex_sight.setText("�̿��� 553 ���ذ�, ���� ���� M4S");

		} else if (title.equals("�ܿ����嵵�� Saiga-12")) {
			ex_damage.setText("620");
			ex_distance.setText("7.2");
			ex_firerate.setText("210");
			ex_accur_aim.setText("71");
			ex_accur_nonaim.setText("48");
			ex_bullet.setText("8");
			ex_supply.setText("56");
			ex_dampersec.setText("217");
			ex_guntype.setText("���ڵ�����");
			ex_price.setText("-");
			ex_explain.setText("-");
			ex_hole.setText("ǥ���� ������, ��ź�� ������, ��ź�� �ҿ���");
			ex_rail.setText("-");
			ex_sight.setText("�������� M4S �ܿ����嵵��, Ʈ��۷� ����� ���ر� �ܿ����嵵�� (����ʿ���� ��밡��)");

		} else if (title.equals("ũ�������� SPAS-12")) {
			ex_damage.setText("650");
			ex_distance.setText("6.5");
			ex_firerate.setText("60");
			ex_accur_aim.setText("73");
			ex_accur_nonaim.setText("57");
			ex_bullet.setText("8");
			ex_supply.setText("56");
			ex_dampersec.setText("65");
			ex_guntype.setText("�����׼�");
			ex_price.setText("-");
			ex_explain.setText("-");
			ex_hole.setText("ǥ���� ������, ��ź�� ������, ��ź�� �ҿ���");
			ex_rail.setText("-");
			ex_sight.setText("�̿��� 553 ���ذ�, Ʈ��۷� ����� ���ر�, ���� ���� M4S, �������� ���ر�");

		} else if (title.equals("������Ų H&K G36C")) {
			ex_damage.setText("57");
			ex_distance.setText("8.3");
			ex_firerate.setText("750");
			ex_accur_aim.setText("30");
			ex_accur_nonaim.setText("21");
			ex_bullet.setText("30");
			ex_supply.setText("180");
			ex_dampersec.setText("71.25");
			ex_guntype.setText("�������");
			ex_price.setText("-");
			ex_explain.setText("-");
			ex_hole.setText("ǥ���� ������, ������� ������");
			ex_rail.setText("�������� ����������");
			ex_sight.setText("�̿��� 553 ���ذ�, ������ ��ũ4 CQ/T");

		} else if (title.equals("�ܿ����嵵�� H&K MP5")) {
			ex_damage.setText("62");
			ex_distance.setText("12");
			ex_firerate.setText("800");
			ex_accur_aim.setText("30");
			ex_accur_nonaim.setText("21");
			ex_bullet.setText("30");
			ex_supply.setText("180");
			ex_dampersec.setText("82.66");
			ex_guntype.setText("�������");
			ex_price.setText("-");
			ex_explain.setText("-");
			ex_hole.setText("ǥ���� ������, ������� ������, ������� �ҿ���");
			ex_rail.setText("�������� ����������, ������� ����������, �������� �����簢��");
			ex_sight.setText("�������� M4S �ܿ����嵵��, Ʈ��۷� ����� ���ر� �ܿ����嵵�� (����ʿ���� ��밡��)");

		} else if (title.equals("ũ�������� Kriss Super V")) {
			ex_damage.setText("65");
			ex_distance.setText("12");
			ex_firerate.setText("820");
			ex_accur_aim.setText("31");
			ex_accur_nonaim.setText("19");
			ex_bullet.setText("30");
			ex_supply.setText("210");
			ex_dampersec.setText("88.83");
			ex_guntype.setText("�������");
			ex_price.setText("-");
			ex_explain.setText("-");
			ex_hole.setText("ǥ���� ������, ������� ������, ������� �ҿ���");
			ex_rail.setText("�������� ����������, ������� ����������, �������� �����簢��");
			ex_sight.setText("�̿��� 553 ���ذ�, ������ ��ũ4 CQ/T. CQB �������ذ�, Ʈ��۷� ����� ���ر�, ���� 3�� ���� ���ذ�");

		} else if (title.equals("������Ų H&K SL8")) {
			ex_damage.setText("180");
			ex_distance.setText("65");
			ex_firerate.setText("350");
			ex_accur_aim.setText("104");
			ex_accur_nonaim.setText("55");
			ex_bullet.setText("10");
			ex_supply.setText("50");
			ex_dampersec.setText("105");
			ex_guntype.setText("���ڵ�������");
			ex_price.setText("-");
			ex_explain.setText("-");
			ex_hole.setText("-");
			ex_rail.setText("������ �簢��");
			ex_sight.setText("ǥ�� 5.5����, �߰Ÿ� 4.5����");

		} else if (title.equals("�ܿ����嵵�� AWM")) {
			ex_damage.setText("300");
			ex_distance.setText("70");
			ex_firerate.setText("49");
			ex_accur_aim.setText("104");
			ex_accur_nonaim.setText("51");
			ex_bullet.setText("5");
			ex_supply.setText("40");
			ex_dampersec.setText("24.5");
			ex_guntype.setText("��Ʈ�׼�");
			ex_price.setText("-");
			ex_explain.setText("-");
			ex_hole.setText("ǥ���� ������, ������ �ҿ���, ������ ������");
			ex_rail.setText("������ �簢��, �ݵ����� �簢��");
			ex_sight.setText("���� �߰Ÿ� 5���� �ܿ����嵵��(����Ұ�)");

		} else if (title.equals("ũ�������� Alpine")) {
			ex_damage.setText("320");
			ex_distance.setText("70");
			ex_firerate.setText("39");
			ex_accur_aim.setText("104");
			ex_accur_nonaim.setText("55");
			ex_bullet.setText("5");
			ex_supply.setText("30");
			ex_dampersec.setText("20.8");
			ex_guntype.setText("��Ʈ�׼�");
			ex_price.setText("-");
			ex_explain.setText("-");
			ex_hole.setText("������ �ҿ���");
			ex_rail.setText("������ �簢��, �ݵ����� �簢��");
			ex_sight.setText("ǥ�� 5.5����, �߰Ÿ� 4.5����, �ܰŸ� 4����, ���� �߰Ÿ� 5����");

		} else if (title.equals("������Ų Stechkin APS")) {
			ex_damage.setText("59");
			ex_distance.setText("10");
			ex_firerate.setText("650");
			ex_accur_aim.setText("14");
			ex_accur_nonaim.setText("7");
			ex_bullet.setText("20");
			ex_supply.setText("40");
			ex_dampersec.setText("63.91");
			ex_guntype.setText("�ڵ�����");
			ex_price.setText("-");
			ex_explain.setText("�ҷ��� �̺�Ʈ, ���� �Ѱ��� �ѹ��̴� ��� ���������� �������� �׻� �����̾���.");
			ex_hole.setText("ǥ���� ������, Ŀ���� ���� ������, ���� �ҿ���, ���� �Ѱ�");
			ex_rail.setText("-");
			ex_sight.setText("-");

		} else if (title.equals("�ܿ����嵵�� H&K USP")) {
			ex_damage.setText("64");
			ex_distance.setText("12");
			ex_firerate.setText("450");
			ex_accur_aim.setText("14");
			ex_accur_nonaim.setText("9");
			ex_bullet.setText("13");
			ex_supply.setText("65");
			ex_dampersec.setText("48");
			ex_guntype.setText("���ڵ�����");
			ex_price.setText("-");
			ex_explain.setText("-");
			ex_hole.setText("ǥ���� ������, Ŀ���� ���� ������, ���� �ҿ���, ���� �Ѱ�");
			ex_rail.setText("-");
			ex_sight.setText("Ʈ��۷� ����� ���ر� �ܿ����嵵��");

		} else if (title.equals("������Ų ����")) {
			ex_damage.setText("-");
			ex_distance.setText("����");
			ex_firerate.setText("����");
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

		} else if (title.equals("���� ������")) {
			ex_damage.setText("");
			ex_distance.setText("����");
			ex_firerate.setText("����");
			ex_accur_aim.setText("-");
			ex_accur_nonaim.setText("-");
			ex_bullet.setText("-");
			ex_supply.setText("-");
			ex_dampersec.setText("-");
			ex_guntype.setText("-");
			ex_price.setText("-");
			ex_explain.setText("��ȣũ���� ��Ų�� �ٲ۰����� ����");
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
