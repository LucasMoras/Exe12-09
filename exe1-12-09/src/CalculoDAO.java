
import javax.swing.JOptionPane;

public class CalculoDAO {
    
        FormasDTO objFormasDTO = new FormasDTO();
        
        public void CalcularAreas(){
            
       double ResultadoRet = objFormasDTO.getAlturaRet() * objFormasDTO.getLarguraRet();
       double ResultadoTri = objFormasDTO.getAlturaTri() * objFormasDTO.getLarguraTri();
       double ResultadoCir = objFormasDTO.getRaioCir() * objFormasDTO.getRaioCir();
     
       JOptionPane.showMessageDialog(null, ResultadoTri + "\n" + ResultadoRet + "\n" + ResultadoCir);
       
    }
}
