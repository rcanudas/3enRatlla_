
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%@page import="java.util.ArrayList, package1.tauler" %>

<% 
   ArrayList<tauler> taulers  = new ArrayList<tauler>();
   taulers = (ArrayList<tauler>) getServletContext().getAttribute("taulers");
   String jugador_;
  jugador_ = (String) getServletContext().getAttribute("nick_jugador");
 tauler t = taulers.get(0);
%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Jugada</title>
    </head>
    <body>
        Benvingut 
        <table>
                <tr>
                
            <td><input type="submit" name="00" value="<%=t.posicions[0][0]%>" 
                       formaction="joc.jsp?fil=0&col=0&jug=<%= jugador_ %>"/></td>
            <td><input type="submit" name="01" value="<%= t.posicions[0][1] %>" 
                       formaction="joc.jsp?fil=0&col=1&jug=<%= jugador_ %>"/></td>
            <td><input type="submit" name="02" value="<%= t.posicions[0][2]%>" 
                       formaction="joc.jsp?fil=0&col=2&jug=<%=jugador_ %>%>"/></td>
            
            </tr>
            <tr>
                
            <td><input type="submit" name="10" value="<%= t.posicions[1][0] %>" 
                       formaction="apretar.jsp?fil=1&col=0&jug=<%= jugador_ %>"/></td>
            <td><input type="submit" name="11" value="<%= t.posicions[1][1] %>" 
                       formaction="apretar.jsp?fil=1&col=1&jug=<%= jugador_  %>"/></td>
            <td><input type="submit" name="12" value="<%= t.posicions[1][1]  %>" 
                       formaction="apretar.jsp?fil=1&col=2&jug=<%= jugador_ %>"/></td>
            
            </tr>
            <tr>
                
            <td><input type="submit" name="20" value="<%= t.posicions[2][0] %>" 
                       formaction="apretar.jsp?fil=2&col=0&jug=<%= jugador_ %>"/></td>
            <td><input type="submit" name="21" value="<%= t.posicions[2][1] %>" 
                       formaction="apretar.jsp?fil=2&col=1&jug=<%= jugador_ %>"/></td>
            <td><input type="submit" name="22" value="<%= t.posicions[2][2] %>" 
                       formaction="apretar.jsp?fil=2&col=2&jug=<%= jugador_ %>"/></td>
            
            </tr>
        
        </table>
    </body>
</html>
