package qqq;

public class L {public double longen;
public double wenth;
public String color;
public double s;
public L(double _longen,double _wenth,String _color){
	 longen=_longen;
	 wenth=_wenth;
	 color=_color;
	
}
public L(double _longen,double _wenth){
	 longen=_longen;
     wenth=_wenth;
	 color="red";
}
public L(String _color){
	longen=14;
	wenth=11;
	 color=_color;
}
public L(){
	longen=10;
	wenth=11;
	color="unknown";
}
public double get_area(  ){
	
	s=longen*wenth;
	return s;
	
}
public void Setlongen( int _longen){
	longen=_longen;
}
public void Setwenth( int _wenth){
	wenth=_wenth;
}public void Setcolor( String _color){
color=_color;
}
public void printInfo(){
	System.out.println("lengen="+longen);
	System.out.println("wenth="+wenth);
	System.out.println("color "+color);
	get_area();
	System.out.println("s="+s);
}
}
