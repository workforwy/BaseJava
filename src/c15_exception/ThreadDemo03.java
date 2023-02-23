package c15_exception;

public class ThreadDemo03 {
    static void login(String phone, String password) {
        if (phone == null) {
            throw new NullPointerException("phone can not be null");
        }
        if (password == null) {
            throw new NullPointerException("password can not be null");
        }
        if (!"139".equals(phone)) {
            try {
                throw new Exception("用户不存在");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    //用户
    public static void main(String[] args) {
        login("139", null);
    }
}
