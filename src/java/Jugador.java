

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import package1.tauler;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 *
 * @author Administrador
 */
public class Jugador extends HttpServlet {

    public Jugador(){}
    
    
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
                   String nick = req.getParameter("txtnick");
                   req.getSession().setAttribute("nik_jugador", nick );
                   tauler taulerJugador= new tauler();
                   taulerJugador=agafarTauler(nick);
                   req.getSession().setAttribute("tauler_jugador", taulerJugador );
                    resp.sendRedirect("joc.jsp");
                    
                   
}    
 
  
 public ArrayList<tauler> taulers;

 
  
  
  public Jugador(String intro_nick){
   taulers = new ArrayList<tauler>();    
      taulers = (ArrayList<tauler>) getServletContext().getAttribute("taulers");
    
  }
  
  public tauler agafarTauler(String nick){
  
  for(int i=0; i<taulers.size();i++){
            if(!taulers.get(i).esta_ple()){
                taulers.get(i).unirJugador(nick);
                return taulers.get(i);
            }
}
  return null;
   
  }

}
