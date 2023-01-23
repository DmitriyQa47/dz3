public class BonusMilesService {
    public int calculate(int cost) {

        int Formula = 20;

        int bonusMiles = cost / Formula;

        return bonusMiles;
    }
}
