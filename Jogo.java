import java.util.ArrayList;

public class Jogo {
    public void times()
    {
        timeAzul = new ArrayList<>();
        timeVerm = new ArrayList<>();
    }
    private Mapa summoner;
    private Personagem yuumi;
    private Personagem nilah;
    private Personagem aphelios;
    private Personagem jhin;
    private Personagem nautilus;
    private Personagem kayle;
    private Personagem seraphine;
    private Personagem ornn;
    private Personagem udyr;
    private Personagem azir;
    private Personagem jun;
    public ArrayList<Personagem> timeAzul;
    public ArrayList<Personagem> timeVerm;

    public void mapa()
    {
        summoner = new Mapa("Summoner's Rift");
    }
    public void timeSet()
        {
        nilah = new Personagem("Nilah", 3000, 2000, "Dor de cotovelo");
        aphelios = new Personagem("Aphelios", 1800,  2300, "Batata quente");
        jhin = new Personagem("Jhin", 1900, 1800, "Dor de cotovelo");
        nautilus = new Personagem("Nautilus", 4000, 2300, "Dor de cotovelo");
        kayle = new Personagem("Kayle", 2600, 1500, "Batata quente");
        seraphine = new Personagem("Seraphine", 2100, 2700, "Dor de cotovelo");
        ornn = new Personagem("Ornn", 4500, 1800, "Batata quente");
        udyr = new Personagem("Udyr", 3200, 2600, "Dor de cotovelo");
        azir = new Personagem("Azir", 2200, 2300, "Batata quente");
        yuumi = new Personagem("Yuumi", 800, 2000, "Batata quente");
        jun = new Personagem("Jun", 10, 0, "Dor de cotovelo e batata quente");
        timeAzul.add(yuumi);
        timeAzul.add(jhin);
        timeAzul.add(kayle);
        timeAzul.add(azir);
        timeAzul.add(ornn);
        timeVerm.add(nilah);
        timeVerm.add(aphelios);
        timeVerm.add(nautilus);
        timeVerm.add(seraphine);
        timeVerm.add(udyr);
        }
        //não sei como deixar a segunda equipe alinhada, mas na minha tela ta mais ou menos numa linha
        public void timesList() {
            System.out.println("Time 1                    Time 2");
            System.out.println("Batata quente         Dor de cotovelo");
            System.out.println("");
            for (int x = 0; x < 5; x++)
            {

                System.out.print(timeAzul.get(x).getNome());
                System.out.print("                      ");
                System.out.print(timeVerm.get(x).getNome());
                System.out.println("");
            }
        }

    public void inicio()
    {
        mapa();
        times();
        timeSet();
        timesList();
        System.out.println("");
        yuumi.usarSkill("Q", 100);
        System.out.println();
        aphelios.tomarDano(200);
        System.out.println();
        seraphine.tomarDano(4000);
    }
}
