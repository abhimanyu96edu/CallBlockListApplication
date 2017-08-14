package com.abhimanyusharma.callapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

import com.abhimanyusharma.callapplication.TableModel.CallData;

import java.text.SimpleDateFormat;
import java.util.Date;

import static com.abhimanyusharma.callapplication.IncomingCallReceiver.incomingNumber;

public class MainActivity extends AppCompatActivity {

    Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt =(Button)findViewById(R.id.button);


        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), DetailsActivity.class));
                finish();
            }
        });

    }

}