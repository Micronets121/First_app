package com.mobdev.lab4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
Button btn,show_spin;EditText e1,e23; final List<String> list = new ArrayList<String>();
Spinner spinner;TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 = (EditText) findViewById(R.id.edit_msg);
        e23 = (EditText) findViewById(R.id.edit_phone);
        btn = (Button) findViewById(R.id.show_button);
        t1=(TextView)findViewById(R.id.shoview);
        show_spin = (Button) findViewById(R.id.show_pho);
        spinner = (Spinner) findViewById(R.id.spinner_view);

        list.add("Bread");
        list.add("Sugar");
        list.add("Steak");
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, list);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(dataAdapter);
        //Adding setOnItemSelectedListener method on spinner.
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, spinner.getSelectedItem().toString(), Toast.LENGTH_LONG).show();
                t1.setText(spinner.getSelectedItem().toString());
            }


            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    public void show_msg(View view) {
        Toast.makeText(this,e1.getText().toString(),Toast.LENGTH_SHORT).show();
    }

    public void show_phone(View view) {

    }








}
