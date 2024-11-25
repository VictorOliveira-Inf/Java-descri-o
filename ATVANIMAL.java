
package atvanimal;



 class Animal{
 
private String nome;
private int idade;
private String especie; 


public String getnome() {
return nome;
 
 }
public int getIdade() {
return idade;
}
public String getEspecie() {
return especie;
}
public void setNome(String nome) {
this.nome = nome;
}

public void setIdade(int idade) {
if (idade >= 0) {
this.idade = idade;
} else {
System.out.println("Idade não pode ser negativa.");
}


}
public void setEspecie(String especie) {
this.especie = especie;
}

// Método para imprimir informações
public void imprimirInformacoes() {
System.out.println("Nome: " + nome);
System.out.println("Idade: " + idade);
System.out.println("Espécie: " + especie);


}
}
 


