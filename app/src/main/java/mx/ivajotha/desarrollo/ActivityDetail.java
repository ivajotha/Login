package mx.ivajotha.desarrollo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.content.IntentFilter;

import android.widget.TextView;

public class ActivityDetail extends AppCompatActivity {
    private TextView titleInter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_detail);
/*
        String userName=getIntent().getExtras().getString("key_user");
        titleInter.setText(String.format("%s, ", userName));
*/
    }
}
