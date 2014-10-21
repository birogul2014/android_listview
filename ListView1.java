package mouse.simple;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListView1 extends Activity {

	private ListView listView;
	private List list;
	private ArrayAdapter<String> adapter;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.listview1);
	    String[] planets = new String[] { "Mercury", "Venus", "Earth", "Mars",  
                "Jupiter", "Saturn", "Uranus", "Neptune","taz","maz"};
		listView = (ListView) findViewById(R.id.listView1);
          list=new ArrayList<String>();
          list.add("mercury is fantastic");
      list.add("venus is bir yultuz name");
		// 清單陣列
		adapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1,planets);


		listView.setAdapter(adapter);
		listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) { //(物件,?,抓清單文字,清單編號);
				// TODO Auto-generated method stub
				ListView listView = (ListView) arg0;
				Intent i = new Intent(getApplicationContext(), kubul.class);
				i.putExtra("name", (String) list.get(arg2));
				startActivity (i);
				
			}
			
		});
	}

}
