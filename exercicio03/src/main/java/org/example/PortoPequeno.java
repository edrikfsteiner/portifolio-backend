package org.example;

public class PortoPequeno extends BasePorto {
    public PortoPequeno(String nome) {
        super(nome);
    }

    @Override
    public boolean atracarBarco(Barco barco) {
        if (barco.getTamanho() <= 10) {
            super.atracarBarco(barco);
            return true;
        } else {
            System.out.println(barco.getNome() + " é muito grande para " + getNome());
            return false;
        }
    }
}
