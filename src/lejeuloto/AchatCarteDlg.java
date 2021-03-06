/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lejeuloto;

import java.awt.GridLayout;
import javax.swing.JButton;

/**
 *
 * @author yann
 */
public class AchatCarteDlg extends javax.swing.JDialog {
    private LesJoueurs ljc;
    private int nbCol, nbLig, nbNum;
    private Joueur jc;
    private CarteLoto cc;
    private boolean achat;
    /**
     * Creates new form AchatCarteDlg
     */
    public AchatCarteDlg(java.awt.Frame parent, boolean modal, LesJoueurs lj, int nblig, int nbcol, int nbnum) {
        super(parent, modal);
        initComponents();
        this.ljc = lj;
        this.nbCol = nbcol;
        this.nbLig = nblig;
        this.nbNum = nbnum;
        this.achat = false;
        this.jc = ljc.getJoueur(0);
        this.cc = new CarteLoto(nbCol, nbNum);
        remplirListeJoueurs();
        JoueurLabel.setText(jc.getPseudo()+" dispose de "+jc.getSolde());
        initCarte();
        afficheCarte();
    }
    
    public void initCarte(){
        Center.setLayout(new GridLayout(nbLig, nbCol));
        for (int i = 0; i < nbCol * nbLig; i++){
            Center.add(new JButton(""));
        }
    }
    
    public void afficheCarte(){
        int[][] t = cc.getTab();
        for (int i = 0; i < nbCol; i++){
            for (int j = 0; j < nbLig; j++){
                JButton jb = (JButton)(Center.getComponent(i+nbCol*j));
                if (t[j][i] != 0){
                    jb.setText(""+t[j][i]);
                }
                else{
                    jb.setText("");
                }
            }
        }
    }
    
    public void remplirListeJoueurs(){
        for (int i = 0; i < ljc.getNbJoueur(); i++){
            ComboBoxJoueurs.addItem(ljc.getJoueur(i).getPseudo());
        }
    }

    public boolean isAchat() {
        return achat;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        North = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Center = new javax.swing.JPanel();
        South = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        JoueurLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        ComboBoxJoueurs = new javax.swing.JComboBox<>();
        AutreChoix = new javax.swing.JButton();
        Acheter = new javax.swing.JButton();
        Quitter = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Acheter une ou plusieurs cartes");
        North.add(jLabel1);

        getContentPane().add(North, java.awt.BorderLayout.NORTH);

        javax.swing.GroupLayout CenterLayout = new javax.swing.GroupLayout(Center);
        Center.setLayout(CenterLayout);
        CenterLayout.setHorizontalGroup(
            CenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 476, Short.MAX_VALUE)
        );
        CenterLayout.setVerticalGroup(
            CenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 219, Short.MAX_VALUE)
        );

        getContentPane().add(Center, java.awt.BorderLayout.CENTER);

        South.setLayout(new java.awt.BorderLayout());

        JoueurLabel.setText("Bob dispose de 15.0€");
        jPanel1.add(JoueurLabel);

        South.add(jPanel1, java.awt.BorderLayout.CENTER);

        jPanel2.setLayout(new java.awt.GridLayout(1, 4));

        ComboBoxJoueurs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxJoueursActionPerformed(evt);
            }
        });
        jPanel2.add(ComboBoxJoueurs);

        AutreChoix.setText("Autre Choix");
        AutreChoix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AutreChoixActionPerformed(evt);
            }
        });
        jPanel2.add(AutreChoix);

        Acheter.setText("Acheter");
        Acheter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcheterActionPerformed(evt);
            }
        });
        jPanel2.add(Acheter);

        Quitter.setText("Quitter");
        Quitter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuitterActionPerformed(evt);
            }
        });
        jPanel2.add(Quitter);

        South.add(jPanel2, java.awt.BorderLayout.SOUTH);

        getContentPane().add(South, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ComboBoxJoueursActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxJoueursActionPerformed
        jc = ljc.getJoueur(ComboBoxJoueurs.getSelectedIndex());
        if (jc.getMesCartes().getTaille() == 2){
            JoueurLabel.setText("Vous avez déjà deux cartes");
            Acheter.setEnabled(false);
            
        }else{
            JoueurLabel.setText(jc.getPseudo()+" dispose de "+jc.getSolde());
            Acheter.setEnabled(true);
        }
    }//GEN-LAST:event_ComboBoxJoueursActionPerformed

    private void AcheterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AcheterActionPerformed
        if (jc.acheter(cc) && jc.getMesCartes().getTaille() < 2){
            JoueurLabel.setText(jc.getPseudo()+" dispose de "+jc.getSolde());
            achat = true;
        }
        else{
            JoueurLabel.setText("Solde insuffisant ou nombre de cartes max. atteint");
            Acheter.setEnabled(false);
        }
        cc = new CarteLoto(nbCol, nbNum);
        afficheCarte();
    }//GEN-LAST:event_AcheterActionPerformed

    private void AutreChoixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AutreChoixActionPerformed
        this.cc = new CarteLoto(nbCol, nbNum);
        afficheCarte();
    }//GEN-LAST:event_AutreChoixActionPerformed

    private void QuitterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuitterActionPerformed
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_QuitterActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Acheter;
    private javax.swing.JButton AutreChoix;
    private javax.swing.JPanel Center;
    private javax.swing.JComboBox<String> ComboBoxJoueurs;
    private javax.swing.JLabel JoueurLabel;
    private javax.swing.JPanel North;
    private javax.swing.JButton Quitter;
    private javax.swing.JPanel South;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
