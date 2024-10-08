import javax.swing.*;
import java.awt.*;

public class ActividadBotones {
    static JFrame frameBotones;
    static JLabel lblNum1, lblNum2, lblResultado;
    static JTextField txtNum1, txtNum2, txtResultado;
    static JButton btnSuma, btnResta, btnMultiplicacion, btnDivision, btnRaizDe1, btnRaizDe2, btnMayor, btnLimpiar;
    static JPanel padre, firstSon, secondSon, thirdSon;

    public static void main(String[] args) {
        inicializarJFrameBotones();
        frameBotones.setVisible(true);
        instanciarComponentes();
        inicializarPanelPadre();
        inicializarPanelesHijos();
    }

    private static void inicializarPanelesHijos() {
        firstSon  = new JPanel(new GridLayout(2, 2, 5, 5));
        secondSon = new JPanel(new GridLayout(3, 3, 5, 5));
        thirdSon = new JPanel(new GridLayout(1, 2, 5, 5));
    }

    private static void inicializarPanelPadre() {
        padre = new JPanel(new BorderLayout());
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
