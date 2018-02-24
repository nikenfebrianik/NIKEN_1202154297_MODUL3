package id.showup.niken.niken_1202154297_modul3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().hide();
        final EditText tuser = findViewById(R.id.username);
        final EditText tpass = findViewById(R.id.password);
        Button blogin = findViewById(R.id.BtnPesan);
        blogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tuser.getText().length()==0){
                    tuser.setError("Enter The Right Username");
                }
                else if (tpass.getText().length()==0){
                    tpass.setError("Enter The Right Password");
                }
                else if(tuser.getText().toString().equals("EAD") && tpass.getText().toString().equals("MOBILE")){
                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(),"Horay Success",Toast.LENGTH_LONG).show();
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Wrong Username or Password",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}