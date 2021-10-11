package fr.isep.ii3510.intentdemo;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

//        TextView tv = findViewById(R.id.change_tv);
//        Intent intent = getIntent();
//        String newValue = intent.getStringExtra("Key");
//        tv.setText(newValue);

    }

    public void onBtnClkForActChange2(View v){

        Intent resultIntent = new Intent(SecondActivity.this, MainActivity.class);

        EditText et = findViewById(R.id.infoWantBack);

        resultIntent.putExtra("Key", et.getText().toString());
        setResult(123456, resultIntent);
        finish();

    }
}