package ap.efficient_farming;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class SingleDetail extends AppCompatActivity {

    ImageView img;
    TextView title, type, desc, contact, rate, time;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_detail);

        Equipment equipment = (Equipment)getIntent().getSerializableExtra("obj");

        img = findViewById(R.id.detailImg);
        title = findViewById(R.id.detailTitle);
        type = findViewById(R.id.detailType);
        desc = findViewById(R.id.detailDesc);
        contact = findViewById(R.id.detailContact);
        rate = findViewById(R.id.detailRate);
        time = findViewById(R.id.detailTime);

        title.setText(equipment.getTitle());
        type.setText(equipment.getType());
        desc.setText(equipment.getDescription());
        contact.setText(equipment.getContact());
        rate.setText(equipment.getRate());
        time.setText(equipment.getTime());
        Picasso.get().load(equipment.getImg_url()).into(img);

    }
}
