/*class Box{
	int length,height,width;
Box(int l, int h, int w)
{
	length = l;
	height =h;
	width = w;
}
void area(){
int area = length*width;
System.out.println("Area of the box is" + area);
}
void volume(){
int volume = length*height*width;
System.out.println("volume of the box is" + volume);
}
}
class BoxDemo{
	public static void main(String[] args){
	Box b = new Box(10,20,30);
	b.area();
	b.volume();	
}
}
class Box{
	int length,height,width;
double volume(double l,double h, double w){
	return l*h*w;
}
}
class BoxDemo{
	public static void main(String[] args){
	Box b = new Box();
	double v = b.volume(10.2,20.3,30.4);
	System.out.println("volume of the box is" + v);
}
}*/
class Box{
	int length,height,width;
int area(int l, int w)
{
	return l*w;
}
double volume(double l,double h, double w){
	return l*h*w;
}
}
class BoxDemo{
	public static void main(String[] args){
	Box b = new Box();
	int a = b.area(10,30);
	System.out.println("area of the box is" + a);
	double v = b.volume(10.2,20.3,30.4);
	System.out.println("volume of the box is" + v);
}
}

