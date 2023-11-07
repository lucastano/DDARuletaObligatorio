/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package vistaEscritorio;

import componente.PanelRuleta.Escuchador;
import controladores.MesaJugadorController;
import controladores.VistaMesaJugador;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import modelo.Jugador;
import modelo.Mesa;

/**
 *
 * @author Lucas
 */
public class Jugar extends javax.swing.JDialog implements VistaMesaJugador, Escuchador {

    
    private MesaJugadorController controller;
    private int montoApuesta;
    
    /**
     * Creates new form Jugar
     */
    public Jugar(java.awt.Frame parent, boolean modal, Mesa mesa, Jugador jugador) {
        super(parent, modal);
        initComponents();
        controller=new MesaJugadorController(this,mesa,jugador);
        panelRuleta1.agregar(this);
        escalarImagenes();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    
    
    
    public void setMontoApuesta(int montoApuesta) {
        this.montoApuesta = montoApuesta;
        
        
    }
    

    private void escalarImagenes() {
        //lblMoneda1
        ImageIcon img= new ImageIcon(getClass().getResource("ficha1.png"));
        Image imgEscalada= img.getImage().getScaledInstance(lblMoneda1.getWidth(), lblMoneda1.getHeight(), Image.SCALE_SMOOTH);
        Icon iconoEscalado=new ImageIcon(imgEscalada);
        lblMoneda1.setIcon(iconoEscalado);
        
        //labelMoneda5
        ImageIcon img5= new ImageIcon(getClass().getResource("ficha5.png"));
        Image imgEscalada5= img5.getImage().getScaledInstance(lblMoneda5.getWidth(), lblMoneda5.getHeight(), Image.SCALE_SMOOTH);
        Icon iconoEscalado5=new ImageIcon(imgEscalada5);
        lblMoneda5.setIcon(iconoEscalado5);
        
        //lblmoneda10
        ImageIcon img10= new ImageIcon(getClass().getResource("ficha10.png"));
        Image imgEscalada10= img10.getImage().getScaledInstance(lblMoneda10.getWidth(), lblMoneda10.getHeight(), Image.SCALE_SMOOTH);
        Icon iconoEscalado10=new ImageIcon(imgEscalada10);
        lblMoneda10.setIcon(iconoEscalado10);
        
        //lblMoneda50
        
        ImageIcon img50= new ImageIcon(getClass().getResource("ficha50.png"));
        Image imgEscalada50= img50.getImage().getScaledInstance(lblMoneda50.getWidth(), lblMoneda50.getHeight(), Image.SCALE_SMOOTH);
        Icon iconoEscalado50=new ImageIcon(imgEscalada50);
        lblMoneda50.setIcon(iconoEscalado50);
        
        
        //lblmoneda100
        
        ImageIcon img100= new ImageIcon(getClass().getResource("ficha100.png"));
        Image imgEscalada100= img100.getImage().getScaledInstance(lblMoneda100.getWidth(), lblMoneda100.getHeight(), Image.SCALE_SMOOTH);
        Icon iconoEscalado100=new ImageIcon(imgEscalada100);
        lblMoneda100.setIcon(iconoEscalado100);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblSaldo = new javax.swing.JLabel();
        lblNumeroRuleta = new javax.swing.JLabel();
        lblNumeroRonda = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        panelRuleta1 = new componente.PanelRuleta();
        lblMoneda1 = new javax.swing.JLabel();
        lblMoneda5 = new javax.swing.JLabel();
        lblMoneda10 = new javax.swing.JLabel();
        lblMoneda50 = new javax.swing.JLabel();
        lblMoneda100 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        lblFichaSeleccionada = new javax.swing.JLabel();
        btnAbandonar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblSaldo.setText("$");

        lblNumeroRuleta.setText("Ruleta #");

        lblNumeroRonda.setText("Ronda #");

        panelRuleta1.setBackground(new java.awt.Color(242, 242, 242));

        lblMoneda1.setText("Moneda 1");
        lblMoneda1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMoneda1MouseClicked(evt);
            }
        });

        lblMoneda5.setText("Moneda 5");
        lblMoneda5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMoneda5MouseClicked(evt);
            }
        });

        lblMoneda10.setText("Moneda 10");
        lblMoneda10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMoneda10MouseClicked(evt);
            }
        });

        lblMoneda50.setText("Moneda 50");
        lblMoneda50.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMoneda50MouseClicked(evt);
            }
        });

        lblMoneda100.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMoneda100MouseClicked(evt);
            }
        });

        jLabel6.setText("Numero sorteado: ");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        lblFichaSeleccionada.setText("Ficha seleccionada: ");

        btnAbandonar.setText("Abandonar");
        btnAbandonar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbandonarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblSaldo)
                .addGap(249, 249, 249)
                .addComponent(lblNumeroRuleta)
                .addGap(65, 65, 65)
                .addComponent(lblNumeroRonda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(btnAbandonar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 728, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(lblMoneda1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(lblMoneda5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(lblMoneda10, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(lblMoneda50, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(lblMoneda100, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(panelRuleta1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblFichaSeleccionada)
                .addGap(189, 189, 189))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSaldo)
                    .addComponent(lblNumeroRuleta)
                    .addComponent(lblNumeroRonda)
                    .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblMoneda5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMoneda100, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblMoneda50, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)
                        .addComponent(lblMoneda10, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblMoneda1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(panelRuleta1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAbandonar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)))
                .addComponent(lblFichaSeleccionada)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAbandonarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbandonarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAbandonarActionPerformed

    private void lblMoneda1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMoneda1MouseClicked
        // TODO add your handling code here:
        this.montoApuesta=1;
        lblFichaSeleccionada.setText("Ficha seleccionada: "+this.montoApuesta);
    }//GEN-LAST:event_lblMoneda1MouseClicked

    private void lblMoneda5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMoneda5MouseClicked
        // TODO add your handling code here:
        this.montoApuesta=5;
        lblFichaSeleccionada.setText("Ficha seleccionada: "+this.montoApuesta);
    }//GEN-LAST:event_lblMoneda5MouseClicked

    private void lblMoneda10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMoneda10MouseClicked
        // TODO add your handling code here:
        this.montoApuesta=10;
        lblFichaSeleccionada.setText("Ficha seleccionada: "+this.montoApuesta);
    }//GEN-LAST:event_lblMoneda10MouseClicked

    private void lblMoneda50MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMoneda50MouseClicked
        // TODO add your handling code here:
        this.montoApuesta=50;
        lblFichaSeleccionada.setText("Ficha seleccionada: "+this.montoApuesta);
    }//GEN-LAST:event_lblMoneda50MouseClicked

    private void lblMoneda100MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMoneda100MouseClicked
        // TODO add your handling code here:
        this.montoApuesta=100;
        lblFichaSeleccionada.setText("Ficha seleccionada: "+this.montoApuesta);
    }//GEN-LAST:event_lblMoneda100MouseClicked

    @Override
    public void mostrarDatos(Mesa mesa, Jugador jugador) {
        lblSaldo.setText("$ "+jugador.getSaldoInicial());
        lblNumeroRuleta.setText("Ruleta # "+mesa.getNumeroRuleta());
        lblNumeroRonda.setText("Ronda # "+mesa.getRondas().size());
        lblUsuario.setText(jugador.getNombre());
    }

    @Override
    public void mostrarApuestas() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbandonar;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel lblFichaSeleccionada;
    private javax.swing.JLabel lblMoneda1;
    private javax.swing.JLabel lblMoneda10;
    private javax.swing.JLabel lblMoneda100;
    private javax.swing.JLabel lblMoneda5;
    private javax.swing.JLabel lblMoneda50;
    private javax.swing.JLabel lblNumeroRonda;
    private javax.swing.JLabel lblNumeroRuleta;
    private javax.swing.JLabel lblSaldo;
    private javax.swing.JLabel lblUsuario;
    private componente.PanelRuleta panelRuleta1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void celdaSeleccionada(int universalCellCode) {
        //con esto obtengo el casillero seleccionado
        int celda=universalCellCode;
        controller.realizarApuesta(this.montoApuesta, celda);
        
    }
}
