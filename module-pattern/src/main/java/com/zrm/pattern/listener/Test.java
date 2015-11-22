package com.zrm.pattern.listener;

/**
 * Created by zhangrm on 2015/11/22.
 */
public class Test {

    public static void main(String[] args){
        Button button = new Button();
        button.setOnCLickListener(new ClickListener() {
            @Override
            public void onClick(Button button) {
                System.out.println("按钮被点击了,正在执行事件");
            }
        });

        button.click();
    }
}
