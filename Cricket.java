// cricket is- a game

package inheritance;

class Game
{
	public void Type()

	{
		System.out.println(" OUTDOOR");
		
	}
}
class Cricket1 extends Game
{
	
public void Type()
{
	System.out.println("Cricket is outdoor game");
}
	

}


//
//public class Cricket {

//	public static void main(String[] args) {
//		
//		Game gm=new Game();
//		gm.Type();   // call game class method
//		
//		Cricket ck=new Cricket();
//		ck.Type();   // call Cricket class method
//		
//		Game gm2=new Game();
//		gm.Type();
//
//		gm=ck;  // gm refers to  cricket object
//		gm.Type(); // call cricket class method
//	}
//
//	}
//
//}
