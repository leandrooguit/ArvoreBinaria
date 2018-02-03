
public class TesteArvore {

	public static void main(String[] args) {
		ArvoreBinaria raiz = new ArvoreBinaria();
		raiz.setValor(1);
		
		ArvoreBinaria no_1 = new ArvoreBinaria();
		no_1.setValor(2);
		no_1.setEsquerda(new ArvoreBinaria(4, null, null));
		no_1.setDireita(new ArvoreBinaria(5, null, new ArvoreBinaria(7, null, null)));
		raiz.setEsquerda(no_1);
		
		raiz.setDireita(new ArvoreBinaria(3, null, new ArvoreBinaria(6, null, null)));

		raiz.SomarNo(5);
	}

}
