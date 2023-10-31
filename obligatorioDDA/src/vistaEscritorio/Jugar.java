/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package vistaEscritorio;

import controladores.MesaJugadorController;
import controladores.VistaMesaJugador;
import modelo.Jugador;
import modelo.Mesa;

/**
 *
 * @author Lucas
 */
public class Jugar extends javax.swing.JDialog implements VistaMesaJugador {
    
    private MesaJugadorController controller;

    /**
     * Creates new form Jugar
     */
    public Jugar(java.awt.Frame parent, boolean modal,Mesa mesa, Jugador jugador) {
        super(parent, modal);
        initComponents();
        controller=new MesaJugadorController(this,mesa,jugador);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblSaldo = new javax.swing.JLabel();
        lblNumeroRuleta = new javax.swing.JLabel();
        lblNumeroRonda = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblNumeroSorteado = new javax.swing.JLabel();
        panelRuleta1 = new componente.PanelRuleta();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Aplicacion Jugador");

        lblSaldo.setText("$");

        lblNumeroRuleta.setText("Ruleta #");

        lblNumeroRonda.setText("Ronda #");

        lblNumeroSorteado.setText("numero sort");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lblSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblNumeroRuleta)
                .addGap(60, 60, 60)
                .addComponent(lblNumeroRonda)
                .addGap(122, 122, 122)
                .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblNumeroSorteado)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelRuleta1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 769, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSaldo)
                    .addComponent(lblNumeroRuleta)
                    .addComponent(lblNumeroRonda)
                    .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblNumeroSorteado, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelRuleta1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(83, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblNumeroRonda;
    private javax.swing.JLabel lblNumeroRuleta;
    private javax.swing.JLabel lblNumeroSorteado;
    private javax.swing.JLabel lblSaldo;
    private javax.swing.JLabel lblUsuario;
    private componente.PanelRuleta panelRuleta1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void mostrarDatos(Mesa mesa, Jugador jugador) {
        lblSaldo.setText("$ "+jugador.getSaldoInicial());
        lblNumeroRuleta.setText("Ruleta # "+mesa.getNumeroRuleta());
        lblNumeroRonda.setText("Ronda # "+mesa.getRondas().size());
        lblUsuario.setText(jugador.getNombre());
    }
}
