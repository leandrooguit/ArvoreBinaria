
public class ArvoreBinaria {

	private int valor;
	ArvoreBinaria esquerda;
	ArvoreBinaria direita;
	
	public ArvoreBinaria(){
		
	}
	
	public ArvoreBinaria(int valor, ArvoreBinaria esquerda, ArvoreBinaria direita) {
		this.valor = valor;
		this.esquerda = esquerda;
		this.direita = direita;
	}
	
	public void SomarNo(int valor) {
		if (this.valor == valor) {
			System.out.println("Resultado da soma: " + somar());
		} else {
			if (this.esquerda!= null) {
				this.esquerda.SomarNo(valor); 
			}
			if (this.direita != null) {
				this.direita.SomarNo(valor);
			}
		}
		return;
	}
	
	public int somar() {
		return valor 
				+ (esquerda == null? 0 : esquerda.somar())
				+ (direita == null? 0 : direita.somar());
	}
	
	public int getValor() {
		return valor;
	}
	
	public void setValor(int valor) {
		this.valor = valor;
	}
	
	public ArvoreBinaria getEsquerda() {
		return esquerda;
	}
	
	public void setEsquerda(ArvoreBinaria esquerda) {
		this.esquerda = esquerda;
	}
	
	public ArvoreBinaria getDireita() {
		return direita;
	}
	
	public void setDireita(ArvoreBinaria direita) {
		this.direita = direita;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + valor;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ArvoreBinaria other = (ArvoreBinaria) obj;
		if (valor != other.valor)
			return false;
		return true;
	}
	
}
