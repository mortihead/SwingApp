package ru.mortihead;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.util.logging.Logger;

public class SwingApp {
    public static void main(String[] args) {
        Logger log = Logger.getLogger(SwingApp.class.getName());
        log.info("Start app");

        //Declare frame object
        JFrame win = new JFrame();
        //Set the title
        win.setTitle("Java Swing Example-3");
        //Set the window size
        win.setSize(800, 600);

        //Create a label object, set the position, and add to the frame
        JLabel lbl1 = new JLabel("Product Name:", JLabel.LEFT);
        lbl1.setBounds(80, 20, 100, 20);
        win.add(lbl1);
        //Create text object set the position, and add to the frame
        JTextField name = new JTextField();
        name.setBounds(200, 20, 200, 20);
        win.add(name);

        //Create a label object, set the position, and add to the frame
        JLabel lbl2 = new JLabel("Product Type:", JLabel.LEFT);
        lbl2.setBounds(80, 60, 100, 20);
        win.add(lbl2);
        //Create the radio buttons, set the position, and add to the frame
        JRadioButton rdbtn1 = new JRadioButton("Local");
        rdbtn1.setActionCommand("Local");
        JRadioButton rdbtn2 = new JRadioButton("Foreign");
        rdbtn2.setActionCommand("Foreign");
        rdbtn1.setBounds(200, 40, 80, 50);
        rdbtn2.setBounds(300, 40, 90, 50);
        ButtonGroup bgrp = new ButtonGroup();
        bgrp.add(rdbtn1);
        bgrp.add(rdbtn2);
        win.add(rdbtn1);
        win.add(rdbtn2);

        /*Create a label object, set the position, and add to the frame */
        JLabel lbl3 = new JLabel("Desctiption:", JLabel.LEFT);
        lbl3.setBounds(80, 100, 120, 20);
        win.add(lbl3);
        //Create textarea object set the position, and add to the frame
        JTextArea txtArea = new JTextArea();
        txtArea.setBounds(200, 100, 200, 100);
        win.add(txtArea);

        //Create a button, set the position, and add to the frame
        JButton btn = new JButton("Submit");
        btn.setBounds(200, 220, 100, 30);
        win.add(btn);

        JFileChooser reestrChooser = new JFileChooser();
        reestrChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        reestrChooser.setAcceptAllFileFilterUsed(false);
        reestrChooser.setBounds(80, 240, 400, 200);
        win.add(reestrChooser);

        FileNameExtensionFilter filter = new FileNameExtensionFilter("MS Excel tables", "xlsx");
        reestrChooser.addChoosableFileFilter(filter);

        Button reestrChooseButton = new Button("Выбрать файл с реестром");
        reestrChooseButton.setBounds(400, 220, 100, 30);

        reestrChooseButton.addActionListener((e) -> {
            log.info("Button click");
            if (reestrChooser.showOpenDialog(win) == JFileChooser.APPROVE_OPTION) {
                log.info("Open dialog select");
                txtArea.setText(reestrChooser.getSelectedFile().toString());
            } else {
                log.info("Open dialog select Cancel");
            }
        });
        win.add(reestrChooseButton);


        //Set window position
        win.setLocationRelativeTo(null);
        //Disable the default layout of the frame
        win.setLayout(null);
        //Make the window visible
        log.info("Make the window visible");
        win.setVisible(true);
    }
}
