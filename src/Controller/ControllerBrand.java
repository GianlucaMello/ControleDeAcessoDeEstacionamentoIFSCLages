package Controller;

import Model.bo.Brand;
import Service.ServiceBrand;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import view.ViewBrand;

public class ControllerBrand{

    private final view.ViewBrand brandView;

    public ControllerBrand(ViewBrand viewBrand) {
        this.brandView = viewBrand;
        this.brandView.getjButtonApplyFilter().addActionListener(new ActionApplyFilter());
        this.brandView.getjButtonCancel().addActionListener(new ActionCancel());
        this.brandView.getjButtonCleanFilter().addActionListener(new ActionCleanFilter());
        this.brandView.getjButtonClose().addActionListener(new ActionClose());
        this.brandView.getjButtonDelete().addActionListener(new ActionDelete());
        this.brandView.getjButtonEdit().addActionListener(new ActionEdit());
        this.brandView.getjButtonNew().addActionListener(new ActionNew());
        this.brandView.getjButtonSave().addActionListener(new ActionSave());
        fillInTable();
        enableDisableButton(true);
    }

    //Methods
    private void applyFilter() {
        TableRowSorter<DefaultTableModel> filter = new TableRowSorter<>(
                (DefaultTableModel) brandView.getjTableBrand().getModel());
        filter.setRowFilter(RowFilter.regexFilter(brandView.getjTextFieldFilter().getText()));
        brandView.getjTableBrand().setRowSorter(filter);
    }

    private void clearField() {
        this.brandView.getjTextFieldName().setText("");
        this.brandView.getjTextFieldId().setText("");
    }

    private void clearTable() {
        DefaultTableModel table = (DefaultTableModel) this.brandView.getjTableBrand().getModel();
        table.setRowCount(0);
    }

    private void deleteBrand() {
        int row = this.brandView.getjTableBrand().getSelectedRow();
        if (row < 0) {
            JFrame warning = new JFrame("Warning!");
            JOptionPane.showMessageDialog(warning, "Please select a brand to delete", "Warning!",
                    JOptionPane.WARNING_MESSAGE);
        } else {
            if (JOptionPane.showConfirmDialog(null, "Do you want to exclude the selected item?",
                    "Confirmation required!", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                int idBrand = (int) this.brandView.getjTableBrand().getValueAt(row, 0);
                ServiceBrand.Delete(idBrand);
                fillInTable();
                JOptionPane.showMessageDialog(null, "Brand excluded!", "OK!", JOptionPane.INFORMATION_MESSAGE);
                enableDisableButton(true);
            }
        }
    }

    private void editBrand() {
        int row = this.brandView.getjTableBrand().getSelectedRow();
        if (row < 0) {
            JFrame warning = new JFrame("Warning!");
            JOptionPane.showMessageDialog(warning, "Please select a brand to edit", "Warning!",
                    JOptionPane.WARNING_MESSAGE);
        } else {

            enableDisableButton(false);
            this.brandView.getjTextFieldId().setText(this.brandView.getjTableBrand().getValueAt(row, 0).toString());
            this.brandView.getjTextFieldName().setText(this.brandView.getjTableBrand().getValueAt(row, 1).toString());
        }
    }

    private void enableDisableButton(boolean estadoDoBotao) {
        if (this.brandView.getjTableBrand().getRowCount() == 0) {
            this.brandView.getjButtonApplyFilter().setEnabled(false);
            this.brandView.getjButtonCleanFilter().setEnabled(false);
            this.brandView.getjButtonEdit().setEnabled(false);
            this.brandView.getjButtonDelete().setEnabled(false);
        } else {
            this.brandView.getjButtonApplyFilter().setEnabled(true);
            this.brandView.getjButtonCleanFilter().setEnabled(true);
            this.brandView.getjButtonDelete().setEnabled(true);
            this.brandView.getjButtonEdit().setEnabled(estadoDoBotao);
        }
        this.brandView.getjButtonCancel().setEnabled(!estadoDoBotao);
        this.brandView.getjButtonNew().setEnabled(estadoDoBotao);
        this.brandView.getjButtonSave().setEnabled(!estadoDoBotao);
        enableDisableField(!estadoDoBotao);
    }

    private void enableDisableField(boolean estadoDoCampo) {
        this.brandView.getjTextFieldName().setEnabled(estadoDoCampo);
        this.brandView.getjTextFieldId().setEnabled(false);
        if (this.brandView.getjTableBrand().getRowCount() == 0) {
            this.brandView.getjTextFieldFilter().setEnabled(false);
            this.brandView.getjTableBrand().setEnabled(false);
        } else {
            this.brandView.getjTextFieldFilter().setEnabled(true);
            this.brandView.getjTableBrand().setEnabled(true);
        }
    }

    private void fillInTable() {
        clearTable();
        DefaultTableModel table = (DefaultTableModel) this.brandView.getjTableBrand().getModel();
        ServiceBrand.GetAll().forEach((currentBrand) -> {
            table.addRow(new Object[]{currentBrand.getId(), currentBrand.getName()});
        });
    }

    private boolean returnBrand(int brandId, String brand) {
        return ServiceBrand.GetAll().stream().anyMatch((currentBrand) -> (brandId != currentBrand.getId() && currentBrand.getName().equalsIgnoreCase(brand)));
    }

    private void saveBrand() {

        if (!this.brandView.getjTextFieldName().getText().isEmpty()) {
            int brandId = -1;
            if (!this.brandView.getjTextFieldId().getText().isEmpty()) {
                brandId = Integer.parseInt(this.brandView.getjTextFieldId().getText());
            }
            if (!returnBrand(brandId, this.brandView.getjTextFieldName().getText())) {
                if(JOptionPane.showConfirmDialog(null, "Confirm?", "Confirmation required!", 
                        JOptionPane.YES_OPTION) == JOptionPane.YES_OPTION){
                    Brand brand = new Brand();
                    String name = this.brandView.getjTextFieldName().getText();
                    brand.setName(name);
                    if (this.brandView.getjTextFieldId().getText().isEmpty()) {
                        int listSize;
                        listSize = ServiceBrand.GetAll().size();
                        if (listSize != 0) {
                            brand.setId(ServiceBrand.GetAll().get(listSize - 1).getId() + 1);
                        } else {
                            brand.setId(1);
                        }
                        ServiceBrand.Create(brand);
                        JOptionPane.showMessageDialog(null, "Brand added", "OK!",
                                JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        brand.setName(name);
                        brand.setId(brandId);
                        ServiceBrand.Update(brandId, brand);
                        JOptionPane.showMessageDialog(null, "Brand updated", "OK!",
                                JOptionPane.INFORMATION_MESSAGE);
                    }
                    clearField();
                    enableDisableButton(true);
                }
            } else {
                JOptionPane.showMessageDialog(null, "The brand is already registered!", "Error!",
                        JOptionPane.ERROR_MESSAGE);
            }
            fillInTable();
        } else {
            JOptionPane.showMessageDialog(null, "Can't register a nameless brand!", "Error!",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    //Class
    private class ActionApplyFilter implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            applyFilter();
        }
    }

    private class ActionCancel implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            enableDisableButton(true);
            clearField();
        }
    }

    private class ActionCleanFilter implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            brandView.getjTextFieldFilter().setText("");
            applyFilter();
        }
    }

    private class ActionClose implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            brandView.dispose();
        }
    }

    private class ActionDelete implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            deleteBrand();
        }
    }

    private class ActionEdit implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            editBrand();
        }
    }

    private class ActionNew implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            enableDisableButton(false);
            clearField();
        }
    }

    private class ActionSave implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            saveBrand();
        }
    }

}
