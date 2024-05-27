package com.example.facebookform;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.shashank.sony.fancytoastlib.FancyToast;

public class MainActivity2 extends AppCompatActivity {
    private Button btn;
    private EditText username;
    private EditText password;
    private void BindingView(){

        btn = findViewById(R.id.editTextText6);
        username = findViewById(R.id.Username);
        password = findViewById(R.id.Password);
    }
    private void BidingAction(){
        btn.setOnClickListener(this::OnClickListener);
    }

    private void OnTextClick(View view) {
    }

    private void OnClickListener(View view){
        if(username.getText().toString().equals("admin") && password.getText().toString().equals("123456"))
        FancyToast.makeText(this,"Login Successfully!",FancyToast.LENGTH_LONG,FancyToast.SUCCESS,true).show();
        else
            FancyToast.makeText(this,"Login Failed!",FancyToast.LENGTH_LONG,FancyToast.ERROR,true).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        BindingView();
        BidingAction();
    }
}