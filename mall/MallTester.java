package com.xworkz.mall;

public class MallTester {
    public static void main(String[] args) {
        Shop shop=new Shop();
        Mall mall=new Mall(shop);
        mall.shop.doBusiness();
    }
}
