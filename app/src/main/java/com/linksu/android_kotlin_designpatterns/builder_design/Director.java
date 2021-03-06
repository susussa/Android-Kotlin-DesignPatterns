package com.linksu.android_kotlin_designpatterns.builder_design;

/**
 * ==========================================
 * 作 者：linksu (sufululove@gmail.com)
 * 版 本：1.0
 * 创建日期： 2017/8/21
 * 描 述：统一组装过程，负责构造Computer
 * Builder 模式
 * 修订历史：
 * ==========================================
 */

public class Director {
    Builder builder = null;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct(String board, String display) {
        builder.buildBoard(board);
        builder.buildDisplay(display);
        builder.buildOS();
    }

    public static class Tesst {
        public static void main(String[] args) {
            Builder builder = new MacbookBuilder();
            builder.buildBoard("aaa");
            builder.buildDisplay("sss");
            builder.buildOS();
            builder.create();
            Director director = new Director(builder);
            director.construct("ssss", "sssss");
            System.out.print(builder.create().toString());
        }
    }
}
