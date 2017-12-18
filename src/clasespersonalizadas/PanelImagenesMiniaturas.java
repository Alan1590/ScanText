/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasespersonalizadas;

import com.sun.javafx.iio.ImageStorage;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.image.BufferedImage;
import static java.awt.image.BufferedImage.TYPE_INT_ARGB;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Observer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import org.eclipse.persistence.config.HintValues;

/**
 *
 * @author alan
 */
public class PanelImagenesMiniaturas extends JPanel {
    private JLabel labelPag;
    private JLabel labelImg;
    private BufferedImage imgFondo;
    private String urlImg; 
    public PanelImagenesMiniaturas(String numPag, String urlImg) {
        this.urlImg = urlImg;
        labelPag = new JLabel("Pag. " + numPag);
        labelPag.setHorizontalTextPosition(SwingConstants.RIGHT);
        labelPag.setVerticalTextPosition(SwingConstants.CENTER);
        labelPag.setFont(new Font("Italic", Font.ITALIC, 10));
        crearPanel();
        
    }

    private Image resizeImg() {
        BufferedImage Img = new BufferedImage(90, 100, TYPE_INT_ARGB);
        Graphics2D gpr = Img.createGraphics();
        BufferedImage bf;

        try {

            bf = ImageIO.read(new File(urlImg));
            gpr.drawImage(bf, 0, 0, 90, 100, (Image img, int infoflags, int x1, int y1, int width1, int height1) -> true);

        } catch (IOException ex) {
            Logger.getLogger(PanelImagenesMiniaturas.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Img;
    }

    private void crearPanel(){
        labelImg = new JLabel();
        ImageIcon img = new ImageIcon(resizeImg());
        labelImg.setIcon(img);
        setLayout(new BorderLayout());
        add(labelImg, BorderLayout.CENTER);
        add(labelPag, BorderLayout.SOUTH);
    }
    
    @Override
    public void paint(Graphics g) {
        super.paint(g);

        setVisible(true);
    }

}
