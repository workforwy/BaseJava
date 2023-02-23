package c08_list.set;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * 联系人
 */
class Contact implements Comparable<Contact> {
    private String name;

    public Contact(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    /**
     * 重写此方法，根据业务指定比较规则
     */
    @Override
    public int compareTo(Contact o) {
        return this.name.compareTo(o.name);
    }
}

public class TreeSetDemo02 {
    public static void main(String[] args) {
        Contact c1 = new Contact("JA");
        Contact c2 = new Contact("CM");
	/*	TreeSet<Contact> set=new TreeSet<Contact>();
		set.add(c1);
		set.add(c2);
		System.out.println(set);*/

        //假如采用如下方式对Contact对象
        //进行排序,Contact无需再实现Comparable接口
        TreeSet<Contact> set02 =
                new TreeSet<Contact>(
                        new Comparator<Contact>() {
                            @Override
                            public int compare(
                                    Contact o1,
                                    Contact o2) {
                                return o1.getName().compareTo(o2.getName());
                            }
                        });
        set02.add(c1);
        set02.add(c2);

        System.out.println(set02);

    }
}

