package textadventure;
public class Rooms {
    
    String name;
    Rooms[] neighbors = new Rooms[4];
    
    public static final NORTH=0;
    public static final EAST=1;
    public static final SOUTH=2;
    public static final WEST=3;
	
	public Rooms (String name, Rooms north, Rooms east, Rooms south, Rooms west)
	{
		this.name = name;
		neighbors[0] = north;
                neighbors[1] = east;
                neighbors[2] = south;
                neighbors[3] = west;
	}
	
	
	public Rooms getRoomsInDirection(int dir){
            return neighbors[dir];
        }

}
	

