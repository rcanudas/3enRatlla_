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
public class Administrador extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
        
       
                     
        if(req.getParameter("botoadmin").equals("Generar_Taulers")){
        generarTauler();
        
        resp.sendRedirect("admin.jsp");  
        }
        if(req.getParameter("botoadmin").equals("Reset")){
        
            for(int i=0; i<taulers.size(); i++){
            
            taulers.get(i).posarA0();
                       
            }
                    resp.sendRedirect("admin.jsp");    
        }
        if(req.getParameter("botoadmin").equals("Imprimir_tot")){
        PrintWriter out = resp.getWriter();
            for(int i=0; i<taulers.size(); i++){
                
                out.println("El tauler "+i+" està ple i creat per el seu autor.");
                
            }
         }
    }    
    
    
    public ArrayList<tauler> taulers;
    public int taulers_ocupats;
      
    
    public Administrador(){
       
    
    } 
    public void generarTauler(){
    
        if(getServletContext().getAttribute("taulers")== null){
            taulers = new ArrayList<tauler>();  
                    for(int y=0; y<10; y++){
                    tauler Tauler= new tauler();
                    taulers.add(Tauler);
                    }
                    getServletContext().setAttribute("taulers", taulers);
        
        }else{
        for(int y=0; y<10; y++){
         taulers.get(y).posarA0();
        }
        }
 }
    
    public void acabar_partida(int num_tauler){
    
        taulers.get(num_tauler).posarA0();
     
    }
    
   public void imprimerTauler(int num_tauler){
   
       taulers.get(num_tauler).imprimir();
   
   } 
        
   public void imprimirTotsTaulers(){
   
   for (int i=0; i<taulers.size(); i++){
       taulers.get(i).imprimir();
   }
   
   }
   
   private void response(HttpServletResponse resp, int msg)
			throws IOException {
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<link href='estil.css' rel='stylesheet' type='text/css' />");
		out.println("</head>");
		out.println("<body>");
		out.println("<t1>Taulers creats: " + msg + "</t1>");
		out.println("</body>");
		out.println("</html>");
	}
}
