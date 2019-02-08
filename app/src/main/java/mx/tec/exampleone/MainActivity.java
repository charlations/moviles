package mx.tec.exampleone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
// Imports
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {
    Button changeBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        changeBtn = findViewById(R.id.changebutton);
        changeBtn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent changeIntent = new Intent( MainActivity.this, TargetActivity.class );
                changeIntent.putExtra("valueKey", "valueContent");
                changeIntent.putExtra("user.name", "Carla Herrera");
                startActivity(changeIntent);
            }
        });
    }
}
