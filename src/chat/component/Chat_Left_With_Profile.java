
package chat.component;

import java.awt.Color;
import javax.swing.Icon;


public class Chat_Left_With_Profile extends javax.swing.JLayeredPane {

   
    public Chat_Left_With_Profile() {
        initComponents();
    }
    public void setUserProfile(String user){
        txt.setUserProfile(user);
    }
    public void setText(String text){
        txt.setText(text);
        txt.setBackground(new Color(240,240,240));
        txt.setTime("12:30 PM");
        txt.seen();
    }
    public void setImageProfile(Icon image){
        image_Paul.setImage(image);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        image_Paul = new chat.swing.ImageAvatar();
        txt = new chat.component.Chat_Item();

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

        image_Paul.setBorderSize(0);
        image_Paul.setImage(new javax.swing.ImageIcon(getClass().getResource("/chat/icon/avatar/Paul.jpg"))); // NOI18N
        image_Paul.setMaximumSize(new java.awt.Dimension(30, 30));
        image_Paul.setMinimumSize(new java.awt.Dimension(30, 30));
        image_Paul.setPreferredSize(new java.awt.Dimension(30, 30));

        jLayeredPane1.setLayer(image_Paul, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addComponent(image_Paul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addGap(0, 1, Short.MAX_VALUE)
                .addComponent(image_Paul, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        add(jLayeredPane1);
        add(txt);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private chat.swing.ImageAvatar image_Paul;
    private javax.swing.JLayeredPane jLayeredPane1;
    private chat.component.Chat_Item txt;
    // End of variables declaration//GEN-END:variables
}
