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
        nivelTextField = new javax.swing.JTextField();
        codigoTextField = new javax.swing.JTextField();
        recorrerBox1 = new javax.swing.JComboBox<>();
        insertarNumeroButton = new javax.swing.JButton();
        eliminarNumeroButton = new javax.swing.JButton();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        recorrerLabel = new javax.swing.JLabel();
        codigoLabel = new javax.swing.JLabel();
        nivelLabel = new javax.swing.JLabel();

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

        nivelTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nivelTextFieldActionPerformed(evt);
            }
        });

        recorrerBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Preorden", "Postorden", "Inorden", "Por nivel" }));
        recorrerBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recorrerBox1ActionPerformed(evt);
            }
        });

        insertarNumeroButton.setText("Insertar número");
        insertarNumeroButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertarNumeroButtonActionPerformed(evt);
            }
        });

        eliminarNumeroButton.setText("Eliminar número");
        eliminarNumeroButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarNumeroButtonActionPerformed(evt);
            }
        });

        mostraLvButton1.setText("Mostrar nivel");
        mostraLvButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostraLvButton1ActionPerformed(evt);
            }
        });

        codigoButton1.setText("Obtener código");
        codigoButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoButton1ActionPerformed(evt);
            }
        });

        recorrerButton1.setText("Recorrer Árbol");
        recorrerButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recorrerButton1ActionPerformed(evt);
            }
        });

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

        jScrollPane1.setViewportView(recorrerLabel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(insertarNumeroButton, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(añadirText1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(eliminarNumeroButton, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(eliminarText1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(insertarNumerosButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(arrayListScrollPane)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(recorrerButton1)
                                        .addGap(18, 18, 18)
                                        .addComponent(recorrerBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(codigoButton1)
                                        .addGap(18, 18, 18)
                                        .addComponent(codigoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(codigoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(generarNumerosButton)
                                .addGap(23, 23, 23)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(cantidadTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(numeroMaximoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(mostraLvButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(nivelTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(nivelLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap())))
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
                .addGap(18, 18, 18)
                .addComponent(insertarNumerosButton)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(insertarNumeroButton)
                    .addComponent(añadirText1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eliminarNumeroButton)
                    .addComponent(eliminarText1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(recorrerButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(recorrerBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(nivelLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nivelTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(mostraLvButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(codigoButton1)
                        .addComponent(codigoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(codigoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(54, Short.MAX_VALUE))
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

    private void nivelTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nivelTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nivelTextFieldActionPerformed

    private void insertarNumeroButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertarNumeroButtonActionPerformed
        arbol.insertar(Integer.parseInt(añadirText1.getText()));
	arbolGrafico.refrescar(arbol);
    }//GEN-LAST:event_insertarNumeroButtonActionPerformed

    private void codigoButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoButton1ActionPerformed
        codigoLabel.setText(arbol.obtenerCódigo(Integer.parseInt(codigoTextField.getText())));
        repaint();
    }//GEN-LAST:event_codigoButton1ActionPerformed

    private void añadirText1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añadirText1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_añadirText1ActionPerformed

    private void eliminarNumeroButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarNumeroButtonActionPerformed
        arbol.eliminar(Integer.parseInt(eliminarText1.getText()));
	arbolGrafico.refrescar(arbol);
    }//GEN-LAST:event_eliminarNumeroButtonActionPerformed

    private void generarNumerosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generarNumerosButtonActionPerformed
        numeros = arbol.generarNúmeros(Integer.parseInt(numeroMaximoTextField.getText()), Integer.parseInt(cantidadTextField.getText()));
        
        String arrayList = "";
        for (int i = 0; i < numeros.size(); i++) {
            arrayList += numeros.get(i) + (i == numeros.size() - 1 ? "" : ", ");
        }
        
        arrayListLabel.setText(arrayList);
        repaint();
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

    private void recorrerButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recorrerButton1ActionPerformed
        String metodo = (String) recorrerBox1.getSelectedItem();
        
        System.out.println(metodo);
        
        String resultado = "";
        switch (metodo) {
            case "Preorden":
                resultado = arbol.recorrerPreorden(arbol.getRaiz());
                break;
                
            case "Postorden":
                resultado = arbol.recorrerPostorden(arbol.getRaiz());
                break;
                
            case "Inorden":
                resultado = arbol.recorrerInorden(arbol.getRaiz());
                break;
                
            case "Por nivel":
                resultado = arbol.recorrerPorNivel(arbol.getRaiz());
                break;
        }
        
        recorrerLabel.setText(resultado);
        repaint();
    }//GEN-LAST:event_recorrerButton1ActionPerformed

    private void recorrerBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recorrerBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_recorrerBox1ActionPerformed

    private void mostraLvButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostraLvButton1ActionPerformed
        nivelLabel.setText(arbol.mostrarNivel(Integer.parseInt(nivelTextField.getText())));
        repaint();
    }//GEN-LAST:event_mostraLvButton1ActionPerformed

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
    private javax.swing.JTextField añadirText;
    private javax.swing.JTextField añadirText1;
    private javax.swing.JTextField cantidadTextField;
    private javax.swing.JButton codigoButton;
    private javax.swing.JButton codigoButton1;
    private javax.swing.JLabel codigoLabel;
    private javax.swing.JTextField codigoTextField;
    private javax.swing.JLabel códigoLabel;
    private javax.swing.JTextField códigoText;
    private javax.swing.JButton eliminarButton;
    private javax.swing.JButton eliminarNumeroButton;
    private javax.swing.JTextField eliminarText;
    private javax.swing.JTextField eliminarText1;
    private javax.swing.JButton generarNumerosButton;
    private javax.swing.JButton insertarNumeroButton;
    private javax.swing.JButton insertarNumerosButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton mostraLvButton;
    private javax.swing.JButton mostraLvButton1;
    private javax.swing.JButton mostrarButton;
    private javax.swing.JTextField mostrarLvText;
    private javax.swing.JLabel nivelLabel;
    private javax.swing.JTextField nivelTextField;
    private javax.swing.JTextField numeroMaximoTextField;
    private javax.swing.JComboBox<String> recorrerBox;
    private javax.swing.JComboBox<String> recorrerBox1;
    private javax.swing.JButton recorrerButton;
    private javax.swing.JButton recorrerButton1;
    private javax.swing.JLabel recorrerLabel;
    // End of variables declaration//GEN-END:variables
}
