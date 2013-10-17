package mx.udg.cucei.cuceiMobile.Lista_con_imagenes;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.VideoView;

public class China extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_china);
		final VideoView video = (VideoView) findViewById(R.id.video);
        Button play = (Button)findViewById(R.id.btnplay2);
        Button stop = (Button)findViewById(R.id.btnstop2);
        
        video.setVideoPath("/sdcard/accidentally.mp4");
        play.setOnClickListener(new OnClickListener(){
        	
        	public void onClick(View v){
        video.start();  		
        	}
        	
                });
        stop.setOnClickListener(new OnClickListener(){
        	
        	public void onClick(View v){
        video.pause();  		
        	}
        	
                });


            }

	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.china, menu);
		return true;
	}

}
