package arboles;

import arboles.*;

public class Arbol {

    Nodo padre;
    Nodo raiz;

    public Arbol() {
        raiz = null;

    }

    public void InsertaNodo(int elem) {
        if (raiz == null) {
            raiz = new Nodo(elem);
        } else {
            raiz.InsertaBinario(elem);
        }
    }

    public void Preorden(Nodo Nodo) {
        if (Nodo == null) {
            return;
        } else {
            System.out.println(Nodo.getElemento() + " ");
            Preorden(Nodo.getRamaIzq());
            Preorden(Nodo.getRamaDer());
        }
    }

    public void PostOrden(Nodo Nodo) {
        if (Nodo == null) {
            return;
        } else {
            PostOrden(Nodo.getRamaIzq());
            PostOrden(Nodo.getRamaDer());
            System.out.println(Nodo.getElemento() + "");
        }
    }

    public void Inorden(Nodo Nodo) {
        if (Nodo == null) {
            return;
        } else {
            Inorden(Nodo.getRamaIzq());
            System.out.println(Nodo.getElemento() + "");
            Inorden(Nodo.getRamaDer());
        }
    }

    void Busqueda(int Elem, Nodo A) {
        if ((A == null) | (A.getElemento() == Elem)) {
            System.out.print(A.getElemento() + " ");
            return;
        } else {
            if (Elem > A.getElemento()) {
                Busqueda(Elem, A.getRamaDer());
            } else {
                Busqueda(Elem, A.getRamaIzq());
            }
        }
    }

    public int Altura(Nodo Nodo) { // cuenta el número de niveles del árbol
        int Altder = (Nodo.getRamaDer() == null ? 0 : 1 + Altura(Nodo.getRamaDer()));
        int Altizq = (Nodo.getRamaIzq() == null ? 0 : 1 + Altura(Nodo.getRamaDer()));
        return Math.max(Altder, Altizq);
    }
}
