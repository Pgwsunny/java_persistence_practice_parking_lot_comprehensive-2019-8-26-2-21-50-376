package tws.entity;

public class ParkingLot {
	private int parkingLotID;
	private int availablePositionCount;
    private int totalCount;
    
    public ParkingLot() {
    	
    }
    
	public ParkingLot(int parkingLotID, int availablePositionCount, int totalCount) {
		this.parkingLotID = parkingLotID;
		this.availablePositionCount = availablePositionCount;
		this.totalCount = totalCount;
	}


	public int getAvailablePositionCount() {
		return availablePositionCount;
	}
	public void setAvailablePositionCount(int availablePositionCount) {
		this.availablePositionCount = availablePositionCount;
	}
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	public int getParkingLotID() {
		return parkingLotID;
	}
	public void setParkingLotID(int parkingLotID) {
		this.parkingLotID = parkingLotID;
	}
    
}
