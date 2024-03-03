package service;

import domain.House;

public class HouseService {
    private House[] houses;
    private  int houseNums =1;//记录当前有多少个房屋信息
    private int idCounter = 1;
    public HouseService(int size) {
        houses = new House[size];//创建HouseService对象，指定数组大小
        houses[0] = new House(1,"jack","112","海定区",2000,"未出租");
    }
    //find方法，返回house对象或者null
    public House findById(int findId){
        //遍历数组
        for (int i = 0; i < houseNums; i++) {
            if (findId == houses[i].getId()) {
                return houses[i];
            }
        }

        return null;

    }

    //del方法，删除一个房屋信息
    public boolean del(int delId){
        //应该先找到所要删除的房屋信息
        //通过id去找这个房屋信息，对应的下标
        //下标和房屋编号没有关系，下标和房屋编号不是一回事
        int index = -1;
        for (int i = 0; i < houseNums;i++){
            if (delId == houses[i].getId()){
               index = i;
                //要删除的房屋ID，是数组下标为i的元素
            }
        }

        if(index == -1){
            //说明delId在数组中不存在
            return false;
        }
        //如果找到
        //如果不-1，会找到NUll,最后一个元素要滞空
        for (int i = index; i < houseNums - 1; i++){
            houses[i] = houses[i+1];
            //把后面的向前面移动

        }
        houses[--houseNums] = null;
        //把当前存在的房屋信息滞空
        return true;
    }
    //add方法，添加新对象，返回boolean
    public boolean add(House newHouse){
        //判断是否还可以继续添加(我们暂时不考虑数组扩容的问题）
        //判断是否还能添加
        if (houseNums == houses.length){
            //不等于说明还能继续添加
            System.out.println("数组已满，不能再添加了....");
            return false;
        }
        //把newHouse对象加入到数组里面
        houses[houseNums++] = newHouse;
        //因为新增加了一个房屋

        //设计一个id增长的机制
        newHouse.setId(++idCounter);
        return true;
    }
    public  House[] list(){//创建list返回所有的房屋信息
        return houses;
    }
}
