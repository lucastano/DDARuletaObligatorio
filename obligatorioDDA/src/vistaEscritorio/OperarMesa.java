/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistaEscritorio;

import controladores.OperarMesaController;
import controladores.VistaOperarMesa;
import java.awt.Image;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import modelo.Croupier;
import modelo.Efecto;
import modelo.Fachada;
import modelo.Jugador;
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
 
    private OperarMesaController controller;
    
    public OperarMesa( Croupier croupier, List<TipoApuesta>tiposApuestaSeleccionados ) {
        initComponents();
        setLocationRelativeTo(null);  
        controller= new OperarMesaController(this,tiposApuestaSeleccionados,croupier);
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
        lblValorBalance = new javax.swing.JLabel();
        panelRuleta1 = new componente.PanelRuleta();
        jSeparator3 = new javax.swing.JSeparator();
        lblCantidadApuestas = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblMonto = new javax.swing.JLabel();
        cbEfectos = new javax.swing.JComboBox();
        btnLanzarPagar = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        lblSorteado = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        table2 = new javax.swing.JTable();
        lblLanzamientos = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(null);

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

        panelRuleta1.setBackground(new java.awt.Color(242, 242, 242));
        panelRuleta1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelRuleta1MouseClicked(evt);
            }
        });

        lblCantidadApuestas.setText("Apuestas :");

        jLabel2.setText("|");

        lblMonto.setText("Monto $");

        btnLanzarPagar.setText("Lanzar / Pagar");
        btnLanzarPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLanzarPagarActionPerformed(evt);
            }
        });

        lblSorteado.setText("Sorteado: ");

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Ronda", "Balance anterior", "Apuestas", "Recoleccion", "Liquidacion", "Balance posterior"
            }
        ));
        table1.setToolTipText("");
        jScrollPane1.setViewportView(table1);

        table2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Jugador", "Saldo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(table2);

        lblLanzamientos.setText("Ultimos Lanzamientos: ");

        jMenu1.setText("Aplicacion Crupier - Operar ruleta");
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1)
                .addGap(169, 169, 169))
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(lblBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblValorBalance)
                .addGap(89, 89, 89)
                .addComponent(lblRonda, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblNroRuleta)
                .addGap(278, 278, 278)
                .addComponent(btnCerrarMesa)
                .addGap(75, 75, 75))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator3)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lblCantidadApuestas, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbEfectos, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(67, 67, 67)
                                        .addComponent(btnLanzarPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(54, 54, 54)
                                        .addComponent(lblSorteado, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(panelRuleta1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 808, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 886, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblLanzamientos)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCantidadApuestas)
                    .addComponent(jLabel2)
                    .addComponent(lblMonto)
                    .addComponent(cbEfectos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLanzarPagar)
                    .addComponent(lblSorteado, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 284, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(panelRuleta1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblLanzamientos)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarMesaActionPerformed
        // TODO add your handling code here:
        dispose();
        //aca deberiamos cerrar la mesa , quitar observadores, sesiones etc
    }//GEN-LAST:event_btnCerrarMesaActionPerformed

    private void btnLanzarPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLanzarPagarActionPerformed
        // TODO add your handling code here:
        int  pos=cbEfectos.getSelectedIndex();
        controller.lanzar(pos);
    }//GEN-LAST:event_btnLanzarPagarActionPerformed

    private void panelRuleta1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRuleta1MouseClicked
        // TODO add your handling code here:
        panelRuleta1.getApuesta(HIDE_ON_CLOSE);
    }//GEN-LAST:event_panelRuleta1MouseClicked

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrarMesa;
    private javax.swing.JButton btnLanzarPagar;
    private javax.swing.JComboBox cbEfectos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lblBalance;
    private javax.swing.JLabel lblCantidadApuestas;
    private javax.swing.JLabel lblLanzamientos;
    private javax.swing.JLabel lblMonto;
    private javax.swing.JLabel lblNroRuleta;
    private javax.swing.JLabel lblRonda;
    private javax.swing.JLabel lblSorteado;
    private javax.swing.JLabel lblValorBalance;
    private componente.PanelRuleta panelRuleta1;
    private javax.swing.JTable table1;
    private javax.swing.JTable table2;
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
        cbEfectos.removeAllItems();
        for (Efecto efecto : efectos) {
            cbEfectos.addItem(efecto.toString());
        }
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

    @Override
    public void mostrarEfectosDisponibles(List<Efecto> efectosDisponibles) {
        for(Efecto e:efectosDisponibles){
            cbEfectos.addItem(e);
        }
        
    }

    @Override
    public void mostrarGanador(int numeroGanador) {
        lblSorteado.setText(""+numeroGanador);
    }

    @Override
    public void mostrarLanzamientos(int numeroGanador) {
       lblLanzamientos.setText(lblLanzamientos.getText()+" "+ numeroGanador);
    }

    @Override
    public void mostrarDatosJugadores(List<Jugador> jugadores) {
        //aca es donde vamos a agregar datos a la tabla
        DefaultTableModel modelo=new DefaultTableModel(new String[]{"Nombre","Saldo"},jugadores.size());
        table2.setModel(modelo);
        TableModel modeloDatos=table2.getModel();
        for(int i =0;i<jugadores.size();i++){
            Jugador jugador = jugadores.get(i);
            modeloDatos.setValueAt(jugador.getNombre(),i ,0 );
            modeloDatos.setValueAt(jugador.getSaldoInicial(),i ,1 );
        }
    }

    
}
