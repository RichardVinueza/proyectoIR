package vista;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Ivet
 */
public class PrincipalV extends JFrame {

    //Creamos los botones en PrincipalV
    public static JButton jButtonCompras = new JButton("COMPRAS");
    public static JButton jButtonVentas = new JButton("VENTAS");
    public static JButton jButtonFactura = new JButton("FACTURA CLIENTE");

    //Creamos los botenes del Menu2
    public static JFrame vistaMenu2 = new JFrame();

    public static JButton jButtonArticulos = new JButton("ARTICULOS");
    public static JButton jButtonAlbaranCompras = new JButton("ALBARAN COMPRAS");
    public static JButton jButtonDetalleCompras = new JButton("DETALLES COMPRAS");
    public static JButton jButton3;
    public static JComboBox<String> jComboBox1;

    public PrincipalV() {

        inicializarVistaPrincipal();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void inicializarVistaPrincipal() {
        this.setLayout(null);
        this.add(jButtonCompras);
        jButtonCompras.setBounds(70, 200, 100, 50);
        this.add(jButtonVentas);
        jButtonVentas.setBounds(200, 200, 100, 50);
        this.add(jButtonFactura);
        jButtonFactura.setBounds(330, 200, 100, 50);
        this.setSize(500, 500);
    }

    public void inicializarMenu2() {
        vistaMenu2.setLayout(null);
        vistaMenu2.add(jButtonArticulos);
        jButtonArticulos.setBounds(80, 100, 170, 50);
        vistaMenu2.add(jButtonAlbaranCompras);
        jButtonAlbaranCompras.setBounds(80, 200, 170, 50);
        vistaMenu2.add(jButtonDetalleCompras);
        jButtonDetalleCompras.setBounds(80, 300, 170, 50);
        
        vistaMenu2.setSize(500, 500);
    }

}
