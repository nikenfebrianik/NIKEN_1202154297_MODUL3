package id.showup.niken.niken_1202154297_modul3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by nikenfebriani on 25/02/18.
 */

public class MenuDetailActivity extends AppCompatActivity {
    private int counts = 1;
    private Button plus, minus;
    private TextView value;
    private ImageView battery;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_detail);

        Intent intent = getIntent();

        String title = intent.getStringExtra("title");
        String desc = intent.getStringExtra("desc");
        String descs = intent.getStringExtra("descs");
        int gambar = intent.getIntExtra("gambar", 0);

        TextView textTitle = findViewById(R.id.tNama);
        TextView textDesc = findViewById(R.id.tDesc);
        ImageView imageGambar = findViewById(R.id.imageView);

        textTitle.setText(title);
        textDesc.setText(descs);
        imageGambar.setImageResource(gambar);

        plus = findViewById(R.id.BtnPlus);
        minus = findViewById(R.id.BtnMinus);
        value = findViewById(R.id.txt);
        battery = findViewById(R.id.battery);

        battery.setImageResource(R.drawable.ic_battery_20_black_24dp);
        value.setText(Integer.toString(counts) + "L");

    }

    public void plus(View view) {
        counts++;
        if (value != null) {
            switch (counts) {
                case 1:
                    battery.setImageResource(R.drawable.ic_battery_20_black_24dp);
                    value.setText(Integer.toString(counts) + "L");
                    Toast.makeText(this, "Battery Low", Toast.LENGTH_LONG).show();
                    break;
                case 2:
                    battery.setImageResource(R.drawable.ic_battery_30_black_24dp);
                    value.setText(Integer.toString(counts) + "L");
                    break;
                case 3:
                    battery.setImageResource(R.drawable.ic_battery_50_black_24dp);
                    value.setText(Integer.toString(counts) + "L");
                    break;
                case 4:
                    battery.setImageResource(R.drawable.ic_battery_60_black_24dp);
                    value.setText(Integer.toString(counts) + "L");
                    break;
                case 5:
                    battery.setImageResource(R.drawable.ic_battery_90_black_24dp);
                    value.setText(Integer.toString(counts) + "L");
                    break;
                case 6:
                    battery.setImageResource(R.drawable.ic_battery_full_black_24dp);
                    value.setText(Integer.toString(counts) + "L");
                    Toast.makeText(this, "Battery Full", Toast.LENGTH_LONG).show();
                    break;
            }
        }
    }

    public void minus(View view) {
        counts--;
        if (value != null) {
            switch (counts) {
                case 6:
                    battery.setImageResource(R.drawable.ic_battery_full_black_24dp);
                    value.setText(Integer.toString(counts) + "L");
                    Toast.makeText(this, "Battery Full", Toast.LENGTH_LONG).show();
                    break;
                case 5:
                    battery.setImageResource(R.drawable.ic_battery_90_black_24dp);
                    value.setText(Integer.toString(counts) + "L");
                    break;
                case 4:
                    battery.setImageResource(R.drawable.ic_battery_60_black_24dp);
                    value.setText(Integer.toString(counts) + "L");
                    break;
                case 3:
                    battery.setImageResource(R.drawable.ic_battery_50_black_24dp);
                    value.setText(Integer.toString(counts) + "L");
                    break;
                case 2:
                    battery.setImageResource(R.drawable.ic_battery_30_black_24dp);
                    value.setText(Integer.toString(counts) + "L");
                    break;
                case 1:
                    battery.setImageResource(R.drawable.ic_battery_20_black_24dp);
                    value.setText(Integer.toString(counts) + "L");
                    Toast.makeText(this, "Battery Low", Toast.LENGTH_LONG).show();
                    break;
            }
        }
    }
}