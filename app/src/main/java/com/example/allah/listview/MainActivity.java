package com.example.allah.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
private ListView listView;
private ArrayAdapter<String > adapter;
private ArrayList<student> students;
private String [] fname,lastname;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.list_item);
        fname = getResources().getStringArray(R.array.fname);
        lastname= getResources().getStringArray(R.array.lastname);
        filllist();
        adapter = new ArrayAdapter<>(this,R.layout.row,fname);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, students.get(position).getLastname(), Toast.LENGTH_SHORT).show();
            }
        });

    }
    public void filllist(){
        students= new ArrayList<>();
        for (int i=0; i<fname.length;i++){
            students.add(new student(fname[i],lastname[i]));
        }

    }

}
