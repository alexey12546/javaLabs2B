import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreatePanel extends JFrame{
    private final JFrame jFrame = getFrame();
    private final JPanel jPanel = new JPanel();
    private double result = 0;

    public void createPanel() {
        jFrame.setSize(600,500);
        jFrame.add(jPanel);
        jFrame.setTitle("Lab2");
        jPanel.setLayout(null);
        JTextField xTextField = new JTextField("0", 15);
        JTextField yTextField = new JTextField("0", 15);
        JTextField zTextField = new JTextField("0", 15);
        JTextField resultTextField = new JTextField("0", 15);
        JLabel xLabel = new JLabel("x: ");
        JLabel yLabel = new JLabel("y: ");
        JLabel zLabel = new JLabel("z: ");
        JLabel resultLabel = new JLabel("result: ");
        JRadioButton jRadioButton1 = new JRadioButton("Formula 1");
        JRadioButton jRadioButton2 = new JRadioButton("Formula 2");
        JRadioButton jRadioButtonX = new JRadioButton("Selected x");
        JRadioButton jRadioButtonY = new JRadioButton("Selected y");
        JRadioButton jRadioButtonZ = new JRadioButton("Selected z");
        JButton jButton1 = new JButton("calculate");
        JButton jButton2 = new JButton("MC");
        JButton jButton3 = new JButton("M+");
        ButtonGroup buttonGroup1 = new ButtonGroup();
        ButtonGroup buttonGroup2 = new ButtonGroup();
        ImageIcon icon1 = new ImageIcon("img/img1.png");
        ImageIcon icon2 = new ImageIcon("img/img2.png");
        JLabel label1 = new JLabel(icon1);
        JLabel label2 = new JLabel(icon2);
        jRadioButton1.setSelected(true);
        jRadioButtonX.setSelected(true);
        jPanel.add(label1).setBounds(100, 60, 314, 30);
        jPanel.add(label2).setBounds(100, 60, 330, 62);
        label2.setVisible(false);
        buttonGroup1.add(jRadioButton1);
        buttonGroup1.add(jRadioButton2);
        buttonGroup2.add(jRadioButtonX);
        buttonGroup2.add(jRadioButtonY);
        buttonGroup2.add(jRadioButtonZ);
        jRadioButton1.setBounds(160, 20, 100, 40);
        jPanel.add(jRadioButton1);
        jRadioButton2.setBounds(275, 20, 100, 40);
        jPanel.add(jRadioButton2);
        jRadioButtonX.setBounds(80, 110, 100, 40);
        jPanel.add(jRadioButtonX);
        jRadioButtonY.setBounds(195, 110, 100, 40);
        jPanel.add(jRadioButtonY);
        jRadioButtonZ.setBounds(310, 110, 100, 40);
        jPanel.add(jRadioButtonZ);
        xLabel.setBounds(60, 158, 30, 20);
        jPanel.add(xLabel);
        xTextField.setBounds(80, 160, 100, 20);
        jPanel.add(xTextField);
        yLabel.setBounds(200, 158, 30, 20);
        jPanel.add(yLabel);
        yTextField.setBounds(220, 160, 100, 20);
        jPanel.add(yTextField);
        zLabel.setBounds(340, 158, 30, 20);
        jPanel.add(zLabel);
        zTextField.setBounds(360, 160, 100, 20);
        jPanel.add(zTextField);
        resultLabel.setBounds(155, 198, 45, 20);
        jPanel.add(resultLabel);
        resultTextField.setBounds(200, 200, 130, 20);
        jPanel.add(resultTextField);
        jButton1.setBounds(220, 310, 100, 40);
        jPanel.add(jButton1);
        jButton2.setBounds(120, 250, 100, 40);
        jPanel.add(jButton2);
        jButton3.setBounds(320, 250, 100, 40);
        jPanel.add(jButton3);
        jRadioButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label1.setVisible(true);
                label2.setVisible(false);
            }
        });

        jRadioButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label2.setVisible(true);
                label1.setVisible(false);
            }

        });

        jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (jRadioButton1.isSelected()) {
                    result = CalculationFunction.returnResult1(xTextField, yTextField, zTextField, resultTextField);
                } else {
                    result = CalculationFunction.returnResult2(xTextField, yTextField, zTextField, resultTextField);
                }
            }
        });
        jButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (jRadioButtonX.isSelected()) {
                    xTextField.setText("0");
                } else if (jRadioButtonY.isSelected()) {
                    yTextField.setText("0");
                } else {
                    zTextField.setText("0");
                }
            }
        });
        jButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (jRadioButtonX.isSelected()) {
                    variableFields(xTextField);
                } else if (jRadioButtonY.isSelected()) {
                    variableFields(yTextField);
                } else {
                    variableFields(zTextField);
                }
            }
        });
        jPanel.revalidate();
    }

    static JFrame getFrame() {
        JFrame jFrame = new JFrame();
        jFrame.setVisible(true);
        jFrame.setBounds(450, 150, 500, 400);
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
        return jFrame;
    }

    private void variableFields(JTextField value) {
        String textField = value.getText();
        double fieldResult = Double.parseDouble(textField.trim());
        fieldResult += result;
        String resultValue = String.valueOf(fieldResult);
        value.setText(resultValue);
    }
}
