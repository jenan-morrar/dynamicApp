package com.example.dynamicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;

import model.Car;
import model.CarModel;

public class MainActivity extends AppCompatActivity {
    private EditText result;
    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void show(View view){
        result = findViewById(R.id.result);
        spinner = findViewById(R.id.spinner);
        String type = spinner.getSelectedItem().toString();

        CarModel model = new CarModel();
        Car c = model.getCarByType(type);
        if (c!= null){
            result.setText(c.getMake() + ", Year = "+ c.getModel());
        }else {
            result.setText("No Car Founded");
        }
    }
}