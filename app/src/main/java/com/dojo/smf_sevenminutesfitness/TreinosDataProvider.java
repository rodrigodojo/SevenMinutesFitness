package com.dojo.smf_sevenminutesfitness;

public class TreinosDataProvider {

    private  int listaIcones;
    private String listatreinos;
    private String listainiciais;

    public TreinosDataProvider(int listaIcones, String listatreinos, String listainiciais) {
        this.listaIcones = listaIcones;
        this.listatreinos = listatreinos;
        this.listainiciais = listainiciais;
    }
    public int getlistaIcones() {
        return listaIcones;
    }

    public void setlistaIcones(int listaIcones) {
        this.listaIcones = listaIcones;
    }

    public String getlistatreinos() {
        return listatreinos;
    }

    public void setlistatreinos(String listatreinos) {
        this.listatreinos = listatreinos;
    }

    public String getlistainiciais() {
        return listainiciais;
    }

    public void setlistainiciais(String listainiciais) {
        this.listainiciais = listainiciais;
    }
}
