package fr.isep.ii3510.intentdemo;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onBtnClkForActChange(View v){

//        Log.d("CLK","Debug clk");
//        Log.v("CLK","Verbose clk");
//        Log.w("CLK","Warning clk");
//        Log.e("CLK","Error clk");
//
////        EditText et = findViewById(R.id.et);
////        String et_text = et.getText().toString();
//
//        //get the input data
//
//        //start second activities
//        Intent go = new Intent(this, SecondActivity.class);
////        go.putExtra(Gardener.INTENT_KEY,"The constant gardener, by John Le Carre");
////        go.putExtra(Gardener.INTENT_KEY, et_text);
//        startActivity(go);

        Intent go = new Intent(MainActivity.this, SecondActivity.class);
        startActivityForResult(go, 123456);
        //startActivity(go);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 123456) {
            String requestedString = data.getStringExtra("Key");
            Log.d("A1",requestedString);
        }
    }

}