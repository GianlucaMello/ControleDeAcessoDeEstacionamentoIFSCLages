/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author gianl
 */
public class ViewBrand extends javax.swing.JDialog {

    /**
     * Creates new form CadMarca
     * @param parent
     * @param modal
     */
    public ViewBrand(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanelCollectionField = new javax.swing.JPanel();
        jLabelTitle = new javax.swing.JLabel();
        jTextFieldId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldName = new javax.swing.JTextField();
        jButtonNew = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();
        jButtonSave = new javax.swing.JButton();
        jPanelData = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldFilter = new javax.swing.JTextField();
        jButtonApplyFilter = new javax.swing.JButton();
        jButtonCleanFilter = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableMarca = new javax.swing.JTable();
        jButtonEdit = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jButtonClose = new javax.swing.JButton();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 400));

        jPanelCollectionField.setBackground(java.awt.SystemColor.activeCaption);

        jLabelTitle.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitle.setText("Brand Management");

        jTextFieldId.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jTextFieldId.setEnabled(false);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel3.setText("Id:");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel2.setText("Name:");

        jTextFieldName.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jTextFieldName.setEnabled(false);

        jButtonNew.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jButtonNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Button-Add-icon.png"))); // NOI18N
        jButtonNew.setText("New");

        jButtonCancel.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jButtonCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Block-icon.png"))); // NOI18N
        jButtonCancel.setText("Cancel");
        jButtonCancel.setToolTipText("");
        jButtonCancel.setEnabled(false);

        jButtonSave.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jButtonSave.setIcon(new javax.swing.ImageIcon("C:\\Users\\gianl\\Documents\\NetBeansProjects\\FinalProject\\icons\\Ok-icon.png")); // NOI18N
        jButtonSave.setText("Save");
        jButtonSave.setEnabled(false);

        javax.swing.GroupLayout jPanelCollectionFieldLayout = new javax.swing.GroupLayout(jPanelCollectionField);
        jPanelCollectionField.setLayout(jPanelCollectionFieldLayout);
        jPanelCollectionFieldLayout.setHorizontalGroup(
            jPanelCollectionFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCollectionFieldLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCollectionFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelCollectionFieldLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldName))
                    .addGroup(jPanelCollectionFieldLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jButtonNew)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonCancel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(58, 58, 58)))
                .addContainerGap())
        );
        jPanelCollectionFieldLayout.setVerticalGroup(
            jPanelCollectionFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCollectionFieldLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCollectionFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCollectionFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCollectionFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCancel)
                    .addComponent(jButtonNew)
                    .addComponent(jButtonSave))
                .addContainerGap())
        );

        jPanelData.setBackground(java.awt.SystemColor.inactiveCaption);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel4.setText("Filter:");

        jTextFieldFilter.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jTextFieldFilter.setEnabled(false);

        jButtonApplyFilter.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jButtonApplyFilter.setIcon(new javax.swing.ImageIcon("C:\\Users\\gianl\\Documents\\NetBeansProjects\\FinalProject\\icons\\Search-icon.png")); // NOI18N
        jButtonApplyFilter.setText("Apply");
        jButtonApplyFilter.setEnabled(false);

        jButtonCleanFilter.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jButtonCleanFilter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Clear-icon.png"))); // NOI18N
        jButtonCleanFilter.setText("Clean");
        jButtonCleanFilter.setEnabled(false);
        jButtonCleanFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCleanFilterActionPerformed(evt);
            }
        });

        jScrollPane2.setToolTipText("");

        jTableMarca.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jTableMarca.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Brand"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableMarca.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTableMarca.setDragEnabled(true);
        jTableMarca.setEnabled(false);
        jTableMarca.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTableMarca);

        jButtonEdit.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jButtonEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/pencil-icon.png"))); // NOI18N
        jButtonEdit.setText("Edit");
        jButtonEdit.setEnabled(false);

        jButtonDelete.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jButtonDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Close-icon.png"))); // NOI18N
        jButtonDelete.setText("Delete");
        jButtonDelete.setEnabled(false);

        jButtonClose.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jButtonClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/logout-icon.png"))); // NOI18N
        jButtonClose.setText("Back");

        javax.swing.GroupLayout jPanelDataLayout = new javax.swing.GroupLayout(jPanelData);
        jPanelData.setLayout(jPanelDataLayout);
        jPanelDataLayout.setHorizontalGroup(
            jPanelDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDataLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanelDataLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldFilter)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonApplyFilter)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonCleanFilter)))
                .addContainerGap())
            .addGroup(jPanelDataLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jButtonEdit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonDelete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonClose)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelDataLayout.setVerticalGroup(
            jPanelDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDataLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldFilter, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jButtonApplyFilter)
                        .addComponent(jButtonCleanFilter)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonEdit)
                    .addComponent(jButtonDelete)
                    .addComponent(jButtonClose))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelCollectionField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelCollectionField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCleanFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCleanFilterActionPerformed

    }//GEN-LAST:event_jButtonCleanFilterActionPerformed

    

    
    public JButton getjButtonCancel() {
        return jButtonCancel;
    }

    public JButton getjButtonClose() {
        return jButtonClose;
    }
    

    public JButton getjButtonNew() {
        return jButtonNew;
    }

    public JButton getjButtonApplyFilter() {
        return jButtonApplyFilter;
    }

    public JButton getjButtonCleanFilter() {
        return jButtonCleanFilter;
    }

    public JButton getjButtonDelete() {
        return jButtonDelete;
    }

    public JButton getjButtonEdit() {
        return jButtonEdit;
    }

    public JPanel getjPanelCollectionField() {
        return jPanelCollectionField;
    }

    public JPanel getjPanelData() {
        return jPanelData;
    }
    

    public JTable getjTableBrand() {
        return jTableMarca;
    }

    public JTextField getjTextFieldFilter() {
        return jTextFieldFilter;
    }

    public JTextField getjTextFieldId() {
        return jTextFieldId;
    }

    public JButton getjButtonSave() {
        return jButtonSave;
    }

    public JTextField getjTextFieldName() {
        return jTextFieldName;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonApplyFilter;
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonCleanFilter;
    private javax.swing.JButton jButtonClose;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonEdit;
    private javax.swing.JButton jButtonNew;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JPanel jPanelCollectionField;
    private javax.swing.JPanel jPanelData;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableMarca;
    private javax.swing.JTextField jTextFieldFilter;
    private javax.swing.JTextField jTextFieldId;
    private javax.swing.JTextField jTextFieldName;
    // End of variables declaration//GEN-END:variables
}