package net.jessicaurrego.calories;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity
{
    Spinner Fruta;
    Spinner Bebida;
    Spinner Comida;

    String[] datosfruta = {"Seleccione una fruta...", "Manzana", "Pera", "Banano" +
            "" +
            "", "Uva", "Naranja"};
    String [] datosbebida = {"Selecciona una bebida...", "Coca-cola", "Agua", "Malteada", "Coca-cola Light", "Cerveza"};
    String[] datoscomida = {"Selecciona una comida...", "Margarita", "Chocolate", "Galletas", "Caramelos", "Frituras"};


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Fruta = (Spinner)findViewById(R.id.FrutaSpinn);
        Bebida = (Spinner)findViewById(R.id.BebidaSpinn);
        Comida = (Spinner)findViewById(R.id.ComidaSpinn);


        ArrayAdapter<String> frutaadaptador = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,datosfruta);
        Fruta.setAdapter(frutaadaptador);

        ArrayAdapter<String> bebidaadaptador = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, datosbebida);
        Bebida.setAdapter(bebidaadaptador);

        ArrayAdapter<String> comidaadaptador = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, datoscomida);
        Comida.setAdapter(comidaadaptador);




        Fruta.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {

                    case 0:
                        Toast to = Toast.makeText(getApplicationContext(), "Selecciona una fruta", Toast.LENGTH_LONG);
                        to.show();
                        break;

                    case 1:
                        Intent mz = new Intent(MainActivity.this, Manzana.class);
                        startActivity(mz);
                        break;

                    case 2:
                        Intent pr = new Intent(MainActivity.this, Pera.class);
                        startActivity(pr);
                        break;

                    case 3:
                        Intent bn = new Intent(MainActivity.this, Banano.class);
                        startActivity(bn);
                        break;

                    case 4:
                        Intent uv = new Intent(MainActivity.this, Uva.class);
                        startActivity(uv);
                        break;

                    case 5:
                        Intent nj = new Intent(MainActivity.this, Naranja.class);
                        startActivity(nj);
                        break;


                }


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }


        });

        Bebida.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
            {
                switch (position)
                {
                    case 0:
                        Toast to = Toast.makeText(getApplicationContext(), "Selecciona una bebida", Toast.LENGTH_LONG);
                        to.show();
                        break;

                    case 1:
                        Intent cc = new Intent(MainActivity.this, CocaCola.class);
                        startActivity(cc);
                        break;

                    case 2:
                        Intent ag = new Intent(MainActivity.this, Agua.class);
                        startActivity(ag);
                        break;

                    case 3:
                        Intent ma = new Intent(MainActivity.this, Malteada.class);
                        startActivity(ma);
                        break;

                    case 4:
                        Intent ccl = new Intent(MainActivity.this, CocaColaLight.class);
                        startActivity(ccl);
                        break;

                    case 5:
                        Intent cv = new Intent(MainActivity.this, Cerveza.class);
                        startActivity(cv);
                        break;


                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        Comida.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
            {
                switch (position)
                {
                    case 0:
                        Toast to = Toast.makeText(getApplicationContext(), "Selecciona una comida", Toast.LENGTH_LONG);
                        to.show();
                        break;

                    case 1:
                        Intent mg = new Intent(MainActivity.this, Margarita.class);
                        startActivity(mg);
                        break;

                    case 2:
                        Intent ch = new Intent(MainActivity.this, Chocolate.class);
                        startActivity(ch);
                        break;

                    case 3:
                        Intent gll = new Intent(MainActivity.this, Galletas.class);
                        startActivity(gll);
                        break;

                    case 4:
                        Intent cr = new Intent(MainActivity.this, Caramelos.class);
                        startActivity(cr);
                        break;

                    case 5:
                        Intent fri = new Intent(MainActivity.this, Frituras.class);
                        startActivity(fri);
                        break;


                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });




    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();


        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    }



