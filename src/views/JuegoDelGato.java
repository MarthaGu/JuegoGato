/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

hibernate
jfree
 */
package views;

import audio.AePlayWave;
import audio.PlayAudio;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Martha
 */
public class JuegoDelGato extends javax.swing.JFrame {

    /**
     * Creates new form JuegoDelGato
     */
    public JuegoDelGato() {
        initComponents();
       
        
         txtJu1.setText("Es tu turno");
     txtJu2.setText("Espera");
     
     
     
     
     
     
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnReset = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        btnCelda4 = new javax.swing.JButton();
        btnCelda3 = new javax.swing.JButton();
        btnCelda2 = new javax.swing.JButton();
        btnCelda5 = new javax.swing.JButton();
        seis = new javax.swing.JButton();
        btnCelda9 = new javax.swing.JButton();
        btnCelda8 = new javax.swing.JButton();
        btnCelda1 = new javax.swing.JButton();
        siete = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtJu1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtJu2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.BorderLayout(2, 0));

        jLabel1.setBackground(new java.awt.Color(239, 0, 0));
        jLabel1.setFont(new java.awt.Font("Algerian", 2, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gato.jpg"))); // NOI18N
        jLabel1.setText("Juego del gato");
        jLabel1.setToolTipText("");
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, java.awt.BorderLayout.PAGE_START);

        jPanel4.setLayout(new java.awt.GridLayout(2, 2));

        btnReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/reset.jpg"))); // NOI18N
        btnReset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnResetMouseClicked(evt);
            }
        });
        jPanel4.add(btnReset);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.jpg"))); // NOI18N
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel4.add(jButton1);

        getContentPane().add(jPanel4, java.awt.BorderLayout.LINE_END);

        jPanel5.setLayout(new java.awt.GridLayout(3, 3));

        btnCelda4.setBackground(new java.awt.Color(204, 204, 204));
        btnCelda4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tapa.jpg"))); // NOI18N
        btnCelda4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnCelda4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCelda4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCelda4MouseEntered(evt);
            }
        });
        btnCelda4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCelda4ActionPerformed(evt);
            }
        });
        jPanel5.add(btnCelda4);

        btnCelda3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tapa.jpg"))); // NOI18N
        btnCelda3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnCelda3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCelda3MouseClicked(evt);
            }
        });
        btnCelda3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCelda3ActionPerformed(evt);
            }
        });
        jPanel5.add(btnCelda3);

        btnCelda2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tapa.jpg"))); // NOI18N
        btnCelda2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnCelda2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCelda2MouseClicked(evt);
            }
        });
        btnCelda2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCelda2ActionPerformed(evt);
            }
        });
        jPanel5.add(btnCelda2);

        btnCelda5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tapa.jpg"))); // NOI18N
        btnCelda5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnCelda5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCelda5MouseClicked(evt);
            }
        });
        btnCelda5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCelda5ActionPerformed(evt);
            }
        });
        jPanel5.add(btnCelda5);

        seis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tapa.jpg"))); // NOI18N
        seis.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        seis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                seisMouseClicked(evt);
            }
        });
        seis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seisActionPerformed(evt);
            }
        });
        jPanel5.add(seis);

        btnCelda9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tapa.jpg"))); // NOI18N
        btnCelda9.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnCelda9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCelda9MouseClicked(evt);
            }
        });
        btnCelda9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCelda9ActionPerformed(evt);
            }
        });
        jPanel5.add(btnCelda9);

        btnCelda8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tapa.jpg"))); // NOI18N
        btnCelda8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnCelda8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCelda8MouseClicked(evt);
            }
        });
        btnCelda8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCelda8ActionPerformed(evt);
            }
        });
        jPanel5.add(btnCelda8);

        btnCelda1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tapa.jpg"))); // NOI18N
        btnCelda1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnCelda1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCelda1MouseClicked(evt);
            }
        });
        btnCelda1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCelda1ActionPerformed(evt);
            }
        });
        jPanel5.add(btnCelda1);

        siete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tapa.jpg"))); // NOI18N
        siete.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        siete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sieteMouseClicked(evt);
            }
        });
        siete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sieteActionPerformed(evt);
            }
        });
        jPanel5.add(siete);

        getContentPane().add(jPanel5, java.awt.BorderLayout.CENTER);

        jPanel1.setLayout(new java.awt.GridLayout(2, 2));

        jLabel2.setBackground(new java.awt.Color(204, 255, 102));
        jLabel2.setText("Jugador 1");
        jLabel2.setOpaque(true);
        jPanel1.add(jLabel2);
        jPanel1.add(txtJu1);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Jugador 2");
        jLabel3.setOpaque(true);
        jPanel1.add(jLabel3);
        jPanel1.add(txtJu2);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCelda4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCelda4ActionPerformed
       
       
         try {
            AePlayWave aw;
            URL url = PlayAudio.class.getResource("/audio/voces.wav");
            aw = new AePlayWave(url);
            aw.start();
        } catch (URISyntaxException ex) {
            Logger.getLogger(PlayAudio.class.getName()).log(Level.SEVERE, null, ex);
        }
    
        
    
    }//GEN-LAST:event_btnCelda4ActionPerformed

    private void btnCelda4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCelda4MouseClicked
     
        if(txtJu1.getText().equals("Es tu turno")){
           btnCelda4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/x.png")));
           jLabel3.setBackground(new java.awt.Color(204, 255, 102));
           jLabel2.setBackground(new java.awt.Color(255, 255, 255));
           txtJu2.setText("Es tu turno");
           txtJu1.setText("Espera");
          btnCelda4.setBackground(Color.BLUE);
           
          
           
        } else if
           
        (txtJu2.getText().equals("Es tu turno")) {
       btnCelda4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/0.jpg"))); 
        txtJu1.setText("Es tu turno");
         txtJu2.setText("Espera");
         jLabel2.setBackground(new java.awt.Color(204, 255, 102));
           jLabel3.setBackground(new java.awt.Color(255, 255, 255));
           btnCelda4.setBackground(Color.BLUE);
         
     
    } 
       btnCelda4.setEnabled(false);
        
    
       if(btnCelda3.getIcon().toString().equals(btnCelda4.getIcon().toString())&&(btnCelda3.getIcon().toString().equals(btnCelda2.getIcon().toString()))){
     JOptionPane.showMessageDialog(null, "¡¡Felicidades, GANSTE !!,para jugar una vez mas presiona el boton RESET");
   
   
    }else if
            (btnCelda4.getIcon().toString().equals(seis.getIcon().toString())&&(btnCelda4.getIcon().toString().equals(siete.getIcon().toString()))){
   JOptionPane.showMessageDialog(null, "¡¡Felicidades, GANSTE !!,,para jugar una vez mas presiona el boton RESET ");

    } else if
             (btnCelda4.getIcon().toString().equals(btnCelda5.getIcon().toString())&&(btnCelda4.getIcon().toString().equals(btnCelda8.getIcon().toString()))){
     JOptionPane.showMessageDialog(null, "¡¡Felicidades, GANSTE !!,,para jugar una vez mas presiona el boton RESET");
   
     
    }
      
       if(btnCelda4.getBackground()==Color.BLUE&&btnCelda5.getBackground()==Color.BLUE&&seis.getBackground()==Color.BLUE&&siete.getBackground()==Color.BLUE&&btnCelda8.getBackground()==Color.BLUE&&btnCelda9.getBackground()==Color.BLUE&&btnCelda1.getBackground()==Color.BLUE&&btnCelda2.getBackground()==Color.BLUE&&btnCelda3.getBackground()==Color.BLUE){
           JOptionPane.showMessageDialog(null, "¡¡SON TAN BUENOS QUE HAN EMPATADO !!,,para jugar una vez mas presiona el boton RESET"); 
       }
      
       
      
              
    }//GEN-LAST:event_btnCelda4MouseClicked

    private void btnCelda3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCelda3ActionPerformed


        try {
            AePlayWave aw;
            URL url = PlayAudio.class.getResource("/audio/voces.wav");
            aw = new AePlayWave(url);
            aw.start();
        } catch (URISyntaxException ex) {
            Logger.getLogger(PlayAudio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnCelda3ActionPerformed

    private void btnCelda3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCelda3MouseClicked

       
        if(txtJu1.getText().equals("Es tu turno")){
           btnCelda3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/x.png")));
           jLabel3.setBackground(new java.awt.Color(204, 255, 102));
           jLabel2.setBackground(new java.awt.Color(255, 255, 255));
           txtJu2.setText("Es tu turno");
           txtJu1.setText("Espera");
            btnCelda3.setBackground(Color.BLUE);
           
           
        } 
       else if
           
        (txtJu2.getText().equals("Es tu turno")){
       btnCelda3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/0.jpg"))); 
        txtJu1.setText("Es tu turno");
         txtJu2.setText("Espera"); 
         jLabel2.setBackground(new java.awt.Color(204, 255, 102));
           jLabel3.setBackground(new java.awt.Color(255, 255, 255));
            btnCelda3.setBackground(Color.BLUE);
            
         }     
          if(btnCelda3.getIcon().toString().equals(btnCelda4.getIcon().toString())&&(btnCelda3.getIcon().toString().equals(btnCelda2.getIcon().toString()))){
   JOptionPane.showMessageDialog(null, "¡¡Felicidades, GANSTE !!,para jugar una vez mas presiona el boton RESET");
    
    } else if (btnCelda3.getIcon().toString().equals(seis.getIcon().toString())&&(btnCelda3.getIcon().toString().equals(btnCelda1.getIcon().toString()))){
    JOptionPane.showMessageDialog(null, "¡¡Felicidades, GANSTE !!,para jugar una vez mas presiona el boton RESET");
    }
          
          btnCelda3.setEnabled(false);
            if(btnCelda4.getBackground()==Color.BLUE&&btnCelda5.getBackground()==Color.BLUE&&seis.getBackground()==Color.BLUE&&siete.getBackground()==Color.BLUE&&btnCelda8.getBackground()==Color.BLUE&&btnCelda9.getBackground()==Color.BLUE&&btnCelda1.getBackground()==Color.BLUE&&btnCelda2.getBackground()==Color.BLUE&&btnCelda3.getBackground()==Color.BLUE){
           JOptionPane.showMessageDialog(null, "¡¡SON TAN BUENOS QUE HAN EMPATADO !!,,para jugar una vez mas presiona el boton RESET"); 
          
            } 
    }//GEN-LAST:event_btnCelda3MouseClicked

    private void btnCelda2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCelda2MouseClicked
      
        if(txtJu1.getText().equals("Es tu turno")){
           btnCelda2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/x.png")));
           jLabel3.setBackground(new java.awt.Color(204, 255, 102));
           jLabel2.setBackground(new java.awt.Color(255, 255, 255));
           txtJu2.setText("Es tu turno");
           txtJu1.setText("Espera");
            btnCelda2.setBackground(Color.BLUE);
           
           
        } 
       else if
           
        (txtJu2.getText().equals("Es tu turno")){
       btnCelda2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/0.jpg"))); 
        txtJu1.setText("Es tu turno");
         txtJu2.setText("Espera"); 
          jLabel2.setBackground(new java.awt.Color(204, 255, 102));
           jLabel3.setBackground(new java.awt.Color(255, 255, 255));
             btnCelda2.setBackground(Color.BLUE);
         } 
        
          if(btnCelda3.getIcon().toString().equals(btnCelda4.getIcon().toString())&&(btnCelda3.getIcon().toString().equals(btnCelda2.getIcon().toString()))){
     JOptionPane.showMessageDialog(null, "¡¡Felicidades, GANSTE !!,para jugar una vez mas presiona el boton RESET");
          }else if
                  (btnCelda9.getIcon().toString().equals(siete.getIcon().toString())&&(btnCelda9.getIcon().toString().equals(btnCelda2.getIcon().toString()))){
   JOptionPane.showMessageDialog(null, "¡¡Felicidades, GANSTE !!,para jugar una vez mas presiona el boton RESET");
    }else if
                  (btnCelda8.getIcon().toString().equals(seis.getIcon().toString())&&(btnCelda8.getIcon().toString().equals(btnCelda2.getIcon().toString()))){
  JOptionPane.showMessageDialog(null, "¡¡Felicidades, GANSTE !!,para jugar una vez mas presiona el boton RESET");
    } 
         btnCelda2.setEnabled(false);
           if(btnCelda4.getBackground()==Color.BLUE&&btnCelda5.getBackground()==Color.BLUE&&seis.getBackground()==Color.BLUE&&siete.getBackground()==Color.BLUE&&btnCelda8.getBackground()==Color.BLUE&&btnCelda9.getBackground()==Color.BLUE&&btnCelda1.getBackground()==Color.BLUE&&btnCelda2.getBackground()==Color.BLUE&&btnCelda3.getBackground()==Color.BLUE){
           JOptionPane.showMessageDialog(null, "¡¡SON TAN BUENOS QUE HAN EMPATADO !!,,para jugar una vez mas presiona el boton RESET"); 
           }
          
    }//GEN-LAST:event_btnCelda2MouseClicked

    private void btnCelda5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCelda5MouseClicked
   
        if(txtJu1.getText().equals("Es tu turno")){
           btnCelda5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/x.png")));
           jLabel3.setBackground(new java.awt.Color(204, 255, 102));
            jLabel2.setBackground(new java.awt.Color(255, 255, 255));
           txtJu2.setText("Es tu turno");
           txtJu1.setText("Espera");
            btnCelda5.setBackground(Color.BLUE);
        } 
       else if
           
        (txtJu2.getText().equals("Es tu turno")){
       btnCelda5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/0.jpg"))); 
        txtJu1.setText("Es tu turno");
         txtJu2.setText("Espera"); 
         
        jLabel2.setBackground(new java.awt.Color(204, 255, 102));
           jLabel3.setBackground(new java.awt.Color(255, 255, 255));
           btnCelda5.setBackground(Color.BLUE);
            
         } 
        
         if
             (btnCelda4.getIcon().toString().equals(btnCelda5.getIcon().toString())&&(btnCelda4.getIcon().toString().equals(btnCelda8.getIcon().toString()))){
   JOptionPane.showMessageDialog(null, "¡¡Felicidades, GANSTE !!,para jugar una vez mas presiona el boton RESET");
    
    } else if
             
             (btnCelda5.getIcon().toString().equals(seis.getIcon().toString())&&(btnCelda5.getIcon().toString().equals(btnCelda9.getIcon().toString()))){
   JOptionPane.showMessageDialog(null, "¡¡Felicidades, GANSTE !!,para jugar una vez mas presiona el boton RESET");
              }
         
         btnCelda5.setEnabled(false);
        
       if(btnCelda4.getBackground()==Color.BLUE&&btnCelda5.getBackground()==Color.BLUE&&seis.getBackground()==Color.BLUE&&siete.getBackground()==Color.BLUE&&btnCelda8.getBackground()==Color.BLUE&&btnCelda9.getBackground()==Color.BLUE&&btnCelda1.getBackground()==Color.BLUE&&btnCelda2.getBackground()==Color.BLUE&&btnCelda3.getBackground()==Color.BLUE){
           JOptionPane.showMessageDialog(null, "¡¡SON TAN BUENOS QUE HAN EMPATADO !!,,para jugar una vez mas presiona el boton RESET");     
       }
    }//GEN-LAST:event_btnCelda5MouseClicked

    private void seisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seisMouseClicked
    
        if(txtJu1.getText().equals("Es tu turno")){
           seis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/x.png")));
           jLabel3.setBackground(new java.awt.Color(204, 255, 102));
            jLabel2.setBackground(new java.awt.Color(255, 255, 255));
           txtJu2.setText("Es tu turno");
           txtJu1.setText("Espera");
            seis.setBackground(Color.BLUE);
           
        } 
       else if
           
        (txtJu2.getText().equals("Es tu turno")){
       seis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/0.jpg"))); 
        txtJu1.setText("Es tu turno");
         txtJu2.setText("Espera"); 
             jLabel2.setBackground(new java.awt.Color(204, 255, 102));
           jLabel3.setBackground(new java.awt.Color(255, 255, 255));
            seis.setBackground(Color.BLUE);
         }  
         seis.setEnabled(false);
          
         if
            (btnCelda4.getIcon().toString().equals(seis.getIcon().toString())&&(btnCelda4.getIcon().toString().equals(siete.getIcon().toString()))){
    JOptionPane.showMessageDialog(null, "¡¡Felicidades, GANSTE !!,para jugar una vez mas presiona el boton RESET");
    }
         else if 
                   
             (btnCelda5.getIcon().toString().equals(seis.getIcon().toString())&&(btnCelda5.getIcon().toString().equals(btnCelda9.getIcon().toString()))){
  JOptionPane.showMessageDialog(null, "¡¡Felicidades, GANSTE !!,para jugar una vez mas presiona el boton RESET");
         } else if
                
                  (btnCelda8.getIcon().toString().equals(seis.getIcon().toString())&&(btnCelda8.getIcon().toString().equals(btnCelda2.getIcon().toString()))){
  JOptionPane.showMessageDialog(null, "¡¡Felicidades, GANSTE !!,para jugar una vez mas presiona el boton RESET");
       
         
         }else if (btnCelda3.getIcon().toString().equals(seis.getIcon().toString())&&(btnCelda3.getIcon().toString().equals(btnCelda1.getIcon().toString()))){
  JOptionPane.showMessageDialog(null, "¡¡Felicidades, GANSTE !!,para jugar una vez mas presiona el boton RESET");
         }   
          if(btnCelda4.getBackground()==Color.BLUE&&btnCelda5.getBackground()==Color.BLUE&&seis.getBackground()==Color.BLUE&&siete.getBackground()==Color.BLUE&&btnCelda8.getBackground()==Color.BLUE&&btnCelda9.getBackground()==Color.BLUE&&btnCelda1.getBackground()==Color.BLUE&&btnCelda2.getBackground()==Color.BLUE&&btnCelda3.getBackground()==Color.BLUE){
           JOptionPane.showMessageDialog(null, "¡¡SON TAN BUENOS QUE HAN EMPATADO !!,,para jugar una vez mas presiona el boton RESET"); 
          
          }
       
    }//GEN-LAST:event_seisMouseClicked

    private void btnCelda9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCelda9MouseClicked
        
        if(txtJu1.getText().equals("Es tu turno")){
           btnCelda9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/x.png")));
           jLabel3.setBackground(new java.awt.Color(204, 255, 102));
           jLabel2.setBackground(new java.awt.Color(255, 255, 255));
           txtJu2.setText("Es tu turno");
           txtJu1.setText("Espera");
            btnCelda9.setBackground(Color.BLUE);
           
        } 
       else if
           
        (txtJu2.getText().equals("Es tu turno")){
       btnCelda9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/0.jpg"))); 
        txtJu1.setText("Es tu turno");
         txtJu2.setText("Espera"); 
         jLabel2.setBackground(new java.awt.Color(204, 255, 102));
           jLabel3.setBackground(new java.awt.Color(255, 255, 255));
           btnCelda9.setBackground(Color.BLUE);
            
         }  
        
        if
             (btnCelda5.getIcon().toString().equals(seis.getIcon().toString())&&(btnCelda5.getIcon().toString().equals(btnCelda9.getIcon().toString()))){
   JOptionPane.showMessageDialog(null, "¡¡Felicidades, GANSTE !!,para jugar una vez mas presiona el boton RESET");
        }else if
                (btnCelda9.getIcon().toString().equals(siete.getIcon().toString())&&(btnCelda9.getIcon().toString().equals(btnCelda2.getIcon().toString()))){
   JOptionPane.showMessageDialog(null, "¡¡Felicidades, GANSTE !!,para jugar una vez mas presiona el boton RESET");
        }  
       btnCelda9.setEnabled(false);
       
          if(btnCelda4.getBackground()==Color.BLUE&&btnCelda5.getBackground()==Color.BLUE&&seis.getBackground()==Color.BLUE&&siete.getBackground()==Color.BLUE&&btnCelda8.getBackground()==Color.BLUE&&btnCelda9.getBackground()==Color.BLUE&&btnCelda1.getBackground()==Color.BLUE&&btnCelda2.getBackground()==Color.BLUE&&btnCelda3.getBackground()==Color.BLUE){
           JOptionPane.showMessageDialog(null, "¡¡SON TAN BUENOS QUE HAN EMPATADO !!,,para jugar una vez mas presiona el boton RESET"); 
          }
    }//GEN-LAST:event_btnCelda9MouseClicked

    private void btnCelda8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCelda8MouseClicked
         if(txtJu1.getText().equals("Es tu turno")){
           btnCelda8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/x.png")));
           jLabel3.setBackground(new java.awt.Color(204, 255, 102));
            jLabel2.setBackground(new java.awt.Color(255, 255, 255));
           txtJu2.setText("Es tu turno");
           txtJu1.setText("Espera");
            btnCelda8.setBackground(Color.BLUE);
           
        } 
       else if
           
        (txtJu2.getText().equals("Es tu turno")){
       btnCelda8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/0.jpg"))); 
        txtJu1.setText("Es tu turno");
         txtJu2.setText("Espera"); 
         jLabel2.setBackground(new java.awt.Color(204, 255, 102));
           jLabel3.setBackground(new java.awt.Color(255, 255, 255));
            btnCelda8.setBackground(Color.BLUE);
         }  
    
          if
             (btnCelda4.getIcon().toString().equals(btnCelda5.getIcon().toString())&&(btnCelda4.getIcon().toString().equals(btnCelda8.getIcon().toString()))){
    JOptionPane.showMessageDialog(null, "¡¡Felicidades, GANSTE !!,para jugar una vez mas presiona el boton RESET");
          }else if (btnCelda8.getIcon().toString().equals(seis.getIcon().toString())&&(btnCelda8.getIcon().toString().equals(btnCelda2.getIcon().toString()))){
                JOptionPane.showMessageDialog(null, "¡¡Felicidades, GANSTE !!,para jugar una vez mas presiona el boton RESET"); 
                  }else if (btnCelda8.getIcon().toString().equals(siete.getIcon().toString())&&(btnCelda8.getIcon().toString().equals(btnCelda1.getIcon().toString()))){
          JOptionPane.showMessageDialog(null, "¡¡Felicidades, GANSTE !!,para jugar una vez mas presiona el boton RESET");
                  
          } 
          btnCelda8.setEnabled(false);
            if(btnCelda4.getBackground()==Color.BLUE&&btnCelda5.getBackground()==Color.BLUE&&seis.getBackground()==Color.BLUE&&siete.getBackground()==Color.BLUE&&btnCelda8.getBackground()==Color.BLUE&&btnCelda9.getBackground()==Color.BLUE&&btnCelda1.getBackground()==Color.BLUE&&btnCelda2.getBackground()==Color.BLUE&&btnCelda3.getBackground()==Color.BLUE){
           JOptionPane.showMessageDialog(null, "¡¡SON TAN BUENOS QUE HAN EMPATADO !!,,para jugar una vez mas presiona el boton RESET"); 
           
            }
   
    
            
          
           
    }//GEN-LAST:event_btnCelda8MouseClicked

    private void btnCelda1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCelda1MouseClicked
         if(txtJu1.getText().equals("Es tu turno")){
           btnCelda1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/x.png")));
           jLabel3.setBackground(new java.awt.Color(204, 255, 102));
           jLabel2.setBackground(new java.awt.Color(255, 255, 255));
           txtJu2.setText("Es tu turno");
           txtJu1.setText("Espera");
           btnCelda1.setBackground(Color.BLUE);
           
        } 
       else if
           
        (txtJu2.getText().equals("Es tu turno")){
       btnCelda1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/0.jpg"))); 
        txtJu1.setText("Es tu turno");
         txtJu2.setText("Espera"); 
         jLabel2.setBackground(new java.awt.Color(204, 255, 102));
           jLabel3.setBackground(new java.awt.Color(255, 255, 255));
             btnCelda1.setBackground(Color.BLUE);
         }  
         
           if
             (btnCelda8.getIcon().toString().equals(siete.getIcon().toString())&&(btnCelda8.getIcon().toString().equals(btnCelda1.getIcon().toString()))){
   JOptionPane.showMessageDialog(null, "¡¡Felicidades, GANSTE !!,para jugar una vez mas presiona el boton RESET");
    }else if (btnCelda3.getIcon().toString().equals(seis.getIcon().toString())&&(btnCelda3.getIcon().toString().equals(btnCelda1.getIcon().toString()))){
   JOptionPane.showMessageDialog(null, "¡¡Felicidades, GANSTE !!,para jugar una vez mas presiona el boton RESET");
    }
           btnCelda1.setEnabled(false);
             if(btnCelda4.getBackground()==Color.BLUE&&btnCelda5.getBackground()==Color.BLUE&&seis.getBackground()==Color.BLUE&&siete.getBackground()==Color.BLUE&&btnCelda8.getBackground()==Color.BLUE&&btnCelda9.getBackground()==Color.BLUE&&btnCelda1.getBackground()==Color.BLUE&&btnCelda2.getBackground()==Color.BLUE&&btnCelda3.getBackground()==Color.BLUE){
           JOptionPane.showMessageDialog(null, "¡¡SON TAN BUENOS QUE HAN EMPATADO !!,,para jugar una vez mas presiona el boton RESET"); 
             }    
    }//GEN-LAST:event_btnCelda1MouseClicked

    private void sieteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sieteMouseClicked
         if(txtJu1.getText().equals("Es tu turno")){
           siete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/x.png")));
           jLabel3.setBackground(new java.awt.Color(204, 255, 102));
           jLabel2.setBackground(new java.awt.Color(255, 255, 255));
           txtJu2.setText("Es tu turno");
           txtJu1.setText("Espera");
            siete.setBackground(Color.BLUE);
           
        } 
       else if
           
        (txtJu2.getText().equals("Es tu turno")){
       siete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/0.jpg"))); 
        txtJu1.setText("Es tu turno");
         txtJu2.setText("Espera"); 
         jLabel2.setBackground(new java.awt.Color(204, 255, 102));
           jLabel3.setBackground(new java.awt.Color(255, 255, 255));
             siete.setBackground(Color.BLUE);
         }  
         
          
          
          if
            (btnCelda4.getIcon().toString().equals(seis.getIcon().toString())&&(btnCelda4.getIcon().toString().equals(siete.getIcon().toString()))){
   JOptionPane.showMessageDialog(null, "¡¡Felicidades, GANSTE !!,para jugar una vez mas presiona el boton RESET");
     new JuegoDelGato().setVisible(false);
        }
          else if (btnCelda9.getIcon().toString().equals(siete.getIcon().toString())&&(btnCelda9.getIcon().toString().equals(btnCelda2.getIcon().toString()))){
   JOptionPane.showMessageDialog(null, "¡¡Felicidades, GANSTE !!,para jugar una vez mas presiona el boton RESET");
          }else if
             (btnCelda8.getIcon().toString().equals(siete.getIcon().toString())&&(btnCelda8.getIcon().toString().equals(btnCelda1.getIcon().toString()))){
   JOptionPane.showMessageDialog(null, "¡¡Felicidades, GANSTE !!,para jugar una vez mas presiona el boton RESET");
    }
         siete.setEnabled(false);
         
           if(btnCelda4.getBackground()==Color.BLUE&&btnCelda5.getBackground()==Color.BLUE&&seis.getBackground()==Color.BLUE&&siete.getBackground()==Color.BLUE&&btnCelda8.getBackground()==Color.BLUE&&btnCelda9.getBackground()==Color.BLUE&&btnCelda1.getBackground()==Color.BLUE&&btnCelda2.getBackground()==Color.BLUE&&btnCelda3.getBackground()==Color.BLUE){
           JOptionPane.showMessageDialog(null, "¡¡SON TAN BUENOS QUE HAN EMPATADO !!,,para jugar una vez mas presiona el boton RESET"); 
           }
         
    }//GEN-LAST:event_sieteMouseClicked

    private void btnCelda2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCelda2ActionPerformed


        try {
            AePlayWave aw;
            URL url = PlayAudio.class.getResource("/audio/voces.wav");
            aw = new AePlayWave(url);
            aw.start();
        } catch (URISyntaxException ex) {
            Logger.getLogger(PlayAudio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnCelda2ActionPerformed

    private void btnCelda5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCelda5ActionPerformed


           
           try {
            AePlayWave aw;
            URL url = PlayAudio.class.getResource("/audio/voces.wav");
            aw = new AePlayWave(url);
            aw.start();
        } catch (URISyntaxException ex) {
            Logger.getLogger(PlayAudio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnCelda5ActionPerformed

    private void seisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seisActionPerformed


        try {
            AePlayWave aw;
            URL url = PlayAudio.class.getResource("/audio/voces.wav");
            aw = new AePlayWave(url);
            aw.start();
        } catch (URISyntaxException ex) {
            Logger.getLogger(PlayAudio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_seisActionPerformed

    private void btnCelda9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCelda9ActionPerformed


        try {
            AePlayWave aw;
            URL url = PlayAudio.class.getResource("/audio/voces.wav");
            aw = new AePlayWave(url);
            aw.start();
        } catch (URISyntaxException ex) {
            Logger.getLogger(PlayAudio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnCelda9ActionPerformed

    private void btnCelda8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCelda8ActionPerformed


        try {
            AePlayWave aw;
            URL url = PlayAudio.class.getResource("/audio/voces.wav");
            aw = new AePlayWave(url);
            aw.start();
        } catch (URISyntaxException ex) {
            Logger.getLogger(PlayAudio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnCelda8ActionPerformed

    private void btnCelda1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCelda1ActionPerformed


        try {
            AePlayWave aw;
            URL url = PlayAudio.class.getResource("/audio/voces.wav");
            aw = new AePlayWave(url);
            aw.start();
        } catch (URISyntaxException ex) {
            Logger.getLogger(PlayAudio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnCelda1ActionPerformed

    private void sieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sieteActionPerformed

        
        try {
            AePlayWave aw;
            URL url = PlayAudio.class.getResource("/audio/voces.wav");
            aw = new AePlayWave(url);
            aw.start();
        } catch (URISyntaxException ex) {
            Logger.getLogger(PlayAudio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_sieteActionPerformed

    private void btnCelda4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCelda4MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCelda4MouseEntered

    private void btnResetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnResetMouseClicked
         btnCelda1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tapa.jpg")));
          btnCelda2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tapa.jpg")));
           btnCelda3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tapa.jpg")));
            btnCelda4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tapa.jpg")));
             btnCelda5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tapa.jpg")));
              seis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tapa.jpg")));
               siete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tapa.jpg")));
                btnCelda8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tapa.jpg")));
       btnCelda9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tapa.jpg")));
       
         btnCelda1.setBackground(Color.black);
         btnCelda1.setEnabled(true);
          btnCelda2.setBackground(Color.black);
           btnCelda2.setEnabled(true);
           btnCelda3.setBackground(Color.black);
            btnCelda3.setEnabled(true);
            btnCelda4.setBackground(Color.black);
             btnCelda4.setEnabled(true);
             btnCelda5.setBackground(Color.black);
              btnCelda5.setEnabled(true);
            seis.setBackground(Color.black);
             seis.setEnabled(true);
             siete.setBackground(Color.black);
              siete.setEnabled(true);
              btnCelda8.setBackground(Color.black);
               btnCelda8.setEnabled(true);
               btnCelda9.setBackground(Color.black);
                btnCelda9.setEnabled(true);
       
    }//GEN-LAST:event_btnResetMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jButton1MouseClicked
       
    
    
       
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        
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
            java.util.logging.Logger.getLogger(JuegoDelGato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JuegoDelGato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JuegoDelGato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JuegoDelGato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JuegoDelGato().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCelda1;
    private javax.swing.JButton btnCelda2;
    private javax.swing.JButton btnCelda3;
    private javax.swing.JButton btnCelda4;
    private javax.swing.JButton btnCelda5;
    private javax.swing.JButton btnCelda8;
    private javax.swing.JButton btnCelda9;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JButton seis;
    private javax.swing.JButton siete;
    private javax.swing.JTextField txtJu1;
    private javax.swing.JTextField txtJu2;
    // End of variables declaration//GEN-END:variables
}
