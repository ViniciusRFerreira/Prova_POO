public class UsaGPS { 
    
    public static void main(String[] args) {
        
        GPS gps1 = new GPS(); 
        GPS gps2 = new GPS("Islândia");
        
        gps1.mostrar();
        gps2.mostrar(); 
        
        gps1.setRota("Berlim");
        gps1.setIdioma("Alemão");
        
        gps1.mostrar();
        
        System.exit(0);
    }
    
}