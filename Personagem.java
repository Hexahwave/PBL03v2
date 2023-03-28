public class Personagem {
    //criando as informações dos personagens
    //o nome ficou public pois eu não conseguia acessar ele na classe "Jogo" e não sabia como fazer com ele em private
    private String nome;
    private int maxVida;
    private int vida;
    private int maxMana;
    private int mana;
    private String time;

    public Personagem(String nome, int maxVida, int maxMana, String time)
    {
        this.nome = nome;
        this.maxVida = maxVida;
        this.maxMana = maxMana;
        this.vida = maxVida;
        this.mana = maxMana;
        this.time = time;
    }
    public void tomarDano(int dano)
    {
        if (dano >= this.vida)
        {
            this.vida = 0;
            System.out.println(this.nome + " do time " + this.time + " foi eliminado e voltou para a base");
            this.setMana(maxMana);
            this.setVida(maxVida);
            return;
        }
        this.vida -= dano;
        System.out.println("O dano recebido por " + this.nome + " do time " + this.time + " foi de " + dano);
        System.out.println("A vida de " + this.nome + " do time " + this.time + " é de " + this.vida);

    }
    public void usarSkill(String tecla, int manaGasta)
    {
        if (manaGasta >= this.mana)
        {
            this.mana = 0;
            System.out.println(this.nome + " do time " + this.time + " não pode castar seu " + tecla);
            return;
        }
        this.mana -= manaGasta;
        System.out.println("A mana gasta por " + this.nome + " do time " + this.time + " para castar sua skill " + tecla + " foi de " + manaGasta);
        System.out.println("A mana de " + this.nome + " do time " + this.time + " é de " + this.mana);
    }
    public int setVida(int vida)
    {
        this.vida = maxVida;
        System.out.println("Ao voltar base, a vida de " + this.nome + " foi recuperada");
        System.out.println("Agora sua vida é " + maxVida);
        return vida;
    }
    public int setMana(int mana)
    {
        this.mana = maxMana;
        System.out.println("Ao voltar base, a mana de " + this.nome + " foi recuperada");
        System.out.println("Agora sua mana é " + this.maxMana);
        return mana;
    }
    public String getNome()
    {
        return nome;
    }
}
