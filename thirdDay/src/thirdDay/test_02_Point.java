package thirdDay;

public class test_02_Point {

		private int x,y;
		public test_02_Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
		public boolean equals(Object obj) {
			test_02_Point p = (test_02_Point)obj;
			if(x == p.x && y == p.y) return true;
			else return false;
		}
}
