package mx.ivajotha.desarrollo;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by jonathan on 20/06/16.
 */
public class ActivityItem extends AppCompatActivity{
    private String nameItem;
    private TextView myName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item);

        nameItem = getIntent().getExtras().getString("key_user");
        setTitle("Detalles");
        myName= (TextView) findViewById(R.id.titleItemInter);
        myName.setText(nameItem);

    }


}
