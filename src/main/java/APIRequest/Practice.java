package APIRequest;

public class Practice {
	int length;
	int width;
	
public void data(int lenght,int width)
{
	this.length=lenght;
	this.width=width;
}
public void display()
{
	System.out.println("Area of rectangle " +(length*width));
}
	
	public static void main(String[] args) {
		
		Practice obj=new Practice();
		obj.data(10, 20);
		obj.display();
	}

}
