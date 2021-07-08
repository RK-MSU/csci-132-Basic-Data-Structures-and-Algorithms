package FundamentalDataStructures;


/*
 * 	
 */
public class Arrays {
	
	private static GameEntry[] board;
	private static int numOfEntries;
	/*
	 * - Arrays have a static size, and must be declared before use
	 * - the instance field board will hold GameEntry instances
	 *
	 */
	
	public Arrays(GameEntry a)
	{
		if(board[board.length-1].equals(null))
		{
			board[numOfEntries] = a;
		}
		
	}
	
	public static void print()
	{
		
	}

}
