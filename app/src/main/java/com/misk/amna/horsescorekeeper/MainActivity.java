package com.misk.amna.horsescorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {

    TextView alanoud11;
    TextView alanoud12;
    TextView alanoud21;
    TextView alanoud22;
    TextView almaha11;
    TextView almaha12;
    TextView almaha21;
    TextView almaha22;
    TextView total1 ;
    TextView total2;
    int result1;
    int result2;
    int alanoud11q;
    int alanoud12q;
    int alanoud21q;
    int alanoud22q;
    int almaha11q;
    int almaha12q;
    int almaha21q;
    int almaha22q;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        alanoud11= (TextView) findViewById(R.id.tfirstH1);
        alanoud12=(TextView) findViewById(R.id.firstH2);
        alanoud21=(TextView) findViewById(R.id.secondH1);
        alanoud22=(TextView) findViewById(R.id.secondH2);
        almaha11=(TextView) findViewById(R.id.textView15);
        almaha12=(TextView) findViewById(R.id.textView18);
        almaha21=(TextView) findViewById(R.id.textView16);
        almaha22=(TextView) findViewById(R.id.textView17);
        total1 =(TextView) findViewById(R.id.total1);
        total2 =(TextView) findViewById(R.id.total2);

        result1=0;
        result2=0;
        alanoud11q=0;
        alanoud12q=0;
        alanoud21q=0;
        alanoud22q=0;
        almaha11q=0;
        almaha12q=0;
        almaha21q=0;
        almaha22q=0;
    }

    void onclickalanoud11i(View v)
    {
        alanoud11q=alanoud11q+1;
        result1=result1+1;
        alanoud11.setText(String.valueOf(alanoud11q));
        total1.setText(String.valueOf(result1));
    }
    void onclickalanoud11d(View v)
    {
        alanoud11q=alanoud11q-1;
        result1=result1-1;
        alanoud11.setText(String.valueOf(alanoud11q));
        total1.setText(String.valueOf(result1));
    }
    void onclickalanoud12i(View v)
    {
        alanoud12q=alanoud12q+1;
        result1=result1+1;
        alanoud12.setText(String.valueOf(alanoud12q));
        total1.setText(String.valueOf(result1));
    }

    void onclickalanoud12d(View v)
    {
        alanoud12q=alanoud12q-1;
        result1=result1-1;
        alanoud12.setText(String.valueOf(alanoud12q));
        total1.setText(String.valueOf(result1));
    }
    void onclickalanoud21i(View v){
            alanoud21q = alanoud21q+1;
            result1=result1+1;
            alanoud21.setText(String.valueOf(alanoud21q));
        total1.setText(String.valueOf(result1));
    }
    void onclickalanoud21d(View v)
    {
        alanoud21q = alanoud21q-1;
        result1=result1-1;
        alanoud21.setText(String.valueOf(alanoud21q));
        total1.setText(String.valueOf(result1));
    }
    void onclickalanoud22i(View v)
    {
        alanoud22q = alanoud22q+1;
        result1=result1+1;
        alanoud22.setText(String.valueOf(alanoud22q));
        total1.setText(String.valueOf(result1));
    }

    void onclickalanoud22d(View v)
    {
        alanoud22q = alanoud22q-1;
        result1=result1-1;
        alanoud22.setText(String.valueOf(alanoud22q));
        total1.setText(String.valueOf(result1));
    }

    void onclickalmaha11i(View v)
    {
        almaha11q=almaha11q+1;
        result2=result2+1;
        almaha11.setText(String.valueOf(almaha11q));
        total2.setText(String.valueOf(result2));
    }
    void onclickalmaha11d(View v)
    {
        almaha11q=almaha11q-1;
        result2=result2-1;
        almaha11.setText(String.valueOf(almaha11q));
        total2.setText(String.valueOf(result2));
    }
    void onclickalmaha12i(View v)
    {
        almaha12q=almaha12q+1;
        result2=result2+1;
        almaha12.setText(String.valueOf(almaha12q));
        total2.setText(String.valueOf(result2));
    }

    void onclickalmaha12d(View v)
    {
        almaha12q=almaha12q-1;
        result2=result2-1;
        almaha12.setText(String.valueOf(almaha12q));
        total2.setText(String.valueOf(result2));
    }
    void onclickalmaha21i(View v){
        almaha21q = almaha21q+1;
        result2=result2+1;
        almaha21.setText(String.valueOf(almaha21q));
        total2.setText(String.valueOf(result2));
    }
    void onclickalmaha21d(View v)
    {
        almaha21q = almaha21q-1;
        result2=result2-1;
        almaha21.setText(String.valueOf(almaha21q));
        total2.setText(String.valueOf(result2));
    }
    void onclickalmaha22i(View v)
    {
        almaha22q = almaha22q+1;
        result2=result2+1;
        almaha22.setText(String.valueOf(almaha22q));
        total2.setText(String.valueOf(result2));
    }

    void onclickalmaha22d(View v)
    {
        almaha22q = almaha22q-1;
        result2=result2-1;
        almaha22.setText(String.valueOf(almaha22q));
        total2.setText(String.valueOf(result2));
    }
    void Reset(View v)
    {
        result1=0;
        result2=0;
        alanoud11q=0;
        alanoud12q=0;
        alanoud21q=0;
        alanoud22q=0;
        almaha11q=0;
        almaha12q=0;
        almaha21q=0;
        almaha22q=0;
        alanoud11.setText(String.valueOf(alanoud11q));
        alanoud12.setText(String.valueOf(alanoud12q));
        alanoud21.setText(String.valueOf(alanoud21q));
        alanoud22.setText(String.valueOf(alanoud22q));
        almaha11.setText(String.valueOf(almaha11q));
        almaha12.setText(String.valueOf(almaha12q));
        almaha21.setText(String.valueOf(almaha21q));
        almaha22.setText(String.valueOf(almaha22q));
        total1.setText(String.valueOf(result1));
        total2.setText(String.valueOf(result2));

    }
}


