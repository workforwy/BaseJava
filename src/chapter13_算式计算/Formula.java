package chapter13_算式计算;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Formula {
    private String f;

    public Formula(String f) {
        // super();
        this.f = f.trim();
    }

    public class DieDaiQi {
        int index;// 定义下标
        // Matcher a=Pattern.compile("\\d+(\\.\\d)?|[/*+\\-]").matcher(f);
        Pattern p = Pattern.compile("\\d+(\\.\\d)?|[/*+\\-]");
        Matcher m = p.matcher(f);

        /*
         * \\d(数字) +(\\.\\d)=（小数点+数字） ?也许有一个，也许有多个 |并且 [/*+\\-]（加减乘除，其中减号特殊，须注释）
         */
        public String next() {
            m.find(index);// 从index向后找下一段（index为第一个字符的下标）
            String s = m.group();// 取出下一段字符
            index = m.end();// index 移动到这一段字符的末尾
            return s;
        }

        public boolean hasNext() {
            // index在界内，还有下一段
            return index < f.length();
        }
    }

    public double eval() {
        LinkedList<Double> list1 = new LinkedList<Double>();
        LinkedList<String> list2 = new LinkedList<String>();
        DieDaiQi d = new DieDaiQi();
        while (d.hasNext()) {
            String s = d.next();
            if (s.matches("\\d+(\\.\\d+)?")) {
                list1.add(Double.parseDouble(s));
            } else if (s.matches("[+\\-]")) {
                list2.add(s);
            } else {
                double a = list1.removeLast();
                double b = Double.parseDouble(d.next());
                double c = jiSuan(a, s, b);
                list1.add(c);
            }
        }
        while (list2.size() != 0) {
            double a = list1.removeFirst();
            double b = list1.removeFirst();
            String s = list2.removeFirst();
            double c = jiSuan(a, s, b);
            list1.addFirst(c);
        }
        return list1.get(0);
    }

    private double jiSuan(double a, String s, double b) {
        BigDecimal bd1 = BigDecimal.valueOf(a);
        BigDecimal bd2 = BigDecimal.valueOf(b);
        BigDecimal r = null;
        switch (s.charAt(0)) {
            case '+':
                r = bd1.add(bd2);
                break;
            case '-':
                r = bd1.subtract(bd2);
                break;
            case '*':
                r = bd1.multiply(bd2);
                break;
            case '/':
                r = bd1.divide(bd2);
                break;
        }
        return r.doubleValue();
    }
}
