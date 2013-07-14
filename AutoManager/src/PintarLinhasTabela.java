import java.awt.Color;  
import java.awt.Component;  
import java.awt.Point;  
import java.util.HashMap;  
import java.util.Map;  
import java.util.Random;  
import java.util.Vector;  
  
import javax.swing.JFrame;  
import javax.swing.JScrollPane;  
import javax.swing.JTable;  
import javax.swing.table.DefaultTableCellRenderer;  
import javax.swing.table.DefaultTableModel;  
  
public class PintarLinhasTabela extends DefaultTableCellRenderer {  
  
    private Map _cores = new HashMap();  
  
    private Point _tempCel = new Point(0, 0);  
  
    private Color _defaultBG;  
  
    public PintarLinhasTabela() {  
        this._defaultBG = getBackground();  
    }  
  
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected,  
        boolean hasFocus, int row, int column) {  
  
        Component c = super.getTableCellRendererComponent(  
            table,  
            value,  
            isSelected,  
            hasFocus,  
            row,  
            column);  
  
        this._tempCel.x = row;  
        this._tempCel.y = column;  
        if (this._cores.containsKey(this._tempCel)) {  
            c.setBackground((Color) this._cores.get(this._tempCel));  
        } else {  
            c.setBackground(this._defaultBG);  
        }  
  
        return c;  
    }  
  
    public void colorirCelula(int row, int col, Color cor) {  
        this._cores.put(new Point(row, col), cor);  
    }  
      
} 