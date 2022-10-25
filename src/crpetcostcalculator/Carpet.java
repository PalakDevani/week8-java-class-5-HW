package crpetcostcalculator;

public class Carpet {
    double cost = 0;
    public Carpet(double cost) {
        this.cost=cost;
        if(cost<0){
            this.cost=cost;
        }
    }
    public double getCost(){
        return this.cost;
    }
}
