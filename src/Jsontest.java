
import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.JSONObject;

public class Jsontest {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<String, String>();
		map.put("a", "aa");
		String js = JSONObject.toJSONString(map);
		System.out.println(js);
		js = JSONObject.toJSONString(js);
		System.out.println(js);
	}
}
