package com.example.mac.gridview10;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class AlphabetAdapter extends BaseAdapter {
    private Context mContext;
    private String[] mLetter;
    private Typeface mTypeface;
    public AlphabetAdapter (Context context, String[] letter, Typeface typeface){
        this.mContext = context;
        this.mLetter = letter;
        this.mTypeface = typeface;
    }
@Override
public int getCount() {
    return mLetter.length;
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
    LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    View gridView;
    if (convertView == null) {
        gridView = inflater.inflate(R.layout.alphabet_grid_item, null);
        TextView letterView = (TextView) gridView.findViewById(R.id.grid_item_letter);
        letterView.setText(mLetter[position]);
        letterView.setTypeface(mTypeface);
    } else {
        gridView = (View) convertView;
    }
    return gridView;
   }
}