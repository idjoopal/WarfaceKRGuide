package com.joopal.warfacekrguide;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class CustomAdapterTip extends ArrayAdapter<Custom_List_Tip> {
	private ArrayList<Custom_List_Tip> items;

	public CustomAdapterTip(Context context, int textViewResourceId,
			ArrayList<Custom_List_Tip> items) {
		super(context, textViewResourceId, items);
		this.items = items;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		View v = convertView;
		if (v == null) {

			LayoutInflater vi = (LayoutInflater) getContext().getSystemService(
					Context.LAYOUT_INFLATER_SERVICE);
			v = vi.inflate(R.layout.list_tip, null);
		}
		Custom_List_Tip custom_list_data = items.get(position);

		if (custom_list_data != null) {
			// �ϳ��� �̹������ 4���� �ؽ�Ʈ�� ������ �޾ƿ´�.
			TextView tv_Sub1 = (TextView) v.findViewById(R.id.tip_title);
			TextView tv_Sub2 = (TextView) v.findViewById(R.id.tip_sub);

			// ���� item�� position�� �´� �̹����� ���� �־��ش�.
			tv_Sub1.setText(custom_list_data.getTitle1());
			tv_Sub2.setText(custom_list_data.getTitle2());
		}

		return v;
	}
}

class Custom_List_Tip {
	private String Title1;
	private String Title2;

	public Custom_List_Tip(String _Title1, String _Title2) {
		this.setTitle1(_Title1);
		this.setTitle2(_Title2);

	}

	// ����Ʈ �信 item 1�� �׸� �߰� �ϴ� �κ� [������]
	public String getTitle1() {
		return Title1;
	}

	public void setTitle1(String _Title) {
		Title1 = _Title;
	}
	
	public String getTitle2() {
		return Title2;
	}

	public void setTitle2(String _Title) {
		Title2 = _Title;
	}

}
