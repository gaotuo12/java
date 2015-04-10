package aaa;

public class student{private String name;
private int grade;
private String major;
private int[] cet4_scores;
public student(String _name,int _grade,String _major,int _cet4_scores[])
{name=_name;
grade=_grade;
major=_major;
cet4_scores=_cet4_scores;}
public void level_up(){grade=grade+1;}
public boolean passed_cet4(){
	for(int i=0;i<cet4_scores.length;i++){
		if(cet4_scores[i]>=461){
			return true;
		}
	}
	return false;
}
public void printInfo(){
	System.out.println("name"+name);
	System.out.println("grade"+grade);
	System.out.println("major"+major);
	if ( passed_cet4())
	
     System.out.println("passed");
     else
    	 System.out.println("not pass");

}

}
