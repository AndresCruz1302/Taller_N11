
package Modelo;

public class Datos {
   String Favorito, combo, asado, hamburguesa,bebidas, precio;

    public Datos(String Favorito, String combo, String asado, String hamburguesa, String bebidas, String precio) {
        this.Favorito = Favorito;
        this.combo = combo;
        this.asado = asado;
        this.hamburguesa = hamburguesa;
        this.bebidas = bebidas;
        this.precio = precio;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }


    
    public String getFavorito() {
        return Favorito;
    }

    public void setFavorito(String Favorito) {
        this.Favorito = Favorito;
    }

    public String getCombo() {
        return combo;
    }

    public void setCombo(String combo) {
        this.combo = combo;
    }

    public String getAsado() {
        return asado;
    }

    public void setAsado(String asado) {
        this.asado = asado;
    }

    public String getHamburguesa() {
        return hamburguesa;
    }

    public void setHamburguesa(String hamburguesa) {
        this.hamburguesa = hamburguesa;
    }

    public String getBebidas() {
        return bebidas;
    }

    public void setBebidas(String bebidas) {
        this.bebidas = bebidas;
    }
   
}
