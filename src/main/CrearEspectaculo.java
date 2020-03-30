package main;

import javax.swing.JOptionPane;

public class CrearEspectaculo extends javax.swing.JFrame {

    private javax.swing.JLabel labelTitle;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelName;
    private javax.swing.JLabel labelFecha;
    private javax.swing.JLabel labelValor;
    private javax.swing.JLabel labelCantidad;

    private javax.swing.JTextField textFieldCodigo;
    private javax.swing.JTextField textFieldNombre;
    private javax.swing.JTextField textFieldFecha;
    private javax.swing.JTextField textFieldValor;
    private javax.swing.JTextField textFieldCantidad;

    private javax.swing.JButton botonGuardar;
    private javax.swing.JButton botonMenu;

    String eventos[][] = new String[6][5];
    int contadorEventos = 0;

    String clientes[][] = new String[10][4];
    int contadorClientes = 0;
    
    String ventas[][] = new String[100][5];
    int contadorVentas = 0;
    

    public CrearEspectaculo() {
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

    private void initComponents() {

        labelTitle = new javax.swing.JLabel();
        labelCodigo = new javax.swing.JLabel();
        labelName = new javax.swing.JLabel();
        labelFecha = new javax.swing.JLabel();
        labelValor = new javax.swing.JLabel();
        labelCantidad = new javax.swing.JLabel();

        textFieldNombre = new javax.swing.JTextField();
        textFieldCodigo = new javax.swing.JTextField();
        textFieldFecha = new javax.swing.JTextField();
        textFieldValor = new javax.swing.JTextField();
        textFieldCantidad = new javax.swing.JTextField();

        botonGuardar = new javax.swing.JButton();
        botonMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelTitle.setForeground(new java.awt.Color(255, 51, 51));
        labelTitle.setText("Crear espectáculo");

        labelCodigo.setText("Codigo del evento");
        labelName.setText("Nombre del evento");
        labelFecha.setText("Fecha del evento");
        labelValor.setText("Valor de la boleta");
        labelCantidad.setText("Cantidad boletas disponibles");

        botonGuardar.setText("Guardar");
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionGuardarEvento(evt);
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
                                                        .addComponent(labelCodigo)
                                                        .addComponent(labelName)
                                                        .addComponent(labelFecha)
                                                        .addComponent(labelValor)
                                                        .addComponent(labelCantidad))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(textFieldCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                                                        .addComponent(textFieldNombre)
                                                        .addComponent(textFieldFecha)
                                                        .addComponent(textFieldValor)
                                                        .addComponent(textFieldCantidad)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(89, 89, 89)
                                                .addComponent(botonGuardar)
                                                .addGap(45, 45, 45)
                                                .addComponent(botonMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(115, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(labelTitle)
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(labelCodigo)
                                        .addComponent(textFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(labelName)
                                        .addComponent(textFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(labelFecha)
                                        .addComponent(textFieldFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(labelValor)
                                        .addComponent(textFieldValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(labelCantidad)
                                        .addComponent(textFieldCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(botonGuardar)
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

    private void actionGuardarEvento(java.awt.event.ActionEvent evt) {
        if (contadorEventos < 8) {
            if (!textFieldCodigo.getText().equals("")
                    && !textFieldNombre.getText().equals("")
                    && !textFieldFecha.getText().equals("")
                    && !textFieldValor.getText().equals("")
                    && !textFieldCantidad.getText().equals("")) {
                eventos[contadorEventos][0] = textFieldCodigo.getText();
                eventos[contadorEventos][1] = textFieldNombre.getText();
                eventos[contadorEventos][2] = textFieldFecha.getText();
                eventos[contadorEventos][3] = textFieldValor.getText();
                eventos[contadorEventos][4] = textFieldCantidad.getText();
                contadorEventos = contadorEventos + 1;
                JOptionPane.showMessageDialog(null, "Evento creado satisfactoriamente");
                textFieldCodigo.setText("");
                textFieldNombre.setText("");
                textFieldFecha.setText("");
                textFieldValor.setText("");
                textFieldCantidad.setText("");
            } else {
                JOptionPane.showMessageDialog(null, "Favor llenar todos los campos");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No hay espacio para almacenar");
        }
    }

}
