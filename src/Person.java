
public class Person {
	private String name;
    private String gender;
    private int age;
    private int tall;
    
    public Person(String _name,String _gender,int _age,int _tall)
    {
    	 name=_name;
    	 gender=_gender; 
    	 age=_age;
         tall=_tall;    
    	
    }
   /* public String getname(){
    	return this.name;
    }
    public String getgender(){
    	return this.gender;
    }
    public int getage(){
    	return this.age;
    }
    public int tall(){
    	return this.tall;
    }*/
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
    public void Print(){
    	System.out.println("name" + name);
    	System.out.println("gender" + gender);
    	System.out.println("age" + age);
    	canMerry();
    }
    

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Person name = new Person("xiaoming","male",11,178);
		name.Print();
		
		
		// TODO Auto-generated method stub

	}

}
