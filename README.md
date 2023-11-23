1- Classe e Objeto em Java:

Classe: Em Java, uma classe é uma estrutura que define o comportamento e as propriedades de objetos. É uma espécie de modelo ou planta baixa para criar objetos. Uma classe em Java contém campos (variáveis) e métodos (funções).

Objeto: Um objeto é uma instância de uma classe. Ele representa uma entidade do mundo real e é criado a partir da classe. Os objetos têm características (campos) e comportamentos (métodos).

Exemplos em Java e C++:
// Exemplo em Java
public class Carro {
    String modelo;
    int ano;

    void ligar() {
        System.out.println("Carro ligado.");
    }
}

// Exemplo em C++
class Carro {
public:
    string modelo;
    int ano;

    void ligar() {
        cout << "Carro ligado." << endl;
    }
};


2- Declaração de Variáveis e Tipos Primitivos em Java:

Declaração de Variáveis: Em Java, as variáveis são declaradas indicando o tipo e o nome.
int idade = 25;

Tipos Primitivos Comuns em Java:
int: Números inteiros.
double: Números de ponto flutuante.
boolean: Valores booleanos.
char: Caracteres Unicode.
String: Sequências de caracteres.
Paralelo em C++:
// Declaração de Variáveis em C++
int idade = 25;
// Tipos Primitivos Comuns em C++
int numero = 42;
double salario = 2500.50;
bool status = true;
char letra = 'A';
string nome = "John";


3- Herança em Java:

Herança: Em Java, a herança permite que uma classe herde campos e métodos de outra classe. A classe que é herdada é chamada de classe pai ou superclasse, e a classe que herda é chamada de classe filha ou subclasse.
Exemplos em Java e C++:
// Exemplo em Java
class Animal {
    void comer() {
        System.out.println("Animal comendo.");
    }
}

class Cachorro extends Animal {
    void latir() {
        System.out.println("Cachorro latindo.");
    }
}

// Exemplo em C++
class Animal {
public:
    void comer() {
        cout << "Animal comendo." << endl;
    }
};

class Cachorro : public Animal {
public:
    void latir() {
        cout << "Cachorro latindo." << endl;
    }
};


4- Variáveis em Java vs. C++:

Java: Em Java, as variáveis de objetos armazenam uma referência ao objeto na memória.
Carro meuCarro = new Carro();

C++: Em C++, as variáveis de objetos armazenam diretamente os dados do objeto.
Carro meuCarro;

# TIC18_JAVA
