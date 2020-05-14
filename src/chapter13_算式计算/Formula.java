package chapter13_��ʽ����;

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
        int index;// �����±�
        // Matcher a=Pattern.compile("\\d+(\\.\\d)?|[/*+\\-]").matcher(f);
        Pattern p = Pattern.compile("\\d+(\\.\\d)?|[/*+\\-]");
        Matcher m = p.matcher(f);

        /*
         * \\d(����) +(\\.\\d)=��С����+���֣� ?Ҳ����һ����Ҳ���ж�� |���� [/*+\\-]���Ӽ��˳������м������⣬��ע�ͣ�
         */
        public String next() {
            m.find(index);// ��index�������һ�Σ�indexΪ��һ���ַ����±꣩
            String s = m.group();// ȡ����һ���ַ�
            index = m.end();// index �ƶ�����һ���ַ���ĩβ
            return s;
        }

        public boolean hasNext() {
            // index�ڽ��ڣ�������һ��
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
