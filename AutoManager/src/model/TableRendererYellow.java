/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.Color;  
import java.awt.Component;  
import java.awt.Font;  
import java.awt.Graphics;
import javax.swing.BorderFactory;
  
import javax.swing.JTable;  
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.plaf.BorderUIResource;
import javax.swing.table.DefaultTableCellRenderer;  

/**
 *
 * @author
 * estagiarios
 */
public class TableRendererYellow extends DefaultTableCellRenderer {
public Component getTableCellRendererComponent(JTable table,Object value,boolean isSelected,boolean hasFocus,int row,int column)  
    {  
        Component result = super.getTableCellRendererComponent(table,value,isSelected,hasFocus,row,column);
       if(table.getValueAt(row, column).toString().equals("Urgente")){
        if(isSelected) {  
            //result.setFont(new Font("arial", Font.BOLD, 14));  
            
            
            result.setForeground(Color.yellow);  
            result.setBackground(Color.white);  
        }
        else {  
           //result.setFont(new Font("arial", Font.PLAIN, 14));  
            result.setForeground(Color.yellow);  
            result.setBackground(Color.white);  
        }
        }
        
        
        return result;  
    }

      
}
