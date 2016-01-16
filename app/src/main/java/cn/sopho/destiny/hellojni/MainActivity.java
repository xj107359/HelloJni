package cn.sopho.destiny.hellojni;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv = (TextView) findViewById(R.id.textView);
        tv.setText(stringFromJNI());
    }

    public native String stringFromJNI();

    public native String unimplementedStringFromJNI();

    static {
        System.loadLibrary("HelloJni");
    }
}
