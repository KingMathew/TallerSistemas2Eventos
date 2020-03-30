package main;

public class Reportes extends javax.swing.JFrame {

    private javax.swing.JButton botonBoletasPorEvento;
    private javax.swing.JButton botonBoletasVendidas;
    private javax.swing.JButton botonTotalVentas;
    private javax.swing.JButton botonBoletasPorCliente;
    private javax.swing.JButton botonMenu;
    private javax.swing.JLabel labelReportes;

    String eventos[][] = new String[6][5];
    int contadorEventos = 0;

    String clientes[][] = new String[10][4];
    int contadorClientes = 0;

    String ventas[][] = new String[100][5];
    int contadorVentas = 0;

    public void cargarInfo(String[][] eventos, int contadorEventos, String[][] clientes, int contadorClientes, String[][] ventas, int contadorVentas) {
        this.eventos = eventos;
        this.contadorEventos = contadorEventos;

        this.clientes = clientes;
        this.contadorClientes = contadorClientes;

        this.ventas = ventas;
        this.contadorVentas = contadorVentas;
    }

    public Reportes() {
        initComponents();
    }

    private void initComponents() {

        botonBoletasPorEvento = new javax.swing.JButton();
        botonBoletasVendidas = new javax.swing.JButton();
        botonTotalVentas = new javax.swing.JButton();
        botonBoletasPorCliente = new javax.swing.JButton();
        botonMenu = new javax.swing.JButton();
        labelReportes = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        botonBoletasPorEvento.setText("Boletas por evento");
        botonBoletasPorEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //actionCrearEspectaculo(evt);
            }
        });

        botonBoletasVendidas.setText("Total de boletas vendidas");
        botonBoletasVendidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //actionRegistrarCliente(evt);
            }
        });

        botonTotalVentas.setText("Total de ventas");
        botonTotalVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //actionRealizarVenta(evt);
            }
        });

        botonBoletasPorCliente.setText("Boletas por cliente");
        botonBoletasPorCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //actionGenerarReporte(evt);
            }
        });

        botonMenu.setForeground(new java.awt.Color(255, 0, 0));
        botonMenu.setText("Menu");
        botonMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //actionExit(evt);
            }
        });

        labelReportes.setForeground(new java.awt.Color(102, 102, 255));
        labelReportes.setText("Reportes");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(161, 161, 161)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(botonBoletasPorEvento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(botonBoletasVendidas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(botonTotalVentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(botonBoletasPorCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(botonMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(180, 180, 180)
                                        .addComponent(labelReportes)))
                        .addContainerGap(164, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelReportes)
                        .addGap(33, 33, 33)
                        .addComponent(botonBoletasPorEvento)
                        .addGap(32, 32, 32)
                        .addComponent(botonBoletasVendidas)
                        .addGap(32, 32, 32)
                        .addComponent(botonTotalVentas)
                        .addGap(32, 32, 32)
                        .addComponent(botonBoletasPorCliente)
                        .addGap(36, 36, 36)
                        .addComponent(botonMenu)
                        .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
    }
}
