package main;

public class Main extends javax.swing.JFrame {

    private javax.swing.JButton botonCrearEspectaculo;
    private javax.swing.JButton botonRegistrarCliente;
    private javax.swing.JButton botonRealizarVenta;
    private javax.swing.JButton botonGenerarReporte;
    private javax.swing.JButton botonSalir;
    private javax.swing.JLabel labelMenu;

    String eventos[][] = new String[6][5];
    int contadorEventos = 0;

    String clientes[][] = new String[10][4];
    int contadorClientes = 0;

    String ventas[][] = new String[100][5];
    int contadorVentas = 0;

    public Main() {
        /*eventos[0] = new String[]{"1002", "Concierto Mayor", "20-01-05", "10000", "30"};
        eventos[1] = new String[]{"1515", "Partido futbol", "20-01-05", "10000", "300"};
        clientes[0] = new String[]{"1022430062", "Mateo Ortiz", "mat", "123"};
        clientes[1] = new String[]{"54546565", "Santiago", "san", "123"};*/
        initComponents();
    }

    public void cargarInfo(String[][] eventos, int contadorEventos, String[][] clientes, int contadorClientes, String[][] ventas, int contadorVentas) {
        this.eventos = eventos;
        this.contadorEventos = contadorEventos;

        this.clientes = clientes;
        this.contadorClientes = contadorClientes;

        this.ventas = ventas;
        this.contadorVentas = contadorVentas;
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);

            }
        });
    }

    private void initComponents() {

        botonCrearEspectaculo = new javax.swing.JButton();
        botonRegistrarCliente = new javax.swing.JButton();
        botonRealizarVenta = new javax.swing.JButton();
        botonGenerarReporte = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();
        labelMenu = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        botonCrearEspectaculo.setText("Crear espectáculo");
        botonCrearEspectaculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionCrearEspectaculo(evt);
            }
        });

        botonRegistrarCliente.setText("Registrar cliente");
        botonRegistrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionRegistrarCliente(evt);
            }
        });

        botonRealizarVenta.setText("Realizar venta");
        botonRealizarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionRealizarVenta(evt);
            }
        });

        botonGenerarReporte.setText("Generar reporte");
        botonGenerarReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionGenerarReporte(evt);
            }
        });

        botonSalir.setForeground(new java.awt.Color(255, 0, 0));
        botonSalir.setText("Salir");
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionExit(evt);
            }
        });

        labelMenu.setForeground(new java.awt.Color(102, 102, 255));
        labelMenu.setText("Menu");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(161, 161, 161)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(botonRegistrarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(botonCrearEspectaculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(botonRealizarVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(botonGenerarReporte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(botonSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(180, 180, 180)
                                        .addComponent(labelMenu)))
                        .addContainerGap(164, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelMenu)
                        .addGap(33, 33, 33)
                        .addComponent(botonCrearEspectaculo)
                        .addGap(32, 32, 32)
                        .addComponent(botonRegistrarCliente)
                        .addGap(32, 32, 32)
                        .addComponent(botonRealizarVenta)
                        .addGap(32, 32, 32)
                        .addComponent(botonGenerarReporte)
                        .addGap(36, 36, 36)
                        .addComponent(botonSalir)
                        .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
    }

    private void actionExit(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }

    private void actionCrearEspectaculo(java.awt.event.ActionEvent evt) {
        CrearEspectaculo crearEspectaculo = new CrearEspectaculo();
        this.setVisible(false);
        crearEspectaculo.cargarInfo(eventos, contadorEventos, clientes, contadorClientes, ventas, contadorVentas);
        crearEspectaculo.setVisible(true);
    }

    private void actionRegistrarCliente(java.awt.event.ActionEvent evt) {
        CrearCliente crearCliente = new CrearCliente();
        this.setVisible(false);
        crearCliente.cargarInfo(eventos, contadorEventos, clientes, contadorClientes, ventas, contadorVentas);
        crearCliente.setVisible(true);
    }

    private void actionRealizarVenta(java.awt.event.ActionEvent evt) {
        Login login = new Login();
        this.setVisible(false);
        login.cargarInfo(eventos, contadorEventos, clientes, contadorClientes, ventas, contadorVentas);
        login.setVisible(true);
    }

    private void actionGenerarReporte(java.awt.event.ActionEvent evt) {
        Reportes reportes = new Reportes();
        this.setVisible(false);
        reportes.cargarInfo(eventos, contadorEventos, clientes, contadorClientes, ventas, contadorVentas);
        reportes.setVisible(true);
    }

}
