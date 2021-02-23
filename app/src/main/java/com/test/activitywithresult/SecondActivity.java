package com.test.activitywithresult;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView receivedMessage;
    EditText response;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        receivedMessage=findViewById(R.id.t2);
        response=findViewById(R.id.response);
        Intent intent=getIntent();
        if(intent.getExtras()!=null)
            receivedMessage.setText(receivedMessage.getText().toString()+" "+intent.getStringExtra("message"));
    }

    public void backBtn(View view) {
        Intent intent=new Intent();
        intent.putExtra("response",response.getText().toString());
        setResult(1,intent);
        finish();
    }
}