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
			// �ϳ��� �̹������ 4���� �ؽ�Ʈ�� ������ �޾ƿ´�.
			ImageView iv = (ImageView) v.findViewById(R.id.main_image);
			TextView tv_Sub = (TextView) v.findViewById(R.id.main_title);

			// ���� item�� position�� �´� �̹����� ���� �־��ش�.
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

	// ����Ʈ �信 ���� �̹��� �߰��ϴ� �κ� (���Ŀ� ������ ������ ���� �� )
	public int getImage_ID() {
		return Image_ID;
	}

	public void setImage_ID(int image_ID) {
		Image_ID = image_ID;
	}

	// ����Ʈ �信 item 1�� �׸� �߰� �ϴ� �κ� [������]
	public String getTitle1() {
		return Title1;
	}

	public void setTitle1(String _Title) {
		Title1 = _Title;
	}

}
