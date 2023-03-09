package Week5;

public class DesktopItem extends Folder{
	
	public DesktopItem(String Name, int Size) {
		super(Name, Size);
	}
	public String getName() {
		return Name;	
	}

	public void Rename(String NewName) {
		this.Name = NewName;
	}
}
