package com.algos;

public class Testing implements Inter{
	
	private static Integer x;
	
	static{
		x=0;
	}
	
	public static void main(String[] args) {
		
		
		x++;
		Integer x = new Integer(3);
		Integer y = new Integer(1);
		y=x;
		System.out.println(x==y);
		x=100;
		System.out.println(x.equals(y));
		System.out.println(x.hashCode());
		System.out.println(y.hashCode());
		
		
		Inter estaClase= new Testing();
		estaClase.entrada(); // solo tiene acceso al metodo definido en la inter
		
		Testing testing =  new Testing();
		testing.entrada(); // tiene acceso a los 2 metodos
		testing.entradaLocal();//
		
		
	}
	
	public String entradaLocal(){
		return null;
	}

	@Override
	public String entrada() {
		// TODO Auto-generated method stub
		return null;
	}

}
