package Encapsulacion;


public class Persona {

	public static void main(String[] args) {

        // 1️ PERSONA
        System.out.println("=== PERSONAS ===");
        Persona p1 = new Persona("Juan", "Perez", 20);
        Persona p2 = new Persona("Maria", "Lopez", 25);
        Persona p3 = new Persona("Carlos", "Ramirez", 30);

        p1.mostrar();
        p2.mostrar();
        p3.mostrar();

        // 2️⃣ RECTANGULO
        System.out.println("\n=== RECTANGULOS ===");
        Rectangulo r1 = new Rectangulo(5, 4);
        Rectangulo r2 = new Rectangulo(6, 3);

        if (r1.area() > r2.area()) {
            System.out.println("El rectangulo 1 tiene mayor area");
        } else {
            System.out.println("El rectangulo 2 tiene mayor area");
        }

        // 3️⃣ PRODUCTO
        System.out.println("\n=== PRODUCTOS ===");
        Producto prod1 = new Producto("001", "Laptop", 5000);
        Producto prod2 = new Producto("002", "Mouse", 100);

        prod1.aplicarDescuento(10);
        prod2.aplicarDescuento(20);

        prod1.mostrar();
        prod2.mostrar();

        // 4️⃣ CUENTA
        System.out.println("\n=== CUENTA ===");
        Cuenta cuenta = new Cuenta("Luis", 1000);

        cuenta.depositar(500);
        cuenta.retirar(200);
        cuenta.retirar(2000);
        cuenta.mostrar();

        // 5️⃣ LIBRO
        System.out.println("\n=== LIBROS ===");
        Libro l1 = new Libro("Libro A", "Autor A", 150);
        Libro l2 = new Libro("Libro B", "Autor B", 350);
        Libro l3 = new Libro("Libro C", "Autor C", 500);

        System.out.println("Libro 1 largo: " + l1.esLargo());
        System.out.println("Libro 2 largo: " + l2.esLargo());
        System.out.println("Libro 3 largo: " + l3.esLargo());

        // 6️⃣ CALCULADORA
        System.out.println("\n=== CALCULADORA ===");
        Calculadora calc = new Calculadora();

        System.out.println("Suma: " + calc.sumar(10, 5));
        System.out.println("Resta: " + calc.restar(10, 5));
        System.out.println("Multiplicacion: " + calc.multiplicar(10, 5));
        System.out.println("Division: " + calc.dividir(10, 0));

        // 7️⃣ FECHA
        System.out.println("\n=== FECHAS ===");
        Fecha f1 = new Fecha(10, 5, 2024);
        Fecha f2 = new Fecha(35, 2, 2024);
        Fecha f3 = new Fecha(25, 13, 2024);

        System.out.println("Fecha 1 valida: " + f1.esValida());
        System.out.println("Fecha 2 valida: " + f2.esValida());
        System.out.println("Fecha 3 valida: " + f3.esValida());
    }
}

//  CLASE PERSONA
class Persona {
    String nombre;
    String apellido;
    int edad;

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public void mostrar() {
        System.out.println("Nombre: " + nombre + " Apellido: " + apellido + " Edad: " + edad);
    }
}

//  CLASE RECTANGULO
class Rectangulo {
    double base, altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double area() {
        return base * altura;
    }

    public double perimetro() {
        return 2 * (base + altura);
    }
}

//  CLASE PRODUCTO
class Producto {
    String codigo, nombre;
    double precio;

    public Producto(String codigo, String nombre, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }

    public void aplicarDescuento(double porcentaje) {
        precio -= precio * porcentaje / 100;
    }

    public void mostrar() {
        System.out.println("Codigo: " + codigo + " Nombre: " + nombre + " Precio: " + precio);
    }
}

// 🔹 CLASE CUENTA
class Cuenta {
    String titular;
    double saldo;

    public Cuenta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double monto) {
        saldo += monto;
    }

    public void retirar(double monto) {
        if (saldo >= monto) {
            saldo -= monto;
        } else {
            System.out.println("No hay saldo suficiente");
        }
    }

    public void mostrar() {
        System.out.println("Titular: " + titular + " Saldo: " + saldo);
    }
}

//  CLASE LIBRO
class Libro {
    String titulo, autor;
    int paginas;

    public Libro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public boolean esLargo() {
        return paginas > 300;
    }
}

//  CLASE CALCULADORA
class Calculadora {
    public double sumar(double a, double b) { return a + b; }
    public double restar(double a, double b) { return a - b; }
    public double multiplicar(double a, double b) { return a * b; }

    public double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("No se puede dividir entre cero");
            return 0;
        }
        return a / b;
    }
}

//  CLASE FECHA
class Fecha {
    int dia, mes, anio;

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public boolean esValida() {
        return (dia >= 1 && dia <= 31) && (mes >= 1 && mes <= 12);
    }
}


