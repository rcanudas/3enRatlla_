package package1;

import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;

/**
 *
 * @author Administrador
 */
public class tauler extends HttpServlet {

    /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrador
 */
    
    
    public int id_tauler=0;
    public int posicions[][];
    public String jugador1;
    public String jugador2;
     
public tauler(){
    
        id_tauler++;
        posicions = new int[3][3];
        posarA0();
        
        
        
    }
public boolean casellaBuida(int x, int y){

    if(posicions[x][y]==0){
    
    return true;
    }
    return false;
        
}

public void unirJugador(String nick){

if(jugador1==null){

    jugador1=nick;
    
}else if(jugador2==null){
    
    jugador2=nick;
    
}else{
    
   System.out.println("Partida plena");
}


}



public void tirada(int jugador, int x, int y){
   
    posicions[x][y]=jugador;
    
}

public void hiHaGuanyador(){
    
    



}

public void posarA0(){

for(int i=0;i<3;i++){
            for(int x=0; x<3; x++){
              posicions[i][x]=0;
            }
        
        }


}
    
    
public boolean esta_ple(){
    
    if(!(jugador1.equals(""))&&!(jugador2.equals("")))
       {
      return true;
    }
        return false;
    
    }

    public void imprimir(){
       
           System.out.println("<table>");
        for(int i=0;i<3;i++){
             System.out.println("<tr>");
            for(int x=0; x<3; x++){
             System.out.println("<td>");
            System.out.println(posicions[i][x]=0);
             System.out.println("</td>");
            }
             System.out.println("</tr>");
         }
         System.out.println("</table>");
    }
    
}
