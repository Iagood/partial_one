package aplicacao.entidade;

public class Aluno {
	private Double nota1;
	private Double nota2;
	private Double nota3;
	
	public Aluno() {
		
	}
	public Aluno(Double nota1, Double nota2, Double nota3) {
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
	}
	public Double getNota1() {
		return nota1;
	}
	public void setNota1(Double nota1) {
		this.nota1 = nota1;
	}
	public Double getNota2() {
		return nota2;
	}
	public void setNota2(Double nota2) {
		this.nota2 = nota2;
	}
	public Double getNota3() {
		return nota3;
	}
	public void setNota3(Double nota3) {
		this.nota3 = nota3;
	}
	public Double media(Double nota1, Double nota2, Double nota3) {
		return (nota1 + nota2 + nota3) / 3;
	}
	
}
