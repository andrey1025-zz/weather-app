package com.abhishek.amplyweather;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class DataListAdapter extends BaseAdapter {
    Context context;
    ArrayList<MData> arrayList;
    public DataListAdapter(Context context, ArrayList<MData> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }
    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        MData data = arrayList.get(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.cell_data, parent, false);
        }
        TextView txt_city = (TextView)convertView.findViewById(R.id.txt_city);
        txt_city.setText(data.city);

        return convertView;
    }
}
