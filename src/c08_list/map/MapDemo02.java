package c08_list.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class UserContext {
    static String[] users = {
            "A/139/A@t.com",//一行对应一个map
            "B/137/B@t.com",
            "C/137/C@t.com"
    };
    private static List<Map<String, String>> list =
            new ArrayList<Map<String, String>>();

    static {
        loadUsers();
    }

    private static void loadUsers() {
        for (String userStr : users) {
            //1.解析userStr,将数据封装到Map对象
            Map<String, String> map =
                    parse(userStr);
            //2.将Map存储到List集合
            list.add(map);
        }
    }

    //"C/137/C@t.com"
    private static Map<String, String> parse(String s) {
        String u[] = s.split("/");
        Map<String, String> map =
                new HashMap<String, String>();
        map.put("name", u[0]);
        map.put("phone", u[1]);
        map.put("email", u[2]);
        return map;
    }

    public static List<Map<String, String>> getUsers() {
        return list;
    }
}

public class MapDemo02 {

    public static void main(String[] args) {
        System.out.println(
                UserContext.getUsers());

    }
}

