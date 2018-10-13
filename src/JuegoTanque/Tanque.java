
package JuegoTanque;

import java.awt.Graphics2D;
import java.awt.event.KeyEvent;


public class Tanque {
    private int posicionX=0;
    private int posicionY=0;
    private int movimientoX=1;
    private JuegoTanque.Juego game;
    
    public Tanque (JuegoTanque.Juego game){
       this.game=game;
       this.posicionX=0;
       this.posicionY=350;
       this.movimientoX=0;
    }

    public int getPosicionX() {
        return posicionX;
    }

    public void setPosicionX(int posicionX) {
        this.posicionX = posicionX;
    }

    
    public void mover(){
        if (posicionX + movimientoX >420/*delimita movimiento del tanque*/ && posicionX +movimientoX < game.getWidth() -60){
                     posicionX +=movimientoX;
        }
    }
    
    public void keyPressed(KeyEvent a){//metodo para leer las teclas
        if(a.getKeyCode()==KeyEvent.VK_LEFT){
            movimientoX=-1;
        }if(a.getKeyCode()==KeyEvent.VK_RIGHT){
            movimientoX=1;
        }
    }
    public void keyReleased (KeyEvent a){//metodo que deja de mover la bola al soltar la techa
        movimientoX=0;
    }
    public void visualizar(Graphics2D g){//tamaño de la raqueta
        g.fillRect(posicionX, posicionY/*pixeles*/, /**/60, 100);
    }
    
    
    
}
