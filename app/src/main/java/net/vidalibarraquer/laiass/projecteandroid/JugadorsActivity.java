package net.vidalibarraquer.laiass.projecteandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class JugadorsActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Spinner spinner;
    EditText et_jugador1;
    EditText et_jugador2;
    EditText et_jugador3;
    EditText et_jugador4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jugadors);
        spinner = (Spinner) findViewById(R.id.spinner);
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.jugadors, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);

        et_jugador1=(EditText)findViewById(R.id.et_jugador1);
        et_jugador2=(EditText)findViewById(R.id.et_jugador2);
        et_jugador3=(EditText)findViewById(R.id.et_jugador3);
        et_jugador4=(EditText)findViewById(R.id.et_jugador4);

        ferInvisible();
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        switch (position){
            case 0:
                ferInvisible();
                et_jugador1.setVisibility(View.VISIBLE);
                et_jugador2.setVisibility(View.VISIBLE);
                break;
            case 1:
                ferInvisible();
                et_jugador1.setVisibility(View.VISIBLE);
                et_jugador2.setVisibility(View.VISIBLE);
                et_jugador3.setVisibility(View.VISIBLE);
                break;
            case 2:
                ferInvisible();
                et_jugador1.setVisibility(View.VISIBLE);
                et_jugador2.setVisibility(View.VISIBLE);
                et_jugador3.setVisibility(View.VISIBLE);
                et_jugador4.setVisibility(View.VISIBLE);
                break;
        }
    }

    public void ferInvisible(){
        et_jugador1.setVisibility(View.INVISIBLE);
        et_jugador2.setVisibility(View.INVISIBLE);
        et_jugador3.setVisibility(View.INVISIBLE);
        et_jugador4.setVisibility(View.INVISIBLE);
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
