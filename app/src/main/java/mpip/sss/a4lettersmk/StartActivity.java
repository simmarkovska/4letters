package mpip.sss.a4lettersmk;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;


public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        Button exit = (Button) findViewById(R.id.exit);
        exit.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(StartActivity.this)
                        .setMessage("Дали сте сигурни дека сакате да излезете?")
                        .setCancelable(false)
                        .setPositiveButton("Да", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                StartActivity.this.finishAffinity();
                            }
                        })
                        .setNegativeButton("Не", null)
                        .show();
            }
        });

        final Button button1 = (Button) findViewById(R.id.button1);
        final Button button2 = (Button) findViewById(R.id.button2);
        final Button button3 = (Button) findViewById(R.id.button3);
        final Button button4 = (Button) findViewById(R.id.button4);


        final Button btn1 = (Button) findViewById(R.id.btn1);
        final Button btn2 = (Button) findViewById(R.id.btn2);
        final Button btn3 = (Button) findViewById(R.id.btn3);
        final Button btn4 = (Button) findViewById(R.id.btn4);

        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Button b1 = (Button) findViewById(R.id.btn1);
                Button b2 = (Button) findViewById(R.id.btn2);
                Button b3 = (Button) findViewById(R.id.btn3);
                Button b4 = (Button) findViewById(R.id.btn4);

                if (b1.getText() == "") {
                    b1.setText("В");
                    b1.setBackgroundResource(R.drawable.round_button);
                    b1.setEnabled(true);
                } else if (b2.getText() == "") {
                    b2.setText("В");
                    b2.setBackgroundResource(R.drawable.round_button);
                    b2.setEnabled(true);
                } else if (b3.getText() == "") {
                    b3.setText("В");
                    b3.setBackgroundResource(R.drawable.round_button);
                    b3.setEnabled(true);
                } else {
                    b4.setText("В");
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
                    b1.setText("Л");
                    b1.setBackgroundResource(R.drawable.round_button);
                    b1.setEnabled(true);
                } else if (b2.getText() == "") {
                    b2.setText("Л");
                    b2.setBackgroundResource(R.drawable.round_button);
                    b2.setEnabled(true);
                } else if (b3.getText() == "") {
                    b3.setText("Л");
                    b3.setBackgroundResource(R.drawable.round_button);
                    b3.setEnabled(true);
                } else {
                    b4.setText("Л");
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
                    b1.setText("З");
                    b1.setBackgroundResource(R.drawable.round_button);
                    b1.setEnabled(true);
                } else if (b2.getText() == "") {
                    b2.setText("З");
                    b2.setBackgroundResource(R.drawable.round_button);
                    b2.setEnabled(true);
                } else if (b3.getText() == "") {
                    b3.setText("З");
                    b3.setBackgroundResource(R.drawable.round_button);
                    b3.setEnabled(true);
                } else {
                    b4.setText("З");
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
                    b1.setText("Е");
                    b1.setBackgroundResource(R.drawable.round_button);
                    b1.setEnabled(true);
                } else if (b2.getText() == "") {
                    b2.setText("Е");
                    b2.setBackgroundResource(R.drawable.round_button);
                    b2.setEnabled(true);
                } else if (b3.getText() == "") {
                    b3.setText("Е");
                    b3.setBackgroundResource(R.drawable.round_button);
                    b3.setEnabled(true);
                } else {
                    b4.setText("Е");
                    b4.setBackgroundResource(R.drawable.round_button);
                    b4.setEnabled(true);
                    CheckWords(btn1, btn2, btn3, btn4);

                }

                button4.setTextColor(Color.parseColor("#e5d7d7"));
                button4.setBackgroundResource(R.drawable.round_blank_button);
                button4.setEnabled(false);
            }
        });


        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                CheckEqualsLetters(btn1, button1, button2, button3, button4);

                if (btn2.getText().toString() != "") {
                    btn1.setText(btn2.getText().toString());
                    btn1.setBackgroundResource(R.drawable.round_button);
                    btn1.setEnabled(true);
                    if (btn3.getText().toString() != "") {
                        btn2.setText(btn3.getText().toString());
                        btn2.setBackgroundResource(R.drawable.round_button);
                        btn2.setEnabled(true);
                        if (btn4.getText().toString() != "") {
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

                if (btn3.getText().toString() != "") {
                    btn2.setText(btn3.getText().toString());
                    btn2.setBackgroundResource(R.drawable.round_button);
                    btn2.setEnabled(true);
                    if (btn4.getText().toString() != "") {
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

                if (btn4.getText().toString() != "") {
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

            if (btn.getText().toString().equals(button1.getText().toString())) {
                button1.setEnabled(true);
                button1.setTextColor(Color.BLACK);
                button1.setBackgroundResource(R.drawable.round_button);
            } else if (btn.getText().toString().equals(button2.getText().toString())) {
                button2.setEnabled(true);
                button2.setTextColor(Color.BLACK);
                button2.setBackgroundResource(R.drawable.round_button);
            } else if (btn.getText().toString().equals(button3.getText().toString())) {
                button3.setEnabled(true);
                button3.setTextColor(Color.BLACK);
                button3.setBackgroundResource(R.drawable.round_button);
            } else if (btn.getText().toString().equals(button4.getText().toString())) {
                button4.setEnabled(true);
                button4.setTextColor(Color.BLACK);
                button4.setBackgroundResource(R.drawable.round_button);
            }

            btn.setText(null);
            btn.setBackgroundResource(R.drawable.round_blank_button);
            btn.setEnabled(false);

        }


    public void CheckWords(Button btn1, Button btn2, Button btn3, Button btn4) {
        if(btn1.getText().toString() == "В" &&
                btn2.getText().toString() == "Л" && btn3.getText().toString() == "Е" &&
                        btn4.getText().toString() == "З")
        {
            Intent i=new Intent(getApplicationContext(),MainActivity.class);
            startActivity(i);

        }

    }

    @Override
    public void onBackPressed(){
        new AlertDialog.Builder(this)
                .setMessage("Дали сте сигурни дека сакате да излезете?")
                .setCancelable(false)
                .setPositiveButton("Да", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        StartActivity.this.finishAffinity();
                    }
                })
                .setNegativeButton("Не", null)
                .show();
    }
    }


