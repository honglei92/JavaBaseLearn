package tool.json;

import com.alibaba.fastjson.JSONObject;

import java.util.HashMap;
import java.util.Map;


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
