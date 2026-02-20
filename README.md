## IMC Pessoa e Atleta
**Descrição Geral** 📄<br>
Este projeto apresenta uma implementação prática dos pilares da **Programação Orientada a Objetos (POO)** utilizando a linguagem Java. O sistema modela pessoas e atletas, demonstrando **herança, encapsulamento e sobrescrita de métodos**. O projeto também calcula o **IMC (Índice de Massa Corporal)**, aplicando uma **redução de 5% para atletas**, refletindo diferenças no índice devido à composição corporal.

---
**Objetivo** 🎯 <br>
O objetivo principal do projeto é exemplificar como **POO pode ser aplicada na prática**, permitindo criar classes relacionadas, herdar atributos e comportamentos, e sobrescrever métodos para adaptar funcionalidades específicas, como o cálculo do IMC.

---
**Tecnologias Utilizadas** 💻 <br>
* ***Java*** — linguagem principal.
* ***Programação Orientada a Objetos (POO):***
  * Herança;
  * Encapsulamento;
  * Sobrescrita de métodos.

---
**Arquitetura e Estrutura do Código** 🧱 <br><br>
***1. Classe Pessoa*** <br>
Representa uma pessoa genérica.<br>
Ela contém:
* ***Atributos privados:*** nome, peso, altura.
* ***Métodos:***
  * mostrarDetalhes() — exibe informações da pessoa.
  * calcularIMC() — calcula e exibe o IMC da pessoa.

***2. Classe Atleta*** <br>
Herdeira de **Pessoa**, representa um atleta.
* ***Adiciona o atributo:*** esportePraticado.
* ***Sobrescreve o método calcularIMC()*** — ajusta o IMC para atletas.
* ***Sobrescreve mostrarDetalhes()*** — exibe também o esporte praticado.

***3. Classe Main*** <br>
Ponto de entrada do sistema.<br>
Nela ocorre:
* ***Criação de objetos de Pessoa e Atleta***
* ***Definição de atributos via setters***
* ***Chamada dos métodos mostrarDetalhes() e calcularIMC()***

---
**Conceitos de POO Demonstrados** 🔍 <br><br>
✅***Herança:*** <br>
A classe **Atleta** estende **Pessoa**, reutilizando atributos e métodos e adicionando funcionalidades específicas.

✅***Encapsulamento:*** <br>
Atributos como **nome, peso e altura** são privados, acessíveis via getters e setters.

✅***Sobrescrita de métodos:*** <br>
**Atleta** sobrescreve métodos da classe **Pessoa** para adaptar o comportamento de cálculo do IMC e exibição de detalhes.

---
**Como Executar o Projeto** ▶️ <br><br>
***1. Compile os arquivos:*** <br>
```javac Pessoa.java Atleta.java Main.java```

***2. Execute o programa:*** <br>
```java Main```

***Exemplo de saída:***<br>
```
Detalhes da Pessoa:
Nome: Cleiton
Peso: 50.0
Altura: 1.6
IMC: 19.53
------------
Detalhes do Atleta:
Nome: Juanito
Peso: 50.0
Altura: 1.6
Esporte Praticado: Vôlei
IMC ajustado para atleta: 18.56
------------
```

---
**Conclusão** 📌 <br>
Este projeto demonstra de forma prática a aplicação dos conceitos de **Programação Orientada a Objetos** em Java, evidenciando **herança, encapsulamento e polimorfismo**. Ele realiza cálculos funcionais, como o IMC ajustado para atletas, mostrando como construir sistemas organizados e reutilizáveis.
