package mx.udg.cucei.cuceiMobile.Lista_con_imagenes;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;

public class Mexico extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_mexico);
		final TextView Titulo = (TextView) findViewById(R.id.tituloc);
		final Button play = (Button) findViewById(R.id.btnplay);
		final Button inicio = (Button) findViewById(R.id.btninicio);
		final Button stop = (Button) findViewById(R.id.btnstop);
		
		SeekBar volumenbar=(SeekBar)findViewById(R.id.vol);

		//creamos el objeto player que es el encargado de tocar
		//el sonido. Require 2 parametros de donde es llamado y
		//archive a tocar que debe estar en la carpeta raw
		final MediaPlayer player =MediaPlayer.create(getBaseContext(), R.raw.barry);  

		play.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				player.start();
				Titulo.setText("Himno Nacional Mexicano");
		              }
		        });

		stop.setOnClickListener(new OnClickListener(){
		public void onClick(View v){
			player.seekTo(0);
			player.pause();
		Titulo.setText("      ");

		                  }
		            });

		inicio.setOnClickListener(new OnClickListener(){
		public void onClick(View v){
			player.pause();
		Titulo.setText("      ");

		                  }
		            });
		
		volumenbar.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {

			public void onStopTrackingTouch(SeekBar arg0) {
			// TODO Auto-generated method stub

			            }

			public void onStartTrackingTouch(SeekBar arg0) {
			// TODO Auto-generated method stub

			            }

			public void onProgressChanged(SeekBar arg0, int arg1, boolean arg2) {
			// TODO Auto-generated method stub

			player.setVolume((float)arg1/100.0f, (float)arg1/100.0f);


			            }
			     });
		
		
		
	}
	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.mexico, menu);
		return true;
	}

}
