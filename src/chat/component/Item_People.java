
package chat.component;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class Item_People extends javax.swing.JPanel {

    
    public Item_People(String name) {
        initComponents();
        lb.setText(name);
        init();
    }

   private void init(){
       addMouseListener(new MouseAdapter(){
           @Override
           public void mouseEntered(MouseEvent me) {
               setBackground(new Color(229,229,229));
           }

           @Override
           public void mouseExited(MouseEvent me) {
               setBackground(new Color(240,240,240));
           } 
       });
   }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        imageAvatar1 = new chat.swing.ImageAvatar();
        lb = new javax.swing.JLabel();

        setBackground(new java.awt.Color(240, 240, 240));

        imageAvatar1.setBorderSize(0);
        imageAvatar1.setImage(new javax.swing.ImageIcon(getClass().getResource("/chat/icon/cat.png"))); // NOI18N

        lb.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        lb.setForeground(new java.awt.Color(0, 0, 0));
        lb.setText("NAME");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imageAvatar1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(lb, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lb, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imageAvatar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private chat.swing.ImageAvatar imageAvatar1;
    private javax.swing.JLabel lb;
    // End of variables declaration//GEN-END:variables
}
