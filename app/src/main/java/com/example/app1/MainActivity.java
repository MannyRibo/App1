package com.example.app1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String antwoord1;
    String antwoord2;
    String antwoord3;
    String antwoord4;

    String correctAntwoord1 = "T";
    String correctAntwoord2 = "F";
    String correctAntwoord3 = "F";
    String correctAntwoord4 = "F";

    private Button submitButton;
    private EditText editText1, editText2, editText3, editText4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = (EditText) findViewById(R.id.editText1);
        editText2 = (EditText) findViewById(R.id.editText2);
        editText3 = (EditText) findViewById(R.id.editText3);
        editText4 = (EditText) findViewById(R.id.editText4);

        submitButton = (Button) findViewById(R.id.submitButton);

        submitButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                antwoord1 = editText1.getText().toString();
                antwoord2 = editText2.getText().toString();
                antwoord3 = editText3.getText().toString();
                antwoord4 = editText4.getText().toString();

                if (alleAntwoordenCorrect()) {
                    Toast.makeText(MainActivity.this, "Alle antwoorden zijn juist", Toast.LENGTH_LONG).show();
                }
                else {
                    Toast.makeText(MainActivity.this, "Niet alle antwoorden zijn juist", Toast.LENGTH_LONG).show();
                }
            }
        });

    }

    public boolean alleAntwoordenCorrect() {
        if (antwoord1.equals(correctAntwoord1) && antwoord2.equals(correctAntwoord2) &&
                antwoord3.equals(correctAntwoord3) && antwoord3.equals(correctAntwoord3) &&
                antwoord4.equals(correctAntwoord4)) {
            return true;
        }
        return false;

    }

        }