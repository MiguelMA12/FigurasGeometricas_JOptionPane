
package calculadorageometrica;

import javax.swing.JOptionPane;

/**
 *
 * @author ayeri
 */
public class Datos {
  Figuras fig = new Figuras();

  public void Entrada() {
    double radio, lado, base, altura, arista;

    radio = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el radio del círculo: "));
    fig.AreaCirculo(radio);

    lado = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el lado del cuadrado: "));
    fig.AreaCuadrado(lado);

    base = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la base del triángulo: "));
    altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la altura del triángulo: "));
    fig.AreaTriangulo(base, altura);

    base = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la base del rectángulo: "));
    altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la altura del rectángulo: "));
    fig.AreaRectangulo(base, altura);

    radio = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el radio de la esfera: "));
    fig.AreaEsfera(radio);

    arista = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la arista del cubo: "));
    fig.AreaCubo(arista);
  }
}
