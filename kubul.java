package mouse.simple;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

public class kubul extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.kubul);
		 Intent in = getIntent();
		    String name = in.getStringExtra("name");
		   TextView vt=(TextView)findViewById(R.id.textView1);
		   vt.setText(name);
		   VideoView videoView = (VideoView) findViewById(R.id.videoView1);
	        MediaController mediaController = new MediaController(this);
	        mediaController.setAnchorView(videoView);
	// Set video link (mp4 format )
	        // http://www.androidbegin.com/tutorial/AndroidCommercial.3gp
	        //http://tormahiri-js.weebly.com/uploads/1/0/6/7/1067082/java_hashset.mp4
	        Uri video = Uri.parse("http://tormahiri-js.weebly.com/uploads/1/0/6/7/1067082/java_hashset.mp4");
	        videoView.setMediaController(mediaController);
	        videoView.setVideoURI(video);
	        videoView.start();
	}
}
