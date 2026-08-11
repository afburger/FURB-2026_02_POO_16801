package exemplos.unidade01.membrosClasse;

public class AppCarro {


    public static void main(String[] args) {
        Carro c1 = new Carro();
        Carro c2 = new Carro();
        Carro c3 = new Carro();

        System.out.println("Id do carro 1: " + c1.getId() + " Contador: " + c1.getContador());
        System.out.println("Id do carro 2: " + c2.getId() + " Contador: " + c2.getContador());
        System.out.println("Id do carro 3: " + c3.getId() + " Contador: " + c3.getContador());
    }

}
