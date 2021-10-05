package com.example.inclass02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
/*
        Button btn = (Button) findViewById(R.id.signinButton);  // ref to the Button view
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Main2Activity.class));
            }
        });
*/
    }

    // This function is called when we CLICK on the Button
    public  void showMe(View V){
        // get the ref for the label
        TextView tv = (TextView) findViewById(R.id.myTextView);
        // set a string to the label
        // tv.setText("My new class");

        // Get the UserName & display in the Label
        // #1: get the Ref to the editText (UserName)
        EditText uName = (EditText) findViewById(R.id.etUserName);

        // #2: get the user entry value
        // #3: set the value to the label
        tv.setText(uName.getText().toString());

        String userN = uName.getText().toString();

        if (userN.equals("user1")) {

            // Toast
            //Toast.makeText(this, uName.getText().toString(), Toast.LENGTH_LONG).show();
            Toast.makeText(this, "VALID USERNAME", Toast.LENGTH_LONG).show();
            ImageView image = (ImageView) findViewById(R.id.imageView);
            image.setImageResource((R.drawable.apple));

            // Navigate to 2nd view
            // pass user1, pwd1 to the second activity

            Intent intent = new Intent(this, Main2Activity.class);
            // pass data to second activity
            intent.putExtra("USERN", "user1Hardcoded");  // key , value
            intent.putExtra("PWD", "user1Hardcoded");
            startActivity(intent);

        }
    }


}
