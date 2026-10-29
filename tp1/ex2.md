
O compilador `javac` transforma o código do **InfoAmbiente** em bytecode (arquivo `.class`), que é um formato intermediário universal e não um código nativo de um sistema operacional.

É esse bytecode que o comando `java` executa, ativando a **JVM (Java Virtual Machine)** específica daquela máquina. A JVM traduz essas instruções padronizadas em tempo de execução para a linguagem de máquina local.

Assim, a diferença crucial é que o `javac` gera um binário genérico e independente, enquanto o comando `java` executa a conversão final para o hardware real, garantindo a portabilidade sem recompilação.
