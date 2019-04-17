package com.example.lat2_akb2_10116071_febridolars;


/*

10116071 FebriDolarS AKB2

CHANGE LOG

16 April 2019 03.22
-Membuat Layout Login,Register,Almost

17 April 2019 15.53
- Membuat Layout Verify, Home

*/

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Verify extends AppCompatActivity {

    private Button button5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify);

        button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHome();
            }
        });
    }
    public void openHome(){
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
    }
}
