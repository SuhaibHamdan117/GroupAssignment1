package edu.cs.birzeit.groupassignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {
    private EditText txtco;
    private EditText txtma;
    private EditText txtpy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        setup();
    }

    private void setup() {
        txtco =findViewById(R.id.txtco);
        txtma =findViewById(R.id.txtma);
        txtpy =findViewById(R.id.txtpy);
    }

    public void btn_onClick(View view) {
        InputMethodManager mgr = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        mgr.hideSoftInputFromWindow(view.getWindowToken(), 0);
        String whyCollege=txtco. getText(). toString();
        String whyMajor=txtma. getText(). toString();
        String payment=txtpy. getText(). toString();
        if(validate()==true) {
            Toast.makeText(this, "Your data has been saved", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, MainActivity4.class);
            startActivity(intent);
        }
    }
    public boolean validate() {
        String whyCollege = txtco.getText().toString();
        String whyMajor = txtma.getText().toString();
        String payment = txtpy.getText().toString();
        if (whyCollege.isEmpty()) {
            txtco.setError("Field can not be empty");
            return false;
        }
        if (whyMajor.isEmpty()) {
            txtma.setError("Field can not be empty");
            return false;
        }
        if (payment.isEmpty()) {
            txtpy.setError("Field can not be empty");
            return false;
        }
        return true;
    }
}