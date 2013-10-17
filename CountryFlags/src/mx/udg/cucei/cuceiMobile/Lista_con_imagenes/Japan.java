package mx.udg.cucei.cuceiMobile.Lista_con_imagenes;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ImageView;

public class Japan extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
	
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_japan);
		
		ImageView imageView;
		
		imageView = (ImageView) findViewById(R.drawable.japan2);    //retrieve the ImageView widget from the layout
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.japan, menu);
		return true;
	}

}
