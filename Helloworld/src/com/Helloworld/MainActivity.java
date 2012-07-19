package com.Helloworld;//封包聲明，要跟建的工程名字一樣，
import android.app.Activity;//Acticity類，主要用來創建窗口地，包含有onCreate(Bundle)
import android.os.Bundle;//
import android.view.View;//包含view对象
import android.widget.Button;
import java.util.Date;

public class MainActivity extends Activity implements View.OnClickListener { //onClickListener是view的一个子类，定义为一旦点击view，就会响应这个activity
    Button btn;//定义一个button类btn

    @Override//大小写敏感检测
	public void onCreate(Bundle icicle) {  //初始化activity
		super.onCreate(icicle);

		btn=new Button(this);
		btn.setOnClickListener(this);
		updateTime();
		setContentView(btn);
	}

	public void onClick(View view) {
		updateTime();
	}

	private void updateTime() {
		btn.setText(new Date().toString());
	}
}