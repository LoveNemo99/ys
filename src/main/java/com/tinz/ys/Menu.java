package com.tinz.ys;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.soecode.wxtools.api.IService;
import com.soecode.wxtools.api.WxConsts;
import com.soecode.wxtools.api.WxService;
import com.soecode.wxtools.bean.WxMenu;
import com.soecode.wxtools.exception.WxErrorException;

public class Menu {

//    public static void main(String[] args) {
    public void xxx() {
        IService iService = new WxService();
        WxMenu menu = new WxMenu();
        List<WxMenu.WxMenuButton> btnList = new ArrayList<>();

        //飙升功能
//        WxMenu.WxMenuButton btn1 = new WxMenu.WxMenuButton();
//        btn1.setName("分类");
//        List<WxMenu.WxMenuButton> subList = new ArrayList<>();
//        WxMenu.WxMenuButton btn1_1 = new WxMenu.WxMenuButton();
//        btn1_1.setType(WxConsts.MENU_BUTTON_CLICK);
//        btn1_1.setKey("1");
//        btn1_1.setName("飙升榜");
//        WxMenu.WxMenuButton btn1_2 = new WxMenu.WxMenuButton();
//        btn1_2.setType(WxConsts.MENU_BUTTON_CLICK);
//        btn1_2.setKey("2");
//        btn1_2.setName("TOP500");
//        WxMenu.WxMenuButton btn1_3 = new WxMenu.WxMenuButton();
//        btn1_3.setType(WxConsts.MENU_BUTTON_CLICK);
//        btn1_3.setKey("3");
//        btn1_3.setName("网络红歌");
//        WxMenu.WxMenuButton btn1_4 = new WxMenu.WxMenuButton();
//        btn1_4.setType(WxConsts.MENU_BUTTON_CLICK);
//        btn1_4.setKey("4");
//        btn1_4.setName("华语新歌");
//        WxMenu.WxMenuButton btn1_5 = new WxMenu.WxMenuButton();
//        btn1_5.setType(WxConsts.MENU_BUTTON_CLICK);
//        btn1_5.setKey("5");
//        btn1_5.setName("洗脑神曲");

        WxMenu.WxMenuButton btn2 = new WxMenu.WxMenuButton();
        btn2.setType(WxConsts.MENU_BUTTON_VIEW);
        btn2.setUrl("http://zrloveys.nat100.top");
        btn2.setKey("6");
        btn2.setName("雨水平台");

        WxMenu.WxMenuButton btn3 = new WxMenu.WxMenuButton();
        btn3.setType(WxConsts.MENU_BUTTON_CLICK);
        btn3.setKey("7");
        btn3.setName("帮助");

//        subList.addAll(Arrays.asList(btn1_1, btn1_2, btn1_3, btn1_4, btn1_5));
//        btn1.setSub_button(subList);

        //将三个按钮设置进btnList
//        btnList.add(btn1);
        btnList.add(btn2);
        btnList.add(btn3);
        //设置进菜单类
        menu.setButton(btnList);
        //调用API即可
        try {
            //参数1--menu  ，参数2--是否是个性化定制。如果是个性化菜单栏，需要设置MenuRule
            iService.createMenu(menu, false);
        } catch (WxErrorException e) {
            e.printStackTrace();
        }
    }
}
