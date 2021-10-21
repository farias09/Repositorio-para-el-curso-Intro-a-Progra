package libraries;

public class Cliente {
    String NombreDeCliente;
    String Email;
    int EdadCliente;
    int Cedula;
    int Telefono;

    public Cliente(String NombrarCliente,String DefinirEmail, int DigitarEdad, int DigitarCedula, int DigitarTelefono){
        this.NombreDeCliente = NombrarCliente;
        this.Email = DefinirEmail;
        this.EdadCliente = DigitarEdad;
        this.Cedula = DigitarCedula;
        this.Telefono = DigitarTelefono;
    }
}