/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lejeuloto;

import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author yann
 */
public class LeJeuLoto extends javax.swing.JFrame {
    private int option;
    private int nbCol = 5;
    private int nbNum = 10;
    private LesJoueurs lj; //Objet lesJoueurs contenant les joueurs
    private int[] boules;
    private String historique;
    
    /**
     * Creates new form Frame
     */
    public LeJeuLoto() {
        boules = new int[CarteLoto.valMax];
        lj = new LesJoueurs(); //on instancie l'objet
        initComponents(); //on crée les composants de l'interface
        initJoueurs(); //on crée deux joueurs
        initBoules(); //on remplit le tableau des boules avec des 0.
        afficheCartes();
        TirageButton.setEnabled(false);
        historique = "-";
        option = 1;
    }
    
    public void initJoueurs(){
        Joueur j1 = new Joueur(); //on instancie le 1er joueur
        Joueur j2 = new Joueur(); //on instancie le 2e joueur
        Joueur j3 = new Joueur(); //on instancie le 3e joueur
        j1.setPseudo("Elis");  //on modifie le pseudo de j1 comme étant Ellis
        j2.setPseudo("Bob");//on modifie le pseudo de j2 comme étant Bob
        j3.setPseudo("Momo");//on modifie le pseudo de j3 comme étant Momo
        j1.setCouleur(Color.red); //on modifie la couleur du j1 comme étant du rouge
        j2.setCouleur(Color.blue);//on modifie la couleur du j2 comme étant du bleu
        j3.setCouleur(Color.green);//on modifie la couleur du j3 comme étant du vert
        lj.ajouteJoueur(j1); //on ajoute j1 à lj
        lj.ajouteJoueur(j2);//on ajoute j2 à lj
        lj.ajouteJoueur(j3);//on ajoute j3 à lj
        updateButtons(); //on actualise les boutons
    }
    
    public void initBoules(){
        for (int i = 0; i < CarteLoto.valMax; i++){
            boules[i] = 0;
        }
    }
    
    public void updateButtons(){
        if (lj.getJoueur(0) != null){
            //si le joueur 1 existe
            buttonJ1.setBackground(lj.getJoueur(0).getCouleur());
            //on change la couleur du bouton comme étant celle stockée par le joueur 
            buttonJ1.setText(lj.getJoueur(0).getPseudo());
            //on change le texte du bouton comme étant le pseudo du joueur
        }
        if (lj.getJoueur(1) != null){
            buttonJ2.setBackground(lj.getJoueur(1).getCouleur());
            buttonJ2.setText(lj.getJoueur(1).getPseudo());
        }
        if (lj.getJoueur(2) != null){
            buttonJ3.setBackground(lj.getJoueur(2).getCouleur());
            buttonJ3.setText(lj.getJoueur(2).getPseudo());
        }
        if (lj.getJoueur(3) != null){
            buttonJ4.setBackground(lj.getJoueur(3).getCouleur());
            buttonJ4.setText(lj.getJoueur(3).getPseudo());
        }
        
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
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        East = new javax.swing.JPanel();
        buttonJ1 = new javax.swing.JButton();
        buttonJ2 = new javax.swing.JButton();
        buttonJ3 = new javax.swing.JButton();
        buttonJ4 = new javax.swing.JButton();
        South = new javax.swing.JPanel();
        S_North = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        S_West = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        HistoTextArea = new javax.swing.JTextArea();
        S_East = new javax.swing.JPanel();
        OptionLabel = new javax.swing.JLabel();
        TiragePanel = new javax.swing.JPanel();
        TirageButton = new javax.swing.JButton();
        TirageLabel = new javax.swing.JLabel();
        ArretTirageButton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        AjoutMenu = new javax.swing.JMenu();
        AddJoueurMenuItem = new javax.swing.JMenuItem();
        AddLotMenuItem = new javax.swing.JMenuItem();
        ActionMenu = new javax.swing.JMenu();
        OptionMenuItem = new javax.swing.JMenuItem();
        StartMenuItem = new javax.swing.JMenuItem();
        AchatCarteMenuItem = new javax.swing.JMenuItem();
        ContinuerMenuItem = new javax.swing.JMenuItem();
        NewGameMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Voici les cartes dont vous disposez");
        North.add(jLabel1);

        getContentPane().add(North, java.awt.BorderLayout.NORTH);

        Center.setLayout(new java.awt.GridLayout(4, 2, 10, 10));
        Center.add(jPanel2);
        Center.add(jPanel3);
        Center.add(jPanel4);
        Center.add(jPanel5);
        Center.add(jPanel6);
        Center.add(jPanel7);
        Center.add(jPanel8);
        Center.add(jPanel9);

        getContentPane().add(Center, java.awt.BorderLayout.CENTER);

        East.setLayout(new java.awt.GridLayout(4, 1, 0, 10));

        buttonJ1.setText("Joueur 1");
        buttonJ1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonJ1ActionPerformed(evt);
            }
        });
        East.add(buttonJ1);

        buttonJ2.setText("Joueur 2");
        buttonJ2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonJ2ActionPerformed(evt);
            }
        });
        East.add(buttonJ2);

        buttonJ3.setText("Joueur 3");
        buttonJ3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonJ3ActionPerformed(evt);
            }
        });
        East.add(buttonJ3);

        buttonJ4.setText("Joueur 4");
        buttonJ4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonJ4ActionPerformed(evt);
            }
        });
        East.add(buttonJ4);

        getContentPane().add(East, java.awt.BorderLayout.EAST);

        South.setLayout(new java.awt.BorderLayout());

        jLabel2.setText("Cadeau: Lave Linge");
        S_North.add(jLabel2);

        South.add(S_North, java.awt.BorderLayout.NORTH);

        S_West.setLayout(new java.awt.BorderLayout());

        jLabel3.setText("Historique du tirage des boules");
        S_West.add(jLabel3, java.awt.BorderLayout.NORTH);

        HistoTextArea.setColumns(20);
        HistoTextArea.setRows(5);
        jScrollPane1.setViewportView(HistoTextArea);

        S_West.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        South.add(S_West, java.awt.BorderLayout.WEST);

        S_East.setLayout(new java.awt.BorderLayout());

        OptionLabel.setText("Option Choisie : Quine");
        S_East.add(OptionLabel, java.awt.BorderLayout.NORTH);

        TiragePanel.setLayout(new java.awt.GridLayout(1, 3));

        TirageButton.setText("Tirage");
        TirageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TirageButtonActionPerformed(evt);
            }
        });
        TiragePanel.add(TirageButton);
        TiragePanel.add(TirageLabel);

        ArretTirageButton.setText("Arreter");
        TiragePanel.add(ArretTirageButton);

        S_East.add(TiragePanel, java.awt.BorderLayout.CENTER);

        South.add(S_East, java.awt.BorderLayout.EAST);

        getContentPane().add(South, java.awt.BorderLayout.SOUTH);

        AjoutMenu.setText("Ajout");

        AddJoueurMenuItem.setText("Joueur");
        AddJoueurMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddJoueurMenuItemActionPerformed(evt);
            }
        });
        AjoutMenu.add(AddJoueurMenuItem);

        AddLotMenuItem.setText("Lot");
        AjoutMenu.add(AddLotMenuItem);

        jMenuBar1.add(AjoutMenu);

        ActionMenu.setText("Action");

        OptionMenuItem.setText("Options du jeu");
        OptionMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OptionMenuItemActionPerformed(evt);
            }
        });
        ActionMenu.add(OptionMenuItem);

        StartMenuItem.setText("Démarrer le jeu");
        StartMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartMenuItemActionPerformed(evt);
            }
        });
        ActionMenu.add(StartMenuItem);

        AchatCarteMenuItem.setText("Acheter des cartes");
        AchatCarteMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AchatCarteMenuItemActionPerformed(evt);
            }
        });
        ActionMenu.add(AchatCarteMenuItem);

        ContinuerMenuItem.setText("Continuer");
        ActionMenu.add(ContinuerMenuItem);

        NewGameMenuItem.setText("Nouvelle partie");
        NewGameMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewGameMenuItemActionPerformed(evt);
            }
        });
        ActionMenu.add(NewGameMenuItem);

        jMenuBar1.add(ActionMenu);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OptionMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OptionMenuItemActionPerformed
        OptionsDlg dlg = new OptionsDlg(this, true, false, 5, 8);
        dlg.setVisible(true);
        nbCol = dlg.getNbCol();
        nbNum = dlg.getNbNum();
        option = dlg.getChoixOpt();
        if (option == 1){
            OptionLabel.setText("Option choisie: Quine");
        }
        if (option == 2){
            OptionLabel.setText("Option choisie: Double Quine");
        }
        if (option == 3){
            OptionLabel.setText("Option choisie: Carton Plein");
        }
    }//GEN-LAST:event_OptionMenuItemActionPerformed

    private void AddJoueurMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddJoueurMenuItemActionPerformed
        if (lj.getNbJoueur() < 4){
            //si il y a moins de 4 joueurs
            AjoutJoueurDlg dlg = new AjoutJoueurDlg(this, true);
            //on crée une fenêtre de dialogue
            dlg.setVisible(true);
            //on affiche la fenêtre.
            if (dlg.getOk() == true){
                //si l'utilisateur a cliqué sur valider
                lj.ajouteJoueur(dlg.getJoueur());
                //on récupère le joueur crée par la fenêtre de dialogue et on l'ajoute à lj.
            }
            updateButtons();
            //on met a jour les boutons.
        }
    }//GEN-LAST:event_AddJoueurMenuItemActionPerformed

    private void buttonJ1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonJ1ActionPerformed
        if (lj.getJoueur(0) != null){ //Si Le joueur 1 existe
            //on crée une Fenêtre de dialogue affichant ses attributs.
            VisuJoueurDlg dlg = new VisuJoueurDlg(this, true, lj.getJoueur(0));
            dlg.setVisible(true); //on affiche a fenêtre de dialogue
        }
    }//GEN-LAST:event_buttonJ1ActionPerformed

    private void buttonJ2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonJ2ActionPerformed
        if (lj.getJoueur(1) != null){ //Si Le joueur 1 existe
            //on crée une Fenêtre de dialogue affichant ses attributs.
            VisuJoueurDlg dlg = new VisuJoueurDlg(this, true, lj.getJoueur(1));
            dlg.setVisible(true); //on affiche a fenêtre de dialogue
        }
    }//GEN-LAST:event_buttonJ2ActionPerformed

    private void buttonJ3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonJ3ActionPerformed
        if (lj.getJoueur(2) != null){ //Si Le joueur 1 existe
            //on crée une Fenêtre de dialogue affichant ses attributs.
            VisuJoueurDlg dlg = new VisuJoueurDlg(this, true, lj.getJoueur(2));
            dlg.setVisible(true); //on affiche a fenêtre de dialogue
        }
    }//GEN-LAST:event_buttonJ3ActionPerformed

    private void buttonJ4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonJ4ActionPerformed
        if (lj.getJoueur(3) != null){ //Si Le joueur 1 existe
            //on crée une Fenêtre de dialogue affichant ses attributs.
            VisuJoueurDlg dlg = new VisuJoueurDlg(this, true, lj.getJoueur(3));
            dlg.setVisible(true); //on affiche a fenêtre de dialogue
        }
    }//GEN-LAST:event_buttonJ4ActionPerformed

    private void AchatCarteMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AchatCarteMenuItemActionPerformed
        AchatCarteDlg dlg = new AchatCarteDlg(this, true, lj, 3, nbCol, nbNum);
        dlg.setVisible(true);
        if (dlg.isAchat()){
            afficheCartes();
        }
    }//GEN-LAST:event_AchatCarteMenuItemActionPerformed

    private void TirageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TirageButtonActionPerformed
        boolean found;
        int value;
        
        //crée un chiffre unique en prenant compte des précédents.
        do{
            value = (int)(1+Math.random() * (CarteLoto.valMax - 1));
            
        }while (boules[value] == 1);
        
        TirageLabel.setText(""+value);
        boules[value] = 1;
        historique = historique + ", "+ value;
        HistoTextArea.setText(historique);
        
        found = false;
        LesCartes output;
        for (int i = 0; i < lj.getNbJoueur(); i++){
            LesCartes lc = lj.getJoueur(i).getMesCartes();
            output = lc.rechCartes(value);
            if (output.getTaille() != 0){
                found = true;
                System.out.println(output.getTaille());
                //Si le numéro a été trouvé dans au moins une carte
            }
        }
        
        afficheCartes();
        
        if (found == true){
            LesJoueurs gagnants = new LesJoueurs();
            for (int i = 0; i < lj.getNbJoueur(); i++){
                Joueur j = lj.getJoueur(i);
                LesCartes lc = j.getMesCartes();
                System.out.println(lc.getTaille());
                CarteLoto cl = lc.getCarte(0);
                if (cl != null){
                    if (cl.estCartonGagnant(option)){
                    gagnants.ajouteJoueur(lj.getJoueur(i));
                }
                }
                
            }
            if (gagnants.getNbJoueur() > 0){
                if (gagnants.getNbJoueur() < 2){
                    jLabel2.setText(gagnants.getJoueur(0).getPseudo()+" gagne ! "+ jLabel2.getText());
                }
                else{
                    if (gagnants.getNbJoueur() >= 2){
                        int gagnant = (int)(1+gagnants.getNbJoueur() * Math.random());
                        jLabel2.setText(gagnants.getJoueur(gagnant).getPseudo()+" gagne ! "+ jLabel2.getText());
                    }
                }
                TirageButton.setEnabled(false);
            }
        }
        
    }//GEN-LAST:event_TirageButtonActionPerformed

    private void StartMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartMenuItemActionPerformed
        boolean demarrage = true;
        if (lj.getNbJoueur() >= 2){
            for (int i = 0; i < lj.getNbJoueur(); i++){
                if (lj.getJoueur(i).getMesCartes().getCarte(0) == null){
                    demarrage = false;
                }
            }
        }else{
            demarrage = false;
        }
        if (demarrage == true){
            TirageButton.setEnabled(true);
        }
    }//GEN-LAST:event_StartMenuItemActionPerformed

    private void NewGameMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewGameMenuItemActionPerformed
        historique = "-";
        for (int i = 0; i < lj.getNbJoueur(); i++){
            lj.getJoueur(i).getMesCartes().retireCartes();
        }
    }//GEN-LAST:event_NewGameMenuItemActionPerformed
    
    public void afficheCartes(){
        int cpt = 0;
        for (int i = 0; i < lj.getNbJoueur(); i++){
            int nbCartesJoueur = lj.getJoueur(i).getMesCartes().getTaille();
            
            switch (nbCartesJoueur){
                case 0:
                    cpt = cpt + 2;
                    
                    break;
                case 1:
                    
                    JPanel jp = (JPanel)(Center.getComponent(cpt));
                    cpt++;
                    lj.getJoueur(i).getMesCartes().getCarte(0).dessineCarte(jp, lj.getJoueur(i).getCouleur());
                    cpt++;
                    break;
                case 2:
                    JPanel jp1 = (JPanel)(Center.getComponent(cpt));
                    
                    cpt++;
                    lj.getJoueur(i).getMesCartes().getCarte(0).dessineCarte(jp1, lj.getJoueur(i).getCouleur());
                    JPanel jp2 = (JPanel)(Center.getComponent(cpt));
                    
                    cpt++;
                    lj.getJoueur(i).getMesCartes().getCarte(1).dessineCarte(jp2, lj.getJoueur(i).getCouleur());
                    break;
            }
        }
        this.pack();
    }
    
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
            java.util.logging.Logger.getLogger(LeJeuLoto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LeJeuLoto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LeJeuLoto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LeJeuLoto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                LeJeuLoto ljl = new LeJeuLoto();
                ljl.setSize(800, 600);
                ljl.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AchatCarteMenuItem;
    private javax.swing.JMenu ActionMenu;
    private javax.swing.JMenuItem AddJoueurMenuItem;
    private javax.swing.JMenuItem AddLotMenuItem;
    private javax.swing.JMenu AjoutMenu;
    private javax.swing.JButton ArretTirageButton;
    private javax.swing.JPanel Center;
    private javax.swing.JMenuItem ContinuerMenuItem;
    private javax.swing.JPanel East;
    private javax.swing.JTextArea HistoTextArea;
    private javax.swing.JMenuItem NewGameMenuItem;
    private javax.swing.JPanel North;
    private javax.swing.JLabel OptionLabel;
    private javax.swing.JMenuItem OptionMenuItem;
    private javax.swing.JPanel S_East;
    private javax.swing.JPanel S_North;
    private javax.swing.JPanel S_West;
    private javax.swing.JPanel South;
    private javax.swing.JMenuItem StartMenuItem;
    private javax.swing.JButton TirageButton;
    private javax.swing.JLabel TirageLabel;
    private javax.swing.JPanel TiragePanel;
    private javax.swing.JButton buttonJ1;
    private javax.swing.JButton buttonJ2;
    private javax.swing.JButton buttonJ3;
    private javax.swing.JButton buttonJ4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}