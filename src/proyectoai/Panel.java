/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoai;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;

/**
 *
 * @author admin
 */
public class Panel extends javax.swing.JPanel {

    /**
     * Creates new form Panel
     */
    public Panel(int x, int y) {
        this.setSize(x,y);
    }

    @Override
    public void paintComponent (Graphics g){
    Dimension tamanio = getSize();
    ImageIcon imagenFondo = new ImageIcon(getClass().getResource("/imagenes/Koala.jpg"));
    g.drawImage(imagenFondo.getImage(),0,0,tamanio.width, tamanio.height, null);
    setOpaque(false);
    super.paintComponent(g);
    }
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
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
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
