package com.test.activitywithresult;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText message1;
    TextView response;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        message1=findViewById(R.id.messae1);
        response=findViewById(R.id.response);
    }

    public void SendBtn(View view) {
        Intent intent=new Intent(this,SecondActivity.class);
        intent.putExtra("message",message1.getText().toString());
        startActivityForResult(intent,1);
    }

    public void ClearBtn(View view) {
        message1.setText("");
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1 && requestCode == 1) {
            response.setText("Response Recu :"+data.getStringExtra("response"));
        }
    }
}