package reportes;

import javax.swing.JOptionPane;
import main.Main;

public class BoletasPorEvento extends javax.swing.JFrame {

    private javax.swing.JLabel labelTitle;
    private javax.swing.JLabel nombreEvento;
    private javax.swing.JComboBox<String> comboBoxEventos;

    private javax.swing.JButton botonConsultar;
    private javax.swing.JButton botonMenu;

    String eventos[][] = new String[6][5];
    int contadorEventos = 0;

    String clientes[][] = new String[10][4];
    int contadorClientes = 0;

    String ventas[][] = new String[100][5];
    int contadorVentas = 0;

    public BoletasPorEvento() {
        initComponents();
    }

    public void cargarInfo(String[][] eventos, int contadorEventos, String[][] clientes, int contadorClientes, String[][] ventas, int contadorVentas) {
        this.eventos = eventos;
        this.contadorEventos = contadorEventos;

        this.clientes = clientes;
        this.contadorClientes = contadorClientes;

        this.ventas = ventas;
        this.contadorVentas = contadorVentas;

        comboBoxEventos.setModel(new javax.swing.DefaultComboBoxModel<>(cargarComboBox()));
    }

    private String[] cargarComboBox() {
        String[] listadoEventosCombo = new String[6];
        for (int i = 0; i < eventos.length; i++) {
            listadoEventosCombo[i] = eventos[i][1];
        }
        return listadoEventosCombo;
    }

    private void initComponents() {

        labelTitle = new javax.swing.JLabel();

        nombreEvento = new javax.swing.JLabel();
        comboBoxEventos = new javax.swing.JComboBox<>();

        botonConsultar = new javax.swing.JButton();
        botonMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelTitle.setForeground(new java.awt.Color(255, 51, 51));
        labelTitle.setText("Cantidad de boletas vendidas por evento");

        nombreEvento.setText("Nombre evento");

        botonConsultar.setText("Consultar");
        botonConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionConsultar(evt);
            }
        });

        botonMenu.setText("Menu");
        botonMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionMenu(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(172, 172, 172)
                                                .addComponent(labelTitle))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(65, 65, 65)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(nombreEvento))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(comboBoxEventos, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(89, 89, 89)
                                                .addComponent(botonConsultar)
                                                .addGap(45, 45, 45)
                                                .addComponent(botonMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                )
                                .addContainerGap(115, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(labelTitle)
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(nombreEvento)
                                        .addComponent(comboBoxEventos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(botonConsultar)
                                        .addComponent(botonMenu))
                                .addContainerGap(82, Short.MAX_VALUE))
        );

        pack();
    }

    private void actionMenu(java.awt.event.ActionEvent evt) {
        Main main = new Main();
        this.setVisible(false);
        main.cargarInfo(eventos, contadorEventos, clientes, contadorClientes, ventas, contadorVentas);
        main.setVisible(true);
    }

    private void actionConsultar(java.awt.event.ActionEvent evt) {
        String[] eventoSelected = new String[5];
        for (int i = 0; i < eventos.length; i++) {
            if (eventos[i][1] != null) {
                if (eventos[i][1].equals(String.valueOf(comboBoxEventos.getSelectedItem()))) {
                    eventoSelected = eventos[i];
                }
            }
        }

        int cantidadTotal = 0;
        for (int i = 0; i < ventas.length; i++) {
            if (ventas[i][2] != null) {
                if (ventas[i][2].equals(eventoSelected[0])) {
                    cantidadTotal = cantidadTotal + Integer.valueOf(ventas[i][3]);
                }
            }

        }
        JOptionPane.showMessageDialog(null, "Boletos vendidos para el evento: " + eventoSelected[1] + " => " + String.valueOf(cantidadTotal));

    }

}
