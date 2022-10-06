/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.senai.sp.jandira;

/**
 *
 * @author 22282180
 */
public class ClinicaFrame extends javax.swing.JFrame {

    /**
     * Creates new form ClinicaFrame
     */
    public ClinicaFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelDeTitulo = new javax.swing.JPanel();
        LabelTitulo = new javax.swing.JLabel();
        LabelCalendario = new javax.swing.JLabel();
        ButtonAgenda = new javax.swing.JButton();
        ButtonPaciente = new javax.swing.JButton();
        ButtonMédicos = new javax.swing.JButton();
        ButtonEspecialidade = new javax.swing.JButton();
        ButtonPlanoSaude = new javax.swing.JButton();
        ButtonSair = new javax.swing.JButton();
        PainelEspecialidade = new javax.swing.JPanel();
        ScrollEspecialidades = new javax.swing.JScrollPane();
        TableEspecialidade = new javax.swing.JTable();
        ButtonEditar = new javax.swing.JButton();
        ButtonDelete = new javax.swing.JButton();
        ButtonCriar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(150, 150, 150));
        getContentPane().setLayout(null);

        PainelDeTitulo.setBackground(new java.awt.Color(158, 158, 158));
        PainelDeTitulo.setLayout(null);

        LabelTitulo.setBackground(new java.awt.Color(255, 255, 255));
        LabelTitulo.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        LabelTitulo.setForeground(new java.awt.Color(14, 34, 215));
        LabelTitulo.setText("Agenda de Consultas ");
        PainelDeTitulo.add(LabelTitulo);
        LabelTitulo.setBounds(80, 20, 270, 28);

        LabelCalendario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagem/Calendar.png"))); // NOI18N
        LabelCalendario.setText("jLabel3");
        PainelDeTitulo.add(LabelCalendario);
        LabelCalendario.setBounds(10, 0, 70, 70);

        getContentPane().add(PainelDeTitulo);
        PainelDeTitulo.setBounds(0, 0, 1000, 80);

        ButtonAgenda.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        ButtonAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagem/ImagemCalendar_1.png"))); // NOI18N
        ButtonAgenda.setText("Agenda");
        ButtonAgenda.setToolTipText("Agenda");
        ButtonAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAgendaActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonAgenda);
        ButtonAgenda.setBounds(10, 100, 110, 27);

        ButtonPaciente.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        ButtonPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagem/Paciente.png"))); // NOI18N
        ButtonPaciente.setText("Paciente");
        ButtonPaciente.setToolTipText("Paciente");
        ButtonPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonPacienteActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonPaciente);
        ButtonPaciente.setBounds(130, 100, 110, 27);

        ButtonMédicos.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        ButtonMédicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagem/doctor.png"))); // NOI18N
        ButtonMédicos.setText("Médicos");
        ButtonMédicos.setToolTipText("Médicos");
        ButtonMédicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonMédicosActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonMédicos);
        ButtonMédicos.setBounds(250, 100, 110, 27);

        ButtonEspecialidade.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        ButtonEspecialidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagem/stethoscope.png"))); // NOI18N
        ButtonEspecialidade.setText("Especialidade");
        ButtonEspecialidade.setToolTipText("Especialidade");
        ButtonEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEspecialidadeActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonEspecialidade);
        ButtonEspecialidade.setBounds(370, 100, 140, 27);

        ButtonPlanoSaude.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        ButtonPlanoSaude.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagem/badge.png"))); // NOI18N
        ButtonPlanoSaude.setText("Plano de Saúde");
        ButtonPlanoSaude.setToolTipText("Plano de Saúde");
        ButtonPlanoSaude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonPlanoSaudeActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonPlanoSaude);
        ButtonPlanoSaude.setBounds(520, 100, 150, 30);

        ButtonSair.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        ButtonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagem/logout32.png"))); // NOI18N
        ButtonSair.setText("Sair");
        ButtonSair.setToolTipText("Sair");
        ButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSairActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonSair);
        ButtonSair.setBounds(880, 100, 110, 30);

        PainelEspecialidade.setBackground(new java.awt.Color(139, 139, 139));
        PainelEspecialidade.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Especialidades Medicas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(19, 0, 200))); // NOI18N
        PainelEspecialidade.setOpaque(false);
        PainelEspecialidade.setLayout(null);

        TableEspecialidade.setBackground(new java.awt.Color(255, 255, 255));
        TableEspecialidade.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        ScrollEspecialidades.setViewportView(TableEspecialidade);

        PainelEspecialidade.add(ScrollEspecialidades);
        ScrollEspecialidades.setBounds(20, 20, 960, 290);

        ButtonEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagem/Lapis1.png"))); // NOI18N
        ButtonEditar.setToolTipText("Editar");
        PainelEspecialidade.add(ButtonEditar);
        ButtonEditar.setBounds(850, 330, 50, 40);

        ButtonDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagem/delete32.png"))); // NOI18N
        ButtonDelete.setToolTipText("Delete");
        PainelEspecialidade.add(ButtonDelete);
        ButtonDelete.setBounds(780, 330, 50, 40);

        ButtonCriar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagem/plus32.png"))); // NOI18N
        ButtonCriar.setToolTipText("Criar Especialidade");
        PainelEspecialidade.add(ButtonCriar);
        ButtonCriar.setBounds(920, 330, 50, 40);

        getContentPane().add(PainelEspecialidade);
        PainelEspecialidade.setBounds(10, 140, 980, 390);

        setBounds(0, 0, 1014, 590);
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSairActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonSairActionPerformed

    private void ButtonAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAgendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonAgendaActionPerformed

    private void ButtonPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonPacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonPacienteActionPerformed

    private void ButtonMédicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonMédicosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonMédicosActionPerformed

    private void ButtonEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEspecialidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonEspecialidadeActionPerformed

    private void ButtonPlanoSaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonPlanoSaudeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonPlanoSaudeActionPerformed

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
            java.util.logging.Logger.getLogger(ClinicaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClinicaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClinicaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClinicaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClinicaFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAgenda;
    private javax.swing.JButton ButtonCriar;
    private javax.swing.JButton ButtonDelete;
    private javax.swing.JButton ButtonEditar;
    private javax.swing.JButton ButtonEspecialidade;
    private javax.swing.JButton ButtonMédicos;
    private javax.swing.JButton ButtonPaciente;
    private javax.swing.JButton ButtonPlanoSaude;
    private javax.swing.JButton ButtonSair;
    private javax.swing.JLabel LabelCalendario;
    private javax.swing.JLabel LabelTitulo;
    private javax.swing.JPanel PainelDeTitulo;
    private javax.swing.JPanel PainelEspecialidade;
    private javax.swing.JScrollPane ScrollEspecialidades;
    private javax.swing.JTable TableEspecialidade;
    // End of variables declaration//GEN-END:variables
}
