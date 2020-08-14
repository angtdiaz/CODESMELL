package modelos;

import java.util.ArrayList;

public class Estudiante{
    //Informacion del estudiante
    public String matricula;
    public String nombre;
    public String apellido;
    public String facultad;
    public int edad;
    public String direccion;
    public String telefono;
    public ArrayList<Paralelo> paralelos;
    
 
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

     public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
     public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
     public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }
    
     public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
     public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
 
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public double CalcularNotaInicial(Paralelo p, double nexamen,double ndeberes, double nlecciones, double ntalleres){
        return calcularNota(p,nexamen,ndeberes,nlecciones,ntalleres);

    }
    
     
    public double CalcularNotaFinal(Paralelo p, double nexamen,double ndeberes, double nlecciones, double ntalleres){
        return calcularNota(p,nexamen,ndeberes,nlecciones,ntalleres);
    }
    
    public double calcularNota(Paralelo p, double nexamen,double ndeberes, double nlecciones, double ntalleres){
            double notaFinal=0;
        for(Paralelo par:paralelos){
            if(p.equals(par)){
                double notaTeorico=(nexamen+ndeberes+nlecciones)*0.80;
                double notaPractico=(ntalleres)*0.20;
                notaFinal=notaTeorico+notaPractico;
            }
        }
        return notaFinal;
    }
}
        
    
    
    
            
        
        
