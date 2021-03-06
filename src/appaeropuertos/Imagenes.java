/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appaeropuertos;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author luisr
 */

//Cada una de estas clases carga las imagenes que se utilizan en el JFrame, su referencia es el nombre de clase

class Imagenes extends JPanel {

    private Image imagen;

    @Override
    public void paint(Graphics g) {
        imagen = new ImageIcon(getClass().getResource("/Imagenes/Cla.jpg")).getImage();
        g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
        setOpaque(false);
        super.paint(g);
    }
}

class Logo extends JPanel {

    private Image imagen;

    @Override
    public void paint(Graphics g) {
        imagen = new ImageIcon(getClass().getResource("/Imagenes/Logo.png")).getImage();
        g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
        setOpaque(false);
        super.paint(g);
    }
}
class Mapa extends JPanel {

    private Image imagen;

    @Override
    public void paint(Graphics g) {
        imagen = new ImageIcon(getClass().getResource("/Imagenes/mapa.png")).getImage();
        g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
        setOpaque(false);
        super.paint(g);
    }
}
class Boleto extends JPanel {

    private Image imagen;

    @Override
    public void paint(Graphics g) {
        imagen = new ImageIcon(getClass().getResource("/Imagenes/Boleto.png")).getImage();
        g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
        setOpaque(false);
        super.paint(g);
    }
}
class Marianas extends JPanel {

    private Image imagen;

    @Override
    public void paint(Graphics g) {
        imagen = new ImageIcon(getClass().getResource("/Imagenes/marianas.jpg")).getImage();
        g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
        setOpaque(false);
        super.paint(g);
    }
}
