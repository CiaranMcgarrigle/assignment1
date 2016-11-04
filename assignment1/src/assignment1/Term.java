package assignment1;
/**
 * 
 * @author Ciaran McGarrigle
 *
 */
public class Term {

	private String word;
	
	/**
	 * Constructor for Term Class
	 * @param word
	 */
	public Term(String word)
	{
		this.word = word;
	}
	
	/**
	 * Getter for firstName
	 * @return
	 */
	public String getWord()
	{
		return word;
	}
	
	/**
	 * Setter for firstName
	 * @param firstName
	 */
	public void setWord(String term){
		this.word = term;
	}

	public boolean contains(String substring) {
		// TODO Auto-generated method stub
		return false;
	}
}