package JAVA_EJERCICIOS;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
 
public class Valor_Del_PI extends JFrame implements ActionListener {
 
    private static final long serialVersionUID = 1L;
 
    private JLabel label1, label2;
    private JButton boton1;
    private JTextField textField1; 
 
    public Valor_Del_PI() {
        setLayout(null);
        setTitle("Cálculo de PI mediante la serie de Leibniz");
 
        label1 = new JLabel("Introduce el número de iteraciones para la aproximación");
        label1.setBounds(10, 20, 450, 30);
        add(label1);
 
        textField1 = new JTextField();
        textField1.setBounds(90, 60, 100, 30);
        textField1.setHorizontalAlignment(JTextField.RIGHT);
        add(textField1);
 
        label2 = new JLabel("");
        label2.setBounds(10, 100, 450, 30);
        add(label2);
 
        boton1 = new JButton("Calcular");
        boton1.setBounds(260, 60, 100, 30);
        add(boton1);
        boton1.addActionListener(this);
 
    }
 
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == boton1){
            String cadena = "";
            try{
                String strRep = textField1.getText();
                int rep = Integer.parseInt(strRep);
                double rdo = calcularPI(rep);
                cadena = "El valor de PI aproximado es: " + rdo;
                label2.setForeground(Color.BLACK);
            }
            catch (NumberFormatException ex){
                cadena = "El valor introducido no es correcto.";
                label2.setForeground(Color.RED);
            }
            finally{
                label2.setText(cadena);
            }
        }
    }
 
    private static double calcularPI(double rep){
        double pi = 0;
        double s = 1;
        for(int i=1,j=1; i<=rep; i++,j=j+2){
            pi += s / j;
            s = -s;
        }
        return pi * 4;
    }
 
    public static void main(String[] args) {
    	Valor_Del_PI frame = new Valor_Del_PI();
        frame.setBounds(0, 0, 450, 170);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
 
}