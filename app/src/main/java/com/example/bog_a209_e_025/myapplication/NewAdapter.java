package com.example.bog_a209_e_025.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class NewAdapter extends BaseAdapter{
    private Context context;
    private int layout;
    private List<String> countryList;

    public NewAdapter(Context context, int layout, List<String> countryList) {
        this.context = context;
        this.layout = layout;
        this.countryList = countryList;
    }

    @Override
    public int getCount() {
        return this.countryList.size();
    }

    @Override
    public Object getItem(int i) {
        return this.countryList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup parent) {
        ViewHolder viewHolder;
        if (view == null){
            LayoutInflater layoutInflater = LayoutInflater.from(this.context);
            view = layoutInflater.inflate(R.layout.list_item, null);
            viewHolder = new ViewHolder();
            viewHolder.tituloTextView = (TextView) view.findViewById(R.id.textId);
            view.setTag(viewHolder);
        } else{
            viewHolder = (ViewHolder) view.getTag();
        }

        String actualText = countryList.get(i);
        viewHolder.tituloTextView.setText(actualText);

        return view;
    }

    static class ViewHolder {
        TextView tituloTextView;
    }
}
