public class Slime extends Object {
    
    int hp;

    public int attack(int targetHp) {
        System.out.println("スライムの攻撃！");
        System.out.println("魔法使いに5ポイントのダメージを与えた！");
        targetHp -= 5;
        return targetHp;
    }

}