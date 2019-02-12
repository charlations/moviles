package mx.tec.lab3;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Context myContext;
    Button startButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myContext = getApplicationContext();

        // Positive, Negative and Neutral answer button Dialog

        AlertDialog.Builder dialogConf = new AlertDialog.Builder(this);
        dialogConf.setTitle("Confirmation Dialog");
        dialogConf.setMessage("This is the dialog text");
        dialogConf.setIcon(R.mipmap.ic_launcher);

        dialogConf.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int id) {
                Toast.makeText(myContext, "Answered YES", Toast.LENGTH_SHORT).show();
            }
        });
        dialogConf.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int id) {
                Toast.makeText(myContext, "Answered NO", Toast.LENGTH_SHORT).show();
            }
        });
        dialogConf.setNeutralButton("Close", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int id) {
                Toast.makeText(myContext, "Closed dialog", Toast.LENGTH_SHORT).show();
            }
        });

        // Text input Dialog

        AlertDialog.Builder inputDialogConf = new AlertDialog.Builder(this);
        inputDialogConf.setTitle("Confirmation Dialog");
        inputDialogConf.setMessage("This is the dialog text");
        inputDialogConf.setIcon(R.mipmap.ic_launcher);

        final EditText TextInput = new EditText(myContext);
        TextInput.setTextColor(Color.BLUE);
        inputDialogConf.setView(TextInput);

        inputDialogConf.setNeutralButton("Close", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int id) {
                String str = TextInput.getEditableText().toString();
                Toast.makeText(myContext, "Wrote: " + str, Toast.LENGTH_LONG).show();
            }
        });

        final AlertDialog myDialog = inputDialogConf.create();

        startButton = findViewById(R.id.callButton);
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDialog.show();
            }
        });

    }
}
