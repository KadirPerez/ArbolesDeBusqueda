package proyecto;

import java.util.ArrayList;

public class GUI extends javax.swing.JFrame {
    
    private ArbolBinario arbol;
    private ArbolBinarioGrafico arbolGrafico;
    private ArrayList<Integer> numeros;
    
    public GUI() {
	initComponents();
	arbol = new ArbolBinario();
	arbolGrafico = new ArbolBinarioGrafico("Árbol binario", arbol);
        numeros = new ArrayList<Integer>();
	setTitle("Pruebas métodos de árboles binarios");
	this.setBounds(0, 0, this.getWidth(), this.getHeight());
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
        recorrerBox1 = new javax.swing.JComboBox<>();
        añadirButton1 = new javax.swing.JButton();
        eliminarButton1 = new javax.swing.JButton();
        mostraLvButton1 = new javax.swing.JButton();
        codigoButton1 = new javax.swing.JButton();
        recorrerButton1 = new javax.swing.JButton();
        añadirText1 = new javax.swing.JTextField();
        generarNumerosButton = new javax.swing.JButton();
        cantidadTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        numeroMaximoTextField = new javax.swing.JTextField();
        arrayListScrollPane = new javax.swing.JScrollPane();
        arrayListLabel = new javax.swing.JLabel();
        insertarNumerosButton = new javax.swing.JButton();

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

        recorrerBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Preorden", "Postorden", "Inorden", "Por nivel" }));

        añadirButton1.setText("Añadir nodos");
        añadirButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añadirButton1ActionPerformed(evt);
            }
        });

        eliminarButton1.setText("Eliminar nodos");
        eliminarButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarButton1ActionPerformed(evt);
            }
        });

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

        generarNumerosButton.setText("Generar Números");
        generarNumerosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generarNumerosButtonActionPerformed(evt);
            }
        });

        cantidadTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadTextFieldActionPerformed(evt);
            }
        });

        jLabel1.setText("Cantidad:");

        jLabel2.setText("Número máximo:");

        numeroMaximoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeroMaximoTextFieldActionPerformed(evt);
            }
        });

        arrayListScrollPane.setViewportView(arrayListLabel);

        insertarNumerosButton.setText("Insertar números");
        insertarNumerosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertarNumerosButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(arrayListScrollPane)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(recorrerBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(recorrerButton1))
                                    .addComponent(códigoLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(64, 64, 64)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(añadirButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(codigoButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(mostraLvButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(eliminarButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(eliminarText1, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                                    .addComponent(códigoText1, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                                    .addComponent(mostrarLvText1, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                                    .addComponent(añadirText1)))
                            .addComponent(insertarNumerosButton, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(generarNumerosButton)
                                .addGap(23, 23, 23)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(cantidadTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(numeroMaximoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 14, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(generarNumerosButton)
                    .addComponent(cantidadTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(numeroMaximoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(arrayListScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(insertarNumerosButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(códigoLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(recorrerButton1)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
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
                        .addGap(27, 27, 27)))
                .addComponent(recorrerBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void añadirButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añadirButton1ActionPerformed
        arbol.insertar(Integer.parseInt(añadirText1.getText()));
	arbolGrafico.refrescar(arbol);
    }//GEN-LAST:event_añadirButton1ActionPerformed

    private void codigoButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoButton1ActionPerformed

    private void añadirText1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añadirText1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_añadirText1ActionPerformed

    private void eliminarButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarButton1ActionPerformed
        arbol.eliminar(Integer.parseInt(eliminarText1.getText()));
	arbolGrafico.refrescar(arbol);
    }//GEN-LAST:event_eliminarButton1ActionPerformed

    private void generarNumerosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generarNumerosButtonActionPerformed
        numeros = arbol.generarNúmeros(Integer.parseInt(numeroMaximoTextField.getText()), Integer.parseInt(cantidadTextField.getText()));
        
        String arrayList = "";
        for (int i = 0; i < numeros.size(); i++) {
            arrayList += numeros.get(i) + (i == numeros.size() - 1 ? "" : ", ");
        }
        
        arrayListLabel.setText(arrayList);
    }//GEN-LAST:event_generarNumerosButtonActionPerformed

    private void numeroMaximoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroMaximoTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numeroMaximoTextFieldActionPerformed

    private void cantidadTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidadTextFieldActionPerformed

    private void insertarNumerosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertarNumerosButtonActionPerformed
        arbol.insertarNumeros(numeros);
        arbolGrafico.refrescar(arbol);
    }//GEN-LAST:event_insertarNumerosButtonActionPerformed

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
    private javax.swing.JLabel arrayListLabel;
    private javax.swing.JScrollPane arrayListScrollPane;
    private javax.swing.JButton añadirButton;
    private javax.swing.JButton añadirButton1;
    private javax.swing.JTextField añadirText;
    private javax.swing.JTextField añadirText1;
    private javax.swing.JTextField cantidadTextField;
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
    private javax.swing.JButton generarNumerosButton;
    private javax.swing.JButton insertarNumerosButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton mostraLvButton;
    private javax.swing.JButton mostraLvButton1;
    private javax.swing.JButton mostrarButton;
    private javax.swing.JTextField mostrarLvText;
    private javax.swing.JTextField mostrarLvText1;
    private javax.swing.JTextField numeroMaximoTextField;
    private javax.swing.JComboBox<String> recorrerBox;
    private javax.swing.JComboBox<String> recorrerBox1;
    private javax.swing.JButton recorrerButton;
    private javax.swing.JButton recorrerButton1;
    // End of variables declaration//GEN-END:variables
}
