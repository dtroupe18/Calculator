// Created by Dave on 10/26/17.
/* Simple Calculator I made while bored */

// https://www.thecrazyprogrammer.com/2014/06/program-to-create-calculator-using-java-swing.html

import javax.swing.*;

public class Calculator {

    JFrame jFrame;
    JTextField textField;
    JButton zero, one, two, three, four, five, six, seven, eight, nine, add,
    subtract, multiply, divide, clear, enter;

    private double x = 0;
    private double y = 0;
    private double solution = 0;
    private int operator = 0;

    // constructor
    Calculator() {
        jFrame = new JFrame("Simple Calculator");
        textField = new JTextField();

        // number buttons
        zero = new JButton("'0");
        one = new JButton("'1");
        two = new JButton("'2");
        three = new JButton("3");
        four = new JButton("'4");
        five = new JButton("'5");
        six = new JButton("'6");
        seven = new JButton("'7");
        eight = new JButton("'8");
        nine = new JButton("'9");

        // operator buttons
        add = new JButton("+");
        subtract = new JButton("-");
        multiply = new JButton("x");
        divide = new JButton("÷");
        clear = new JButton("Clear");
        enter = new JButton("Enter");

        textField.setBounds(10, 10, 300, 30);


    }




}
