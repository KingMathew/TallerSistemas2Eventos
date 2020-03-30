package main;

import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    private javax.swing.JLabel labelTitle;
    private javax.swing.JLabel labelUser;
    private javax.swing.JLabel labelPassword;

    private javax.swing.JTextField textFieldUser;
    private javax.swing.JTextField textFieldPassword;

    private javax.swing.JButton botonGuardar;
    private javax.swing.JButton botonMenu;

    String eventos[][] = new String[6][5];
    int contadorEventos = 0;

    String clientes[][] = new String[10][4];
    int contadorClientes = 0;

    String ventas[][] = new String[100][5];
    int contadorVentas = 0;

    public Login() {
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
        labelUser = new javax.swing.JLabel();
        labelPassword = new javax.swing.JLabel();

        textFieldPassword = new javax.swing.JTextField();
        textFieldUser = new javax.swing.JTextField();

        botonGuardar = new javax.swing.JButton();
        botonMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelTitle.setForeground(new java.awt.Color(255, 51, 51));
        labelTitle.setText("Autenticación usuario");

        labelUser.setText("Usuario");
        labelPassword.setText("Contraseña");

        botonGuardar.setText("Ingresar");
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionIngresar(evt);
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
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(172, 172, 172)
                                        .addComponent(labelTitle))
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(65, 65, 65)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(labelUser)
                                                .addComponent(labelPassword))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(textFieldUser, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                                                .addComponent(textFieldPassword)))
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(89, 89, 89)
                                        .addComponent(botonGuardar)
                                        .addGap(45, 45, 45)
                                        .addComponent(botonMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(115, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelTitle)
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(labelUser)
                                .addComponent(textFieldUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(labelPassword)
                                .addComponent(textFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void actionIngresar(java.awt.event.ActionEvent evt) {

        if (!textFieldUser.getText().equals("")
                && !textFieldPassword.getText().equals("")) {

            String name = "";
            String user = textFieldUser.getText();
            String pass = textFieldPassword.getText();

            Boolean success = false;
            String[] clienteSelected = new String[4];
            for (int i = 0; i < clientes.length; i++) {

                if (user.equals(clientes[i][2]) && pass.equals(clientes[i][3])) {
                    clienteSelected = clientes[i];
                    success = true;
                    name = clientes[i][1];
                }
            }

            if (success) {
                JOptionPane.showMessageDialog(null, "Bienvenido " + name);
                ListadoEventos listadoEventos = new ListadoEventos();
                this.setVisible(false);
                listadoEventos.cargarInfo(eventos, contadorEventos, clientes, contadorClientes, ventas, contadorVentas, clienteSelected[0]);
                listadoEventos.setVisible(true);

            } else {
                JOptionPane.showMessageDialog(null, "Usuario y/o contraseña incorrectos");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Favor llenar todos los campos");
        }

    }
}
