## Exercício 4

```
PS C:\Users\vazma\Desktop\faculdade-estudos\Faculdade-Infnet_GIT\fundamentos_desenvol._JAVA\tp1> jshell
|  Welcome to JShell -- Version 17.0.15
|  For an introduction type: /help intro

jshell> int estoque = 12;
estoque ==> 12

jshell> int limiteMinimo = 15
limiteMinimo ==> 15

jshell> boolean precisaComprar = estoque < limiteMinimo;
precisaComprar ==> true

jshell> System.out.println("Precisa reabastecer? " + precisaComprar);
Precisa reabastecer? true

jshell> /exit
|  Goodbye
```


### Explicação Linha por Linha (Análise da IA)

- Linha 1 (int estoque = 12;): Cria uma variável chamada estoque do tipo primitivo int (inteiro) e atribui a ela o valor inicial de 12.
- Linha 2 (int limiteMinimo = 15;): Cria uma segunda variável inteira chamada limiteMinimo e define seu valor como 15.
- Linha 3 (boolean precisaComprar = estoque < limiteMinimo;): Avalia uma expressão usando o operador relacional "menor que" (<). Como 12 é menor que 15, a expressão resulta em true. Esse resultado lógico é guardado na variável precisaComprar do tipo primitivo boolean.
- Linha 4 (System.out.println(...);): Exibe o resultado no terminal. Ela junta (concatena) o texto explicativo com o valor da variável precisaComprar, imprimindo na tela: Precisa reabastecer? true.
