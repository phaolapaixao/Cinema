public class Main {
    public static void main(String[] args) {

        Filme filme1 = new Filme();
        filme1.setTitulo("Divertidamente");
        filme1.setGenero("infantil");
        filme1.setDuracao("1:30\n");

        Filme filme2 = new Filme();
        filme2.setTitulo("Para todos os garotos que já amei");
        filme2.setGenero("romance");
        filme2.setDuracao("1:45");

        System.out.println("Filmes Disponiveis:\n");
        System.out.println(filme1.getTitulo());
        System.out.println(filme1.getGenero());
        System.out.println(filme1.getDuracao());

        System.out.println(filme2.getTitulo());
        System.out.println(filme2.getGenero());
        System.out.println(filme2.getDuracao());
    }
}