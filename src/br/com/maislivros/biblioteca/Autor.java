package br.com.maislivros.biblioteca;

public class Autor {

   private String nome;
   private boolean genero; // False - feminino, True - masculino

   public String getNome() {
      return nome;
   }

   public void setNome(String nome) {
      this.nome = nome;
   }

   public boolean isGenero() {
      return genero;
   }

   public void setGenero(boolean genero) {
      this.genero = genero;
   }
}
