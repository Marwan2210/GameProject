package units;

public class Infantry extends Unit{

	public Infantry(int level, int maxSoldierCount, int currentSoldierCount,
			double idleUpkeep, double marchingUpkeep, double siegeUpkeep) {
		super(level, maxSoldierCount, currentSoldierCount, idleUpkeep, marchingUpkeep,
				siegeUpkeep);
	}
	
}
