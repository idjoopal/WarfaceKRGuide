package com.joopal.warfacekrguide;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapterContent extends ArrayAdapter<Custom_List_Content> {
	private ArrayList<Custom_List_Content> items;

	public CustomAdapterContent(Context context, int textViewResourceId,
			ArrayList<Custom_List_Content> items) {
		super(context, textViewResourceId, items);
		this.items = items;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		View v = convertView;
		if (v == null) {

			LayoutInflater vi = (LayoutInflater) getContext().getSystemService(
					Context.LAYOUT_INFLATER_SERVICE);
			v = vi.inflate(R.layout.list_content, null);
		}
		Custom_List_Content custom_list_data = items.get(position);

		if (custom_list_data != null) {
			// 하나의 이미지뷰와 4개의 텍스트뷰 정보를 받아온다.
			ImageView iv = (ImageView) v.findViewById(R.id.main_image);
			TextView tv_Sub = (TextView) v.findViewById(R.id.main_title);

			// 현재 item의 position에 맞는 이미지와 글을 넣어준다.
			iv.setBackgroundResource(custom_list_data.getImage_ID());
			tv_Sub.setText(custom_list_data.getTitle1());
		}

		return v;
	}
}

class Custom_List_Content {
	private int Image_ID;
	private String Title1;

	public Custom_List_Content(int _Image_ID, String _Title1) {
		this.setImage_ID(_Image_ID);
		this.setTitle1(_Title1);

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

}
