package mpip.sss.a4lettersmk;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        Thread thread=new Thread(){
            @Override
            public void run(){
                try{
                    sleep(3*1000);
                    Intent i=new Intent(getApplicationContext(), StartActivity.class);
                    startActivity(i);
                } catch (Exception ex) {
                }
            }
        };
        thread.start();
    }

    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setMessage("Дали сте сигурни дека сакате да излезете?")
                .setCancelable(false)
                .setPositiveButton("Да", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        FirstActivity.this.finishAffinity();
                    }
                })
                .setNegativeButton("Не", null)
                .show();
    }
}
