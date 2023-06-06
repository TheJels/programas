package arboles;

public class Nodo {

    private int elemento;
    Nodo ramaIzq;
    Nodo ramaDer;

    public Nodo(int elemento) {//Constructor
        this.elemento = elemento;
        ramaIzq = null;
        ramaDer = null;
    }

    public void InsertaBinario(int elem){
        if (elem < this.elemento){
            if (ramaIzq == null){
                ramaIzq = new Nodo (elem);
            }else{
                ramaIzq.InsertaBinario(elem);
            }  
        }else{
            if (elem > this.elemento){
                if (ramaDer == null){
                    ramaDer = new Nodo(elem);
                }else{
                    ramaDer.InsertaBinario(elem);
                }
            }
        }
    }
        

    public int getElemento() {
        return elemento;
    }

    public void setElemento(int elemento) {
        this.elemento = elemento;
    }

    public Nodo getRamaIzq() {
        return ramaIzq;
    }

    public void setRamaIzq(Nodo ramaIzq) {
        this.ramaIzq = ramaIzq;
    }

    public Nodo getRamaDer() {
        return ramaDer;
    }

    public void setRamaDer(Nodo ramaDer) {
        this.ramaDer = ramaDer;
    }

    @Override
    public String toString() {
        return "Nodo{" + "elemento=" + elemento + ", ramaIzq=" + ramaIzq + ", ramaDer=" + ramaDer + '}';
    }

}
