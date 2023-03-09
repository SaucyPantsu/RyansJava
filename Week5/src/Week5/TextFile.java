package Week5;

public class TextFile extends DesktopItem{
	public String item;
	
	public TextFile(String Name, int Size) {
		super(Name, Size);
	}
	
	public void add(String item) {
		this.item = this.item + item; 
	}

}
