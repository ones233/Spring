package com.demo03_dongtai;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyInvocationHandler implements InvocationHandler {

    private Rent rent;
    public void setRent(Rent rent){
        this.rent = rent;
    }

    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),rent.getClass().getInterfaces(),this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        xuanchuan();
        Object invoke = method.invoke(rent,args);
        return invoke;
    }

    public void xuanchuan(){
        System.out.println("宣传");
    }
}
