package Lab2__1.Challenge1;

public class BoxingMatch {
    private Fighter f1;
    private Fighter f2;

    public BoxingMatch(Fighter f1, Fighter f2){
        this.f1=f1;
        this.f2=f2;

    }

    public String fight(){
        String winner = "";
        while(f1.getHealth()>0&&f2.getHealth()>0){
            f2.decreaseHealth(f1.getDamagePerAtack());
            f1.decreaseHealth(f2.getDamagePerAtack());
        }
        if(f1.getHealth()>0){
            winner = f1.getName();
        }
        else{
            winner = f2.getName();
        }
        return winner;
    }
}
