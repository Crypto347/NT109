
package chat.component;

import java.awt.Color;


public class Chat_Right extends javax.swing.JLayeredPane {

   
    public Chat_Right() {
        initComponents();
    }
    public void setText(String text){
        txt.setText(text);
        txt.setBackground(new Color(74, 173, 255));
        
        txt.sendSucces();
    }
    public void setTime(){
        txt.setTime("12:01 PM");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt = new chat.component.Chat_Item();

        txt.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        setLayer(txt, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private chat.component.Chat_Item txt;
    // End of variables declaration//GEN-END:variables
}
