
package JuegoTanque;

 import java.awt.Graphics2D;

public class Nivel {
        private int marcador;
        private  JuegoTanque.Juego game;
        Tanque tanqueEnemigo1;
        Tanque tanqueEnemigo2;
        Tanque tanqueEnemigo3;
        int posicionX=0;
        int posicionY=0;

    public Nivel(JuegoTanque.Juego game) {
        
        marcador = 2;
        this.game = game;
        tanqueEnemigo1 = new Tanque(this);
        this.tanqueEnemigo2 = tanque;
        this.tanqueEnemigo3 = tanque;
    }
    
    public void nivel1(){
        tanqueEnemigo1.setPosicionX(200);
        tanqueEnemigo1.visualizar(g);
    }
    public void nivel2(){
        tanqueEnemigo1.setPosicionX(100);
        tanqueEnemigo2.setPosicionX(100);
    }
    public void nivel3(){
        tanqueEnemigo1.setPosicionX(66);
        tanqueEnemigo2.setPosicionX(132);
        tanqueEnemigo3.setPosicionX(198);
    }
    
    public void visualizar(Graphics2D g){
        if(marcador==1){
            nivel1();
        }
          if(marcador==2){
            nivel2();
        }
          if(marcador==3){
              nivel3();
          }
            
    }
}
