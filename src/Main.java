class Veiculo {

        protected String marca;
        protected int anoFabrico;

        public Veiculo (String marca, int anoFabrico){
            this.marca = marca;
            this.anoFabrico = anoFabrico;
        }

        public void apresentar() {
            System.out.println("Marca: " + marca + ", Ano de Fabrico: " + anoFabrico);
        }
}

class Carro extends Veiculo {
    private int numPortas;

    public Carro (String marca, int anoFabrico, int numPortas) {
        super(marca, anoFabrico);
        this.numPortas = numPortas;
    }

    @Override
    public void apresentar() {
        super.apresentar();
        System.out.println("Número de Portas:" + numPortas);
    }
}

class Moto extends Veiculo {
    private String tipo;

    public Moto (String marca, int anoFabrico, String tipo) {
        super(marca, anoFabrico);
        this.tipo = tipo;
    }

    @Override
    public void apresentar() {
        super.apresentar();
        System.out.println("Tipo de Moto:" + tipo);
    }
}

public class Main {
    public static void main (String[] args) {
        Carro meuCarro = new Carro("Mustang", 2020, 4);
        Moto minhaMota = new Moto("Kawasaki", 2018, "Esportiva");

        System.out.println("Informações do Carro:");
        meuCarro.apresentar();

        System.out.println("\nInformações da Mota:");
        minhaMota.apresentar();
    }
}