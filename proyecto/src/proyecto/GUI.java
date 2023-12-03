package proyecto;

/**
 *
 * @author kadirperez
 */
public class GUI extends javax.swing.JFrame {

    public GUI() {
	initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        eliminarText = new javax.swing.JTextField();
        mostrarLvText = new javax.swing.JTextField();
        códigoLabel = new javax.swing.JLabel();
        códigoText = new javax.swing.JTextField();
        mostrarButton = new javax.swing.JButton();
        recorrerBox = new javax.swing.JComboBox<>();
        añadirButton = new javax.swing.JButton();
        eliminarButton = new javax.swing.JButton();
        mostraLvButton = new javax.swing.JButton();
        codigoButton = new javax.swing.JButton();
        recorrerButton = new javax.swing.JButton();
        añadirText = new javax.swing.JTextField();
        eliminarText1 = new javax.swing.JTextField();
        mostrarLvText1 = new javax.swing.JTextField();
        códigoLabel1 = new javax.swing.JLabel();
        códigoText1 = new javax.swing.JTextField();
        mostrarButton1 = new javax.swing.JButton();
        recorrerBox1 = new javax.swing.JComboBox<>();
        añadirButton1 = new javax.swing.JButton();
        eliminarButton1 = new javax.swing.JButton();
        mostraLvButton1 = new javax.swing.JButton();
        codigoButton1 = new javax.swing.JButton();
        recorrerButton1 = new javax.swing.JButton();
        añadirText1 = new javax.swing.JTextField();

        eliminarText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarTextActionPerformed(evt);
            }
        });

        mostrarLvText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarLvTextActionPerformed(evt);
            }
        });

        códigoLabel.setText("Código:");

        mostrarButton.setText("Mostrar árbol");
        mostrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarButtonActionPerformed(evt);
            }
        });

        recorrerBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Preorden", "Postorden", "Inorden", "Por nivel" }));

        añadirButton.setText("Añadir nodos");
        añadirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añadirButtonActionPerformed(evt);
            }
        });

        eliminarButton.setText("Eliminar nodos");

        mostraLvButton.setText("Mostrar nivel");

        codigoButton.setText("Obtener código:");
        codigoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoButtonActionPerformed(evt);
            }
        });

        recorrerButton.setText("Recorrer");

        añadirText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añadirTextActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        eliminarText1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarText1ActionPerformed(evt);
            }
        });

        mostrarLvText1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarLvText1ActionPerformed(evt);
            }
        });

        códigoLabel1.setText("Código:");

        mostrarButton1.setText("Mostrar árbol");
        mostrarButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarButton1ActionPerformed(evt);
            }
        });

        recorrerBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Preorden", "Postorden", "Inorden", "Por nivel" }));

        añadirButton1.setText("Añadir nodos");
        añadirButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añadirButton1ActionPerformed(evt);
            }
        });

        eliminarButton1.setText("Eliminar nodos");

        mostraLvButton1.setText("Mostrar nivel");

        codigoButton1.setText("Obtener código:");
        codigoButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoButton1ActionPerformed(evt);
            }
        });

        recorrerButton1.setText("Recorrer");

        añadirText1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añadirText1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(añadirButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(codigoButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(mostraLvButton1))
                                    .addComponent(eliminarButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(eliminarText1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(códigoText1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(añadirText1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mostrarLvText1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(mostrarButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(recorrerBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(recorrerButton1)
                                .addComponent(códigoLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(mostrarButton1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(añadirButton1)
                    .addComponent(añadirText1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eliminarButton1)
                    .addComponent(eliminarText1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mostraLvButton1)
                    .addComponent(mostrarLvText1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codigoButton1)
                    .addComponent(códigoText1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(códigoLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(recorrerButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(recorrerBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void eliminarTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eliminarTextActionPerformed

    private void mostrarLvTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarLvTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mostrarLvTextActionPerformed

    private void mostrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mostrarButtonActionPerformed

    private void añadirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añadirButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_añadirButtonActionPerformed

    private void codigoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoButtonActionPerformed

    private void añadirTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añadirTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_añadirTextActionPerformed

    private void eliminarText1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarText1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eliminarText1ActionPerformed

    private void mostrarLvText1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarLvText1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mostrarLvText1ActionPerformed

    private void mostrarButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarButton1ActionPerformed
	ArbolBinarioGrafico arbolGrafico = new ArbolBinarioGrafico("");
    }//GEN-LAST:event_mostrarButton1ActionPerformed

    private void añadirButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añadirButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_añadirButton1ActionPerformed

    private void codigoButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoButton1ActionPerformed

    private void añadirText1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añadirText1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_añadirText1ActionPerformed

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
	    java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (InstantiationException ex) {
	    java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (IllegalAccessException ex) {
	    java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (javax.swing.UnsupportedLookAndFeelException ex) {
	    java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	}
	//</editor-fold>

	/* Create and display the form */
	java.awt.EventQueue.invokeLater(new Runnable() {
	    public void run() {
		new GUI().setVisible(true);
	    }
	});
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton añadirButton;
    private javax.swing.JButton añadirButton1;
    private javax.swing.JTextField añadirText;
    private javax.swing.JTextField añadirText1;
    private javax.swing.JButton codigoButton;
    private javax.swing.JButton codigoButton1;
    private javax.swing.JLabel códigoLabel;
    private javax.swing.JLabel códigoLabel1;
    private javax.swing.JTextField códigoText;
    private javax.swing.JTextField códigoText1;
    private javax.swing.JButton eliminarButton;
    private javax.swing.JButton eliminarButton1;
    private javax.swing.JTextField eliminarText;
    private javax.swing.JTextField eliminarText1;
    private javax.swing.JButton mostraLvButton;
    private javax.swing.JButton mostraLvButton1;
    private javax.swing.JButton mostrarButton;
    private javax.swing.JButton mostrarButton1;
    private javax.swing.JTextField mostrarLvText;
    private javax.swing.JTextField mostrarLvText1;
    private javax.swing.JComboBox<String> recorrerBox;
    private javax.swing.JComboBox<String> recorrerBox1;
    private javax.swing.JButton recorrerButton;
    private javax.swing.JButton recorrerButton1;
    // End of variables declaration//GEN-END:variables
}
