package cn.xdd.test;

import org.junit.Test;

/**
 * @author xchb
 * @version 1.0
 * @ClassName MyThreadLocal
 * @description null
 * @createTime 2019年08月26日 20:00
 */

class Local{
    private static Local local;
    private Local(){}
    public static Local newInstanse(){
        if(local==null){
           local=new Local();
        }
        return local;
    }
}

public class MyThreadLocal {
    public static void main(String[] args) {
        for(int i=1;i<=200;i++){
            new Thread(()->{
                Local local=Local.newInstanse();
                System.out.println(local+"--->"+Thread.currentThread().getName());
            },"线程"+i).start();
        }
    }
}
