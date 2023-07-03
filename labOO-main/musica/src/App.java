import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<Musicas> todasMusicas = new ArrayList<>();

        todasMusicas.add(new MP3(
            "Afraid", 
            "I Love You.",
            "The Neighbourhood", 
            "Jesse Rutherford",
            2018, 
            320000)); //1
        todasMusicas.add(new MP3(
            "How", 
            "I Love You.", 
            "The Neighbourhood", 
            "Jesse Rutherford", 
            2018, 
            320000)); //2
        todasMusicas.add(new CD(
            "Let it Go", 
            "I Love You.", 
            "The Neighbourhood", 
            "Jesse Rutherford", 
            2018)); //3
        todasMusicas.add(new LP(
            "Amor De Verao", 
            "V", 
            "Maglore", 
            "Teago Oliveira", 
            2022, 
            33)); //4
        todasMusicas.add(new LP(
            "Mamma Mia", 
            "ABBA", 
            "ABBA", 
            "ABBA", 
            1975, 
            45)); //5
        todasMusicas.add(new MP3(
            "Take A Bow", 
            "Bedtime Stories", 
            "Madonna", 
            "Madonna", 
            1995, 
            310000)); //6
        todasMusicas.add(new LP(
            "Vira Vira", 
            "Mamonas Assassinas", 
            "Mamonas Assassinas", 
            "Mamonas Assassinas", 
            1995, 
            78)); //7
        todasMusicas.add(new CD(
            "Judas", 
            "Born This Way.", 
            "Lady Gaga", 
            "Lady Gaga", 
            2011)); //8
        todasMusicas.add(new CD(
            "Hot N Cold", 
            "One Of The Boys", 
            "Katy Perry", 
            "Katy Perry", 
            2008)); //9
        todasMusicas.add(new MP3(
            "Me Apaixonei Pela Pessoa Errada", 
            "Cartão Postal", "Exaltasamba", 
            "Exaltassamba", 1999, 
            180000)); //10

        Busca b = new Busca();
        b.buscaAnos90(todasMusicas);
        b.buscaCompositor(todasMusicas, "The Neighbourhood");
        b.buscaInterprete(todasMusicas, "ABBA");
        b.buscaTitulo(todasMusicas, "How");
    }
}
