/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fpclient;

import fp.message;
import fp.protokol;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.DefaultCaret;

/**
 *
 * @author ASUS-PC
 */
public class FrmMain extends javax.swing.JFrame {

    /**
     * 1. Wait for users
     * 2. Hide
     * 3. Wait
     * 4. Go
     * 5. Game Over
     */
    int Status;
    private int X;
    private int Y;
    private Socket sock;
    private ObjectOutputStream ous;
    private ObjectInputStream ois;
    private ThreadReadClient trcClient;
    /**
     * Creates new form FrmMain
     */
    public FrmMain() {
        initComponents();
        setLocationRelativeTo(null);
        DefaultCaret caret = (DefaultCaret)this.TxtLog.getCaret();
        caret.setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);
        DisableNonGame();
        Status=1;
        X=-1;
        Y=-1;
        CmdDisconnect.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        CMD00 = new javax.swing.JButton();
        CMD01 = new javax.swing.JButton();
        CMD02 = new javax.swing.JButton();
        CMD10 = new javax.swing.JButton();
        CMD11 = new javax.swing.JButton();
        CMD12 = new javax.swing.JButton();
        CMD20 = new javax.swing.JButton();
        CMD21 = new javax.swing.JButton();
        CMD22 = new javax.swing.JButton();
        CmdReady = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TxtLog = new javax.swing.JTextArea();
        TxtChat = new javax.swing.JTextField();
        CmdSend = new javax.swing.JButton();
        TxtUserName = new javax.swing.JTextField();
        CmdRename = new javax.swing.JButton();
        CmdConnect = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        CmdDisconnect = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TxtSkor = new javax.swing.JTextArea();
        TxtIP = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hide and Seek");
        setResizable(false);

        CMD00.setText("X");
        CMD00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CMD00ActionPerformed(evt);
            }
        });

        CMD01.setText("X");
        CMD01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CMD01ActionPerformed(evt);
            }
        });

        CMD02.setText("X");
        CMD02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CMD02ActionPerformed(evt);
            }
        });

        CMD10.setText("X");
        CMD10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CMD10ActionPerformed(evt);
            }
        });

        CMD11.setText("X");
        CMD11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CMD11ActionPerformed(evt);
            }
        });

        CMD12.setText("X");
        CMD12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CMD12ActionPerformed(evt);
            }
        });

        CMD20.setText("X");
        CMD20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CMD20ActionPerformed(evt);
            }
        });

        CMD21.setText("X");
        CMD21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CMD21ActionPerformed(evt);
            }
        });

        CMD22.setText("X");
        CMD22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CMD22ActionPerformed(evt);
            }
        });

        CmdReady.setText("Ready");
        CmdReady.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmdReadyActionPerformed(evt);
            }
        });

        TxtLog.setEditable(false);
        TxtLog.setColumns(20);
        TxtLog.setLineWrap(true);
        TxtLog.setRows(5);
        jScrollPane1.setViewportView(TxtLog);

        CmdSend.setText("Send");
        CmdSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmdSendActionPerformed(evt);
            }
        });

        CmdRename.setText("Rename");
        CmdRename.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmdRenameActionPerformed(evt);
            }
        });

        CmdConnect.setText("Connect");
        CmdConnect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmdConnectActionPerformed(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        CmdDisconnect.setText("Disconnect");
        CmdDisconnect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmdDisconnectActionPerformed(evt);
            }
        });

        TxtSkor.setEditable(false);
        TxtSkor.setColumns(20);
        TxtSkor.setLineWrap(true);
        TxtSkor.setRows(5);
        jScrollPane2.setViewportView(TxtSkor);

        TxtIP.setText("127.0.0.1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TxtChat)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CmdSend))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(TxtIP)
                                            .addComponent(CmdDisconnect, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                                            .addComponent(CmdConnect, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(CMD20, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(CMD21, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(CMD22, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(CMD10, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(CMD11, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(CMD12, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(CMD00, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(CMD01, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(CMD02, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(CmdReady, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(TxtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(CmdRename, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)))))
                    .addComponent(jSeparator3))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator2)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(CMD00, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CMD01, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CMD02, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(CMD10, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CMD11, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CMD12, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(CMD20, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CMD21, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CMD22, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TxtIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(CmdConnect)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CmdDisconnect)))
                        .addGap(4, 4, 4))
                    .addComponent(jScrollPane2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CmdReady)
                    .addComponent(TxtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CmdRename))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtChat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CmdSend))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CmdReadyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmdReadyActionPerformed
        // TODO add your handling code here:
        protokol prot=new protokol();
        prot.setRequest(1);
        try {
            SendRequest(prot);
            DisableButton();
        } catch (IOException ex) {
            Logger.getLogger(FrmMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_CmdReadyActionPerformed

    private void CmdConnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmdConnectActionPerformed
        TxtLog.setText("");
        TxtChat.setText("");
        TxtUserName.setText("");
        TxtSkor.setText("");
        try {
            // TODO add your handling code here:
            System.out.println("Masuk connect");
            this.sock = new Socket(TxtIP.getText(), 6060);
            System.out.println("Berhasil connect");
            this.ous = new ObjectOutputStream(this.sock.getOutputStream());
            this.ois = new ObjectInputStream(this.sock.getInputStream());
            
            this.trcClient = new ThreadReadClient(sock, ois, this);
            this.trcClient.start();
            EnableNonGame();
            CmdConnect.setEnabled(false);
            CmdDisconnect.setEnabled(true);
        } catch (IOException ex) {
            Logger.getLogger(FrmMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_CmdConnectActionPerformed

    private void CmdDisconnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmdDisconnectActionPerformed
        // TODO add your handling code here:
        protokol prot=new protokol();
        prot.setRequest(5);
        try {
            SendRequest(prot);
            ResetUI();
        } catch (IOException ex) {
            Logger.getLogger(FrmMain.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_CmdDisconnectActionPerformed

    private void CmdRenameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmdRenameActionPerformed
        // TODO add your handling code here:
        protokol prot=new protokol();
        prot.setRequest(0);
        prot.setUsername(TxtUserName.getText());
        try {
            SendRequest(prot);
        } catch (IOException ex) {
            Logger.getLogger(FrmMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_CmdRenameActionPerformed

    private void CmdSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmdSendActionPerformed
        // TODO add your handling code here:
        message msg=new message();
        msg.setMessageString(TxtChat.getText());
        try {
            this.SendMessage(msg);
        } catch (IOException ex) {
            Logger.getLogger(FrmMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_CmdSendActionPerformed

    private void CMD00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CMD00ActionPerformed
        // TODO add your handling code here:
        if(Status==2)
        {
            try {
                Hide(0,0);
            } catch (IOException ex) {
                Logger.getLogger(FrmMain.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(Status==3)
        {
            WriteLog("This turn is not your turn!\n");
        }
        else if(Status==4)
        {
            try {
                Seek(0,0);
            } catch (IOException ex) {
                Logger.getLogger(FrmMain.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else
        {
            WriteLog("Game has not started yet!!!\n\n");
        }
    }//GEN-LAST:event_CMD00ActionPerformed

    private void CMD01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CMD01ActionPerformed
        // TODO add your handling code here:
        if (Status == 2) {
            try {
                Hide(1, 0);
            } catch (IOException ex) {
                Logger.getLogger(FrmMain.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (Status == 3) {
            WriteLog("This turn is not your turn!\n");
        } else if (Status == 4) {
            try {
                Seek(1, 0);
            } catch (IOException ex) {
                Logger.getLogger(FrmMain.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            WriteLog("Game has not started yet!!!\n");
        }
    }//GEN-LAST:event_CMD01ActionPerformed

    private void CMD02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CMD02ActionPerformed
        // TODO add your handling code here:
        if (Status == 2) {
            try {
                Hide(2, 0);
            } catch (IOException ex) {
                Logger.getLogger(FrmMain.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (Status == 3) {
            WriteLog("This turn is not your turn!\n");
        } else if (Status == 4) {
            try {
                Seek(2, 0);
            } catch (IOException ex) {
                Logger.getLogger(FrmMain.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            WriteLog("Game has not started yet!!!\n");
        }
    }//GEN-LAST:event_CMD02ActionPerformed

    private void CMD10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CMD10ActionPerformed
        // TODO add your handling code here:
        if (Status == 2) {
            try {
                Hide(0, 1);
            } catch (IOException ex) {
                Logger.getLogger(FrmMain.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (Status == 3) {
            WriteLog("This turn is not your turn!\n");
        } else if (Status == 4) {
            try {
                Seek(0, 1);
            } catch (IOException ex) {
                Logger.getLogger(FrmMain.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            WriteLog("Game has not started yet!!!\n");
        }
    }//GEN-LAST:event_CMD10ActionPerformed

    private void CMD11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CMD11ActionPerformed
        // TODO add your handling code here:
        if (Status == 2) {
            try {
                Hide(1, 1);
            } catch (IOException ex) {
                Logger.getLogger(FrmMain.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (Status == 3) {
            WriteLog("This turn is not your turn!\n");
        } else if (Status == 4) {
            try {
                Seek(1, 1);
            } catch (IOException ex) {
                Logger.getLogger(FrmMain.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            WriteLog("Game has not started yet!!!\n");
        }
    }//GEN-LAST:event_CMD11ActionPerformed

    private void CMD12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CMD12ActionPerformed
        // TODO add your handling code here:
        if (Status == 2) {
            try {
                Hide(2, 1);
            } catch (IOException ex) {
                Logger.getLogger(FrmMain.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (Status == 3) {
            WriteLog("This turn is not your turn!\n");
        } else if (Status == 4) {
            try {
                Seek(2, 1);
            } catch (IOException ex) {
                Logger.getLogger(FrmMain.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            WriteLog("Game has not started yet!!!\n");
        }
    }//GEN-LAST:event_CMD12ActionPerformed

    private void CMD20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CMD20ActionPerformed
        // TODO add your handling code here:
        if (Status == 2) {
            try {
                Hide(0, 2);
            } catch (IOException ex) {
                Logger.getLogger(FrmMain.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (Status == 3) {
            WriteLog("This turn is not your turn!\n");
        } else if (Status == 4) {
            try {
                Seek(0, 2);
            } catch (IOException ex) {
                Logger.getLogger(FrmMain.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            WriteLog("Game has not started yet!!!\n");
        }
    }//GEN-LAST:event_CMD20ActionPerformed

    private void CMD21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CMD21ActionPerformed
        // TODO add your handling code here:
        if (Status == 2) {
            try {
                Hide(1, 2);
            } catch (IOException ex) {
                Logger.getLogger(FrmMain.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (Status == 3) {
            WriteLog("This turn is not your turn!\n");
        } else if (Status == 4) {
            try {
                Seek(1, 2);
            } catch (IOException ex) {
                Logger.getLogger(FrmMain.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            WriteLog("Game has not started yet!!!\n");
        }
    }//GEN-LAST:event_CMD21ActionPerformed

    private void CMD22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CMD22ActionPerformed
        // TODO add your handling code here:
        if (Status == 2) {
            try {
                Hide(2, 2);
            } catch (IOException ex) {
                Logger.getLogger(FrmMain.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (Status == 3) {
            WriteLog("This turn is not your turn!\n");
        } else if (Status == 4) {
            try {
                Seek(2, 2);
            } catch (IOException ex) {
                Logger.getLogger(FrmMain.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            WriteLog("Game has not started yet!!!\n");
        }
    }//GEN-LAST:event_CMD22ActionPerformed

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
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FrmMain().setVisible(true);
            }
        });
    }
    
    public void ResetUI()
    {
            DisableNonGame();
            Status=1;
            X=-1;
            Y=-1;
            CmdConnect.setEnabled(true);
            CmdDisconnect.setEnabled(false);
    }
    public void WriteLog(String log)
    {
        this.TxtLog.append(log);
    }
    
    public void SendRequest(protokol prot) throws IOException
    {
        ous.writeObject(prot);
        ous.flush();
        ous.reset();
    }
    public void Hide(int X, int Y) throws IOException
    {
        protokol prot=new protokol();
        prot.setRequest(2);
        prot.setX(X);
        prot.setY(Y);
        SendRequest(prot);
    }
    
    public void EnableButton()
    {
        CMD00.setEnabled(true);
        CMD01.setEnabled(true);
        CMD02.setEnabled(true);
        CMD10.setEnabled(true);
        CMD11.setEnabled(true);
        CMD12.setEnabled(true);
        CMD20.setEnabled(true);
        CMD21.setEnabled(true);
        CMD22.setEnabled(true);
    }
    
    public void DisableButton()
    {
        CMD00.setEnabled(!true);
        CMD01.setEnabled(!true);
        CMD02.setEnabled(!true);
        CMD10.setEnabled(!true);
        CMD11.setEnabled(!true);
        CMD12.setEnabled(!true);
        CMD20.setEnabled(!true);
        CMD21.setEnabled(!true);
        CMD22.setEnabled(!true);
    }
    
    public void Seek(int X, int Y) throws IOException
    {
        protokol prot=new protokol();
        prot.setRequest(3);
        prot.setX(X);
        prot.setY(Y);
        SendRequest(prot);
    }
    public void UpdateScore(String usernames[],int skor[])
    {
        String Skor;
        Skor="Skor :\n";
        for(int i=0;i<usernames.length;i++)
        {
            Skor=Skor+usernames[i]+" : "+skor[i]+"\n";
        }
        Skor=Skor+"\n";
        TxtSkor.setText(Skor);
    }
    public void SendMessage(message msg) throws IOException
    {
        ous.writeObject(msg);
        ous.flush();
        ous.reset();
    }
    public void EnableNonGame()
    {
        CmdReady.setEnabled(true);
        TxtUserName.setEnabled(true);
        TxtChat.setEnabled(true);
        CmdSend.setEnabled(true);
        CmdRename.setEnabled(true);
    }
    
    public void DisableNonGame()
    {
        CmdReady.setEnabled(!true);
        TxtUserName.setEnabled(!true);
        TxtChat.setEnabled(!true);
        CmdSend.setEnabled(!true);
        CmdRename.setEnabled(!true);
    }
    public void StatusUpdated()
    {
        switch(Status)
        {
            case 2:
                EnableButton();
                break;
            case 3:
                DisableButton();
                break;
            case 4:
                EnableButton();
                break;
            case 5:
                DisableButton();
                CmdDisconnect.doClick();
                break;
            default:
                break;
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CMD00;
    private javax.swing.JButton CMD01;
    private javax.swing.JButton CMD02;
    private javax.swing.JButton CMD10;
    private javax.swing.JButton CMD11;
    private javax.swing.JButton CMD12;
    private javax.swing.JButton CMD20;
    private javax.swing.JButton CMD21;
    private javax.swing.JButton CMD22;
    private javax.swing.JButton CmdConnect;
    private javax.swing.JButton CmdDisconnect;
    private javax.swing.JButton CmdReady;
    private javax.swing.JButton CmdRename;
    private javax.swing.JButton CmdSend;
    private javax.swing.JTextField TxtChat;
    private javax.swing.JTextField TxtIP;
    private javax.swing.JTextArea TxtLog;
    private javax.swing.JTextArea TxtSkor;
    private javax.swing.JTextField TxtUserName;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables
}