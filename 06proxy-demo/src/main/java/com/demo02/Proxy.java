package com.demo02;

public class Proxy  implements Rent{
    Host host;
    public Proxy(){

    }

    public Proxy(Host host) {
        this.host = host;
    }

    public void rent() {
        xuanchuan("happy");
        host.rent();
    }

    public void xuanchuan(String msg){
        System.out.println(msg+"开始出租了");
    }
}
