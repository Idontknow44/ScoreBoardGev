package com.example.scoreboardgev;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    int scoreA = 0;
    int scoreB = 0;

    TextView tvScoreA;
    TextView tvScoreB;

    TextView tvErrorMsA;
    TextView tvErrorMsB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Button btnStart = findViewById(R.id.btnStart);
        btnStart.setOnClickListener(v ->
                Toast.makeText(this, "game started", Toast.LENGTH_SHORT).show()
        );
        tvScoreA = findViewById(R.id.tvScoreA);
        tvScoreB = findViewById(R.id.tvScoreB);

        tvErrorMsA = findViewById(R.id.tvErrorMsA);
        tvErrorMsB = findViewById(R.id.tvErrorMsB);


        Button btnA3 = findViewById(R.id.btnA3);
        Button btnB3 = findViewById(R.id.btnB3);

        Button btnA2 = findViewById(R.id.btnA2);
        Button btnB2 = findViewById(R.id.btnB2);

        Button btnA1 = findViewById(R.id.btnA1);
        Button btnB1 = findViewById(R.id.btnB1);

        Button btnAM = findViewById(R.id.btnAM);
        Button btnBM = findViewById(R.id.btnBM);


        btnA3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvErrorMsA.setText("");
                scoreA = scoreA + 3;
                tvScoreA.setText(String.valueOf(scoreA));
            }
        });

        btnB3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvErrorMsB.setText("");
                scoreB = scoreB + 3;
                tvScoreB.setText(String.valueOf(scoreB));
            }
        });


        btnA2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvErrorMsA.setText("");
                scoreA = scoreA + 2;
                tvScoreA.setText(String.valueOf(scoreA));
            }
        });

        btnB2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvErrorMsB.setText("");
                scoreB = scoreB + 2;
                tvScoreB.setText(String.valueOf(scoreB));
            }
        });


        btnA1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvErrorMsA.setText("");
                scoreA = scoreA + 1;
                tvScoreA.setText(String.valueOf(scoreA));
            }
        });

        btnB1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvErrorMsB.setText("");
                scoreB = scoreB + 1;
                tvScoreB.setText(String.valueOf(scoreB));
            }
        });


        btnAM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (scoreA <= 0)
                {
                    tvErrorMsA.setText("cannot go lower than 0");
                    return;
                }
                scoreA = scoreA - 1;
                tvScoreA.setText(String.valueOf(scoreA));
            }
        });

        btnBM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (scoreB <= 0)
                {
                    tvErrorMsB.setText("cannot go lower than 0");
                    return;
                }
                scoreB = scoreB - 1;
                tvScoreB.setText(String.valueOf(scoreB));
            }
        });



        Button btnReset = findViewById(R.id.btnReset);
        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreA = 0;
                scoreB = 0;
                tvScoreA.setText(String.valueOf(scoreA));
                tvScoreB.setText(String.valueOf(scoreB));
            }
        });
    }
}