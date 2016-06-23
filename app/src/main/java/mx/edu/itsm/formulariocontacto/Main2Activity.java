package mx.edu.itsm.formulariocontacto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView rname;
    TextView rphone;
    TextView remail;
    TextView rdescripcion;
    TextView rfecha;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);



        rname = (TextView) findViewById(R.id.textView3);
        rphone = (TextView) findViewById(R.id.textView4);
        remail =(TextView) findViewById(R.id.textView6);
        rdescripcion = (TextView) findViewById(R.id.textView8);
        rfecha = (TextView) findViewById(R.id.textView10);

        Bundle parametros = getIntent().getExtras();
        String nom = parametros.getString("nombre");
        String tel = parametros.getString("telefono");
        String email = parametros.getString("email");
        String desc = parametros.getString("descripcion");
        String dias = parametros.getString("dia");

         rname.setText(nom);
        rphone.setText(tel);
        remail.setText(email);
        rdescripcion.setText(desc);
        rfecha.setText(dias);

    }
}
