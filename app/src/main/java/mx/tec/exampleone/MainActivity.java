package mx.tec.exampleone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
// Imports
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button changeBtn;
    EditText usernameInput;
    String usernameVar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usernameInput = findViewById(R.id.editTextName);

        changeBtn = findViewById(R.id.changebutton);
        changeBtn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                usernameVar = usernameInput.getText().toString();
                Intent changeIntent = new Intent( MainActivity.this, TargetActivity.class );
                changeIntent.putExtra("username", usernameVar);
                startActivity(changeIntent);
            }
        });
    }
}
