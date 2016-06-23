package mx.edu.itsm.formulariocontacto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText name;
    EditText phone;
    EditText email;
    EditText descripcion;
    Button enviar;
    DatePicker datePicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = (EditText) findViewById(R.id.tvNombre);
        phone = (EditText) findViewById(R.id.TvTelefono);
        email = (EditText) findViewById(R.id.TvEmail);
        descripcion = (EditText) findViewById(R.id.tvDescripcion);
        datePicker = (DatePicker) findViewById(R.id.datePicker);
        enviar =(Button) findViewById(R.id.btnEnviar);


        enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fecha = datePicker.getDayOfMonth()+" "+ datePicker.getMonth()+" "+ datePicker.getYear();
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("nombre",name.getText().toString());
                intent.putExtra("telefono",phone.getText().toString());
                intent.putExtra("email",email.getText().toString());
                intent.putExtra("descripcion",descripcion.getText().toString());
                intent.putExtra("dia",fecha);


                startActivity(intent);
                }
        });


    }
}
