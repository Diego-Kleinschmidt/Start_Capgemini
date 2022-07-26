/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author diekl
 */
public class BotaoColunaCellRender extends DefaultTableCellRenderer {

    private String botaoType;
    
    public BotaoColunaCellRender(String botaoType){
        this.botaoType = botaoType;
    }

    public String getBotaoType() {
        return botaoType;
    }

    public void setBotaoType(String botaoType) {
        this.botaoType = botaoType;
    }
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        JLabel label = (JLabel) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/" + botaoType + ".png")));
        return label;
    }
}
