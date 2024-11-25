/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atv2;

class Livro{

private String titulo;
private String autor;
private int anoPublicacao;

public String getTitulo(){
return titulo;
}

public String getAutor(){
return autor;
}

public int getAnoPublicacao(){
return anoPublicacao;
}
public void setTitulo(String titulo) {
this.titulo = titulo;
}

public void setAutor(String autor) {
this.autor = autor;
}

public void setAnoPublicacao(int anoPublicacao) {
if (anoPublicacao > 0) {
this.anoPublicacao = anoPublicacao;
}
else {

System.out.println("Ano de publicação inválido.");
}
}
public void imprimirInformacoes() {
System.out.println("Titulo: " + titulo);
System.out.println("Autor: " + autor);
System.out.println("Ano de Publicacao: " + anoPublicacao);
}
}
public class ATV2 {

   public static void main(String[] args) {
        Livro livro = new Livro();


livro.setTitulo("Dom Casmurro");
livro.setAutor("Machado de Assis");
livro.setAnoPublicacao(1899);

   Livro livro2 = new Livro();


livro2.setTitulo("50 tons de cinza");
livro2.setAutor("algumacoisa");
livro2.setAnoPublicacao(2010);


livro.imprimirInformacoes();
livro2.imprimirInformacoes();



}
      
    }
    
