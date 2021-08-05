package Controller;

import java.util.ArrayList;
import model.Owner;
import view.services.JavaMySQLService;

public class Controller {

    private JavaMySQLService dbService;

    private ArrayList<Owner> owners;

    public Controller() {
        super();
        owners = new ArrayList<>();
        dbService = new JavaMySQLService();
    }
    public ArrayList<Owner> getOwners() {
        return owners;
    }
    public void addOwners(String nombre) {
        Owner cliente = new Owner(nombre);
        owners.add(cliente);
    }
    public String listarClientes() {
        String listado = "";
        for (Owner cliente : owners) {
            listado += "Nombre: " + cliente.getNombre() + "\n";
        }
        return listado;
    }
    public String[] updateListClientes(){
        String[] listado = new String[owners.size()];
        for (int i = 0; i < listado.length; i++) {
            listado[i] = owners.get(i).toString();
        }
        return listado;
    }
    public void addOwner(String nombre) {
    }
}

