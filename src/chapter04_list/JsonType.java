package chapter04_list;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class JsonType {

    public static void main(String[] args) {
        Map<String,String> map = new HashMap();
        map.put("name", "12342");
        map.put("pass", "4355");
        map.put("jos", "999");
        map.put("wang", "999");
        JsonType jsonType = new JsonType();
        String mm = jsonType.simpleMapToJsonStr(map);
        System.out.println(mm);
        Map mp = jsonType.getData(mm);
        System.out.println(mp.get("wang"));
    }

    /**
     * map to json
     *
     * @param map
     * @return
     */
    public String simpleMapToJsonStr(Map<String, String> map) {
        if (map == null || map.isEmpty()) {
            return "null";
        }
        String jsonStr = "{";
        Set<?> keySet = map.keySet();
        for (Object key : keySet) {
            jsonStr += "\"" + key + "\":\"" + map.get(key) + "\",";
        }
        jsonStr = jsonStr.substring(0, jsonStr.length() - 2);
        jsonStr += "}";
        return jsonStr;
    }

    /**
     * string to map {"pass":"4355","name":"12342","wang":"fsf"}
     *
     * @param str
     * @return
     */
    public Map getData(String str) {
        String sb = str.substring(2, str.length() - 1);
        String[] name = sb.split("\\\",\\\"");
        String[] n = null;
        Map map = new HashMap();
        for (int i = 0; i < name.length; i++) {
            n = name[i].split("\\\":\\\"");
            map.put(n[0], n[1]);
        }
        return map;
    }
}
