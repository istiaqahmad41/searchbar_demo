package com.example.searchbar_implement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ListView product_listview;
    SearchView src;
    Button btn;
    ArrayAdapter<String> product_adapter;
    String text_catch;
    String[] electronicDevices;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

     product_listview = findViewById(R.id.listview);
         electronicDevices = new String[]{
                 "TechNova Tablet",
                 "QuantumPhone",
                 "EcoSmartwatch",
                 "HyperVision",
                 "VortexVR",
                 "PixelPad Laptop",
                 "InfinityPod",
                 "ZenithSmartphone",
                 "EcoEarpods",
                 "QuantumQuantifier",
                 "CineStream",
                 "iSpectra",
                 "EcoAir",
                 "InfinityDesk",
                 "NexGen",
                 "VirtualGuard",
                 "CyberConsole",
                 "NanoTab",
                 "EcoThermostat",
                 "UltraSound",
                 "SmartServe",
                 "QuantumDrive",
                 "HyperSync",
                 "iEcoHome System",
                 "TechBeam Projector",
                 "NeuroSync Brain Stimulator",
                 "EcoCharge Power Bank",
                 "TruSense Air Quality Monitor",
                 "SonicBoom Alarm Clock",
                 "VistaView Smart Mirror",
                 "AeroPods Earbuds",
                 "PixelSight Camera",
                 "SmartFlow Faucet",
                 "EcoView Energy Monitor",
                 "GigaGlove Virtual Reality Glove",
                 "DigitalDex Smart Doorbell",
                 "TechTorch Flashlight",
                 "QuantumGaming Chair",
                 "EcoDrive Electric Car",
                 "PowerGrip Phone Holder",
                 "BioBeat Heart Rate Monitor",
                 "AeroDrone Delivery Drone",
                 "QuantumPulse Bluetooth Speaker",
                 "TechDesk Standing Desk",
                 "EcoWasher",
                 "SmartStem Plant Monitor",
                 "QuantumNavigator GPS",
                 "EcoGlow Light Bulb"
         };



   product_adapter= new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,electronicDevices);

   product_listview.setAdapter(product_adapter);

btn = findViewById(R.id.button);
            src=(SearchView)findViewById(R.id.searchview);
            src.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
                @Override
                public boolean onQueryTextSubmit(String query) {
                    return false;
                }

                @Override
                public boolean onQueryTextChange(String newText) {
                    product_adapter.getFilter().filter(newText);
                    return false;
                }
            });

            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(MainActivity.this, MainActivity2.class);
                    i.putExtra("product",text_catch);
                    startActivity(i);
                }
            });

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    text_catch = electronicDevices[position];



    }


}