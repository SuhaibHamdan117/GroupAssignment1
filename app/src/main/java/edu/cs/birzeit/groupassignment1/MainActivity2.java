package edu.cs.birzeit.groupassignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    private EditText txtm1;
    private EditText txtm2;
    private EditText txtm3;
    private EditText txtt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setup();
    }

    private void setup() {

        txtm1 =findViewById(R.id.txtm1);
        txtm2 =findViewById(R.id.txtm2);
        txtm3 =findViewById(R.id.txtm3);
        txtt =findViewById(R.id.txtt);
    }

    public void btn_onClick(View view) {
        InputMethodManager mgr = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        mgr.hideSoftInputFromWindow(view.getWindowToken(), 0);

        String first=txtm1. getText(). toString();
        String second=txtm2. getText(). toString();
        String third=txtm3. getText(). toString();
        String average=txtt. getText(). toString();
        if(validate()==true) {
            Toast.makeText(this, "Your data has been saved", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, MainActivity3.class);
            startActivity(intent);
        }
    }
    public boolean validate() {
        String first = txtm1.getText().toString();
        String second = txtm2.getText().toString();
        String third = txtm3.getText().toString();
        String average = txtt.getText().toString();
        if (first.isEmpty()) {
            txtm1.setError("Field can not be empty");
            return false;
        }
        if (second.isEmpty()) {
            txtm2.setError("Field can not be empty");
            return false;
        }
        if (third.isEmpty()) {
            txtm3.setError("Field can not be empty");
            return false;
        }
        if (average.isEmpty()) {
            txtt.setError("Field can not be empty");
            return false;
        }
        return true;
    }

}