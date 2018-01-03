package com.joopal.warfacekrguide;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapterStrife extends ArrayAdapter<Custom_List_Strife> {
	private ArrayList<Custom_List_Strife> items;

	public CustomAdapterStrife(Context context, int textViewResourceId,
			ArrayList<Custom_List_Strife> items) {
		super(context, textViewResourceId, items);
		this.items = items;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		View v = convertView;
		if (v == null) {

			LayoutInflater vi = (LayoutInflater) getContext().getSystemService(
					Context.LAYOUT_INFLATER_SERVICE);
			v = vi.inflate(R.layout.list_strife, null);
		}
		Custom_List_Strife custom_list_data = items.get(position);

		if (custom_list_data != null) {
			// 하나의 이미지뷰와 4개의 텍스트뷰 정보를 받아온다.
			ImageView iv = (ImageView) v.findViewById(R.id.sub_image);
			TextView tv_Sub = (TextView) v.findViewById(R.id.sub_title);
			TextView tv_Sub2 = (TextView) v.findViewById(R.id.sub_des);

			// 현재 item의 position에 맞는 이미지와 글을 넣어준다.
			iv.setBackgroundResource(custom_list_data.getImage_ID());
			tv_Sub.setText(custom_list_data.getTitle1());
			tv_Sub2.setText(custom_list_data.getTitle2());
		}

		return v;
	}
}

class Custom_List_Strife {
	private int Image_ID;
	private String Title1;
	private String Title2;

	public Custom_List_Strife(int _Image_ID, String _Title1, String _Title2) {
		this.setImage_ID(_Image_ID);
		this.setTitle1(_Title1);
		this.setTitle2(_Title2);

	}

	// 리스트 뷰에 수업 이미지 추가하는 부분 (추후에 교수님 프로필 사진 들어감 )
	public int getImage_ID() {
		return Image_ID;
	}

	public void setImage_ID(int image_ID) {
		Image_ID = image_ID;
	}

	// 리스트 뷰에 item 1번 항목 추가 하는 부분 [수업명]
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
