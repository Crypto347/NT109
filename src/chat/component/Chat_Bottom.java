package chat.component;

import chat.event.PublicEvent;
import chat.swing.JIMSendTextPane;
import chat.swing.ScrollBar;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;

public class Chat_Bottom extends javax.swing.JPanel {

    public Chat_Bottom() {
        initComponents();
        init();
    }

    private void init() {
        setLayout(new MigLayout("fillx, filly", "1[fill]1", "1[fill]1"));
        JScrollPane scroll = new JScrollPane();
        JIMSendTextPane txt = new JIMSendTextPane();
        scroll.setBorder(null);
        txt.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                refresh();
            }

        });
        txt.setHintText("Aa");
        scroll.setViewportView(txt);
        ScrollBar sb = new ScrollBar();
        sb.setPreferredSize(new Dimension(2, 10));
        scroll.setVerticalScrollBar(sb);
        scroll.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        add(sb);
        add(scroll, "w 100%");
                
        JPanel panel = new JPanel();
        panel.setBorder(new EmptyBorder(1, 1, 0, 0));
        panel.setLayout(new MigLayout("filly", "0[]0", "0[center]0"));
        panel.setBackground(Color.WHITE);
        panel.setPreferredSize(new Dimension(30, 25));
        panel.setBackground(Color.WHITE);
        JButton cmd = new JButton();
        cmd.setBorder(null);       
        cmd.setContentAreaFilled(false);
        cmd.setCursor(new Cursor(Cursor.HAND_CURSOR));
        cmd.setIcon(new ImageIcon(getClass().getResource("/chat/icon/send.png")));
        cmd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = txt.getText().trim();
                if(!text.equals("")){
                    PublicEvent.getInstance().getEventChat().sendMessage(text);
                    txt.setText("");
                    txt.grabFocus();
                } else{
                    txt.grabFocus();
                }
            }
        });
        panel.add(cmd);
        add(panel);
    }

    private void refresh() {
        revalidate();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
