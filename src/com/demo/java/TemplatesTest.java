package com.demo.java;

import com.demo.module01.Customer;

import java.util.ArrayList;

/**
 * @author Chen
 * @create 2020-06-05 19:55
 */
public class TemplatesTest {
    //模板六：prsf 可生成private static final
    private static final Customer CUST =new Customer();
    //变形：psf 可生成public static final
    public static final int SU =1;
    //psfi
    public static final int SU1 = 2;
    //psfs
    public static final String NATION = "china";


    //模板一：psvm / public static void main
    public static void main(String[] args){
        System.out.println("HelloWorld");

        //模板二：sout
        System.out.println();
        //变形：soutp /soutm /soutv / xxx.sout
        int num = 10;
        int num1 = 20;
        System.out.println("num = " + num);
        System.out.println(num1);

        //模板三：fori(增强for循环)
        String[] arr = new String[]{"tom","jerry","lilei"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //变形：iter
        for (String s : arr) {
            System.out.println(s);
        }
        //变形:itar(普通for循环)
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }

        //模板四：ifn
        ArrayList arrayList = new ArrayList();
        arrayList.add(123);
        arrayList.add(345);
        if (arrayList == null) {

        }
        //变形：inn
        //变形：xxx.nn / xxx.null
        if (arrayList != null) {

        }

    }

    public void method(){
        System.out.println("TemplatesTest");
    }
}
