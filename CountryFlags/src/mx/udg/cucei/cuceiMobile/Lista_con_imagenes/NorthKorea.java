package mx.udg.cucei.cuceiMobile.Lista_con_imagenes;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class NorthKorea extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_north_korea);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.north_korea, menu);
		return true;
	}

}
