package mouse.simple;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

public class ListView2 extends Activity {

	private SimpleAdapter adapter;
	private ListView listView2;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.listview2);

		// 先創出主要layout(包含一個ListView)，裡面的清單項目由
		// 另一個layout(view2content.xml)去部屬，來達到圖文的清單

		listView2 = (ListView) findViewById(R.id.listView2);
		
		//清單面版
		adapter = new SimpleAdapter(this, getData(), R.layout.view2content,
				new String[] { "title", "info", "img" }, new int[] {
						R.id.title, R.id.info, R.id.img });
		listView2.setAdapter(adapter);
		listView2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				// TODO Auto-generated method stub
				ListView listView = (ListView) arg0;
				Toast.makeText(	ListView2.this,
						"ID：" + arg3 + 
						"   選單文字："+ listView.getItemAtPosition(arg2).toString(),
						Toast.LENGTH_LONG).show();
			}
		});
	}

	/**
	 * 設定清單資料
	 * */
	private List<? extends Map<String, ?>> getData() {
		// TODO Auto-generated method stub
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();

		Map<String, Object> map = new HashMap<String, Object>();
		map.put("title", "G1");
		map.put("info", "紅豆");
		map.put("img", R.drawable.icon);
		list.add(map);

		map = new HashMap<String, Object>();
		map.put("title", "G2");
		map.put("info", "綠豆");
		map.put("img", R.drawable.icon);
		list.add(map);

		map = new HashMap<String, Object>();
		map.put("title", "G3");
		map.put("info", "土豆");
		map.put("img", R.drawable.icon);
		list.add(map);

		map = new HashMap<String, Object>();
		map.put("title", "G4");
		map.put("info", "毛豆");
		map.put("img", R.drawable.icon);
		list.add(map);

		return list;
	}

}
