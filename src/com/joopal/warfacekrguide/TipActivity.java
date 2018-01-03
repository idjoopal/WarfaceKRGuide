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
		
		data = new Custom_List_Tip("F5","강퇴투표시 찬성하는 버튼. 잠수 강퇴시킬때 꼭 누르도록 하자.");
		Array_Data.add(data);
		data = new Custom_List_Tip("공기방금지","공격하는 편이 베이스에서 대기를 타면 안되는 룰, 게임이 루즈해지는걸 방지한다.");
		Array_Data.add(data);
		data = new Custom_List_Tip("구타보","자동스나인 Tavor STAR-21를 지칭함.");
		Array_Data.add(data);
		data = new Custom_List_Tip("노기간제","쿠데타당시 없어진 무기를 사용하면 안되는방. 초보가 그딴게 있을리 없으니 사실 몰라도 된다.");
		Array_Data.add(data);
		data = new Custom_List_Tip("노스","스킨을 착용하면 안되는방.");
		Array_Data.add(data);
		data = new Custom_List_Tip("노불펍","Saiga Bullpup 사용을 금지하는 방. 크라운불펍 역시 예외없다");
		Array_Data.add(data);
		data = new Custom_List_Tip("노커룬","칼전의 공공연한 룰, 근접방어기능이 있는 커룬덤 방탄조끼를 착용하면 안되는 방.");
		Array_Data.add(data);
		data = new Custom_List_Tip("노크","크라운무기, 방어구를 착용하면 안되는 방. 무기나 방어구 둘중 하나만 금지하기도 한다.");
		Array_Data.add(data);
		data = new Custom_List_Tip("노타보","일반적으로 자동스나인 Tavor STAR-21를 쓰면 안되는 방. 다른 타보는 물어보고 쓴다.");
		Array_Data.add(data);
		data = new Custom_List_Tip("닌자","총을 사용하지 않는 유저들을 지칭함. 못하면서 이 짓하면 욕먹는다.");
		Array_Data.add(data);
		data = new Custom_List_Tip("막살","주위도 확인 안하고 일단 살리고보는 메딕을 지칭, 거기에 피까지 안주면 최고다.");
		Array_Data.add(data);
		data = new Custom_List_Tip("막설","폭파미션에서 주위도 확인안하고 C4를 설했다가 몰래 해체당할 때를 지칭함.");
		Array_Data.add(data);
		data = new Custom_List_Tip("신타보","반자동스나인 Tavor STAR-21 Navy Blue를 지칭함.");
		Array_Data.add(data);
		data = new Custom_List_Tip("초탄","몸에 맞는 첫번째 탄환을 방어해주는 초탄방어의 줄임말, 아군이 쏜 총에도 깨질 수 있으니 조심한다.");
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
