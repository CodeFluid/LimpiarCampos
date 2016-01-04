package CodeFluid;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LimpiarCampos {
    
    public void Limpiar(JPanel panel){
        for (Object o : panel.getComponents()) {
            if (o instanceof JTextField){
                ((JTextField) o).setText("");
            }
        }
    }
}
