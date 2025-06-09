package kr.ac.kopo.direct7_1_2025;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText editAngle;
    ImageView imgv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        editAngle = findViewById(R.id.edit_angle);
        imgv = findViewById(R.id.imgv);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        super.onOptionsItemSelected(item);
        item.setChecked(true);
        if(item.getItemId() == R.id.item_ratation){
            int angle = Integer.parseInt(editAngle.getText().toString());
            imgv.setRotation(angle);
            return true;
        }else if(item.getItemId() == R.id.item_italy){
            imgv.setImageResource(R.drawable.trip01);
            return true;
        }else if(item.getItemId() == R.id.item_france){
            imgv.setImageResource(R.drawable.trip02);
            return true;
        }else if(item.getItemId() == R.id.item_swiss){
            imgv.setImageResource(R.drawable.trip03);
            return true;
        }
        return false;
    }
}