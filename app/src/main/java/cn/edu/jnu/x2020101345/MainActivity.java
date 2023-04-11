package cn.edu.jnu.x2020101345;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonCalculate=this.findViewById(R.id.button_calculate);
        EditText editTextScores=this.findViewById(R.id.editText_frame_scores);
        TextView textViewScore=this.findViewById(R.id.textView_score);

        buttonCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Scores=editTextScores.getText().toString();
                String []arrayScores=Scores.split(",");
                BowlingGame game=new BowlingGame();
                for(int i=0;i< arrayScores.length;i++)
                {
                    game.roll(Integer.parseInt(arrayScores[i]));
                }

                textViewScore.setText("total Score is"+game.score());

            }
        });

    }
}