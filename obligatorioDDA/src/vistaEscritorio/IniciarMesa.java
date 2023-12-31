/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistaEscritorio;


import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Croupier;
import modelo.Efecto;
import modelo.Fachada;
import modelo.TipoApuesta;

public class IniciarMesa extends javax.swing.JFrame {

    /**
     * Creates new form IniciarMesa
     */
    private List<TipoApuesta>tiposApuestaSeleccionados= new ArrayList<>();
    
    private Croupier croupier;
    
    public IniciarMesa( Croupier c) {
        initComponents();
        setLocationRelativeTo(null);
        this.croupier=c;
        cargarTiposApuestaDisponibles();
        cargarTiposApuestaHabilitados();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnIniciarMesa = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listTiposHabilitados = new javax.swing.JList();
        jScrollPane1 = new javax.swing.JScrollPane();
        listTiposDisponibles = new javax.swing.JList();
        btnAdd = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Tipos de Apuesta Disponibles");

        btnIniciarMesa.setText("Iniciar");
        btnIniciarMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarMesaActionPerformed(evt);
            }
        });

        jLabel2.setText("Tipos de Apuesta Habilitadas");

        jScrollPane2.setViewportView(listTiposHabilitados);

        listTiposDisponibles.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listTiposDisponiblesValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listTiposDisponibles);

        btnAdd.setText("Add>");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnRemove.setText("Remove");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        jMenu1.setText("Aplicacion Crupier - Iniciar mesa");
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addComponent(btnIniciarMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(189, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAdd, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnRemove, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAdd)
                        .addGap(18, 18, 18)
                        .addComponent(btnRemove)
                        .addGap(37, 37, 37)))
                .addComponent(btnIniciarMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listTiposDisponiblesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listTiposDisponiblesValueChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_listTiposDisponiblesValueChanged

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
       int pos= listTiposDisponibles.getSelectedIndex();
       List<TipoApuesta>tipos=Fachada.getInstancia().getTiposApuesta();
       TipoApuesta ap=tipos.get(pos);
       if(!tiposApuestaSeleccionados.contains(ap)){
          tiposApuestaSeleccionados.add(ap);
       cargarTiposApuestaHabilitados(); 
       }
       
       
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        // TODO add your handling code here:
        int pos =listTiposHabilitados.getSelectedIndex();
        TipoApuesta tp=tiposApuestaSeleccionados.get(pos);
        if(!tp.isObligatorio()){
            tiposApuestaSeleccionados.remove(pos);
        }
        cargarTiposApuestaHabilitados();
        //en lugar de esto podemos usar observador, pero de momento para dejarlo funcionando lo hacemos asi 
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnIniciarMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarMesaActionPerformed
        // TODO add your handling code here:
        dispose();
        new OperarMesa(this.croupier,tiposApuestaSeleccionados).setVisible(true);
    }//GEN-LAST:event_btnIniciarMesaActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnIniciarMesa;
    private javax.swing.JButton btnRemove;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList listTiposDisponibles;
    private javax.swing.JList listTiposHabilitados;
    // End of variables declaration//GEN-END:variables

    private void cargarTiposApuestaDisponibles() {
        List<TipoApuesta>apuestasDisponibles=Fachada.getInstancia().getTiposApuesta();
        listTiposDisponibles.setListData(apuestasDisponibles.toArray());
    }

    private void cargarTiposApuestaHabilitados() {
        List<TipoApuesta>apuestasDisponibles=Fachada.getInstancia().getTiposApuesta();
        for(TipoApuesta ap:apuestasDisponibles){
            if(ap.isObligatorio()){
                if(!tiposApuestaSeleccionados.contains(ap)){
                   tiposApuestaSeleccionados.add(ap); 
                }
                
            }
        }
        
        listTiposHabilitados.setListData(tiposApuestaSeleccionados.toArray());
    }

    

    
}
