/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vue;

import modele.Ecole;

import java.awt.Color;

/**
 *
 * @author louiscauquelin
 */
public class Index extends javax.swing.JFrame {

    /**
     * Creates new form index
     */
    public Index() {
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

        mainPanel = new javax.swing.JPanel();
        itemMenu = new javax.swing.JPanel();
        homeBtn = new javax.swing.JPanel();
        homeIcon = new javax.swing.JLabel();
        homeText = new javax.swing.JLabel();
        indexBtn = new javax.swing.JPanel();
        searchIcon = new javax.swing.JLabel();
        searchText = new javax.swing.JLabel();
        classroomBtn = new javax.swing.JPanel();
        classroomIcon = new javax.swing.JLabel();
        classroomText = new javax.swing.JLabel();
        reportBtn = new javax.swing.JPanel();
        reportIcon = new javax.swing.JLabel();
        reportText = new javax.swing.JLabel();
        inscriptionBtn = new javax.swing.JPanel();
        classroomIcon1 = new javax.swing.JLabel();
        classroomText1 = new javax.swing.JLabel();
        infoBtn = new javax.swing.JPanel();
        reportIcon2 = new javax.swing.JLabel();
        reportText2 = new javax.swing.JLabel();
        addGrade = new javax.swing.JPanel();
        addGradeIcon = new javax.swing.JLabel();
        addGradeText = new javax.swing.JLabel();
        rightPanel = new javax.swing.JPanel();
        topPanel = new javax.swing.JPanel();
        anneeBox = new javax.swing.JComboBox<>();
        anneeText = new javax.swing.JLabel();
        peopleTable = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        tableText = new javax.swing.JLabel();
        titleSeparator = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1015, 543));

        itemMenu.setBackground(new java.awt.Color(243, 249, 255));

        homeBtn.setBackground(new java.awt.Color(234, 251, 255));

        homeIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        homeIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vue/images/home.png"))); // NOI18N

        homeText.setFont(new java.awt.Font("Noteworthy", 1, 18)); // NOI18N
        homeText.setForeground(new java.awt.Color(86, 98, 112));
        homeText.setText("Tableau de bord");

        javax.swing.GroupLayout homeBtnLayout = new javax.swing.GroupLayout(homeBtn);
        homeBtn.setLayout(homeBtnLayout);
        homeBtnLayout.setHorizontalGroup(
            homeBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(homeIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(homeText)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        homeBtnLayout.setVerticalGroup(
            homeBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(homeIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homeBtnLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(homeText)
                .addGap(16, 16, 16))
        );

        indexBtn.setBackground(new java.awt.Color(243, 249, 255));
        indexBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                indexBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                indexBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                indexBtnMouseExited(evt);
            }
        });

        searchIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        searchIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vue/images/index.png"))); // NOI18N
        searchIcon.setAlignmentY(0.0F);

        searchText.setFont(new java.awt.Font("Noteworthy", 1, 18)); // NOI18N
        searchText.setForeground(new java.awt.Color(86, 98, 112));
        searchText.setText("Éleves/Professeurs");
        searchText.setAlignmentY(0.0F);

        javax.swing.GroupLayout indexBtnLayout = new javax.swing.GroupLayout(indexBtn);
        indexBtn.setLayout(indexBtnLayout);
        indexBtnLayout.setHorizontalGroup(
            indexBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(indexBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(searchIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchText)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        indexBtnLayout.setVerticalGroup(
            indexBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(indexBtnLayout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addGroup(indexBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, indexBtnLayout.createSequentialGroup()
                        .addComponent(searchText)
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, indexBtnLayout.createSequentialGroup()
                        .addComponent(searchIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        classroomBtn.setBackground(new java.awt.Color(243, 249, 255));
        classroomBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt,Ecole ece) {
                classroomBtnMouseClicked(evt,ece);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                classroomBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                classroomBtnMouseExited(evt);
            }
        });

        classroomIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        classroomIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vue/images/class.png"))); // NOI18N
        classroomIcon.setAlignmentY(0.0F);

        classroomText.setFont(new java.awt.Font("Noteworthy", 1, 18)); // NOI18N
        classroomText.setForeground(new java.awt.Color(86, 98, 112));
        classroomText.setText("Classes");
        classroomText.setAlignmentY(0.0F);

        javax.swing.GroupLayout classroomBtnLayout = new javax.swing.GroupLayout(classroomBtn);
        classroomBtn.setLayout(classroomBtnLayout);
        classroomBtnLayout.setHorizontalGroup(
            classroomBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(classroomBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(classroomIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(classroomText)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        classroomBtnLayout.setVerticalGroup(
            classroomBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(classroomBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(classroomIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, classroomBtnLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(classroomText)
                .addGap(16, 16, 16))
        );

        reportBtn.setBackground(new java.awt.Color(243, 249, 255));
        reportBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reportBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                reportBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                reportBtnMouseExited(evt);
            }
        });

        reportIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reportIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vue/images/report.png"))); // NOI18N
        reportIcon.setAlignmentY(0.0F);

        reportText.setFont(new java.awt.Font("Noteworthy", 1, 18)); // NOI18N
        reportText.setForeground(new java.awt.Color(86, 98, 112));
        reportText.setText("Statistiques");
        reportText.setAlignmentY(0.0F);

        javax.swing.GroupLayout reportBtnLayout = new javax.swing.GroupLayout(reportBtn);
        reportBtn.setLayout(reportBtnLayout);
        reportBtnLayout.setHorizontalGroup(
            reportBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reportBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(reportIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reportText)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        reportBtnLayout.setVerticalGroup(
            reportBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reportBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(reportIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, reportBtnLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(reportText)
                .addGap(16, 16, 16))
        );

        inscriptionBtn.setBackground(new java.awt.Color(243, 249, 255));
        inscriptionBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt, Ecole ece) {
                inscriptionBtnMouseClicked(evt,ece);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                inscriptionBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                inscriptionBtnMouseExited(evt);
            }
        });

        classroomIcon1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        classroomIcon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vue/images/inscription.png"))); // NOI18N
        classroomIcon1.setAlignmentY(0.0F);

        classroomText1.setFont(new java.awt.Font("Noteworthy", 1, 18)); // NOI18N
        classroomText1.setForeground(new java.awt.Color(86, 98, 112));
        classroomText1.setText("Inscription");
        classroomText1.setAlignmentY(0.0F);

        javax.swing.GroupLayout inscriptionBtnLayout = new javax.swing.GroupLayout(inscriptionBtn);
        inscriptionBtn.setLayout(inscriptionBtnLayout);
        inscriptionBtnLayout.setHorizontalGroup(
            inscriptionBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inscriptionBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(classroomIcon1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(classroomText1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        inscriptionBtnLayout.setVerticalGroup(
            inscriptionBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inscriptionBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(classroomIcon1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inscriptionBtnLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(classroomText1)
                .addGap(16, 16, 16))
        );

        infoBtn.setBackground(new java.awt.Color(243, 249, 255));
        infoBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                infoBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                infoBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                infoBtnMouseExited(evt);
            }
        });

        reportIcon2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reportIcon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vue/images/info.png"))); // NOI18N
        reportIcon2.setAlignmentY(0.0F);

        reportText2.setFont(new java.awt.Font("Noteworthy", 1, 18)); // NOI18N
        reportText2.setForeground(new java.awt.Color(86, 98, 112));
        reportText2.setText("Informations");
        reportText2.setAlignmentY(0.0F);

        javax.swing.GroupLayout infoBtnLayout = new javax.swing.GroupLayout(infoBtn);
        infoBtn.setLayout(infoBtnLayout);
        infoBtnLayout.setHorizontalGroup(
            infoBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(reportIcon2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reportText2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        infoBtnLayout.setVerticalGroup(
            infoBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(reportIcon2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, infoBtnLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(reportText2)
                .addGap(16, 16, 16))
        );

        addGrade.setBackground(new java.awt.Color(243, 249, 255));
        addGrade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addGradeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addGradeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addGradeMouseExited(evt);
            }
        });

        addGradeIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addGradeIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vue/images/addGrade.png"))); // NOI18N
        addGradeIcon.setAlignmentY(0.0F);

        addGradeText.setFont(new java.awt.Font("Noteworthy", 1, 18)); // NOI18N
        addGradeText.setForeground(new java.awt.Color(86, 98, 112));
        addGradeText.setText("Ajouter Note");
        addGradeText.setAlignmentY(0.0F);

        javax.swing.GroupLayout addGradeLayout = new javax.swing.GroupLayout(addGrade);
        addGrade.setLayout(addGradeLayout);
        addGradeLayout.setHorizontalGroup(
            addGradeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addGradeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addGradeIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addGradeText)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        addGradeLayout.setVerticalGroup(
            addGradeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addGradeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addGradeIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addGradeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addGradeText)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout itemMenuLayout = new javax.swing.GroupLayout(itemMenu);
        itemMenu.setLayout(itemMenuLayout);
        itemMenuLayout.setHorizontalGroup(
            itemMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(homeBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(classroomBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(reportBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, itemMenuLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(itemMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(indexBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inscriptionBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addComponent(infoBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(itemMenuLayout.createSequentialGroup()
                .addComponent(addGrade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        itemMenuLayout.setVerticalGroup(
            itemMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(itemMenuLayout.createSequentialGroup()
                .addComponent(homeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(indexBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inscriptionBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(classroomBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addGrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reportBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(infoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        rightPanel.setBackground(new java.awt.Color(255, 255, 255));

        topPanel.setBackground(new java.awt.Color(241, 241, 241));

        anneeBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        anneeText.setFont(new java.awt.Font("Noteworthy", 0, 16)); // NOI18N
        anneeText.setText("Année scolaire :");

        javax.swing.GroupLayout topPanelLayout = new javax.swing.GroupLayout(topPanel);
        topPanel.setLayout(topPanelLayout);
        topPanelLayout.setHorizontalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addGap(690, 690, 690)
                .addComponent(anneeBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(topPanelLayout.createSequentialGroup()
                .addGap(600, 600, 600)
                .addComponent(anneeText))
        );
        topPanelLayout.setVerticalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(anneeBox, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(anneeText, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Nom", "Prénom", "Classe", "Action"
            }
        ));
        peopleTable.setViewportView(table);

        tableText.setFont(new java.awt.Font("Noteworthy", 1, 18)); // NOI18N
        tableText.setForeground(new java.awt.Color(86, 98, 112));
        tableText.setText("Liste des professeurs et élèves de l'établissement");

        javax.swing.GroupLayout rightPanelLayout = new javax.swing.GroupLayout(rightPanel);
        rightPanel.setLayout(rightPanelLayout);
        rightPanelLayout.setHorizontalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(topPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(rightPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titleSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(peopleTable, javax.swing.GroupLayout.PREFERRED_SIZE, 761, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tableText))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        rightPanelLayout.setVerticalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightPanelLayout.createSequentialGroup()
                .addComponent(topPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(tableText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(titleSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(peopleTable, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(itemMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(215, 215, 215)
                .addComponent(rightPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(rightPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(itemMenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void indexBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_indexBtnMouseClicked
        new Index().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_indexBtnMouseClicked

    private void indexBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_indexBtnMouseEntered
        indexBtn.setBackground(new Color(234,251,255));
    }//GEN-LAST:event_indexBtnMouseEntered

    private void indexBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_indexBtnMouseExited
        indexBtn.setBackground(new Color(243,249,255));
    }//GEN-LAST:event_indexBtnMouseExited

    private void classroomBtnMouseClicked(java.awt.event.MouseEvent evt, Ecole ece) {//GEN-FIRST:event_classroomBtnMouseClicked
        new Classes(ece).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_classroomBtnMouseClicked

    private void classroomBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_classroomBtnMouseEntered
        classroomBtn.setBackground(new Color(234,251,255));
    }//GEN-LAST:event_classroomBtnMouseEntered

    private void classroomBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_classroomBtnMouseExited
        classroomBtn.setBackground(new Color(243,249,255));
    }//GEN-LAST:event_classroomBtnMouseExited

    private void reportBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportBtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_reportBtnMouseClicked

    private void reportBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportBtnMouseEntered
        reportBtn.setBackground(new Color(234,251,255));
    }//GEN-LAST:event_reportBtnMouseEntered

    private void reportBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportBtnMouseExited
        reportBtn.setBackground(new Color(243,249,255));
    }//GEN-LAST:event_reportBtnMouseExited

    private void inscriptionBtnMouseClicked(java.awt.event.MouseEvent evt, Ecole ece) {//GEN-FIRST:event_inscriptionBtnMouseClicked
        new Inscription(ece).setVisible(true);
    }//GEN-LAST:event_inscriptionBtnMouseClicked

    private void inscriptionBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inscriptionBtnMouseEntered
        inscriptionBtn.setBackground(new Color(234,251,255));
    }//GEN-LAST:event_inscriptionBtnMouseEntered

    private void inscriptionBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inscriptionBtnMouseExited
        inscriptionBtn.setBackground(new Color(243,249,255));
    }//GEN-LAST:event_inscriptionBtnMouseExited

    private void infoBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_infoBtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_infoBtnMouseClicked

    private void infoBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_infoBtnMouseEntered
        infoBtn.setBackground(new Color(234,251,255));
    }//GEN-LAST:event_infoBtnMouseEntered

    private void infoBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_infoBtnMouseExited
        infoBtn.setBackground(new Color(243,249,255));
    }//GEN-LAST:event_infoBtnMouseExited

    private void addGradeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addGradeMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_addGradeMouseClicked

    private void addGradeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addGradeMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_addGradeMouseEntered

    private void addGradeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addGradeMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_addGradeMouseExited

    /**
     * @param args the command line arguments
     */
  //  public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
/*        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
      //  java.awt.EventQueue.invokeLater(new Runnable() {
        //    public void run() {
        //        new Index().setVisible(true);
          //  }
       // });
   // }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel addGrade;
    private javax.swing.JLabel addGradeIcon;
    private javax.swing.JLabel addGradeText;
    private javax.swing.JComboBox<String> anneeBox;
    private javax.swing.JLabel anneeText;
    private javax.swing.JPanel classroomBtn;
    private javax.swing.JLabel classroomIcon;
    private javax.swing.JLabel classroomIcon1;
    private javax.swing.JLabel classroomText;
    private javax.swing.JLabel classroomText1;
    private javax.swing.JPanel homeBtn;
    private javax.swing.JLabel homeIcon;
    private javax.swing.JLabel homeText;
    private javax.swing.JPanel indexBtn;
    private javax.swing.JPanel infoBtn;
    private javax.swing.JPanel inscriptionBtn;
    private javax.swing.JPanel itemMenu;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JScrollPane peopleTable;
    private javax.swing.JPanel reportBtn;
    private javax.swing.JLabel reportIcon;
    private javax.swing.JLabel reportIcon2;
    private javax.swing.JLabel reportText;
    private javax.swing.JLabel reportText2;
    private javax.swing.JPanel rightPanel;
    private javax.swing.JLabel searchIcon;
    private javax.swing.JLabel searchText;
    private javax.swing.JTable table;
    private javax.swing.JLabel tableText;
    private javax.swing.JSeparator titleSeparator;
    private javax.swing.JPanel topPanel;
    // End of variables declaration//GEN-END:variables
}
