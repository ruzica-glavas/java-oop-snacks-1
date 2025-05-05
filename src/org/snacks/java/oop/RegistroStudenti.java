package org.snacks.java.oop;

public class RegistroStudenti {
    private Studente [] registro;

    public RegistroStudenti(){
        this.registro = new Studente[0]; //Costruttore
    }

    public Studente [] getRegistro(){
        return this.registro;
    }

    public void setRegistro(Studente[]registro){
        this.registro=registro;
    }

    //Aggiungere studente all'array

    public void addStudente(Studente studente){
        Studente[] registroAggiornato = new Studente[this.registro.length+1]; // creazione di un nuovo registro lungo come quello creato precedentemente aggiungendo un elemento

        for (int i=0; i<this.registro.length; i++){
            registroAggiornato[i]=this.registro[i];
        } //copia del mio vecchio registro nel nuovo, ciclando studente per studente

        registroAggiornato[registroAggiornato.length-1]=studente; // aggiunta alla fine dell'array l'ulitmo studente

        this.registro=registroAggiornato; //sovrascrittura del mio nuovo registro a quello vecchio
    }

    public String toString(){
        String output = "Registro studenti:";
        for (Studente studente: this.registro){
            output += String.format("%s;", studente.getStudent());
        }
        return output;
    }

}
