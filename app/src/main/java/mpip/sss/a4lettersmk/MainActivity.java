package mpip.sss.a4lettersmk;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity {

    private static boolean RUN_ONCE = true;
    private static final String PREFS="highscores_pref";
    private long timeCountInMilliSeconds;
    private ProgressBar barTimer;
    private CountDownTimer countDownTimer;
    private String line;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_scores=(Button) findViewById(R.id.scores);
        Button btn_highscores=(Button) findViewById(R.id.highscores);

        SharedPreferences sp=getSharedPreferences(PREFS, 0);
        String highscores_str=sp.getString("highscores_str", "0");
        btn_highscores.setText(highscores_str);


        if(RUN_ONCE){
            btn_scores.setText("0");
        }
        else{
            btn_scores.setText(getIntent().getExtras().getString("scores_str"));
        }


        runOnce();

        Scanner s = new Scanner(getResources().openRawResource(R.raw.words));
        ArrayList<String> list = new ArrayList<>();

        try {
            while (s.hasNextLine()) {
                list.add(s.nextLine());
            }
        } finally {
            s.close();
        }

        line=list.get(new Random().nextInt(list.size()));
        char [] letters=line.toCharArray();
        Arrays.sort(letters);
        String newWord=new String(letters);
        
        final String l3=String.valueOf(newWord.charAt(0));
        final String l2=String.valueOf(newWord.charAt(1));
        final String l4=String.valueOf(newWord.charAt(2));
        final String l1=String.valueOf(newWord.charAt(3));



 
        final Button button1 = (Button) findViewById(R.id.button1);
        final Button button2 = (Button) findViewById(R.id.button2);
        final Button button3 = (Button) findViewById(R.id.button3);
        final Button button4 = (Button) findViewById(R.id.button4);

        button1.setText(l1);
        button2.setText(l2);
        button3.setText(l3);
        button4.setText(l4);

        final Button btn1 = (Button) findViewById(R.id.btn1);
        final Button btn2 = (Button) findViewById(R.id.btn2);
        final Button btn3 = (Button) findViewById(R.id.btn3);
        final Button btn4 = (Button) findViewById(R.id.btn4);


        barTimer = (ProgressBar) findViewById(R.id.barTimer);

        timeCountInMilliSeconds = 10000;
        setProgressBarValues();
        startCountDownTimer();





        //za kopcinjata vo krugot funkcii
        //-----------------------------------------------------------------------------


        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Button b1 = (Button) findViewById(R.id.btn1);
                Button b2 = (Button) findViewById(R.id.btn2);
                Button b3 = (Button) findViewById(R.id.btn3);
                Button b4 = (Button) findViewById(R.id.btn4);

                if (b1.getText() == "") {
                    b1.setText(l1);
                    b1.setBackgroundResource(R.drawable.round_button);
                    b1.setEnabled(true);
                } else if (b2.getText() == "") {
                    b2.setText(l1);
                    b2.setBackgroundResource(R.drawable.round_button);
                    b2.setEnabled(true);
                } else if (b3.getText() == "") {
                    b3.setText(l1);
                    b3.setBackgroundResource(R.drawable.round_button);
                    b3.setEnabled(true);
                } else {
                    b4.setText(l1);
                    b4.setBackgroundResource(R.drawable.round_button);
                    b4.setEnabled(true);
                    CheckWords(btn1, btn2, btn3, btn4);

                }

                button1.setTextColor(Color.parseColor("#e5d7d7"));
                button1.setBackgroundResource(R.drawable.round_blank_button);
                button1.setEnabled(false);

            }
        });


        //-----------------------------------------------------------------------------

        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Button b1 = (Button) findViewById(R.id.btn1);
                Button b2 = (Button) findViewById(R.id.btn2);
                Button b3 = (Button) findViewById(R.id.btn3);
                Button b4 = (Button) findViewById(R.id.btn4);

                if (b1.getText() == "") {
                    b1.setText(l2);
                    b1.setBackgroundResource(R.drawable.round_button);
                    b1.setEnabled(true);
                } else if (b2.getText() == "") {
                    b2.setText(l2);
                    b2.setBackgroundResource(R.drawable.round_button);
                    b2.setEnabled(true);
                } else if (b3.getText() == "") {
                    b3.setText(l2);
                    b3.setBackgroundResource(R.drawable.round_button);
                    b3.setEnabled(true);
                } else {
                    b4.setText(l2);
                    b4.setBackgroundResource(R.drawable.round_button);
                    b4.setEnabled(true);
                    CheckWords(btn1, btn2, btn3, btn4);

                }

                button2.setTextColor(Color.parseColor("#e5d7d7"));
                button2.setBackgroundResource(R.drawable.round_blank_button);
                button2.setEnabled(false);
            }
        });


        //-----------------------------------------------------------------------------

        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Button b1 = (Button) findViewById(R.id.btn1);
                Button b2 = (Button) findViewById(R.id.btn2);
                Button b3 = (Button) findViewById(R.id.btn3);
                Button b4 = (Button) findViewById(R.id.btn4);

                if (b1.getText() == "") {
                    b1.setText(l3);
                    b1.setBackgroundResource(R.drawable.round_button);
                    b1.setEnabled(true);
                } else if (b2.getText() == "") {
                    b2.setText(l3);
                    b2.setBackgroundResource(R.drawable.round_button);
                    b2.setEnabled(true);
                } else if (b3.getText() == "") {
                    b3.setText(l3);
                    b3.setBackgroundResource(R.drawable.round_button);
                    b3.setEnabled(true);
                } else {
                    b4.setText(l3);
                    b4.setBackgroundResource(R.drawable.round_button);
                    b4.setEnabled(true);
                    CheckWords(btn1, btn2, btn3, btn4);

                }
                button3.setTextColor(Color.parseColor("#e5d7d7"));
                button3.setBackgroundResource(R.drawable.round_blank_button);
                button3.setEnabled(false);
            }
        });


        //-----------------------------------------------------------------------------

        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Button b1 = (Button) findViewById(R.id.btn1);
                Button b2 = (Button) findViewById(R.id.btn2);
                Button b3 = (Button) findViewById(R.id.btn3);
                Button b4 = (Button) findViewById(R.id.btn4);

                if (b1.getText() == "") {
                    b1.setText(l4);
                    b1.setBackgroundResource(R.drawable.round_button);
                    b1.setEnabled(true);
                } else if (b2.getText() == "") {
                    b2.setText(l4);
                    b2.setBackgroundResource(R.drawable.round_button);
                    b2.setEnabled(true);
                } else if (b3.getText() == "") {
                    b3.setText(l4);
                    b3.setBackgroundResource(R.drawable.round_button);
                    b3.setEnabled(true);
                } else {
                    b4.setText(l4);
                    b4.setBackgroundResource(R.drawable.round_button);
                    b4.setEnabled(true);
                    CheckWords(btn1, btn2, btn3, btn4);

                }

                button4.setTextColor(Color.parseColor("#e5d7d7"));
                button4.setBackgroundResource(R.drawable.round_blank_button);
                button4.setEnabled(false);
            }
        });

        //za rezlutantnite kopcinja funkcii
        //-----------------------------------------------------------------------------

        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                CheckEqualsLetters(btn1, button1, button2, button3, button4);

                if (!btn2.getText().toString().equals("")) {
                    btn1.setText(btn2.getText().toString());
                    btn1.setBackgroundResource(R.drawable.round_button);
                    btn1.setEnabled(true);
                    if (!btn3.getText().toString().equals("")) {
                        btn2.setText(btn3.getText().toString());
                        btn2.setBackgroundResource(R.drawable.round_button);
                        btn2.setEnabled(true);
                        if (!btn4.getText().toString().equals("")) {
                            btn3.setText(btn4.getText().toString());
                            btn3.setBackgroundResource(R.drawable.round_button);
                            btn3.setEnabled(true);
                        } else {

                            btn3.setText("");
                            btn3.setBackgroundResource(R.drawable.round_blank_button);
                            btn3.setEnabled(false);
                        }
                    } else {
                        btn2.setText("");
                        btn2.setBackgroundResource(R.drawable.round_blank_button);
                        btn2.setEnabled(false);
                    }

                } else {
                    btn1.setText("");
                    btn1.setBackgroundResource(R.drawable.round_blank_button);
                    btn1.setEnabled(false);
                }


                btn4.setText("");
                btn4.setBackgroundResource(R.drawable.round_blank_button);
                btn4.setEnabled(false);

            }
        });


        //-----------------------------------------------------------------------------

        btn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                CheckEqualsLetters(btn2, button1, button2, button3, button4);

                if (!btn3.getText().toString().equals("")) {
                    btn2.setText(btn3.getText().toString());
                    btn2.setBackgroundResource(R.drawable.round_button);
                    btn2.setEnabled(true);
                    if (!btn4.getText().toString().equals("")) {
                        btn3.setText(btn4.getText().toString());
                        btn3.setBackgroundResource(R.drawable.round_button);
                        btn3.setEnabled(true);
                    } else {

                        btn3.setText("");
                        btn3.setBackgroundResource(R.drawable.round_blank_button);
                        btn3.setEnabled(false);
                    }
                }
                btn4.setText("");
                btn4.setBackgroundResource(R.drawable.round_blank_button);
                btn4.setEnabled(false);
            }
        });

        //-----------------------------------------------------------------------------

        btn3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                CheckEqualsLetters(btn3, button1, button2, button3, button4);

                if (!btn4.getText().toString().equals("")) {
                    btn3.setText(btn4.getText().toString());
                    btn3.setBackgroundResource(R.drawable.round_button);
                    btn3.setEnabled(true);
                } else {

                    btn3.setText("");
                    btn3.setBackgroundResource(R.drawable.round_blank_button);
                    btn3.setEnabled(false);
                }
                btn4.setText("");
                btn4.setBackgroundResource(R.drawable.round_blank_button);
                btn4.setEnabled(false);
            }
        });


        //-----------------------------------------------------------------------------

        btn4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                CheckEqualsLetters(btn4, button1, button2, button3, button4);

                btn4.setText("");
                btn4.setBackgroundResource(R.drawable.round_blank_button);
                btn4.setEnabled(false);

            }
        });
    }


    public void CheckEqualsLetters(Button btn, Button button1, Button button2, Button button3, Button button4) {

        if (btn.getText().toString().equals(button1.getText().toString()) &&
                !button1.isEnabled()) {
            button1.setEnabled(true);
            button1.setTextColor(Color.BLACK);
            button1.setBackgroundResource(R.drawable.round_button);
        } else if (btn.getText().toString().equals(button2.getText().toString()) &&
                !button2.isEnabled()) {
            button2.setEnabled(true);
            button2.setTextColor(Color.BLACK);
            button2.setBackgroundResource(R.drawable.round_button);
        } else if (btn.getText().toString().equals(button3.getText().toString()) &&
                !button3.isEnabled()) {
            button3.setEnabled(true);
            button3.setTextColor(Color.BLACK);
            button3.setBackgroundResource(R.drawable.round_button);
        }else if (btn.getText().toString().equals(button4.getText().toString()) &&
                !button4.isEnabled()) {
            button4.setEnabled(true);
            button4.setTextColor(Color.BLACK);
            button4.setBackgroundResource(R.drawable.round_button);
        }

        btn.setText(null);
        btn.setBackgroundResource(R.drawable.round_blank_button);
        btn.setEnabled(false);

    }

    public void CheckWords(Button btn1, Button btn2, Button btn3, Button btn4) {
        String word=btn1.getText().toString() + btn2.getText().toString() + btn3.getText().toString() + btn4.getText().toString();


        Button btn_scores = (Button) findViewById(R.id.scores);
        Button btn_highscores = (Button) findViewById(R.id.highscores);
        int scores = Integer.parseInt(btn_scores.getText().toString());
        int highscores = Integer.parseInt(btn_highscores.getText().toString());

       Scanner s = new Scanner(getResources().openRawResource(R.raw.words));

        while(s.hasNext()) {
            String line=s.next();
            if(line.equals(word)) {
                scores += 1;
                btn_scores.setText(String.valueOf(scores));
                if (highscores < scores) {
                    highscores = scores;
                    btn_highscores.setText(String.valueOf(highscores));
                    SharedPreferences highscores_pref=getSharedPreferences(PREFS, 0);
                    SharedPreferences.Editor editor=highscores_pref.edit();
                    editor.putString("highscores_str", String.valueOf(highscores));
                    editor.commit();
                    Intent i=new Intent(getApplicationContext(),MainActivity.class);
                    i.putExtra("scores_str", String.valueOf(scores));
                    startActivity(i);
                }
                Intent i=new Intent(getApplicationContext(),MainActivity.class);
                i.putExtra("scores_str", String.valueOf(scores));
                startActivity(i);
            }
        }
        }

    private void runOnce(){
        if(RUN_ONCE){
            RUN_ONCE=false;
        }
    }


    public void startCountDownTimer() {

        countDownTimer = new CountDownTimer(timeCountInMilliSeconds, 1) {
            @Override
            public void onTick(long millisUntilFinished) {

                barTimer.setProgress((int) (millisUntilFinished));

            }

            @Override
            public void onFinish() {
                setProgressBarValues();
                Button bu1= (Button)findViewById(R.id.button1);
                Button bu2= (Button)findViewById(R.id.button2);
                Button bu3= (Button)findViewById(R.id.button3);
                Button bu4= (Button)findViewById(R.id.button4);

                Button buu1= (Button)findViewById(R.id.btn1);
                Button buu2= (Button)findViewById(R.id.btn2);
                Button buu3= (Button)findViewById(R.id.btn3);
                Button buu4= (Button)findViewById(R.id.btn4);

                bu1.setEnabled(false);
                bu2.setEnabled(false);
                bu3.setEnabled(false);
                bu4.setEnabled(false);

                buu1.setEnabled(false);
                buu2.setEnabled(false);
                buu3.setEnabled(false);
                buu4.setEnabled(false);


                new AlertDialog.Builder(MainActivity.this)
                        .setMessage("Можно решение: " +line.toUpperCase() + "\nИзгубивте!")
                        .setPositiveButton("OK" ,new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        RUN_ONCE=true;
                        Intent i=new Intent(getApplicationContext(),StartActivity.class);
                        startActivity(i);
                    }}).show();

            }
        }.start();
        countDownTimer.start();
    }


    private void setProgressBarValues() {

        barTimer.setMax((int) timeCountInMilliSeconds);
        barTimer.setProgress((int) timeCountInMilliSeconds);
    }

    @Override
    public void onBackPressed(){
        RUN_ONCE=true;
        Intent i=new Intent(getApplicationContext(),StartActivity.class);
        startActivity(i);
    }


}


