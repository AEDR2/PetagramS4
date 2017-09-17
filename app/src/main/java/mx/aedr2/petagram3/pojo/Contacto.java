package mx.aedr2.petagram3.pojo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import mx.aedr2.petagram3.R;

public class Contacto extends AppCompatActivity {
    Button bEnvio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacto);

        bEnvio = (Button) findViewById(R.id.bEnvio);

    }
}
