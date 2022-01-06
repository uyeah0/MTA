package fourthDay;

public class test_Exam33 {

	public static void main(String[] args) {
		String [][] board = new String[][] {
			{"1", "3", "4"},
			{"1", "3", "7", "2", "³²"},
			{"1", "3", "2"},
			{"1", "3", "4", "5"}
		};

		traverse(board);
	}
	public static void traverse( String[][] board ) {
		 for( int x  = 0;  x < board.length ; x++){
			for(int y = 0; y < board[x].length; y++){
				System.out.println(board[x][y]);
			}
		}
	}

}
