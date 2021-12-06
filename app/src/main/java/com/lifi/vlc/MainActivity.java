package com.lifi.vlc;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button,button2,button3,button4, button5, button6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button_send);
        button2 = (Button) findViewById(R.id.button_recieve);
        button3 = (Button) findViewById(R.id.button_exit);
        button4 = (Button) findViewById(R.id.send);
        button6 = (Button) findViewById(R.id.ppl);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent myIntent = new Intent(MainActivity.this,
                        Send_new.class);
                startActivity(myIntent);
            }});
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                finish();
                System.exit(0);
            }});
        button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                alertDialog.setTitle("Airis");
                alertDialog.setMessage("Para usar presiona el botón de enviar para mandar información en BITS");
                alertDialog.setButton(Dialog.BUTTON_POSITIVE,"Entendido!",new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialogInterface,int which){

                    }});
                alertDialog.show();
            }});
    }}