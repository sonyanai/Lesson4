package jp.techacademy.taison.yanai.lesson4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(this);
        //setOnClickListenerメソッドの引数にはonClickメソッドを実装したクリックリスナークラスを渡す必要があります。
        //今回はMainActivityクラス自身(this)を設定しonClickメソッドを実装しています。
    }
    @Override
    public void onClick(View v) {
        Log.d("UI_PARTS","ボタンをタップしました");
    }
}
