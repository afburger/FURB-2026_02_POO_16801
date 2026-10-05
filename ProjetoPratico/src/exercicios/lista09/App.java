package exercicios.lista09;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        // Parte C: prova que classes abstratas nao podem ser instanciadas.
        // Conteudo c = new Conteudo("Generico", 120);
        //   Erro: Conteudo is abstract; cannot be instantiated
        // Plano p = new Plano("Generico", 1);
        //   Erro: Plano is abstract; cannot be instantiated

        // Parte D: prova que PlanoGratuito nao pode ser estendido.
        // class PlanoVIP extends PlanoGratuito {}
        //   Erro: cannot inherit from final PlanoGratuito

        Scanner scanner = new Scanner(System.in);
        ArrayList<Usuario> usuarios = new ArrayList<>();
        ArrayList<Musica> musicas = new ArrayList<>();
        ArrayList<Podcast> podcasts = new ArrayList<>();

        usuarios.add(new Usuario("Ana", "ana@email.com"));
        usuarios.add(new Usuario("Bob", "bob@email.com"));
        musicas.add(new Musica("Bohemian Rhapsody", "Queen", "A Night at the Opera", 354));
        musicas.add(new Musica("Hotel California", "Eagles", "Hotel California", 391));
        podcasts.add(new Podcast("The Joe Rogan Experience", "Joe Rogan", 1, 3600));

        int opcao = -1;
        while (opcao != 0) {
            System.out.println("\n=== Sonora ===");
            System.out.println("1. Reproduzir todos os conteudos");
            System.out.println("2. Ver contador de reproducoes");
            System.out.println("3. Trocar plano de um usuario");
            System.out.println("4. Ver resumo do plano de um usuario");
            System.out.println("0. Sair");
            System.out.print("Opcao: ");

            try {
                opcao = Integer.parseInt(scanner.nextLine());

                switch (opcao) {
                    case 1:
                        for (Musica m : musicas) {
                            m.reproduzir();
                        }
                        for (Podcast p : podcasts) {
                            p.reproduzir();
                        }
                        break;

                    case 2:
                        for (Musica m : musicas) {
                            System.out.println(m.getTitulo() + ": " + m.getReproducoes() + " reproducao(oes)");
                        }
                        for (Podcast p : podcasts) {
                            System.out.println(p.getTitulo() + ": " + p.getReproducoes() + " reproducao(oes)");
                        }
                        break;

                    case 3: {
                        for (int i = 0; i < usuarios.size(); i++) {
                            System.out.println((i + 1) + ". " + usuarios.get(i).getNome());
                        }
                        System.out.print("Escolha o usuario: ");
                        int uIdx = Integer.parseInt(scanner.nextLine()) - 1;
                        if (uIdx < 0 || uIdx >= usuarios.size()) {
                            throw new IllegalArgumentException("Usuario invalido.");
                        }
                        Usuario u = usuarios.get(uIdx);

                        System.out.println("1. Gratuito  2. Individual  3. Familia");
                        System.out.print("Escolha o plano: ");
                        int pOpc = Integer.parseInt(scanner.nextLine());

                        switch (pOpc) {
                            case 1:
                                u.assinar(new PlanoGratuito());
                                break;
                            case 2:
                                System.out.print("Preco mensal: R$ ");
                                double precoInd = Double.parseDouble(scanner.nextLine());
                                u.assinar(new PlanoIndividual(precoInd));
                                break;
                            case 3:
                                System.out.print("Preco mensal: R$ ");
                                double precoFam = Double.parseDouble(scanner.nextLine());
                                System.out.print("Numero de membros (1-6): ");
                                int membros = Integer.parseInt(scanner.nextLine());
                                u.assinar(new PlanoFamilia(precoFam, membros));
                                break;
                            default:
                                throw new IllegalArgumentException("Opcao de plano invalida.");
                        }
                        System.out.println("Plano atualizado: " + u.getPlano().resumo());
                        break;
                    }

                    case 4: {
                        for (int i = 0; i < usuarios.size(); i++) {
                            System.out.println((i + 1) + ". " + usuarios.get(i).getNome());
                        }
                        System.out.print("Escolha o usuario: ");
                        int uIdx = Integer.parseInt(scanner.nextLine()) - 1;
                        if (uIdx < 0 || uIdx >= usuarios.size()) {
                            throw new IllegalArgumentException("Usuario invalido.");
                        }
                        System.out.println(usuarios.get(uIdx).getPlano().resumo());
                        break;
                    }

                    case 0:
                        System.out.println("Ate logo!");
                        break;

                    default:
                        System.out.println("Opcao invalida.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada invalida: esperava um numero.");
            } catch (IllegalArgumentException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }

        scanner.close();
    }
}
