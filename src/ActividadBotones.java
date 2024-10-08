import javax.swing.*;

public class ActividadBotones {
    static JFrame frameBotones;
    static JLabel lblNum1, lblNum2, lblResultado;
    static JTextField txtNum1, txtNum2, txtResultado;
    static JButton btnSuma, btnResta, btnMultiplicacion, btnDivision, btnRaizDe1, btnRaizDe2, btnMayor, btnLimpiar;

    public static void main(String[] args) {
        inicializarJFrameBotones();
        frameBotones.setVisible(true);
        
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
