package com.example.mlrit.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText et1,et2,et3;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1=(EditText)findViewById(R.id.editText);
        et2=(EditText)findViewById(R.id.editText2);
        et3=(EditText)findViewById(R.id.editText3);
        b=(Button)findViewById(R.id.button);


        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if((et1.getText().toString()).equals("")) {
                    et1.setError("Enter Name");
                }
                else
                {
                    if((et2.getText().toString().equals(""))
                    {
                        et2.setError("Enter email");
                    }
                    else

                }
                }
                else {
                    Toast.makeText(MainActivity.this, "REGISTERED", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
