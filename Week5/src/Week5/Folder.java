package Week5;

public class Folder implements group{
	public int Size;
	public String Name;
	public String Data;
	
	public Folder(String name, int Size) {
		this.Size = Size;
		this.Name = name;
	}

	public void MakeData(String Data) {
		this.Data = Data;
	}
	
	public int getSize() {
		return Size;
	}
	public String open() {
		return Data;
	}
	
	@Override
	public void add(String item) {
		// TODO Auto-generated method stub
		
	}

}
