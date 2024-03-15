
package chat.component;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.Icon;
import javax.swing.JButton;

public class MenuButton extends JButton{
    public Icon getIconSimple(){
        return iconSimple;
    }
    public void setIconSimple(Icon iconSimple){
        this.iconSimple = iconSimple;
    }
    public Icon getIconSelected(){
        return iconSelected;
    }
    public void setIconSelected(Icon iconSelected){
        this.iconSelected = iconSelected;
    }
    private Icon iconSimple;
    private Icon iconSelected;
    public MenuButton(){
        setContentAreaFilled(false);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }

    @Override
    public void setSelected(boolean bln) {
        super.setSelected(bln); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        if(bln){
           setIcon(iconSelected); 
        } else{
            setIcon(iconSimple);
        }
    }

    
    
    
}
