/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Administrador
 */
public class Ator {
    private int Codigo;
    private String NomeReal;
    private String NomeArtistico;

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getNomeReal() {
        return NomeReal;
    }

    public void setNomeReal(String NomeReal) {
        this.NomeReal = NomeReal;
    }

    public String getNomeArtistico() {
        return NomeArtistico;
    }

    public void setNomeArtistico(String NomeArtistico) {
        this.NomeArtistico = NomeArtistico;
    }

    @Override
    public String toString() {
        return "Ator{" + "NomeArtistico=" + NomeArtistico + '}';
    }
    
}
