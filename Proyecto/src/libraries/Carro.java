package libraries;

public class Carro {

    String NombreCarro;
    String TipoCarro;
    int CantidadPersonas;
    int NumeroPlaca;
    int PrecioRenta;
    public Carro(String NombrarCarro,String DefinirTipoDeCarro, int IngresarNumeroDePlaca, int IngresarPrecioDeRenta){
        this.NombreCarro = NombrarCarro;
        this.TipoCarro = DefinirTipoDeCarro;
        this.NumeroPlaca =IngresarNumeroDePlaca;
        this.PrecioRenta = IngresarPrecioDeRenta;
    }
}
