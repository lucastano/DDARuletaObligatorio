/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistaEscritorio;

import controladores.VistaOperarMesa;
import java.awt.Image;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import modelo.Croupier;
import modelo.Efecto;
import modelo.Fachada;
import modelo.Mesa;
import modelo.TipoApuesta;

/**
 *
 * @author Lucas
 */
public class OperarMesa extends javax.swing.JFrame implements VistaOperarMesa {

    /**
     * Creates new form OperarMesa
     */
    private Mesa mesa;
    private Croupier croupier;
    private List<TipoApuesta>tiposApuestaSeleccionados;
    
    public OperarMesa( Croupier croupier, List<TipoApuesta>tiposApuestaSeleccionados ) {
        initComponents();
        setLocationRelativeTo(null);  
        this.croupier=croupier;
        this.tiposApuestaSeleccionados=tiposApuestaSeleccionados;
        this.mesa=Fachada.getInstancia().crearMesa(tiposApuestaSeleccionados, croupier);
        mesa.avisar(Mesa.eventos.cambioBalance);
        mesa.avisar(Mesa.eventos.cambioRonda);
        escalarImagenes();
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        lblBalance = new javax.swing.JLabel();
        lblNroRuleta = new javax.swing.JLabel();
        btnCerrarMesa = new javax.swing.JButton();
        lblRonda = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        lblValorBalance = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblBalance.setText("$ ");

        lblNroRuleta.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        lblNroRuleta.setText("Ruleta #");

        btnCerrarMesa.setText("Cerrar mesa");
        btnCerrarMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarMesaActionPerformed(evt);
            }
        });

        lblRonda.setText("Ronda #");

        jMenu1.setText("Aplicacion Crupier - Operar ruleta");
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1)
                        .addGap(76, 76, 76))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(lblBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblValorBalance)
                        .addGap(89, 89, 89)
                        .addComponent(lblRonda, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 211, Short.MAX_VALUE)
                        .addComponent(lblNroRuleta)
                        .addGap(88, 88, 88)))
                .addComponent(btnCerrarMesa)
                .addGap(19, 19, 19))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator2)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNroRuleta, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCerrarMesa)
                    .addComponent(lblBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRonda)
                    .addComponent(lblValorBalance))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(331, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarMesaActionPerformed
        // TODO add your handling code here:
        dispose();
        //aca deberiamos cerrar la mesa , quitar observadores, sesiones etc
    }//GEN-LAST:event_btnCerrarMesaActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrarMesa;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblBalance;
    private javax.swing.JLabel lblNroRuleta;
    private javax.swing.JLabel lblRonda;
    private javax.swing.JLabel lblValorBalance;
    // End of variables declaration//GEN-END:variables

    

    private void escalarImagenes() {
        ImageIcon img= new ImageIcon(getClass().getResource("iconobillete.png"));
        Image imgEscalada= img.getImage().getScaledInstance(lblBalance.getWidth(), lblBalance.getHeight(), Image.SCALE_SMOOTH);
        Icon iconoEscalado=new ImageIcon(imgEscalada);
        lblBalance.setIcon(iconoEscalado);
        
        ImageIcon imgruleta= new ImageIcon(getClass().getResource("ruleta.png"));
        Image imgEscaladaRuleta= imgruleta.getImage().getScaledInstance(lblNroRuleta.getWidth(), lblNroRuleta.getHeight(), Image.SCALE_SMOOTH);
        Icon iconoEscaladoRuleta=new ImageIcon(imgEscaladaRuleta);
        lblNroRuleta.setIcon(iconoEscaladoRuleta);
    }

    

    @Override
    public void mostrarEfectos(List<Efecto> efectos) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mostrarBalance(int balance) {
         lblValorBalance.setText("$ "+balance);
    }

    @Override
    public void mostrarNumeroRuleta(int numero) {
        lblNroRuleta.setText(lblNroRuleta.getText()+" "+numero);
    }
    @Override
    public void mostrarNumeroRonda(int numero) {
       lblRonda.setText("Ronda # "+numero);
    }

    
}
