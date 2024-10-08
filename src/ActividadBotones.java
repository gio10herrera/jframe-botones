import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActividadBotones {
    static JFrame frameBotones;
    static JLabel lblNum1, lblNum2, lblResultado;
    static JTextField txtNum1, txtNum2, txtResultado;
    static JButton btnSuma, btnResta, btnMultiplicacion, btnDivision, btnRaizDe1, btnRaizDe2, btnMayor, btnLimpiar;
    static JPanel padrePanel, firstSonPanel, secondSonPanel, thirdSonPanel;
    static double result;

    public static void main(String[] args) {
        inicializarJFrameBotones();
        instanciarComponentes();
        inicializarPanelPadre();
        inicializarPanelesHijos();
        agregarComponentesFirstSonPanel();
        agregarComponentesSecondSonPanel();
        agegarComponentesThirdSonPanel();
        agregarPanelesHijosAlPadre();
        agregarPanelPadreAlFrame();
        frameBotones.setVisible(true);
        sumar();
    }

    private static double ObtenerNum1(){
        return Double.parseDouble(txtNum1.getText());
    }
    private static double ObtenerNum2(){
        return Double.parseDouble(txtNum2.getText());
    }

    private static void sumar() {
        btnSuma.addActionListener(e -> {
            double num1 = ObtenerNum1();
            double num2 = ObtenerNum2();
            result = num1 + num2;
            txtResultado.setText(String.valueOf(result));
        });
    }

    private static void agegarComponentesThirdSonPanel() {
        thirdSonPanel.add(lblResultado);
        thirdSonPanel.add(txtResultado);
    }

    private static void agregarPanelPadreAlFrame() {
        frameBotones.add(padrePanel);
    }

    private static void agregarComponentesSecondSonPanel() {
        secondSonPanel.add(btnSuma);
        secondSonPanel.add(btnResta);
        secondSonPanel.add(btnMultiplicacion);
        secondSonPanel.add(btnDivision);
        secondSonPanel.add(btnRaizDe1);
        secondSonPanel.add(btnRaizDe2);
        secondSonPanel.add(btnMayor);
        secondSonPanel.add(btnLimpiar);
    }

    private static void agregarPanelesHijosAlPadre() {
        padrePanel.add(firstSonPanel, BorderLayout.NORTH);
        padrePanel.add(secondSonPanel, BorderLayout.CENTER);
        padrePanel.add(thirdSonPanel, BorderLayout.SOUTH);
    }

    private static void agregarComponentesFirstSonPanel() {
        firstSonPanel.add(lblNum1);
        firstSonPanel.add(txtNum1);
        firstSonPanel.add(lblNum2);
        firstSonPanel.add(txtNum2);
    }

    private static void inicializarPanelesHijos() {
        firstSonPanel  = new JPanel(new GridLayout(2, 2, 5, 5));
        firstSonPanel.setBorder(new EmptyBorder(10, 5, 15, 45));
        secondSonPanel = new JPanel(new GridLayout(3, 3, 5, 15));
        secondSonPanel.setBorder(new EmptyBorder(10, 5, 15, 10));
        thirdSonPanel = new JPanel(new GridLayout(1, 2, 5, 5));
        thirdSonPanel.setBorder(new EmptyBorder(10, 5, 15, 45));
    }

    private static void inicializarPanelPadre() {
        padrePanel = new JPanel(new BorderLayout());
    }

    private static void instanciarComponentes() {
        lblNum1 = new JLabel("Numero 1");
        lblNum1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNum2 = new JLabel("Numero 2");
        lblNum2.setHorizontalAlignment(SwingConstants.CENTER);
        lblResultado = new JLabel("Resultado");
        lblResultado.setHorizontalAlignment(SwingConstants.CENTER);
        txtNum1 = new JTextField();
        txtNum1.setHorizontalAlignment(SwingConstants.CENTER);
        txtNum2 = new JTextField();
        txtNum2.setHorizontalAlignment(SwingConstants.CENTER);
        txtResultado = new JTextField();
        txtResultado.setHorizontalAlignment(SwingConstants.CENTER);
        txtResultado.setEditable(false);
        btnSuma = new JButton("Suma");
        btnResta = new JButton("Resta");
        btnMultiplicacion = new JButton("Multiplicacion");
        btnDivision = new JButton("Division");
        btnRaizDe1 = new JButton("Raiz de 1");
        btnRaizDe2 = new JButton("Raiz de 2");
        btnMayor = new JButton("Mayor");
        btnLimpiar = new JButton("Limpiar");
    }


    private static void inicializarJFrameBotones() {
        //creacion del JFrame
        frameBotones = new JFrame();
        frameBotones.setSize(300, 400);
        //jFrameInterfaz.pack();
        frameBotones.setLocationRelativeTo(null);
        frameBotones.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameBotones.setResizable(false);
        frameBotones.setTitle("Botones");
    }
}
