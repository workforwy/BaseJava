package c08_list.map;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class User {
    private String name;
    private String phone;
    private String email;

    public User(String name, String phone, String email) {
        super();
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    @Override
    public String toString() {
        return "User [name=" + name + ", phone=" + phone + ", email=" + email
                + "]";
    }

}

class UserContext02 {
    static String[] users = {
            "A/139/A@t.com",//一行对应一个map
            "B/137/B@t.com",
            "C/137/C@t.com"
    };

    static {
        loadUsers();
    }

    private static List<User> list =
            new ArrayList<User>();

    private static void loadUsers() {
        for (String userStr : users) {
            //1.解析userStr,将数据封装到Map对象
            User map =
                    parse(userStr);
            //2.将Map存储到List集合
            list.add(map);
        }
    }

    //"C/137/C@t.com"
    private static User parse(String s) {
        String u[] = s.split("/");
        return new User(u[0], u[1], u[2]);
    }

    public static List<User> getUsers() {
        return list;
    }
}

public class MapDemo03 {

    public static void main(String[] args) {
        System.out.println(
                UserContext02.getUsers());

    }
}

