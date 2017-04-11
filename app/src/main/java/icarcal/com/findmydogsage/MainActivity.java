package icarcal.com.findmydogsage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /**
     * The discover age button
     */
    private Button discoverAgeButton;

    /**
     * The user input text
     */
    private EditText inputText;

    /**
     * The response field
     */
    private TextView responseText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        discoverAgeButton = (Button) findViewById(R.id.discoverAgeButton);
        inputText = (EditText) findViewById(R.id.dogsAgeText);
        responseText = (TextView) findViewById(R.id.responseText);

        discoverAgeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userInput = inputText.getText().toString();

                if (userInput.isEmpty()) {
                    responseText.setText("Digite o texto para a conversão");
                } else {
                    int dogsAgeParsed = Integer.parseInt(userInput);

                    responseText.setText("A idade do seu cachorro em anos humanos é " + (dogsAgeParsed * 7) + " anos");
                }
            }
        });
    }
}
