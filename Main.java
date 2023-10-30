import filter.FilterService;

public class Main {
    public static void main(String[] args) {
        //clasa anonima
//        Carnivor carnivor = () -> System.out.println("Ursul mananca Carne");
//        carnivor.manancaCarne();
//        Carnivor leu = new Leu();
//        leu.manancaCarne();
        //lambda
//        Carnivor carnivor1 = () -> System.out.println("Mananca carne lup");
//        carnivor1.manancaCarne();

//        AnimalService animalService = new AnimalService();
//        animalService.manancaIarba(new Zebra());
//        Erbivor erbivor = new Erbivor() {
//            @Override
//            public void manancaIarba() {
//                System.out.println("Mananca Iarba Panda");
//            }
//        };
//        animalService.manancaIarba(erbivor);
//        Erbivor iepure = () -> System.out.println("Mananca iarba Iepure");
//        animalService.manancaIarba(iepure);

//        animalService.mananca(new Leu());
//        animalService.mananca(()-> System.out.println("Mananca carne Puma"));
//        animalService.mananca(()-> System.out.println("Mananca carne Lup"));
//        animalService.mananca(()-> System.out.println("Mananca carne Urs"));
//        animalService.mananca(()-> System.out.println("Mananca carne Vulpe"));

//        Carnivor[] carnivors = new Carnivor[3];
//        carnivors[0] = new Leu();
//        carnivors[1] = () -> System.out.println("Mananca carne Urs");
//        carnivors[2] = () -> System.out.println("Mananca carne Panda");
//        for (Carnivor carnivor: carnivors) {
//            carnivor.manancaCarne();
//        }

//        AnimalService animalService = new AnimalService();
//        animalService.mananca(new String[]{"Leu", "Urs", "Panda"});

//        Erbivor erbivor = (String nume) -> System.out.println("Mananca iarba " + nume);
//        erbivor.manancaIarba("Panda");
//
//        Carnivor carnivor = (String nume) -> System.out.println("Mananca carne " +nume);
//        carnivor.manancaCarne("Urs");

//        Erbivor erbivor = (String nume) -> "Mananca iarba" + nume;
//        System.out.println(erbivor.manancaIarba("Panda"));

        FilterService filterService = new FilterService();
        String[] filteredValues = filterService.filter(new String[]{"Andrei", "Ion", "Anton"}, (String nume) -> nume.startsWith("A"));
        String[] filteredValues2 = filterService.filter(new String[]{"Andrei", "Ion", "Anton"}, (String nume) -> nume.endsWith("n"));
        for (String name: filteredValues){
            System.out.println(name);
        }
        for (String name: filteredValues2){
            System.out.println(name);
        }
    }
}