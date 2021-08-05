package test;

import model.Owner;

public class Test {

    public void escenarioOwner(){
        Owner owner1 = new Owner("Mario");
        boolean test1 = assertTrue("Mario", owner1.getNombre());
        // (condicion)? opc1 : opc2
        System.out.println((test1)? "Paso": "No paso");
    }

    public boolean assertTrue(int esperado, int obtenido){
        if(esperado > obtenido){
            return true;
        }
        return false;
    }

    public boolean assertTrue(String esperado, String obtenido){
        if(esperado.equalsIgnoreCase(obtenido)){
            return true;
        }
        return false;
    }
}