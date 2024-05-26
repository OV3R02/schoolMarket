package com.mycompany.schoolmarket.gui;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import com.mycompany.schoolmarket.entity.Book;

public class TableModel extends AbstractTableModel{

    private List<Book> booksList;

    public TableModel() {
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public int getRowCount() {
        return booksList.size();
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Book book = booksList.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return book.getIdBook();
            case 1:
                return book.getBookName();
            case 2:
                return book.getClassSection();
            case 3:
                return book.getCost();
            case 4:
                return book.getGrade();
        }
        return null;
    }
    
}
