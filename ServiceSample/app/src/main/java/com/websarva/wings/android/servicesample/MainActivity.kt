package com.websarva.wings.android.servicesample

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

/**
 * 『Androidアプリ開発の教科書』
 * 第13章サービスサンプル
 */
class MainActivity : AppCompatActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)

		//Intentから通知のタップからの引き継ぎデータを取得。
		val fromNotification = intent.getBooleanExtra("fromNotification", false)
		//引き継ぎデータが存在、つまり通知のタップからならば…
		if(fromNotification) {
			//再生ボタンをタップ不可に、停止ボタンをタップ可に変更。
			val btPlay = findViewById<Button>(R.id.btPlay)
			val btStop = findViewById<Button>(R.id.btStop)
			btPlay.isEnabled = false
			btStop.isEnabled = true
		}
	}

	/**
	 * 再生ボタンタップ時の処理メソッド。
	 *
	 * @param view 画面部品
	 */
	fun onPlayButtonClick(view: View) {
		//インテントオブジェクトを生成。
		val intent = Intent(applicationContext, SoundManageService::class.java)
		//サービスを起動。
		startService(intent)
		//再生ボタンをタップ不可に、停止ボタンをタップ可に変更。
		val btPlay = findViewById<Button>(R.id.btPlay)
		val btStop = findViewById<Button>(R.id.btStop)
		btPlay.isEnabled = false
		btStop.isEnabled = true
	}

	/**
	 * 停止ボタンタップ時の処理メソッド。
	 *
	 * @param view 画面部品
	 */
	fun onStopButtonClick(view: View) {
		//インテントオブジェクトを生成。
		val intent = Intent(applicationContext, SoundManageService::class.java)
		//サービスを停止。
		stopService(intent)
		//再生ボタンをタップ可に、停止ボタンをタップ不可に変更。
		val btPlay = findViewById<Button>(R.id.btPlay)
		val btStop = findViewById<Button>(R.id.btStop)
		btPlay.isEnabled = true
		btStop.isEnabled = false
	}
}
