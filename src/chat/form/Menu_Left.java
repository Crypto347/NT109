package chat.form;

import net.miginfocom.swing.MigLayout;
import chat.component.Item_People;
import chat.swing.ScrollBar;

public class Menu_Left extends javax.swing.JPanel {

    public Menu_Left() {
        initComponents();
        init();
    }

    private void init() {
        jScrollPane_Left.setVerticalScrollBar(new ScrollBar());
        menuList.setLayout(new MigLayout("fillx", "0[]0", "1[]1"));
        showMessage();

    }
    @SuppressWarnings("unchecked")
     private void showMessage() {
        menuList.removeAll();
        for (int i = 0; i < 20; i++) {
            menuList.add(new Item_People("People" + i), "wrap");
        }       
       refreshMenuList();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu = new javax.swing.JLayeredPane();
        menuMessage = new chat.component.MenuButton();
        menuGroup = new chat.component.MenuButton();
        menuBox = new chat.component.MenuButton();
        jScrollPane_Left = new javax.swing.JScrollPane();
        menuList = new javax.swing.JLayeredPane();

        setBackground(new java.awt.Color(240, 240, 240));

        menu.setBackground(new java.awt.Color(230, 230, 230));
        menu.setOpaque(true);
        menu.setLayout(new java.awt.BorderLayout());

        menuMessage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chat/icon/love.png"))); // NOI18N
        menuMessage.setIconSelected(new javax.swing.ImageIcon(getClass().getResource("/chat/icon/love (1).png"))); // NOI18N
        menuMessage.setIconSimple(new javax.swing.ImageIcon(getClass().getResource("/chat/icon/love.png"))); // NOI18N
        menuMessage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuMessageActionPerformed(evt);
            }
        });
        menu.add(menuMessage, java.awt.BorderLayout.LINE_START);

        menuGroup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chat/icon/email (6).png"))); // NOI18N
        menuGroup.setIconSelected(new javax.swing.ImageIcon(getClass().getResource("/chat/icon/email (5).png"))); // NOI18N
        menuGroup.setIconSimple(new javax.swing.ImageIcon(getClass().getResource("/chat/icon/email (6).png"))); // NOI18N
        menuGroup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuGroupActionPerformed(evt);
            }
        });
        menu.add(menuGroup, java.awt.BorderLayout.CENTER);

        menuBox.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chat/icon/friends (1).png"))); // NOI18N
        menuBox.setIconSelected(new javax.swing.ImageIcon(getClass().getResource("/chat/icon/friends (2).png"))); // NOI18N
        menuBox.setIconSimple(new javax.swing.ImageIcon(getClass().getResource("/chat/icon/friends (1).png"))); // NOI18N
        menuBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBoxActionPerformed(evt);
            }
        });
        menu.add(menuBox, java.awt.BorderLayout.LINE_END);

        jScrollPane_Left.setBackground(new java.awt.Color(240, 240, 240));
        jScrollPane_Left.setBorder(null);
        jScrollPane_Left.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        menuList.setBackground(new java.awt.Color(240, 240, 240));
        menuList.setOpaque(true);

        javax.swing.GroupLayout menuListLayout = new javax.swing.GroupLayout(menuList);
        menuList.setLayout(menuListLayout);
        menuListLayout.setHorizontalGroup(
            menuListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        menuListLayout.setVerticalGroup(
            menuListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 433, Short.MAX_VALUE)
        );

        jScrollPane_Left.setViewportView(menuList);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane_Left))
            .addComponent(menu)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane_Left))
        );
    }// </editor-fold>//GEN-END:initComponents
    private void showGroup(){
        menuList.removeAll();
        for (int i = 0; i < 3; i++) {
            menuList.add(new Item_People("Group" + i), "wrap");
        }
        refreshMenuList();
    } private void showBox() {
        menuList.removeAll();
        for (int i = 0; i < 20; i++) {
            menuList.add(new Item_People("Box" + i), "wrap");
        }
        refreshMenuList();
    }
    private void refreshMenuList(){
        menuList.repaint();
        menuList.revalidate();
    }
    private void menuMessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuMessageActionPerformed
        if (!menuMessage.isSelected()) {
            menuMessage.setSelected(true);
            menuGroup.setSelected(false);
            menuBox.setSelected(false);
            showMessage();
        }

    }//GEN-LAST:event_menuMessageActionPerformed

    private void menuGroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuGroupActionPerformed
        if (!menuGroup.isSelected()) {
            menuMessage.setSelected(false);
            menuGroup.setSelected(true);
            menuBox.setSelected(false);
            showGroup();
        }

    }//GEN-LAST:event_menuGroupActionPerformed

    private void menuBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBoxActionPerformed
        if (!menuBox.isSelected()) {
            menuMessage.setSelected(false);
            menuGroup.setSelected(false);
            menuBox.setSelected(true);
            showBox();
        }

    }//GEN-LAST:event_menuBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane_Left;
    private javax.swing.JLayeredPane menu;
    private chat.component.MenuButton menuBox;
    private chat.component.MenuButton menuGroup;
    private javax.swing.JLayeredPane menuList;
    private chat.component.MenuButton menuMessage;
    // End of variables declaration//GEN-END:variables

}
