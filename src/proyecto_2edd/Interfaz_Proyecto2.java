/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_2edd;

import java.awt.BorderLayout;
import java.awt.Rectangle;
import java.io.File;
import java.time.Duration;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import java.time.Instant;
import javax.swing.JInternalFrame;
import javax.swing.JLayeredPane;

/**
 *
 * @author Nicolás Briceño
 */
public class Interfaz_Proyecto2 extends javax.swing.JFrame {
    public UserList list = new UserList();
    public archivo txt = new archivo();
    public int size = 1021;
    public HashTable table = new HashTable(size);
    Instant start = Instant.now();
    MonticuloBinario a = new MonticuloBinario();
    private Object jInternalFrame2;
    public Constructor_Grafico drawer;
    
    /**
     * Creates new form Interfaz_Proyecto2
     */
    public Interfaz_Proyecto2() {
        initComponents();
        boxprioridades.removeAllItems();
        boxprioridades.addItem("prioridad_baja");
        boxprioridades.addItem("prioridad_media");
        boxprioridades.addItem("prioridad_alta");
        boxelimuser.removeAllItems();
        usersbox.removeAllItems(); 
        deletedocbox.removeAllItems();
        printdocbox.removeAllItems();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel21 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        label1 = new java.awt.Label();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        fondopestana1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        browsebutton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        ExploradorArchivo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        fieldnewname = new javax.swing.JTextField();
        boxprioridades = new javax.swing.JComboBox<>();
        addbutton = new javax.swing.JButton();
        boxelimuser = new javax.swing.JComboBox<>();
        deletebutton = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        printdocbutton = new javax.swing.JButton();
        deletedocbutton = new javax.swing.JButton();
        createdocbutton = new javax.swing.JButton();
        printdocbox = new javax.swing.JComboBox<>();
        deletedocbox = new javax.swing.JComboBox<>();
        usersbox = new javax.swing.JComboBox<>();
        newdoctype = new javax.swing.JTextField();
        newdocsize = new javax.swing.JTextField();
        newdocname = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        userdocs = new javax.swing.JTextArea();
        fondo1 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        fondo2 = new javax.swing.JLabel();

        jLabel21.setText("jLabel21");

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(204, 204, 204));
        jLabel23.setText("Seleccione Usuario");

        label1.setText("label1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Inicio");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, -1, -1));

        fondopestana1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto2imagenes/fondo proyecto 2.jpeg"))); // NOI18N
        jPanel1.add(fondopestana1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jTabbedPane1.addTab("Inicio", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        browsebutton.setText("Cargar...");
        browsebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browsebuttonActionPerformed(evt);
            }
        });
        jPanel2.add(browsebutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 170, 80, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Menu de Usuarios");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, -1, -1));

        ExploradorArchivo.setForeground(new java.awt.Color(0, 51, 102));
        ExploradorArchivo.setText("Cargue archivo de formato \"csv.\"");
        ExploradorArchivo.setEnabled(false);
        ExploradorArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExploradorArchivoActionPerformed(evt);
            }
        });
        jPanel2.add(ExploradorArchivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 340, -1));

        jTextPane1.setEnabled(false);
        jScrollPane1.setViewportView(jTextPane1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 440, 90));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Usuarios Existentes");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, -1, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Eliminar usuario");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Agregar nuevo usuario: inserte nombre y nivel de prioridad");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Cargar archivo con la información");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, 30));

        fieldnewname.setText("Inserte nombre de Usuario");
        fieldnewname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fieldnewnameMouseClicked(evt);
            }
        });
        fieldnewname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldnewnameActionPerformed(evt);
            }
        });
        jPanel2.add(fieldnewname, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 200, -1));

        boxprioridades.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(boxprioridades, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 130, -1));

        addbutton.setText("Agregar");
        addbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbuttonActionPerformed(evt);
            }
        });
        jPanel2.add(addbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 250, 80, -1));

        boxelimuser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        boxelimuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxelimuserActionPerformed(evt);
            }
        });
        jPanel2.add(boxelimuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 340, -1));

        deletebutton.setText("Eliminar");
        deletebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebuttonActionPerformed(evt);
            }
        });
        jPanel2.add(deletebutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 320, 80, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto2imagenes/fondo 2 proyecto 2.jpeg"))); // NOI18N
        jPanel2.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jTabbedPane1.addTab("Usuarios", jPanel2);

        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
        });
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(204, 204, 204));
        jLabel16.setText("Seleccione");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 70, 20));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 204, 204));
        jLabel15.setText("Imprimir Documentos");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 180, 30));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setText("Seleccione");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 420, 70, 20));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setText("Eliminar Documento");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 380, 180, 30));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("Tamaño");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, 70, 20));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("Tipo");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, 70, 20));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("Nombre");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 70, 20));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("Nuevo Documento");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 180, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Documentos");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Seleccione Usuario");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 180, 30));

        printdocbutton.setText("Imprimir documento");
        printdocbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printdocbuttonActionPerformed(evt);
            }
        });
        jPanel3.add(printdocbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, 220, -1));

        deletedocbutton.setText("Eliminar documento");
        deletedocbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletedocbuttonActionPerformed(evt);
            }
        });
        jPanel3.add(deletedocbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 460, 220, -1));

        createdocbutton.setText("Agregar documento nuevo");
        createdocbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createdocbuttonActionPerformed(evt);
            }
        });
        jPanel3.add(createdocbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, 250, -1));

        printdocbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel3.add(printdocbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 420, 150, -1));

        deletedocbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        deletedocbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletedocboxActionPerformed(evt);
            }
        });
        jPanel3.add(deletedocbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 420, 150, -1));

        usersbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        usersbox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                usersboxItemStateChanged(evt);
            }
        });
        usersbox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usersboxMouseClicked(evt);
            }
        });
        usersbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usersboxActionPerformed(evt);
            }
        });
        jPanel3.add(usersbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 250, -1));

        newdoctype.setText("Inserte tipo (.txt, .pdf, etc)");
        newdoctype.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newdoctypeMouseClicked(evt);
            }
        });
        jPanel3.add(newdoctype, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 310, 190, -1));

        newdocsize.setText("Inserte tamaño (sin unidades)");
        newdocsize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newdocsizeMouseClicked(evt);
            }
        });
        newdocsize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newdocsizeActionPerformed(evt);
            }
        });
        jPanel3.add(newdocsize, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, 190, -1));

        newdocname.setText("Inserte nombre del documento");
        newdocname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newdocnameMouseClicked(evt);
            }
        });
        jPanel3.add(newdocname, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 190, -1));

        userdocs.setColumns(20);
        userdocs.setRows(5);
        userdocs.setEnabled(false);
        jScrollPane2.setViewportView(userdocs);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 190, 250));

        fondo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto2imagenes/fondo 2 proyecto 2.jpeg"))); // NOI18N
        jPanel3.add(fondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel17.setText("jLabel17");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        jLabel18.setText("jLabel18");
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(204, 204, 204));
        jLabel19.setText("Eliminar Documento");
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 380, 180, 30));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(204, 204, 204));
        jLabel20.setText("Eliminar Documento");
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 380, 180, 30));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(204, 204, 204));
        jLabel22.setText("Seleccione Usuario");
        jPanel3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 180, 30));

        jTabbedPane1.addTab("Documentos", jPanel3);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 309, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 371, Short.MAX_VALUE)
        );

        jDesktopPane1.setLayer(jInternalFrame1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(105, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        jPanel4.add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 520));

        fondo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto2imagenes/fondo 2 proyecto 2.jpeg"))); // NOI18N
        jPanel4.add(fondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jTabbedPane1.addTab("Arbol de Impresión", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

        
    private void Refresh(){
        if(list.getpFirst() == null){
            JOptionPane.showMessageDialog(this, "Primero debe cargar el archivo","ALERTA", JOptionPane.WARNING_MESSAGE);
            return;
        }
        txt.writecsv(list);
        String data = list.Imprimir();
        jTextPane1.setText(data);
    }
    
    private void browsebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browsebuttonActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        String filename = f.getAbsolutePath();
        list.setFilepath(filename);
        if(filename.contains(".csv")){
            txt.readcsv(list, list.getFilepath());
            ListNode aux = list.getpFirst();
            while(aux != null){
                boxelimuser.addItem(aux.getNombre());
                aux = aux.getpNext();
            }
            String data = list.Imprimir();
            jTextPane1.setText(data);
            this.AddToDocumentos();
            ExploradorArchivo.setText("Datos de usuario cargados");
        }else{
            JOptionPane.showMessageDialog(this, "Tipo de archivo no válido","ALERTA", JOptionPane.WARNING_MESSAGE);
            ExploradorArchivo.setText("Tipo de archivo no válido. Se requiere: csv");
        }
    }//GEN-LAST:event_browsebuttonActionPerformed

    private void AddToDocumentos(){
        ListNode aux = list.getpFirst();
            while(aux != null){
                usersbox.addItem(aux.getNombre()); 
                aux = aux.getpNext();
            }
    }
    
    private void AddUserDocs(){
        Object selectuser = usersbox.getSelectedItem();
        ListNode user = list.Buscar((String)selectuser);
        String data = list.imprimirDocs(user);
        userdocs.setText(data);
    }
    
    private int GetTime(){
        Instant end = Instant.now();
        Duration interval = Duration.between(start, end);
        return interval.toSecondsPart();
    }
    
    private void ExploradorArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExploradorArchivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ExploradorArchivoActionPerformed

    private void addbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbuttonActionPerformed
        if(list.getpFirst() == null){
            JOptionPane.showMessageDialog(this, "Primero debe cargar el archivo","ALERTA", JOptionPane.WARNING_MESSAGE);
            return;
        }
        String nu = fieldnewname.getText();
        if(nu.contains(" ")){
            nu = nu.replace(" ", "_");
        }else if(nu.contains("-") || nu.contains("*") || nu.contains("+") || nu.contains("/") || nu.contains("^") || nu.contains("=")){
            JOptionPane.showMessageDialog(this, "Nombre de Usuario no válido"+"\n"+"Revisar: -  *  +  /  ^  =  ;  ,  &  %  |  ()  []  {}","ALERTA", JOptionPane.WARNING_MESSAGE);
            return;
        }else if(nu.contains(";") || nu.contains(",") || nu.contains("&") || nu.contains("%") || nu.contains("|")){
            JOptionPane.showMessageDialog(this, "Nombre de Usuario no válido"+"\n"+"Revisar: -  *  +  /  ^  =  ;  ,  &  %  |  ()  []  {}","ALERTA", JOptionPane.WARNING_MESSAGE);
            return;
        }else if(nu.contains("(") || nu.contains(")") || nu.contains("[") || nu.contains("]") || nu.contains("{") || nu.contains("}")){
            JOptionPane.showMessageDialog(this, "Nombre de Usuario no válido"+"\n"+"Revisar: -  *  +  /  ^  =  ;  ,  &  %  |  ()  []  {}","ALERTA", JOptionPane.WARNING_MESSAGE);
            return;
        }
        String priority = (String)boxprioridades.getSelectedItem();
        list.Insertar(nu, priority);
        boxelimuser.addItem(list.getpLast().getNombre());
        this.Refresh();
        this.AddToDocumentos();
        this.ActualizarBoxDocs();
    }//GEN-LAST:event_addbuttonActionPerformed

    private void deletebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebuttonActionPerformed
        if(list.getpFirst() == null){
            JOptionPane.showMessageDialog(this, "Primero debe cargar el archivo","ALERTA", JOptionPane.WARNING_MESSAGE);
            return;
        }
        String nombre = (String)boxelimuser.getSelectedItem();
        int index = boxelimuser.getSelectedIndex();
        list.Eliminar(nombre);
        boxelimuser.removeItemAt(index);
        usersbox.removeItemAt(index);
        this.Refresh();
    }//GEN-LAST:event_deletebuttonActionPerformed

    private void fieldnewnameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fieldnewnameMouseClicked
        fieldnewname.selectAll();
    }//GEN-LAST:event_fieldnewnameMouseClicked

    private void newdocsizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newdocsizeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newdocsizeActionPerformed

    private void fieldnewnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldnewnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldnewnameActionPerformed

    private void newdocnameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newdocnameMouseClicked
        newdocname.selectAll();
    }//GEN-LAST:event_newdocnameMouseClicked

    private void newdocsizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newdocsizeMouseClicked
        newdocsize.selectAll();
    }//GEN-LAST:event_newdocsizeMouseClicked

    private void newdoctypeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newdoctypeMouseClicked
        newdoctype.selectAll();
    }//GEN-LAST:event_newdoctypeMouseClicked

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
        fieldnewname.setText("Inserte nombre de Usuario");
        newdocname.setText("Inserte nombre del documento");
        newdocsize.setText("Inserte tamaño (sin unidades)");
        newdoctype.setText("Inserte tipo (.txt, .pdf, etc)");
    }//GEN-LAST:event_jTabbedPane1MouseClicked

    private void deletedocboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletedocboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deletedocboxActionPerformed

    private void createdocbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createdocbuttonActionPerformed
        if(list.getpFirst() == null){
            JOptionPane.showMessageDialog(this, "Primero debe cargar los usuarios.\n(Pestaña Usuarios)","ALERTA", JOptionPane.WARNING_MESSAGE);
        return;
            
        }else{
            String selectuser = (String)usersbox.getSelectedItem();
            ListNode user = list.Buscar((String)selectuser);
            UserList docs = user.getDocs();
            String nombre = newdocname.getText();
            String tamano = newdocsize.getText();
            String tipo = newdoctype.getText();
            int time = this.GetTime();
            if (docs.Insertar(user, nombre, tamano, tipo, time)){
                HashNode doc = new HashNode( user.getNombre(),  user.getPrioridad(),  nombre,  tamano,  tipo);
                table.Insertar(doc);
                printdocbox.addItem(nombre);
                deletedocbox.addItem(nombre);
            }
            
        }
        
    }//GEN-LAST:event_createdocbuttonActionPerformed

    private void printdocbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printdocbuttonActionPerformed
        if(list.getpFirst() == null){
            JOptionPane.showMessageDialog(this, "Primero debe cargar los usuarios.\n(Pestaña Usuarios)","ALERTA", JOptionPane.WARNING_MESSAGE);
            return;
            
        }else{
            String selectuser = (String)usersbox.getSelectedItem();
            ListNode user = list.Buscar(selectuser);
            String docname = (String)printdocbox.getSelectedItem();
            UserList docs = user.getDocs();
            ListNode doc = docs.Buscar(docname);
            
            if((user.getPrioridad().trim()).equals("prioridad_alta")){
                a.insertar(doc.getNombre(), doc.getType(), Integer.parseInt(doc.getSize()), 1);          
            } else if ((user.getPrioridad().trim()).equals("prioridad_media")){
                a.insertar(doc.getNombre(), doc.getType(), Integer.parseInt(doc.getSize()), 2); 
            } else if ((user.getPrioridad().trim()).equals("prioridad_baja")){
                a.insertar(doc.getNombre(), doc.getType(), Integer.parseInt(doc.getSize()), 3); 
            }
            a.preOrder(a.getRoot());
        this.jDesktopPane1.removeAll();
        Rectangle tamaño = this.jInternalFrame1.getBounds();
        this.jInternalFrame1 = null;
        this.jInternalFrame1 = new JInternalFrame("Representación gráfica", true);
        this.jDesktopPane1.add(this.jInternalFrame1, JLayeredPane.DEFAULT_LAYER);
        this.jInternalFrame1.setVisible(true);
        this.jInternalFrame1.setBounds(tamaño);
        this.jInternalFrame1.setEnabled(false);
        drawer = new Constructor_Grafico(a);
        this.jInternalFrame1.add(drawer, BorderLayout.CENTER);
        }
    }//GEN-LAST:event_printdocbuttonActionPerformed

    private void ActualizarBoxDocs(){
        String selectuser = (String)usersbox.getSelectedItem();
        ListNode user = list.Buscar(selectuser);
        try{
            UserList docs = user.getDocs();
            ListNode auxf = docs.getpFirst();
            printdocbox.removeAllItems();
            deletedocbox.removeAllItems();
            while(auxf != null){
                printdocbox.addItem(auxf.getNombre());
                deletedocbox.addItem(auxf.getNombre());
                auxf = auxf.getpNext();
            }
        }catch(NullPointerException e){
            printdocbox.removeAllItems();
            deletedocbox.removeAllItems();
        }
        
    }
    
    private void deletedocbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletedocbuttonActionPerformed
        if(list.getpFirst() == null){
            JOptionPane.showMessageDialog(this, "Primero debe cargar los usuarios.\n(Pestaña Usuarios)","ALERTA", JOptionPane.WARNING_MESSAGE);
            return;
        }else{
            HashNode aux = table.buscar((String)deletedocbox.getSelectedItem());
            String user = aux.getUsername();
            String docname = aux.getDocname();
            int index = deletedocbox.getSelectedIndex();
            list.Eliminar(user, docname);
            deletedocbox.removeItemAt(index);
            printdocbox.removeItemAt(index);
            this.Refresh();
    
        }
    }//GEN-LAST:event_deletedocbuttonActionPerformed

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
        this.AddUserDocs();
    }//GEN-LAST:event_jPanel3MouseClicked

    private void boxelimuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxelimuserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxelimuserActionPerformed

    private void usersboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usersboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usersboxActionPerformed

    private void usersboxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usersboxMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_usersboxMouseClicked

    private void usersboxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_usersboxItemStateChanged
        ActualizarBoxDocs();
    }//GEN-LAST:event_usersboxItemStateChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Proyecto2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Proyecto2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Proyecto2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Proyecto2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz_Proyecto2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ExploradorArchivo;
    private javax.swing.JButton addbutton;
    private javax.swing.JComboBox<String> boxelimuser;
    private javax.swing.JComboBox<String> boxprioridades;
    private javax.swing.JButton browsebutton;
    private javax.swing.JButton createdocbutton;
    private javax.swing.JButton deletebutton;
    private javax.swing.JComboBox<String> deletedocbox;
    private javax.swing.JButton deletedocbutton;
    private javax.swing.JTextField fieldnewname;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel fondo1;
    private javax.swing.JLabel fondo2;
    private javax.swing.JLabel fondopestana1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextPane jTextPane1;
    private java.awt.Label label1;
    private javax.swing.JTextField newdocname;
    private javax.swing.JTextField newdocsize;
    private javax.swing.JTextField newdoctype;
    private javax.swing.JComboBox<String> printdocbox;
    private javax.swing.JButton printdocbutton;
    private javax.swing.JTextArea userdocs;
    private javax.swing.JComboBox<String> usersbox;
    // End of variables declaration//GEN-END:variables
}
