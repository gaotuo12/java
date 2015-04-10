package ccdd;

public class Man {private int age;
private String name;
private int height;
private String gender;
public Man(int _age,String _name,int _height,String _gender){age=_age;
name = _name;height=_height;gender=_gender;}
public void canMerry(){
	if(gender=="male"){
		if(age>=22){
			System.out.printf("can merry");
		}
		else	System.out.printf("cannot merry");
	}
	
	else	if(age>=20)
		{
			System.out.printf("can merry");
		}
	else System.out.printf("cannot merry");
	
}

public int getage(){return age;}
public String getname(){return name;}
public int getheight(){return height;}

public void Print(){
	System.out.println("age" + age);
	System.out.println("name" + name);
	System.out.println("height" + height);
	System.out.println("gender" + gender);
	canMerry();
	}
}