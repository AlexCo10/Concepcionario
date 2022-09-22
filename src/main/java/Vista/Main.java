
package Vista;

import Modelo.Persona;
import Modelo.Vehiculo;
import java.util.ArrayList;

public class Main {
    
    
    public static void main(String[] args) {
        
        new Principal().setVisible(true);
        
        ArrayList<Persona> personas = new ArrayList<Persona>();
        ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
                
        Vehiculo v1 = new Vehiculo();
        v1.setPlaca("a23h2");
        v1.setMarca("ford");
        v1.setModelo(2016);
        vehiculos.add(v1);
        
        Vehiculo v2 = new Vehiculo();
        v2.setPlaca("j55d7");
        v2.setMarca("toyota");
        v2.setModelo(2015);
        vehiculos.add(v2);
        
        Vehiculo v3 = new Vehiculo();
        v3.setPlaca("z33g8");
        v3.setMarca("Ferrari");
        v3.setModelo(2019);
        vehiculos.add(v3);
        
        Persona p1 = new Persona();
        p1.setCedula("1354034");
        p1.setNombre("Carlos");
        p1.setApellido("Arenas");
        p1.setContacto(313830);
        p1.setVehiculo(v1);
        personas.add(p1);
        
        Persona p2 = new Persona();
        p2.setCedula("135769");
        p2.setNombre("Arturo");
        p2.setApellido("Hernandez");
        p2.setContacto(317834);
        p2.setVehiculo(v2);
        personas.add(p2);
        
        Persona p3 = new Persona();
        p3.setCedula("1398987");
        p3.setNombre("Hector");
        p3.setApellido("Rodriguez");
        p3.setContacto(3148935);
        p3.setVehiculo(v3);
        personas.add(p3);
        
        
        
        for(int i=0;i<vehiculos.size();i++){
            vehiculos.get(i).getPlaca();
            
        }
        
    }
    
}
