package es.escuelaestech.chopo.relative_layouts_jesus_perezmontes;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Arrays;

public class Main2Activity extends AppCompatActivity {

    public static final String KEY_DATA_STRING = "es.estech.ejemplointent.KEY_DATO_STRING";
    public static final String KEY_DATA_INT = "es.estech.ejemplointent.KEY_DATO_INT";
    private String dataString;
    private int dataInt;
    private int[] numbers;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        dataString = null;


        if (getIntent().hasExtra(KEY_DATA_STRING)) {
            dataString = getIntent().getStringExtra(KEY_DATA_STRING);

            final TextView text1 = findViewById(R.id.text1);
            text1.setText(dataString);

        } else {
            throw new IllegalArgumentException("Activity cannot find  extra: " + KEY_DATA_STRING);
        }



        if (getIntent().hasExtra(KEY_DATA_INT)) {
            dataInt = getIntent().getIntExtra(KEY_DATA_INT, -1);

            final TextView text2 = findViewById(R.id.text2);
            text2.setText(String.valueOf(dataInt));

        } else {
            throw new IllegalArgumentException("Activity cannot find  extra: " + KEY_DATA_INT);
        }

        if (getIntent().hasExtra("array")) {
            numbers = getIntent().getIntArrayExtra("array");

            final TextView text3 = findViewById(R.id.text3);
            text3.setText(String.valueOf(Arrays.toString(numbers)));

        } else {
            throw new IllegalArgumentException("Activity cannot find  extra: array");
        }
        Toast.makeText(Main2Activity.this,
                dataString, Toast.LENGTH_LONG).show();
        Toast.makeText(Main2Activity.this,
                Integer.toString(dataInt), Toast.LENGTH_LONG).show();
        Toast.makeText(Main2Activity.this,
                Arrays.toString(numbers), Toast.LENGTH_LONG).show();
    }
}
