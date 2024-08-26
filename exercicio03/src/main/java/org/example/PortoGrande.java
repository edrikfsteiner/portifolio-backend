package org.example;

public class PortoGrande extends BasePorto {
    public PortoGrande(String nome) {
        super(nome);
    }

    @Override
    public boolean atracarBarco(Barco barco) {
        if (barco.getTamanho() >= 10) {
            super.atracarBarco(barco);
            return true;
        } else {
            System.out.println(barco.getNome() + " é muito pequeno para " + getNome());
            return false;
        }
    }
}
