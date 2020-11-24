package com.demo03_dongtai;

public class Client {
    public static void main(String[] args) {
        Host host = new Host();

        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        pih.setRent(host);
        Rent  proxy = (Rent) pih.getProxy();
        proxy.rent();
    }
}
