package main;

import javax.swing.JOptionPane;

public class ListadoEventos extends javax.swing.JFrame {

    private javax.swing.JLabel labelTitle;
    private javax.swing.JLabel nombreEvento;

    private javax.swing.JComboBox<String> comboBoxEventos;

    private javax.swing.JLabel labelCantidad;
    private javax.swing.JTextField textFieldCantidad;

    private javax.swing.JLabel labelValorTotal;
    private javax.swing.JTextField textFieldValorTotal;

    private javax.swing.JButton botonConsultar;
    private javax.swing.JButton botonMenu;
    private javax.swing.JButton botonVender;

    String eventos[][] = new String[6][5];
    int contadorEventos = 0;

    String clientes[][] = new String[10][4];
    int contadorClientes = 0;

    String ventas[][] = new String[100][5];
    int contadorVentas = 0;

    String boletasRestantes = "";
    int positionEvento = -1;

    //Datos de la venta
    String valorCompra = "";
    String idUsuario = "";
    String idEvento;
    String cantBoletas;

    public ListadoEventos() {
        initComponents();
    }

    public void cargarInfo(String[][] eventos, int contadorEventos, String[][] clientes, int contadorClientes, String[][] ventas, int contadorVentas, String idCliente) {
        this.eventos = eventos;
        this.contadorEventos = contadorEventos;

        this.clientes = clientes;
        this.contadorClientes = contadorClientes;

        this.ventas = ventas;
        this.contadorVentas = contadorVentas;

        this.idUsuario = idCliente;

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

        labelCantidad = new javax.swing.JLabel();
        textFieldCantidad = new javax.swing.JTextField();

        labelValorTotal = new javax.swing.JLabel();
        textFieldValorTotal = new javax.swing.JTextField();

        botonConsultar = new javax.swing.JButton();
        botonMenu = new javax.swing.JButton();
        botonVender = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelTitle.setForeground(new java.awt.Color(255, 51, 51));
        labelTitle.setText("Vender boletos");

        nombreEvento.setText("Nombre evento");
        labelCantidad.setText("Cantidad de boletas");

        labelValorTotal.setText("Valor total: ");
        labelValorTotal.setVisible(false);
        textFieldValorTotal.setEditable(false);
        textFieldValorTotal.setVisible(false);
        botonVender.setVisible(false);

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

        botonVender.setText("Vender");
        botonVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                venderBoletas(evt);
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
                                                        .addComponent(nombreEvento)
                                                        .addComponent(labelCantidad)
                                                        .addComponent(labelValorTotal))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(comboBoxEventos, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                                                        .addComponent(textFieldCantidad)
                                                        .addComponent(textFieldValorTotal)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(89, 89, 89)
                                                .addComponent(botonConsultar)
                                                .addGap(45, 45, 45)
                                                .addComponent(botonMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(89, 89, 89)
                                                .addComponent(botonVender)))
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
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(labelCantidad)
                                        .addComponent(textFieldCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(labelValorTotal)
                                        .addComponent(textFieldValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(botonConsultar)
                                        .addComponent(botonMenu))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(botonVender))
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

        if (!textFieldCantidad.getText().equals("")) {
            String[] eventoSelected = new String[5];
            int position = -1;
            for (int i = 0; i < eventos.length; i++) {
                if (eventos[i][1] != null) {
                    if (eventos[i][1].equals(String.valueOf(comboBoxEventos.getSelectedItem()))) {
                        eventoSelected = eventos[i];
                        position = i;
                    }
                }
            }

            positionEvento = position;
            int valorBoleta = Integer.valueOf(eventoSelected[3]);
            int valorTotal = -1;
            int boletasDisponibles = Integer.valueOf(eventoSelected[4]);
            int boletasComprar = Integer.valueOf(textFieldCantidad.getText());
            int restanteBoletas = -1;

            if (boletasComprar < boletasDisponibles) {
                restanteBoletas = boletasDisponibles - boletasComprar;
                boletasRestantes = String.valueOf(restanteBoletas);
                valorTotal = valorBoleta * boletasComprar;

                textFieldValorTotal.setText(String.valueOf(valorTotal));
                labelValorTotal.setVisible(true);
                textFieldValorTotal.setVisible(true);
                botonVender.setVisible(true);

                valorCompra = String.valueOf(valorTotal);
                idEvento = eventoSelected[0];
                cantBoletas = textFieldCantidad.getText();

            } else {
                JOptionPane.showMessageDialog(null, "La cantidad de boletas a comprar supera el límite de boletas disponibles");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Favor llenar todos los campos");
        }
    }

    private void venderBoletas(java.awt.event.ActionEvent evt) {

        //Numero de venta
        ventas[contadorVentas][0] = String.valueOf(contadorVentas + 1);
        //Id cliente
        ventas[contadorVentas][1] = idUsuario;
        //Id evento
        ventas[contadorVentas][2] = idEvento;
        //Cantidad boletas
        ventas[contadorVentas][3] = cantBoletas;
        //Valor compra
        ventas[contadorVentas][4] = valorCompra;
        
        contadorVentas = contadorVentas + 1;

        JOptionPane.showMessageDialog(null, "Venta registrada satisfactoriamente");
        Main main = new Main();
        this.setVisible(false);
        main.cargarInfo(eventos, contadorEventos, clientes, contadorClientes, ventas, contadorVentas);
        main.setVisible(true);
    }

}
