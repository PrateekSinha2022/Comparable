package Obje;

public class Main {
	public static void main(String[] args) {
		Studenty s1=new Studenty("Hari",20,58.5);
		Studenty s=new Studenty("Hai",20,58.5);
		System.out.println(s.equals(s1));
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
	}

}
