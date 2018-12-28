package com.example.allah.listview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.widget.ArrayAdapter;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapter extends ArrayAdapter implements View.OnClickListener {
    public CustomAdapter(@NonNull Context context, int resource, @NonNull List objects) {
        super(context, resource, objects);
    }
private ArrayList<student> students;
    Context mContext;
    private static class ViewHolder {

        TextView txtName;
        TextView txtLname;
        ImageView info;
        RelativeLayout bg;
    }
        public CustomAdapter(ArrayList<student> students, Context context) {
            super(context, R.layout.row, students);
            this.students = students;
            this.mContext=context;

        }
    @Override
    public void onClick(View v) {

    }
}
