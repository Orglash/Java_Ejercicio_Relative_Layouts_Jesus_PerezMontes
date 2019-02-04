package es.escuelaestech.chopo.relative_layouts_jesus_perezmontes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final String text = "Perico de los palotes.";
        final int number = 10;

        final int[] numbers = new int[]{ 1,2,3,4,5,6,7,8,9,10 };

        final Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra(Main2Activity.KEY_DATA_STRING, text);
                intent.putExtra(Main2Activity.KEY_DATA_INT, number);


                intent.putExtra("array", numbers);
                startActivity(intent);
            }
        });


    }
}
