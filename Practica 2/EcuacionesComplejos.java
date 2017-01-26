import java.utils.*;

public class EcuacionesComplejos {
	public static void main(String[] args)
	{
		float a=4, b=8, c=12, d=-15, e=10, f=0, g=12, h=-6, i=-5, j=7, k=35, l=-3;
		/* Relacion variables creadas con coeficientes de ambas ecuaciones complejas
		(a + bj)x + (c + dj) = (e + fj) Primera Ecuacion
		(g + hj)x + (i + jj) = (k + lj) Segunda Ecuacion */
		float det1, det2, var1, var2, var3, var4, div, div_real1, div_img1, div_real2, div_img2, x_real, x_img, y_real, y_img, angulo, angulo_grados;

		det1 = ((a*i) - (b*j)) - ((g*c) - (h*d));
		det2 = ((a*j) + (b*i)) - ((g*d) + (h*c));
		var1 = ((e*i) - (f*j)) - ((k*c) - (l*d));
		var2 = ((e*j) + (f*i)) - ((k*d) + (l*c));
		var3 = ((a*k) - (b*l)) - ((g*e) - (h*f));
		var4 = ((a*l) + (b*k)) - ((g*f) + (h*e));

		div = ((float) Math.pow(det1,2) + (float) Math.pow(det2, 2));
		div_real1 = ((var1*det1) + (var2*det2));
		div_img1 = ((var1*det2*-1) + (var2*det1));
		div_real2 = ((var3*det1) + (var4*det2));
		div_img2 = ((var3*det2*-1) + (var4*det1));

		x_real = (div_real1/div);
		x_img = (div_img1/div);
		y_real = (div_real2/div);
		y_img = (div_img2/div);

		System.out.println("*** Solucion Forma Polar ***");
		System.out.print("Variable X: magnitud = " +
			(float)Math.sqrt((float)Math.pow(x_real, 2) +
			(float)Math.pow(x_img, 2)));
		angulo = (float)Math.atan(x_img/x_real);
		angulo_grados = (float) Math.toDegrees(angulo);
		System.out.println(" angulo = " + angulo_grados + " (grados)");
		System.out.print("Variable Y: magnitud = " + 
			(float)Math.sqrt((float)Math.pow(y_real,2) +
			(float)Math.pow(y_img, 2)));
		angulo = (float)Math.atan(y_img/y_real);
		angulo_grados = (float) Math.toDegrees(angulo);
		System.out.println(" angulo = " + angulo_grados + " (grados)");
	}
}