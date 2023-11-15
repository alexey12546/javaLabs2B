import javax.swing.*;

import static java.lang.Math.*;
import static java.lang.Math.pow;

public class CalculationFunction {


    static double returnResult1(JTextField xTextField, JTextField yTextField, JTextField zTextField, JTextField resultTextField) {
        String xValue = xTextField.getText();
        String yValue = yTextField.getText();
        String zValue = zTextField.getText();
        double x = Double.parseDouble(xValue.trim());
        double y = Double.parseDouble(yValue.trim());
        double z = Double.parseDouble(zValue.trim());
        double a = formula1(x, y, z);
        String rezultValue = String.valueOf(a);
        resultTextField.setText(rezultValue);
        return a;
    }

    static double returnResult2(JTextField xTextField, JTextField yTextField, JTextField zTextField, JTextField resultTextField) {
        String xValue = xTextField.getText();
        String yValue = yTextField.getText();
        String zValue = zTextField.getText();
        double x = Double.parseDouble(xValue.trim());
        double y = Double.parseDouble(yValue.trim());
        double z = Double.parseDouble(zValue.trim());
        double a = formula2(x, y, z);
        String rezultValue = String.valueOf(a);
        resultTextField.setText(rezultValue);
        return a;
    }


    static double formula1(double x, double y, double z) {
        double a = sin(log(y) + sin(PI * pow(y, 2))) * pow((pow(x, 2) + sin(z) + pow(E, cos(z))), 0.25);
        return a;
    }

    static double formula2(double x, double y, double z) {
        double a = (1 + pow(x, z) + log(pow(y, 2))) * (1 - sin(z * y)) / (pow((pow(x, 3) + 1), 0.5));
        return a;
    }

}
