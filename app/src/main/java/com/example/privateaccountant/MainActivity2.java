package com.example.privateaccountant;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import com.example.privateaccountant.ui.Product;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity2 extends AppCompatActivity {
        BottomNavigationView bottomNavigationView;
        Products products = new Products();
        Offers offers = new Offers();
        Payments payments = new Payments();
        Checks checks = new Checks();


    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
}