# ScientificCalculator — estrutura dos exercícios

Projeto Maven com Java 23 e JUnit 5. A classe `ScientificCalculator` contém
a implementação fornecida no enunciado. Os testes estão separados por operação
e contêm apenas a estrutura para preenchimento.

```text
src/main/java/org/example/
├── Main.java
└── ScientificCalculator.java

src/test/java/org/example/
├── AdditionTest.java
├── SubtractionTest.java
├── MultiplicationTest.java
├── DivisionTest.java
├── PowerTest.java
├── SquareRootTest.java
├── LogarithmTest.java
├── SineTest.java
└── CosineTest.java
```

Cada classe tem um `@BeforeEach` que cria uma nova calculadora antes de cada
teste. O campo `calculator` fica disponível para os métodos daquela classe;
a instância é renovada a cada teste.

As classes estão marcadas com `@Disabled` para que os métodos vazios sejam
exibidos como ignorados, sem indicar falsamente testes aprovados. Remova essa
anotação e seu import ao implementar os testes da classe.

## Correspondência com os exercícios

| Item | Local |
| --- | --- |
| 1 — Configuração do JUnit 5 | `pom.xml` |
| 2 — Primeiro teste | `AdditionTest.java` |
| 3 — Quatro fases | `SubtractionTest.java` |
| 4 — Fixture | `setUp()` em cada classe de teste |
| 5 e 6 — Raiz positiva e negativa | `SquareRootTest.java` |
| 7 — Divisão por zero | `DivisionTest.java` |
| 8 — Log e seno | `LogarithmTest.java` e `SineTest.java` |
| 9 — Análise de cobertura | Resposta textual a elaborar |
| 10 — Revisão dos nomes | Revisar após implementar os cenários |
| 11 — Organização por comportamento | Arquivos separados por operação |

Multiplicação, potência e cosseno também possuem arquivos reservados.
As respostas textuais e os prints ficam para a realização dos exercícios.

## Executar

No IntelliJ IDEA, selecione o JDK 23 e recarregue o projeto Maven após abrir
o `pom.xml`. Execute a pasta `src/test/java` pela IDE ou, com Maven instalado,
use `mvn test` no terminal. Inicialmente, os testes serão ignorados por causa
do `@Disabled`.
