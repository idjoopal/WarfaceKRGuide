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

public class ChallengeActivity extends TabActivity {
	TabHost myTab = null;

	private ArrayList<Custom_List_Sub> Array_Data;
	private Custom_List_Sub data;
	private CustomAdapterSub adapter;
	
	private ArrayList<Custom_List_Strife> Array_DataS;
	private Custom_List_Strife dataS;
	private CustomAdapterStrife adapterS;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sub);

		// ************************��ũ �� �߰�*****************************//
		Array_Data = new ArrayList<Custom_List_Sub>();

		data = new Custom_List_Sub(R.drawable.chm_gotcha, "��Ҵ�! Gacha!",
				"Ÿ����忡�� �⺻����� �ѹ��� �����ʰ� ���ų� ��弦 4001�� (������ġ�� 401ų)");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_5, "��� �� ���̺�!", "Ÿ����� 5�� Ŭ����");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_6, "��������", "Ÿ����� 6�� Ŭ����");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_7, "�ξ� �� ����", "Ÿ����� 7�� Ŭ����");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_8, "����� ���ֹ�", "Ÿ����� 8�� Ŭ����");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_9, "�����ذ��", "Ÿ����� 9�� Ŭ����");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_10, "�繫�� �뿹��ɲ�", "Ÿ����� 10�� Ŭ����");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_11, "���׸� �ϴ�", "Ÿ����� 11�� Ŭ����");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_12, "������ 12��", "Ÿ����� 12�� Ŭ����");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_13, "����� ����", "Ÿ����� 13�� Ŭ����");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_14, "����ȸ�� ��", "Ÿ����� 14�� Ŭ����");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_15, "�����", "Ÿ����� 15�� Ŭ����");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_16, "�����ڵ��� ��Ƽ", "Ÿ����� 16�� Ŭ����");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_17, "����", "Ÿ����� 17�� Ŭ����");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_18, "��Ȯ", "Ÿ����� 18�� Ŭ����");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_19, "������", "Ÿ����� 19�� Ŭ����");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_hg1, "���������͸� Ÿ�⿣ �ʹ� ū", "Ÿ����忡�� ���ų� 1ų");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_storm1, "��������ź", "�ѵ������� 100,000");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_storm2, "��������ź",
				"�ѵ������� 1,000,000");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_storm3, "�ʴ��� ����ź",
				"�ѵ������� 20,000,000");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_rank10, "�Ź��� �����޴�", "���3ȣ��(���� 10) ����");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_rank30, "������ ���", "����5ȣ��(���� 30) ����");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_rank60, "���̻� �ö󰥰��� ����", "����(���� 66) ����");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_rank70, "�����̽�", "����(���� 70) ����");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_sound100, "ħ���� ��ɲ�",
				"�����⸦ �� ���·� 100�� ���");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_sound1000, "������ �ӻ���",
				"�����⸦ �� ���·� 1000�� ���");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_sound10000, "���������� ġ������ ����",
				"�����⸦ �� ���·� 10000�� ���");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_butt100, "¢���� �峭�ٷ���", "�ֹ��� �������� 100ų");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_dosal50, "Ǫ����", "������ 50��");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_dosal250, "���θ�", "������ 250��");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_dosal1000, "������θ�", "������ 1000��");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_move100, "������",
				"Ż��̼ǿ��� �ٹ��� 100�� ���");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_capt10, "������", "Ż��̼� 10�� �¸�");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_capt100, "Ż��������", "Ż��̼� 100�� �¸�");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_capt1000, "(�ѱ�����)",
				"Ż��̼� 1000�� �¸�");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_bodyguard10, "Ʈ��������",
				"Ż��̼ǿ��� �ٹ��⸦ �� ���·� 10�� ���");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_bodyguard100, "����ũ��ƾ",
				"Ż��̼ǿ��� �ٹ��⸦ �� ���·� 100�� ���");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_bodyguard1000, "��п��",
				"Ż��̼ǿ��� �ٹ��⸦ �� ���·� 1000�� ���");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_boom100, "����������",
				"���Ĺ̼ǿ��� C4 ��ġ�� ���ļ��� 100��");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_quest10, "������û�� ����", "������û 10�� �¸�");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_quest100, "������û�� ���׶�", "������û 100�� �¸�");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_quest1000, "(�ѱ�����)",
				"������û 1000�� �¸�");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_run10, "���ۼ�", "���ݹ̼� 10�� �¸�");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_run100, "�㸮����", "���ݹ̼� 100�� �¸�");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_run1000, "����̵�", "���ݹ̼� 1000�� �¸�");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_death10, "��������ġ�� ����", "��������ġ 10�� �¸�");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_death100, "��������ġ�� ���׶�",
				"��������ġ 100�� �¸�");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_death1000, "������� ������ ���Դϴ�",
				"��������ġ 1000�� �¸�");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_pok10, "���Ĺ̼��� ����", "���Ĺ̼� 10�� �¸�");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_pok100, "���Ĺ̼��� ���׶�", "���Ĺ̼� 100�� �¸�");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_pok1000, "(�ѱ�����)", "���Ĺ̼� 1000�� �¸�");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_surv50, "��Ʈ �� ���ĵ�", "�����̹� 1�� 50��");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_surv250, "�л���", "�����̹� 1�� 250��");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_surv1000, "�Ƿ� ���� �������",
				"�����̹� 1�� 1000��");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_100, "������ è�Ǿ�",
				"������忡�� �¸��� 1�� 100��");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_sniperhs100, "������ �ʴ� ġ���� ����",
				"������忡�� �������۷� ��弦 100ȸ");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_ma1000, "�ְ��� �ϻ���",
				"������忡�� ��������� 1000ȸ �ϻ�");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_h10, "�Ӹ��� �����", "������忡�� �������� 10ȸ");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_h100, "(�ѱ�����)", "������忡�� ���Ӹ��� 100ȸ");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_h1000, "(�ѱ�����)",
				"������忡�� ���Ӹ��� 1000ȸ");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_lie100, "Ǯ���� ���� ��",
				"���帰 ���·� 100�� ���̱�");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_10000grenade, "����ź ������",
				"����ź 10000ų");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_10000colt, "���̽� ����Ʈ �δ�",
				"COLT Python 10000ų");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_10000desert, "13����",
				"Desert Eagle 10000ų");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_10000usp, "�ڸ���",
				"H&K USP 10000ų");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_10000k5, "������ġ",
				"Daewoo K5 10000ų");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_10000browing, "Browning High Power ������",
				"Browning High Power 10000ų");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_10000beretta, "�غ��� ���",
				"Beretta M9 10000ų");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_10000glock, "�Ϻ���",
				"Glock 18c 10000ų");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_10000steyr, "���� �ڸ���",
				"Steyr M9-A1 10000ų");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_10000crowndesert, "Desert Eagle ����Ʈ",
				"Desert Eagle ũ��� 5000ų");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_10000crownberetta, "USMC �屳",
				"Beretta M9 ũ��� 5000ų");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_hgpistol10, "��ġ�� ����",
				"�������� ���ų� 10ų");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_hgpistol100, "���ô��� ����",
				"�������� ���ų� 100ų");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_hgpistol1000, "�躼�� ���� ����",
				"�������� ���ų� 500ų");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_10000sig, "������ ����",
				"SIG 552 10000ų");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_10000mp7, "�������� ��9����",
				"H&K MP7 10000ų");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_10000m4, "M4 CQB ������", "M4 CQB 10000ų");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_10000kriss, "���κ���Ľ�",
				"Kriss Super V 10000ų");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_10000ak9, "����������", "AK-9 10000ų");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_10000aug, "AUG �̴�",
				"AUG A3 9mm XS 10000ų");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_10000tavor, "(�ѱ�����)",
				"Tavor CTAR-21 10000ų");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_10000daewook1, "Daewoo K1 ������",
				"Daewoo K1 10000ų");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_10000p90, "����ź",
				"FN P90 10000ų");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_10000g36c, "��������",
				"H&K G36C 10000ų");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_10000calico, "Calico M960A ������",
				"Calico M960A 10000ų");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_10000mp5, "H&K MP5 ������",
				"H&K MP5 10000ų");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_10000auzi, "�������",
				"Mini Uzi 10000ų");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_10000compact, "���� ���α��",
				"XM8 Compact 10000ų");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_10000crowntavor, "Tavor CTAR-21 ����Ʈ",
				"Tavor CTAR-21 ũ��� 5000ų");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_10000crownkriss, "(�ѱ�����)",
				"Kriss Super V ũ��� 5000ų");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_10000crownk1, "�Ⱙ��� ������ ����",
				"Daewoo K1 ũ��� 5000ų");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_rank100, "����� ����",
				"������� ���� 100�� ����");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_rankin10, "���� ���� �߳���!",
				"������� ���� 10�� ����");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_rankin1, "���� ������ ���̴�!",
				"������� ���� 1��");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_xmas, "ũ�������� �̺��� �Ǹ�",
				"ũ������������� 1000ų");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chm_kor, "��������� ö����ũ",
				"CBT�� �������� 3���޼�");
		Array_Data.add(data);

		adapter = new CustomAdapterSub(this,
				android.R.layout.simple_list_item_1, Array_Data);

		ListView list1 = (ListView) findViewById(R.id.ListView01);

		list1.setAdapter(adapter);
		// *******************************************************************//

		// ************************���� �� �߰�*****************************//
		Array_Data = new ArrayList<Custom_List_Sub>();
		
		data = new Custom_List_Sub(R.drawable.chb_th250, "�������",
				"Ÿ����� ��弦 250ȸ");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chb_th1000, "�극��ũ����",
				"Ÿ����� ��弦 1000ȸ");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chb_th2500, "��ο���� ������",
				"Ÿ����� ��弦 2500ȸ");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chb_t500, "�繫���� ��", "Ÿ����忡�� 500ų");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chb_t2500, "�ø����",
				"Ÿ����忡�� 2500ų");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chb_th10000, "�� �����ε�",
				"Ÿ����忡�� 10000ų");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chb_thg10, "���縦 �� �� ������",
				"Ÿ����忡�� ���ų� 10ų");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chb_ice500, "ȭ�� �����",
				"��帧 �۰����� 500ų");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chb_aim100, "���ػ���� ����", "���ػ��·� 100ų");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chb_aim1000, "���ػ���� ����", "���ػ��·� 1000ų");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chb_aim10000, "������ ���Ҽ� ���� �ڵ�",
				"���ػ��·� 10000ų");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chb_crown100, "ũ��� ��ɲ�",
				"ũ��� ���� ȹ�淮 100");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chb_crown1000, "ũ��� ����",
				"ũ��� ���� ȹ�淮 1000");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chb_crown10000, "ũ����� ����",
				"ũ��� ���� ȹ�淮 10000");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chb_money100000, "���ڰ� �� ����",
				"���ӸӴ� ���� ȹ�淮 100,000");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chb_money500000, "����� �� ����",
				"���ӸӴ� ���� ȹ�淮 500,000");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chb_cure10000, "���� óġ���",
				"���� ġ�ᷮ 10,000HP");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chb_cure100000, "�ǹ���",
				"���� ġ�ᷮ 100,000HP");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chb_cure1000000, "�����ǻ�",
				"���� ġ�ᷮ 1,000,000HP");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chb_revive100, "�������ǰ�", "���� ��Ȱ 100��");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chb_revive1000, "�һ���������", "���� ��Ȱ 1000��");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chb_revive10000, "������",
				"���� ��Ȱ 10000��");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chb_elect10, "ġ������ ��ũ",
				"��������� 10ȸ ���̱�");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chb_elect100, "��������� ����",
				"��������� 100ȸ ���̱�");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chb_elect500, "������ õ��",
				"��������� 500ȸ ���̱�");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chb_hc50, "�ذ��� �μ��� ��", "���ũ���� 50��");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chb_hc500, "�ذ��� ������ ��", "���ũ���� 500��");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chb_hc2500, "�ذ��� ��", "���ũ���� 2500��");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chb_gc10, "����ź�� ����", "����ź�޺� 10��");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chb_gc100, "����ź�� ����", "����ź�޺� 100��");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chb_gc1000, "����ź�� ��", "����ź�޺� 1000��");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chb_gc10000, "������",
				"����ź�޺� 10000��");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chb_boom5, "��������ź", "����ź 1���� 5ų");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chb_clay10, "�ϼҼ���",
				"ũ����� ����ų 10��");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chb_clay100, "������ �ں�",
				"ũ����� ����ų 100��");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chb_clay1000, "�ź������� ������",
				"ũ����� ����ų 1000��");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chb_knock10, "�̴�� ���� �� ����",
				"�˴ٿ� ���·� ��弦 10��");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chb_knock50, "�����ϻ�",
				"�˴ٿ� ���·� ��弦 50��");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chb_knock500, "�����Ϲ�",
				"�˴ٿ� ���·� ��弦 500��");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chb_nozoom100, "������ų",
				"�������۷� �������� �ʰ� 100�� ���");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chb_nozoom500, "���� ��",
				"�������۷� �������� �ʰ� 500�� ���");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chb_killsniper100, "���������� õ��",
				"�������� 100�� ���");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chb_vender1, "���� ����մϴ�", "�Ѱ��� ������ ���");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chb_vender3, "�����ߵ�", "��� ������ ���");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chb_ehg10, "��������",
				"������忡�� ���ų� 10ų");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chb_nhg10, "�ϴ��",
				"�븻��忡�� ���ų� 10ų");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chb_hhg10, "�ϱ��õ",
				"�ϵ��忡�� ���ų� 10ų");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chb_coupdeta, "��Ÿ �̺�Ʈ",
				"��Ÿ �̺�Ʈ ��� ����");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chb_10000claymore, "ũ����� ������", "ũ����� 10000ų");
		Array_Data.add(data);
		
		data = new Custom_List_Sub(R.drawable.chb_10000m16a2, "�ؾȰ���",
				"M16A2 10000ų");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chb_10000mg36, "�ӽ��ٰԺ�����",
				"H&K MG36 10000ų");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chb_10000rpk, "������ ���", "RPK 10000ų");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chb_10000auga3hbar, "���ſ� AUG",
				"AUG A3 H Bar 10000ų");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chb_10000xm8, "������ ������",
				"XM8 LMG 10000ų");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chb_10000k3, "�ε��׽þ� �غ��� ���Ľ�ī",
				"Daewoo K3 10000ų");
		Array_Data.add(data);
		
		data = new Custom_List_Sub(R.drawable.chb_10000jackhammer, "����",
				"JackHammer 10000ų");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chb_10000keltec, "Kel-Tec ��ź�� ������",
				"Kel-Tec KSG 10000ų");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chb_10000hawkpump, "Hawk Pump ������",
				"Hawk Pump 10000ų");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chb_10000cobray, "�Ÿ��� û�Һ�",
				"Cobray Striker 10000ų");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chb_10000superm4, "�� �����",
				"Benelli M4 Super 90 10000ų");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chb_10000nova, "��¦�� ���ĵ� ��ΰ�����",
				"Benelli Nova Tactical 10000ų");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chb_10000saigabp, "������",
				"Saiga Bullpup 10000ų");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chb_10000mc255, "������",
				"MC 255 12 10000ų");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chb_10000remingtoncb, "Remington 870 CB ������",
				"Remington 870 CB 10000ų");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chb_10000remington, "��ź�Ѱ��� ������ ����",
				"Remington 870 10000ų");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chb_10000vepr, "�ѿ����� ���⳪",
				"VEPR-12 10000ų");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chb_10000saiga, "�߻� �����",
				"Saiga 10000ų");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chb_10000spas, "SPAS-12 ������",
				"SPAS-12 10000ų");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chb_10000crownsaigabp, "Saiga Bullpup ����Ʈ",
				"Saiga Bullpup ũ��� 5000ų");
		Array_Data.add(data);
		data = new Custom_List_Sub(R.drawable.chb_10000crownspas, "SPAS-12 ����Ʈ",
				"SPAS-12 ũ��� 5000ų");
		Array_Data.add(data);
		
		data = new Custom_List_Sub(R.drawable.chb_kor, "�±ظ���� �ݻ�����",
				"CBT�� �������� 3���޼�");
		Array_Data.add(data);

		adapter = new CustomAdapterSub(this,
				android.R.layout.simple_list_item_1, Array_Data);

		ListView list2 = (ListView) findViewById(R.id.ListView02);

		list2.setAdapter(adapter);
		// *******************************************************************//

		
		// ************************��Ʈ������ �� �߰�*****************************//
		Array_DataS = new ArrayList<Custom_List_Strife>();

		dataS = new Custom_List_Strife(R.drawable.cs_tr, "�� ���� ������ ���ڱ�!",
				"�����ø����� Ÿ����� Ŭ����");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_tm, "������ ���� �����ϱ�",
				"�޵����� Ÿ����� Ŭ����");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_te, "���� �Ͼ�, ���¾� �����Ͼ�!",
				"�����Ͼ�� Ÿ����� Ŭ����");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_ts, "���⼭ �츮���� ����!",
				"�������۷� Ÿ����� Ŭ����");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_thg25, "������ ���",
				"Ÿ����忡�� ���ų� 25ų");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_winter1000, "������",
				"�ܿ� ���� ����� 1000ų");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_pc, "�����п�����",
				"PC�� ����� 10000ų");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_sg50, "�� ���� ��������!", "�ǵ尡�� 50ų");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_sg500, "���и� �μ�����", "�ǵ尡�� 500ų");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_slide50, "�����̵��� ����", "�����̵�ų 50��");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_slide500, "�����̵��� ����", "�����̵�ų 500��");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_slide2500, "�����̵��� ��", "�����̵�ų 2500��");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_help10, "ģ���� ����",
				"���������� �� ���� 10��");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_help100, "������ �Բ���� �η����ʴ�!",
				"���������� �� ���� 100��");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_help1000, "����� �Բ� ����!",
				"���������� �� ���� 1000��");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_e5, "���̽��ھ�",
				"������� ų�޺� 5x 20��");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_n5, "���۽��ھ�",
				"�븻��� ų�޺� 5x 20��");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_h5, "��Ʈ���ھ�",
				"�ϵ��� ų�޺� 5x 20��");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_e5250, "�������",
				"������� ų�޺� 5x 250��");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_n5250, "�ʰ������",
				"�븻��� ų�޺� 5x 250��");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_h5250, "���ʰ������",
				"�ϵ��� ų�޺� 5x 250��");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_e5500, "������",
				"������� ų�޺� 5x 500��");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_n5500, "��������",
				"�븻��� ų�޺� 5x 500��");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_h5500, "�ʰ�����",
				"�ϵ��� ų�޺� 5x 500��");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_e51000, "�߰���",
				"������� ų�޺� 5x 1000��");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_n51000, "�߰��� ���� ���� ��",
				"�븻��� ų�޺� 5x 1000��");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_h51000, "�߰��ڸ� �������� ��",
				"�ϵ��� ų�޺� 5x 1000��");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_friend20, "���Ӽ� ���� �༮", "ģ�� 20��޼�");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_1enodie, "�Ѿ��� ���ϴ� ��",
				"�����ʰ� ������� Ŭ����");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_1nnodie, "�ϵ�Ÿ��",
				"�����ʰ� �븻��� Ŭ����");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_1hnodie, "�һ��� ����",
				"�����ʰ� �ϵ��� Ŭ����");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_10enodie, "�Һ�",
				"10�� �����ʰ� ������� Ŭ����");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_10nnodie, "��Ÿ�� ���",
				"10�� �����ʰ� �븻��� Ŭ����");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_10hnodie, "�䰡�ϴ� ���",
				"10�� �����ʰ� �ϵ��� Ŭ����");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_100enodie, "�ϴ��� �����",
				"100�� �����ʰ� ������� Ŭ����");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_100nnodie, "��·�� ��Ƴ���",
				"100�� �����ʰ� �븻��� Ŭ����");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_100hnodie, "�� ���� �ʾ�",
				"100�� �����ʰ� �ϵ��� Ŭ����");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_hell, "�������� �� �Ǹ�",
				"���� ���� ä �ѹ��� 10000������������");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_clay50, "ũ������� ����", "ũ�����ų 50��");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_clay200, "ũ������� ����", "ũ�����ų 200��");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_clay1000, "ũ������� ��", "ũ�����ų 1000��");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_hgsniper10, "��������",
				"�������۷� ���ų� 10ų");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_hgsniper100, "�ҽ�����",
				"�������۷� ���ų� 100ų");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_hgsniper500, "������ �ı�",
				"�������۷� ���ų� 500ų");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_hgek, "Į����",
				"������忡�� �⺻������� ���ų� 5ų");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_hgnk, "������ ����",
				"�븻��忡�� ��ȣũ�� ���ų� 5ų");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_hghk, "������ �Ա�",
				"�ϵ��忡�� ���������� ���ų� 5ų");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_10000m4a1, "M4A1 ������", "M4A1 10000ų");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_10000aug, "�ں��",
				"AUG A3 10000ų");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_10000g36k, "������ �����",
				"H&K G36K 10000ų");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_10000k2, "���ѹα� ����",
				"Daewoo K2 10000ų");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_10000scar, "Ư�������δ�",
				"FN SCAR-H 10000ų");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_10000acr, "(�ѱ�����)", "ACR 10000ų");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_10000calico, "���ڵ��� ����",
				"Calico M955A 10000ų");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_10000ak103, "�ú����� Ż��",
				"AK-103 10000ų");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_10000ak47, "AK",
				"AK-47 10000ų");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_10000sig551, "��������",
				"SIG551 10000ų");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_10000tavortar, "Ÿ������",
				"Tavor TAR-21 10000ų");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_10000galil, "������ ����",
				"Galil AR 10000ų");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_10000f2000, "���⿡��",
				"FN F2000 10000ų");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_10000dragu, "Dragunov SR ������",
				"Dragunov SR 10000ų");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_10000qbu, "�ùε��� ������",
				"QBU-88 10000ų");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_10000sig550, "���������Ⱥδ�",
				"SIG 550 10000ų");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_10000m16spr, "M16 SPR Custom ������",
				"M16 SPR Custom 10000ų");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_10000tavorstar, "���̺� ���",
				"Tavor STAR-21 10000ų");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_10000chetyac, "����",
				"Cheytac M200 10000ų");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_10000alpine, "�������� �ϻ���",
				"Alpine 10000ų");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_10000xm8ss, "XM8 Sharpshooter ������",
				"XM8 Sharpshooter 10000ų");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_10000vss, "������ ���ݼ�",
				"VSS Vintorez 10000ų");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_10000acrspr, "21���� ����",
				"ACR SPR 10000ų");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_10000sl8, "H&K SL8 ������",
				"H&K SL8 10000ų");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_10000m14ebr, "���� �� ��ȭ�� ������",
				"M14 EBR 10000ų");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_10000awm, "�ܿ� ����", "AWM 10000ų");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_10000wa2000, "(�ѱ�����)",
				"Walther WA 2000 10000ų");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_10000knife, "������", "�⺻��� 10000ų");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_10000ultra, "��Ʈ�󸶸� ������",
				"��Ʈ�󸶸� 10000ų");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_10000kabar, "��ɼ� Į, ��¥?", "KA Bar Utility knife 10000ų");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_10000tactool, "���� ������", "���� 10000ų");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_10000space, "������ �Ĵ� ��", "������ 10000ų");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_10000blackhawk, "������ �糪��", "��ȣũ 10000ų");
		Array_DataS.add(dataS);
		
		dataS = new Custom_List_Strife(R.drawable.cs_10000crownas50, "AS50 ����Ʈ",
				"AS50 ũ��� 5000ų");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_10000crownscar, "FN SCAR-H ����Ʈ",
				"FN SCAR-H ũ��� 5000ų");
		Array_DataS.add(dataS);
		dataS = new Custom_List_Strife(R.drawable.cs_10000crownacr, "ACR ����Ʈ",
				"ACR ũ��� 5000ų");
		Array_DataS.add(dataS);
		
		dataS = new Custom_List_Strife(R.drawable.cs_kor, "�ú����� Ÿ�̰�",
				"CBT�� �������� 3���޼�");
		Array_DataS.add(dataS);
		
		adapterS = new CustomAdapterStrife(this,
				android.R.layout.simple_list_item_1, Array_DataS);

		ListView list3 = (ListView) findViewById(R.id.ListView03);

		list3.setAdapter(adapterS);
		// *******************************************************************//

		myTab = getTabHost(); // TabHost

		myTab.addTab(myTab.newTabSpec("Tag1").setIndicator("��ũ")
				.setContent(R.id.ListView01)); // Tab ����
		myTab.addTab(myTab.newTabSpec("Tag2").setIndicator("����")
				.setContent(R.id.ListView02));
		myTab.addTab(myTab.newTabSpec("Tag3").setIndicator("��Ʈ������")
				.setContent(R.id.ListView03));

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
