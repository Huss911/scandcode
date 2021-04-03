package Animal1 ;
public class Animal1 {
	int age ;
	public String gender ;
	public Animal1 (int old,String sex) {
		age = old ;
		gender = sex ;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Animal1 myzoo= new Animal1(8,"male");
		System.out.println(myzoo.age+ "" +myzoo.gender);
	}
}
