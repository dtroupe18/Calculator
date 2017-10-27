// Created by Dave on 10/26/17.
/* Simple Calculator I made while bored */

import javax.swing.*;

public class Calculator {

    private JFrame jFrame;
    private JTextField textField;
    private JButton zero, one, two, three, four, five, six, seven, eight, nine, add,
            subtract, multiply, divide, decimal, clear, equals, plusMinus, squareRoot;

    private double x = 0;
    private double y = 0;
    private double solution = 0;
    private int operator = 0;

    // constructor
    Calculator() {
        addButtons();
        setButtonBounds();
        setupFrame();
        addActionListeners();
    }

    private void addButtons() {
        jFrame = new JFrame("Simple Calculator");
        textField = new JTextField();

        // number buttons
        zero = new JButton("0");
        one = new JButton("1");
        two = new JButton("2");
        three = new JButton("3");
        four = new JButton("4");
        five = new JButton("5");
        six = new JButton("6");
        seven = new JButton("7");
        eight = new JButton("8");
        nine = new JButton("9");
        decimal = new JButton(".");
        plusMinus = new JButton("±");
        squareRoot = new JButton("√ ");

        // operator buttons
        add = new JButton("+");
        subtract = new JButton("-");
        multiply = new JButton("x");
        divide = new JButton("÷");
        clear = new JButton("C");
        equals = new JButton("=");
    }

    private void setButtonBounds() {
        // place buttons in the correct place
        textField.setBounds(25, 10, 300, 40);

        // first row clear ± √ ÷
        clear.setBounds(25, 55, 69, 69);
        plusMinus.setBounds(102, 55, 69, 69);
        squareRoot.setBounds(179, 55, 69, 69);
        divide.setBounds(256, 55, 69, 69);

        // row 7 - 9 and multiply
        seven.setBounds(25, 132, 69, 69);
        eight.setBounds(102, 132, 69, 69);
        nine.setBounds(179, 132, 69, 69);
        multiply.setBounds(256, 132, 69, 69);

        // row 4 - 6  and plus
        four.setBounds(25, 209, 69, 69);
        five.setBounds(102, 209, 69, 69);
        six.setBounds(179, 209, 69, 69);
        add.setBounds(256, 209, 69, 69);


        // row 1 - 3 and -
        one.setBounds(25, 286, 69, 69);
        two.setBounds(102, 286, 69, 69);
        three.setBounds(179, 286, 69, 69);
        subtract.setBounds(256, 286, 69, 69);

        // forth row
        zero.setBounds(25, 363, 144, 69);
        decimal.setBounds(179, 363, 69, 69);
        equals.setBounds(256, 363, 69, 69);
    }

    private void setupFrame() {
        // add everything to the frame
        jFrame.add(textField);

        jFrame.add(clear);
        jFrame.add(plusMinus);
        jFrame.add(squareRoot);
        jFrame.add(divide);

        jFrame.add(seven);
        jFrame.add(eight);
        jFrame.add(nine);
        jFrame.add(multiply);

        jFrame.add(four);
        jFrame.add(five);
        jFrame.add(six);
        jFrame.add(seven);
        jFrame.add(add);

        jFrame.add(one);
        jFrame.add(two);
        jFrame.add(three);
        jFrame.add(subtract);

        jFrame.add(zero);
        jFrame.add(decimal);
        jFrame.add(equals);

        // make the frame visible
        jFrame.setLayout(null);
        jFrame.setVisible(true);
        jFrame.setSize(350, 500);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setResizable(false);
    }

    private void addActionListeners() {

        zero.addActionListener(e -> textField.setText(textField.getText().concat("0")));
        one.addActionListener(e -> textField.setText(textField.getText().concat("1")));
        two.addActionListener(e -> textField.setText(textField.getText().concat("2")));
        three.addActionListener(e -> textField.setText(textField.getText().concat("3")));
        four.addActionListener(e -> textField.setText(textField.getText().concat("4")));
        five.addActionListener(e -> textField.setText(textField.getText().concat("5")));
        six.addActionListener(e -> textField.setText(textField.getText().concat("6")));
        seven.addActionListener(e -> textField.setText(textField.getText().concat("7")));
        eight.addActionListener(e -> textField.setText(textField.getText().concat("8")));
        nine.addActionListener(e -> textField.setText(textField.getText().concat("9")));

//        decimal = new JButton(".");
//        plusMinus = new JButton("±");
//        squareRoot = new JButton("√ ");
//
//        // operator buttons
//        add = new JButton("+");
//        subtract = new JButton("-");
//        multiply = new JButton("x");
//        divide = new JButton("÷");
//        clear = new JButton("C");
//        equals = new JButton("=");
    }

    public static void main(String[] args) {
        new Calculator();
    }
}