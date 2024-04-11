package Geometrica;

public class Figura {
	
	private float base;
	private float altura;
	private Tipo_Figura tipo;
	private float area;
	private static int contador;
	
	public Figura(float base, float altura, Tipo_Figura tipo) {
		this.base = base;
		this.altura = altura;
		this.tipo = tipo;
		Calc_area();
		contador++;
	}
	
	private void Calc_area() {
		if(this.tipo == Tipo_Figura.TRIANGULO) this.area = (base*altura)/2;
		if(this.tipo == Tipo_Figura.RETANGULO) this.area = base*altura;
	}

	public float getBase() {
		return base;
	}

	public void setBase(float base) {
		this.base = base;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public Tipo_Figura getTipo() {
		return tipo;
	}
	
	public static int getContador() {
		return contador;
	}

	public void setTipo(Tipo_Figura tipo) {
		this.tipo = tipo;
	}

	public float getArea() {
		return area;
	}

}
