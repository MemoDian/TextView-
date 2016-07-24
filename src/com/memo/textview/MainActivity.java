package com.memo.textview;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
	private TextView tvTitle;
	private Button btnWeb;
	private Button btnPhone;
	private Button btnEmail;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		initViews();
		
		initOnClick();
	}

	private void initOnClick() {
		btnWeb.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				tvTitle.setText("www.baidu.com");
			}
		});
		btnPhone.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				tvTitle.setText("15096085744");
			}
		});
		btnEmail.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				tvTitle.setText("lxydian@sina.com");
			}
		});
	}

	private void initViews() {
		tvTitle = (TextView) findViewById(R.id.tvTitle);
		btnWeb = (Button) findViewById(R.id.btnWeb);
		btnPhone = (Button) findViewById(R.id.btnPhone);
		btnEmail = (Button) findViewById(R.id.btnEmail);
	}

}
