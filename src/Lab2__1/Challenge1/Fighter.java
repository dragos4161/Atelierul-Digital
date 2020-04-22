package Lab2__1.Challenge1;

import java.util.Objects;

public class Fighter extends Human{
    private int damagePerAtack;

    public Fighter(int damagePerAtack, int health, String name){
        super(health,name);
        this.damagePerAtack=damagePerAtack;
    }

    public int getDamagePerAtack() {.
        return damagePerAtack;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fighter fighter = (Fighter) o;
        return damagePerAtack == fighter.damagePerAtack;
    }

    @Override
    public int hashCode() {
        return Objects.hash(damagePerAtack);
    }
}
