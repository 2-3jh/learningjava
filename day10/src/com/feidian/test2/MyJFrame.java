package com.feidian.test2;

import javax.swing.*;
import java.awt.*;

public class MyJFrame extends JFrame {
    public MyJFrame()  {
        initJFrame();

        JLabel text =new JLabel("你觉得自己帅吗？");
        text.setFont(new Font("宋体",0,30));
        text.setBounds(120,150,300,50);

    }

    private void initJFrame() {
        this.setSize(500,600);
        this.setTitle("自信即巅峰");
        this.setDefaultCloseOperation(3);
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
    }
}
