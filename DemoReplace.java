package stringdemo;

public class DemoReplace 
{


	public static void main(String[] args)
	{
     String word="Kunal Kadam";
		
		String word2=word.replace('l', 'k');

		String word3=word.replace("Kunal","Dhanaji");
		
		System.out.println("word:"+word);
		System.out.println("word2:"+word2);
		System.out.println("word3:"+word3);
		
		String message="You are with me now .No one can replace this.";
		String message2=message.replace("You", "me");
		String message3=message.replaceFirst("You", "You");
		
		System.out.println("message:"+message);
		System.out.println("message2:"+message2);
		System.out.println("message3"+message3);


	}

}
