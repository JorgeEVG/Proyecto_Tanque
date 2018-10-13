package JuegoTanque;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Juego extends JPanel{
    Tanque tanqueJugador;
    Pared pared;
    Nivel nivel;
    int marcador =0;
    //Raqueta raqueta;
    
    public Juego(){
     tanqueJugador = new Tanque(this);//this hace una referencia de la misma clase
     pared = new Pared(this);
     //raqueta = new Raqueta(this);
     establecerEscuchadorDeTeclado();
     setFocusable(true);
     
     
     tanqueJugador.setPosicionX(600);//metodos que usare en nivel
     pared.setPosicionY(200);//metodos que usare en nivel
    }
    
    @Override
    public void paint (Graphics g){
            super.paint(g);//llamar de clase padre Jpanel
            Graphics2D g2d = (Graphics2D) g;// cast, 
            g2d.setRenderingHint/*metodo*/(RenderingHints/*clase*/.KEY_ANTIALIASING/*constante*/,
            RenderingHints.VALUE_ANTIALIAS_ON);
            //creo un objeto, el objeto lo hago 2d, suavizo sus bordes y lo relleno con el fillOval
            tanqueJugador.visualizar(g2d);
            pared.visualizar(g2d);
            //raqueta.visualizar(g2d);
            nivel.visualizar(g2d);
            
            
        }

    private void mover(){
        tanqueJugador.mover();//metodo para mover pelota
        //raqueta.mover();//metodo para mover raqueta
    }
        
        public static void main(String[] args) throws InterruptedException {
            
        JFrame frame = new JFrame("Ejemplo 2");
        Juego lienzo = new Juego();
        frame.add(lienzo);
        frame.setSize(800, 400);//tamaño del cuadro donde se pone el cuadro
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//para cerrar el programa
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        
        while(true){
            lienzo.mover();//este metodo llama a los metodos mover
            lienzo.repaint();
            Thread.sleep(10);
            
        }
       }
        
       private void establecerEscuchadorDeTeclado(){
           addKeyListener(new KeyListener(){
               @Override
               public void keyTyped(KeyEvent a) {
                   
               }

               @Override
               public void keyPressed(KeyEvent a) {
                   tanqueJugador.keyPressed(a);
               }

               @Override
               public void keyReleased(KeyEvent a) {
                   tanqueJugador.keyReleased(a);
               }
          
           });
           
           
       }

    
       
        
}//lave final
