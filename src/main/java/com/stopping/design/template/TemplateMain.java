package com.stopping.design.template;

/**
 * @Classname: TemplateMain
 * @Date: 2022/4/26 5:07 下午
 * @author: stopping
 */
public class TemplateMain {
    public static void main(String[] args) {
        new BoosProcess(true).work();
        new CommonWorker(false).work();
    }
}
