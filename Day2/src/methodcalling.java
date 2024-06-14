
public class methodcalling {
int a = 10;
int b = 20;

int display()
{
return(a);
}
public static void main(String[] args) {
	methodcalling object = new methodcalling();
	System.out.println(object.display());
}
}
