
import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.JSONObject;

public class SourcetreeTest {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<String, String>();
		map.put("a", "aa");
		String js = JSONObject.toJSONString(map);
		System.out.println(js);
		js = JSONObject.toJSONString(js);
		System.out.println(js);
		int a=001;
		int a=002;
	}
}
