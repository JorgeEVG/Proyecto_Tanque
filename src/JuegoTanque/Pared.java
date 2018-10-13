
package JuegoTanque;

import java.awt.Graphics2D;

public class Pared {
    
    private int posicionX=0;
    private int posicionY=0;
    private  JuegoTanque.Juego game;

    public Pared(JuegoTanque.Juego game) {
        this.game = game;
        this.posicionX=400;
        this.posicionY=0;

    }
    
    public int getPosicionY() {
        return posicionY;
    }

    public void setPosicionY(int posicionY) {
        this.posicionY = posicionY;
    }
    
    
    public void visualizar(Graphics2D g){//tamaño de la raqueta
        g.fillRect(posicionX, posicionY/*pixeles*/, /**/20, 600);
    }
    
    
    
    
}//lave final
