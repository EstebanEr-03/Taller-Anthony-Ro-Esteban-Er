import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfazTallerProgra extends JFrame {
    private JScrollBar scrollBar1;
    private JPanel panelPrincipal;
    private JTabbedPane tabbedPane1;
    private JTabbedPane tabbedPane2;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JButton ingresarButton;
    private JButton quemarDatos7LibrosButton;
    private JTabbedPane tabbedPane3;
    private JTextField textField6;
    private JButton eliminatButton;
    private JTextArea textAreaMostrarLibroEliminado;
    private JTextField textField7;
    private JButton eliminarButton;
    private JTextArea textAreaLibroEliminado;
    private JTextField textField8;
    private JButton button1;
    private JTextArea textAreaBuscarNombre;
    private JTextField textField9;
    private JButton button2;
    private JTextArea textAreaBuscarPorId;
    private JButton calcularButton;
    private JTextArea textAreaCalcular;
    private JButton mostrarLibrosDisponiblesButton;
    private JButton mostrarLibrosDisponiblesButton1;
    Libro libroA=new Libro("Mi lucha",500,"Hitler","Santillana","004");
    Libro libroB=new Libro("La ciudad perdida",400,"anthony","saneca","005");
    Libro libroC=new Libro("Evil Death",100,"pedro","norma","003");
    Libro libroD=new Libro("La momia",250,"felipe","Santillana","001");
    Libro libroE=new Libro("Cantunia",50,"Quito","Santillana","007");
    Libro libroF=new Libro("SHurima",600,"Jose","Norma","006");

    Libro libroNew;
    boolean respuesta=true;
    TrackingSystem trackingSystemNew=new TrackingSystem();
public InterfazTallerProgra() {
    add(panelPrincipal);
    setSize(300,200);
    setLocationRelativeTo(null);

    setTitle("Taller Progra Anthony & Esteban");
    ingresarButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (trackingSystemNew.searchByTrackingNombreValidar(trackingSystemNew.libros, textField1.getText())){
                System.out.println("No se ingreso ya que ya existe un libro con ese nombre");
                JOptionPane.showMessageDialog(null,"No se ingreso ya que ya existe un libro con ese nombre");
            }else {
                libroNew = new Libro(textField1.getText(), Integer.valueOf(textField5.getText()), textField2.getText(), textField3.getText(), textField4.getText());
                trackingSystemNew.addPackage(libroNew);
                JOptionPane.showMessageDialog(null,"Se ha ingresado con exito");
            }

        }
    });
    eliminatButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String nombre=textField6.getText();
            trackingSystemNew.removePackagePorNombre(trackingSystemNew.libros,nombre);
            textAreaMostrarLibroEliminado.setText("Se ha remivido Exitosamente el libro "+nombre);
        }
    });
    eliminarButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String id=textField7.getText();
            trackingSystemNew.removePackage(trackingSystemNew.libros,id);
            textAreaLibroEliminado.setText("Se ha remivido Exitosamente el libro "+id);
        }
    });
    button1.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String buscarNombre=textField8.getText();
            textAreaBuscarNombre.setText(" "+trackingSystemNew.searchByNombreLineal(trackingSystemNew.libros, buscarNombre).toString());
        }
    });
    button2.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            //int id=Integer.valueOf(textField9.getText());
            //textAreaBuscarPorId.setText(" "+trackingSystemNew.searchBinary(trackingSystemNew.libros,id).toString());
            textAreaBuscarPorId.setText(" "+trackingSystemNew.searchBinary(trackingSystemNew.libros, Integer.valueOf(textField9.getText())).toString());
        }
    });
    calcularButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            int indice=trackingSystemNew.libros.size()-1;
            textAreaCalcular.setText(" "+trackingSystemNew.sumaPaginasRecursiva(trackingSystemNew.libros,indice));
        }
    });
    mostrarLibrosDisponiblesButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            textAreaMostrarLibroEliminado.setText(trackingSystemNew.libros.toString());
        }
    });
    quemarDatos7LibrosButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            trackingSystemNew.addPackage(libroA);
            trackingSystemNew.addPackage(libroB);
            trackingSystemNew.addPackage(libroC);
            trackingSystemNew.addPackage(libroD);
            trackingSystemNew.addPackage(libroE);
            trackingSystemNew.addPackage(libroF);


        }
    });
    mostrarLibrosDisponiblesButton1.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            textAreaBuscarNombre.setText(trackingSystemNew.libros.toString());
        }
    });
}
}
