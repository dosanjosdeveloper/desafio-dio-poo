package br.com.dosanjosdeveloper.desafio.dominio;

public abstract class Conteudo {
   protected static final double XP_PADRAO = 10d;

   private String titulo;
   private String decricao;

   public String getTitulo() {
      return titulo;
   }

   public void setTitulo(String titulo) {
      this.titulo = titulo;
   }

   public String getDecricao() {
      return decricao;
   }

   public void setDecricao(String decricao) {
      this.decricao = decricao;
   }

   public static double calculaXp() {
      return XP_PADRAO;
   }

   public abstract double calcularXp();
}
