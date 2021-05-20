package edu.cs.birzeit.groupassignment1;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Spinner spinl;
    private EditText txtf;
    private EditText txtl;
    private EditText txte;
    private EditText txtp;
    private EditText txtpa;
    private EditText txtd;
    RadioButton ragf;
    RadioButton ragm;
    RadioGroup rgroup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setup();
        populateSpinner();
        ragm.setChecked(true);
    }
    private void setup() {
        txtf =findViewById(R.id.txtf);
        txtl =findViewById(R.id.txtl);
        txte =findViewById(R.id.txte);
        txtp =findViewById(R.id.txtp);
        txtpa =findViewById(R.id.txtpa);
        spinl =(Spinner) findViewById(R.id.spinl);
        txtd=findViewById(R.id.txtd);
        rgroup =findViewById(R.id.rgroup);
        ragf =findViewById(R.id.ragf);
        ragm =findViewById(R.id.ragm);
    }
    private void populateSpinner() {
        ArrayList<String> data=new ArrayList<>();
        data.add("Married");
        data.add("Single");
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,data);
        spinl.setAdapter(adapter);
    }

    public void btn_onClick(View view) {
        InputMethodManager mgr = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        mgr.hideSoftInputFromWindow(view.getWindowToken(), 0);

        String first=txtf. getText(). toString();
        String last=txtl. getText(). toString();
        String email=txte. getText(). toString();
        String phone=txtp. getText(). toString();
        String address=txtpa. getText(). toString();
        String date=txtd. getText(). toString();
        int status = spinl.getSelectedItemPosition();
        if(validate()==true) {
            Toast.makeText(this, "Your data has been saved", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, MainActivity2.class);
            startActivity(intent);
        }
    }
    public boolean validate() {
        String first = txtf.getText().toString();
        String last = txtl.getText().toString();
        String email = txte.getText().toString();
        String phone = txtp.getText().toString();
        String address = txtpa.getText().toString();
        String date = txtd.getText().toString();
        if (first.isEmpty()) {
            txtf.setError("Field can not be empty");
            return false;
        }
        if (last.isEmpty()) {
            txtl.setError("Field can not be empty");
            return false;
        }
        if (email.isEmpty()) {
            txte.setError("Field can not be empty");
            return false;
        }
        if (phone.isEmpty()) {
            txtp.setError("Field can not be empty");
            return false;
        }
        if (address.isEmpty()) {
            txtpa.setError("Field can not be empty");
            return false;
        }
        if (date.isEmpty()) {
            txtd.setError("Field can not be empty");
            return false;
        }
        return true;
    }


}