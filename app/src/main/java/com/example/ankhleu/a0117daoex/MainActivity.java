package com.example.ankhleu.a0117daoex;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.ankhleu.a0117daoex.data.student;
import com.example.ankhleu.a0117daoex.data.studentscoreDAO;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    final public static studentscoreDAO dao=new studentscoreDAO();

    ListView lv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();
        lv=(ListView)findViewById(R.id.listview);
        ArrayList<String> studentName=new ArrayList<>();
        for (student s:dao.getList())
        {
            studentName.add(s.name);
        }

        ArrayAdapter<String>adapter=new ArrayAdapter<String>(MainActivity.this
                ,android.R.layout.simple_list_item_1,studentName);
        lv.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu,menu);//缺少此行，menu button不會出現
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {

        if (item.getItemId()==R.id.menu_add)
        {
            Intent it=new Intent(MainActivity.this,AddActivity.class);
            startActivity(it);
        }
        return super.onContextItemSelected(item);
    }
}
