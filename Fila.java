import java.util.LinkedList;
import java.util.List;

/*
9277489 - Hortencia Lopes Barros Santos

 Escreva a implementação desta fila genérica, com base na especificação descrita
 no enunciado e nas suas escolhas feitas nos itens (a) e (b).
 */

public class Fila <T> {
    T elemento;

	public void setElemento(T elemento){
		this.elemento = elemento;
                //System.out.println(this.elemento);
	}

	public T getElemento(){
		return this.elemento;
	}
         
    public List adiciona(LinkedList fila, T elem){
       /*adiciona um elemento tipo T à fila */
       fila.add(elem);
       
       return fila;
    }
    
    public List remove(LinkedList fila){
       /*remove o primeiro elemento da fila */
       fila.remove(0);
       
       return fila;
    }
    
    public int tamanho(LinkedList fila){
        int tam = fila.size();
        return tam;
    }
}
