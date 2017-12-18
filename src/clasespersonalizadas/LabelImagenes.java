/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasespersonalizadas;

import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JLabel;

/**
 *
 * @author alan
 */
public class LabelImagenes extends JLabel {

    private ArrayList<Integer> x, y, x2, y2;

    public LabelImagenes() {
        x = new ArrayList<>();
        y = new ArrayList<>();
        x2 = new ArrayList<>();
        y2 = new ArrayList<>();

    }

    public void setCoordenadas(int x, int y, int x2, int y2) {
        this.x.add(x);
        this.y.add(y);
        this.x2.add(x2);
        this.y2.add(y2);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        for (int a = 0; a < this.x.size(); a++) {
            g.drawRect(this.x.get(a), this.y.get(a),
                    this.x2.get(a), this.y2.get(a));
        }

    }

}
