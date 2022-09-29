import javax.swing.JOptionPane;

public class GPS { 
    
    private String idioma;
    private String rota;
    
    //metodo default
    public GPS (){
        this.idioma = "English";
        this.rota = "Las Vegas";
    }
    
    //metodo idioma em portugues
    public GPS (String rota){
        this.idioma = "Portugues - BR";
        this.rota = rota;
    } 
    
    public void mostrar(){
        
        JOptionPane.showMessageDialog(null, "\nIdioma: " + getIdioma() + "\nRota: " + getRota());
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getRota() {
        return rota;
    }

    public void setRota(String rota) {
        this.rota = rota;
    }
}