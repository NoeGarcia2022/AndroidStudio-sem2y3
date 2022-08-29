package com.nagv.apppractica3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CapturarClicDeUnBoton extends AppCompatActivity {
    private EditText et1,et2;
    private TextView tv3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_capturar_clic_de_un_boton);

        et1=(EditText) findViewById(R.id.edt1);
        et2=(EditText) findViewById(R.id.edt2);
        tv3=(TextView) findViewById(R.id.resul);

    }

    //Metodo para mostrar y ocultar el menu
    /*este codigo siempre lo tengo que copiar en todas las activity*/
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.item1:
                Intent intent1=new Intent(this, CapturarClicDeUnBoton.class);
                startActivity(intent1);
                return true;

            case R.id.item2:
                //Toast.makeText(this, "opcion2", Toast.LENGTH_SHORT).show();
                Intent intent2=new Intent(this, ControlesRadioGroup_RadioButton.class);
                startActivity(intent2);
                return true;

            case R.id.item3:
                //Toast.makeText(this, "opcion2", Toast.LENGTH_SHORT).show();
                Intent intent3=new Intent(this, ControlCheckBox.class);
                startActivity(intent3);
                return true;

            case R.id.item4:
                Intent intent4=new Intent(this, ControlSpinner.class);
                startActivity(intent4);
                return true;

            case R.id.item5:
                Intent intent5=new Intent(this, ControlListView.class);
                startActivity(intent5);
                return true;

            case R.id.item6:
                Intent intent6=new Intent(this, ControlImageButton.class);
                startActivity(intent6);
                return true;

            case R.id.item7:
                Intent intent7=new Intent(this, ClaseToast.class);
                startActivity(intent7);
                return true;

            case R.id.item8:
                Intent intent8=new Intent(this, ControlEditText.class);
                startActivity(intent8);
                return true;

            case R.id.item9:
                Intent intent9=new Intent(this, LanzarSegundoActivity.class);
                startActivity(intent9);
                return true;

            case R.id.item11:
                Intent intent11=new Intent(this, SegundoActivityConParametros.class);
                startActivity(intent11);

            case R.id.item12:
                Intent intent12=new Intent(this, ClaseSharedPreferences.class);
                startActivity(intent12);
                return true;

            case R.id.item13:
                Intent intent13=new Intent(this, Problema2.class);
                startActivity(intent13);
                return true;

            case R.id.item14:
                Intent intent14=new Intent(this, MainActivity.class);
                startActivity(intent14);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
    //hasta aqui
    //Este metodo se ejecutara cuando se presione el boton
    public void Sumar(View view) {
        String valor1=et1.getText().toString();
        String valor2=et2.getText().toString();
        if (valor1.length()==0 && valor2.length()==0){
            Toast.makeText(this, "Debes completar todos los campos!!!!", Toast.LENGTH_SHORT).show();

        }
        if (valor1.length() !=0 && valor2.length() !=0){
            int nro1=Integer.parseInt(valor1);
            int nro2=Integer.parseInt(valor2);
            int suma=nro1+nro2;
            String resul=String.valueOf(suma);
            tv3.setText(resul);
        }
    }
}