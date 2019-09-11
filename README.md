# Libreria de numeros complejos


## Uso General
Para utilizar dicha libreria se debe tener instalado el IDE Netbeans y se debe clonar o descargar los archivos del
repositorio, y desde Netbeans abrir el proyecto.

Al ejecutar la libreria esta muestra en pantalla los numero complejos con los que se estan trabajando y las operaciones que esta realizo 
con sus debido resultados. Para ejecutar las pruebas se debe abrir el paquete "Test", y ejecutar la clase "CNYTTest" desde Netbeans.

Si se desea cambiar de numeros complejos esto se debe hacer desde el codigo fuente en los atributos de la clase CNYT, donde el primer
numero del nuevo complejo es la parte entera o la longitud y el segundo numero es la parte imaginaria o el angulo.


## Contenido
### Numeros Comlpejos:
Suma, el metodo de esta es: public Complejo sumaComp(Complejo a, Complejo b)
Producto, el metodo de esta es: public Complejo multComp(Complejo a, Complejo b)
Resta, el metodo de esta es: public Complejo restaComp(Complejo a, Complejo b)
División, el metodo de esta es: public Complejo divComp(Complejo a, Complejo b)
Módulo, el metodo de esta es: public double modulo (Complejo a)
Conjugado, el metodo de esta es: public Complejo conjugado(Complejo a)
Conversión entre representaciones polar y cartesiano, el metodo de esta es: de polar a cartesiano public Complejo poCar(Complejo a) y de cartesiano a polar public Complejo caPol(Complejo a)
Retornar la fase de un número complejo., el metodo de esta es: public double fase(Complejo a)

### Vectores Comlpejos:
Adición de vectores complejos, el metodo de esta es: public ArrayList<Complejo> sumaVec(ArrayList<Complejo> vec1, ArrayList<Complejo>vec2)
Inversa de vectores complejos, el metodo de esta es: public ArrayList<Complejo> inversaVec(ArrayList<Complejo> vec1)
Multiplicación escalar de vectores complejos, el metodo de esta es:  public ArrayList<Complejo> multEscaVec(ArrayList<Complejo> vec1, Complejo a)

### Matrices Comlpejas:
Adición de matrices complejos, el metodo de esta es: public ArrayList<ArrayList<Complejo>> sumaMat(ArrayList<ArrayList<Complejo>> mat1, ArrayList<ArrayList<Complejo>> mat2)
Inversa de matrices complejos, el metodo de esta es: public ArrayList<ArrayList<Complejo>> inversaMat(ArrayList<ArrayList<Complejo>> mat1)
Multiplicación escalar de matrices complejas, el metodo de esta es: public ArrayList<ArrayList<Complejo>> multEscaMat(ArrayList<ArrayList<Complejo>> mat1, Complejo a)
Matriz transpuesta, el metodo de esta es: public ArrayList<ArrayList<Complejo>> transpuestaMat(ArrayList<ArrayList<Complejo>> mat1)
Matriz conjugada, el metodo de esta es: public ArrayList<ArrayList<Complejo>> conjugadoMat(ArrayList<ArrayList<Complejo>> mat1)
Matriz adjunta, el metodo de esta es: public ArrayList<ArrayList<Complejo>> adjuntaMat(ArrayList<ArrayList<Complejo>> mat1)
Función para calcular la "acción" de una matriz sobre un vector, el metodo de esta es:  public ArrayList<Complejo> accionMatVec(ArrayList<ArrayList<Complejo>> mat1, ArrayList<Complejo> vec1 )
Norma de matrices, el metodo de esta es: public Complejo normaMat(ArrayList<ArrayList<Complejo>> mat1)
Distancia entrematrices, el metodo de esta es: public Complejo distMat(ArrayList<ArrayList<Complejo>> mat1, ArrayList<ArrayList<Complejo>> mat2)
Revisar si es unitaria, el metodo de esta es: public boolean unitariaMat(ArrayList<ArrayList<Complejo>> mat1)
Revisar si es Hermitian, el metodo de esta es: public boolean hermitianMat(ArrayList<ArrayList<Complejo>> mat1)
Producto tensor, el metodo de esta es:  public ArrayList<ArrayList<Complejo>> productoTensorMat(ArrayList<ArrayList<Complejo>> mat1, ArrayList<ArrayList<Complejo>> mat2)


## Autor
Johan Nicolas Cortes Torres
