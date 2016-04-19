package patrickadams.sumapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public EditText num1;
    public EditText num2;
    public TextView addResult;
    public Button add;

    int first, second, result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = (EditText)findViewById(R.id.editText);
        num2 = (EditText)findViewById(R.id.editText2);
        addResult = (TextView)findViewById(R.id.textView);
        add = (Button)findViewById(R.id.button);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                first = Integer.parseInt(num1.getText().toString());
                second = Integer.parseInt(num2.getText().toString());

                result = subtract(first, second);
                addResult.setText(Integer.toString(result));
            }
        });
    }

    public int subtract(int num1, int num2){
        return num1 - num2;
    }
}
