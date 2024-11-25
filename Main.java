/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atvanimal;

public class Main {

 public static void main(String[] args) {
      
     Animal animal = new Animal();
      Animal animal2 = new Animal();

// Definindo nome, idade e espécie
animal.setNome("Spike");
animal.setIdade(15);
animal.setEspecie("Cachorro");

animal2.setNome("garfield");
animal2.setIdade(14);
animal2.setEspecie("gato");

// Imprimindo informações
animal.imprimirInformacoes(); 
 animal2.imprimirInformacoes();       
   }
    
}

