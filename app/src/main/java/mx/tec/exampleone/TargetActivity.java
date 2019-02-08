package mx.tec.exampleone;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class TargetActivity extends AppCompatActivity {

    Intent currentIntent;
    TextView usernameText;
    String usernameVar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_target);

        currentIntent = getIntent();
        usernameVar = currentIntent.getStringExtra("user.name");

        usernameText = findViewById(R.id.usernametext);
        usernameText.setText(usernameVar);

    }
}
