package com.example.implicitintents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.net.URL;

public class MainActivity extends AppCompatActivity {
    Button btn1, btn2, btn3,btn4,btn5,btn6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = findViewById(R.id.button);
        btn2 = findViewById(R.id.button2);
        btn3=findViewById(R.id.button3);
        btn4=findViewById(R.id.button4);
        btn5=findViewById(R.id.button5);
        btn6=findViewById(R.id.button6);
    }

   public  void openurl(View view)
   {

       Intent intent1 =new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com"));
       startActivity(intent1);
       if(intent1.resolveActivity(getPackageManager())!=null)
       {

           startActivity(intent1);
       }



   }
    public  void openlocation(View view)
    {
        Intent intent =new Intent(Intent.ACTION_VIEW, Uri.parse("geo:20.5937,78.9629"));
        startActivity(intent);
        if(intent.resolveActivity(getPackageManager())!=null)
        {

            startActivity(intent);
        }

    }


    public  void captureimage(View view)
    {
        Intent intent =new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivity(intent);
        if(intent.resolveActivity(getPackageManager())!=null)
        {

            startActivity(intent);
        }

    }
    public  void makeacall(View view)
    {
        Intent intent2=new Intent(Intent.ACTION_VIEW,Uri.parse("tel:123456"));
        startActivity(intent2);
        if(intent2.resolveActivity(getPackageManager())!=null)
        {

            startActivity(intent2);
        }

    }


    public  void send(View view) {

        Intent send = new Intent(Intent.ACTION_SEND);
        send.putExtra(Intent.EXTRA_TEXT, "this is my text");
        send.setType("text/plain");
        startActivity(send);

    }


    public  void sendto(View view )
    {
        Intent sendto=new Intent(Intent.ACTION_SENDTO,Uri.parse("smsto:1234567789"));
        sendto.putExtra("smsto","are we playng cricket today");
        startActivity(sendto);

    }
    public void picker(View view)
    {
        Intent photopick =new Intent(Intent.ACTION_PICK);
        photopick.setType("image/*");
        startActivity(photopick);
    }
}