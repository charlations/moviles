package mx.tec.exampleone;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TargetActivity extends AppCompatActivity {

    Intent currentIntent;
    TextView usernameText;
    String usernameVar;
    Button backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_target);

        currentIntent = getIntent();
        usernameVar = currentIntent.getStringExtra("username");

        usernameText = findViewById(R.id.usernametext);
        usernameText.setText(usernameVar);

        backButton = findViewById(R.id.backButton);
        backButton.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent backIntent = new Intent( TargetActivity.this, MainActivity.class );
                startActivity(backIntent);
            }
        });

    }
}
