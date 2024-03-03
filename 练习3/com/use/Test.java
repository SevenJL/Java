package com.use;

//import com.xiaoqiang.Dog;

import java.util.Arrays;
//建议使用哪个类，就导入哪个，不建议全部导入

public class Test {
    public static void main(String[] args) {
//        Dog dog = new Dog();
//        System.out.println(dog);
        int[] arr = {6,45,78,2,8,34,43};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
