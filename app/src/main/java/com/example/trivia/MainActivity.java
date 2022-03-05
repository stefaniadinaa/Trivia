package com.example.trivia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn_adevarat;
    private Button btn_fals;
    private ImageButton btn_next;
    private TextView tv_intrebare;

    private int indexIntrebare = 0;

    private Intrebare[] nintrebari = new Intrebare[]{
            new Intrebare(R.string.intrebare1, false),
            new Intrebare(R.string.intrebare2, false),
            new Intrebare(R.string.intrebare3, true),
            new Intrebare(R.string.intrebare4, false),
            new Intrebare(R.string.intrebare5, true),
            new Intrebare(R.string.intrebare6, true),
            new Intrebare(R.string.intrebare7, false),
            new Intrebare(R.string.intrebare8, false),
            new Intrebare(R.string.intrebare9, true),
            new Intrebare(R.string.intrebare10, true),
            new Intrebare(R.string.intrebare11, false),
            new Intrebare(R.string.intrebare12, false),
            new Intrebare(R.string.intrebare13, true),
            new Intrebare(R.string.intrebare14, false),
            new Intrebare(R.string.intrebare15, true),
            new Intrebare(R.string.intrebare16, true),
            new Intrebare(R.string.intrebare17, false),
            new Intrebare(R.string.intrebare18, true),
            new Intrebare(R.string.intrebare19, true),
            new Intrebare(R.string.intrebare20, false),
            new Intrebare(R.string.intrebare21, false),
            new Intrebare(R.string.intrebare22, false),
            new Intrebare(R.string.intrebare23, true),
            new Intrebare(R.string.intrebare24, true),
            new Intrebare(R.string.intrebare25, false),
            new Intrebare(R.string.intrebare26, true),
            new Intrebare(R.string.intrebare27, false),
            new Intrebare(R.string.intrebare28, false),
            new Intrebare(R.string.intrebare29, false),
            new Intrebare(R.string.intrebare30, true),
            new Intrebare(R.string.intrebare31, true),
            new Intrebare(R.string.intrebare32, false),
            new Intrebare(R.string.intrebare33, false),
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn_adevarat = findViewById(R.id.btn_adevarat);
        btn_fals = findViewById(R.id.btn_fals);
        btn_next = findViewById(R.id.btn_urmatoare);
        tv_intrebare = findViewById(R.id.tv_intrebare);


        btn_adevarat.setOnClickListener(this);
        btn_fals.setOnClickListener(this);
        btn_next.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_adevarat:

                verificaRaspuns(true);
                break;

            case R.id.btn_fals:

                verificaRaspuns(false);
                break;

            case R.id.btn_urmatoare:
                indexIntrebare = (indexIntrebare + 1) % nintrebari.length;
                nextIntrebare();
                break;
        }
    }

    public void nextIntrebare() {
        tv_intrebare.setText(nintrebari[indexIntrebare].getIntrebareText());
    }

    public void verificaRaspuns(boolean raspunsUtilizator) {
        boolean raspunsIntrebare = nintrebari[indexIntrebare].isRaspunsIntrebare();
        int mesaj = 0;

        if (raspunsIntrebare == raspunsUtilizator) {
            mesaj = R.string.adevarat;
        } else {
            mesaj = R.string.fals;
        }
        Toast.makeText(getApplicationContext(), mesaj, Toast.LENGTH_LONG).show();
    }
}