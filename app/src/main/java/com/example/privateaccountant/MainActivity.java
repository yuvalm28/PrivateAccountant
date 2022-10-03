package com.example.privateaccountant;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class MainActivity extends AppCompatActivity {
    Button login, signup, next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login =findViewById(R.id.login);
        signup = findViewById(R.id.signup);
        next = findViewById(R.id.next);

    }

    public void onClick(View view) {
        if(view == login) {
            Intent go = new Intent(MainActivity.this, LoginActivity.class);
            startActivity(go);
        }
        if (view == signup){
            Intent go = new Intent(MainActivity.this, SignupActivity.class);
            startActivity(go);
        }
        if (view == next){
            Intent go = new Intent(MainActivity.this, MainActivity2.class);
            startActivity(go);
        }
    }
}