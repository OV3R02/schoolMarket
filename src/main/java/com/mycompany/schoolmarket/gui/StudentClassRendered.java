package com.mycompany.schoolmarket.gui;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

import com.mycompany.schoolmarket.entity.StudentClass;

public class StudentClassRendered extends JLabel implements ListCellRenderer<StudentClass> {

    public StudentClassRendered() {
        // setOpaque(true);
    }

    @Override
    public Component getListCellRendererComponent(JList<? extends StudentClass> list, StudentClass value, int index,
            boolean isSelected, boolean cellHasFocus) {
        setText(value.getSection());
        if (isSelected) {
            setBackground(list.getSelectionBackground());
            setForeground(list.getSelectionForeground());
        } else {
            setBackground(list.getBackground());
            setForeground(list.getForeground());
        }

        return this;
    }

}
