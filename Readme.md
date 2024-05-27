## Desafio Controle de Fluxo: Contagem e Validação de Parâmetros

**Tarefas:**

1. **Criar Projeto:**
    - [x] Criar um novo projeto Java chamado "DesafioControleFluxo".

2. **Criar Classe de Exceção:**
    - [x] Criar a classe `ParametrosInvalidosException` que estende `Exception`.
    - [x] Adicionar um construtor que recebe a mensagem de erro.

3. **Criar Classe Principal:**
    - [x] Criar a classe `Contador`.
    - [x] Adicionar o método `main`.
    - [x] No método `main`:
        - [x] Ler dois números inteiros do usuário via terminal.
        - [x] Chamar o método `contar` dentro de um bloco `try-catch` para lidar com a exceção `ParametrosInvalidosException`.
        - [x] Em caso de exceção, imprimir a mensagem de erro.

4. **Implementar Método de Contagem:**
    - [x] Criar o método `contar` que recebe os dois parâmetros e lança `ParametrosInvalidosException`.
    - [x] No método `contar`:
        - [x] Validar se o primeiro parâmetro é maior que o segundo.
        - [x] Se a validação falhar, lançar a exceção `ParametrosInvalidosException` com a mensagem "O segundo parâmetro deve ser maior que o primeiro".
        - [x] Se a validação passar, utilizar um loop `for` para imprimir os números do primeiro parâmetro até o segundo.

**Critérios de Aceitação:**

- [x] O programa deve compilar sem erros.
- [x] Ao receber dois números válidos, o programa deve imprimir os números em ordem crescente.
- [x] Ao receber o primeiro número maior que o segundo, o programa deve lançar a exceção `ParametrosInvalidosException` e imprimir a mensagem de erro.
- [x] Documentar o código fonte com comentários explicativos.
**Observações:**

- Utilize a classe `Scanner` para ler os números do terminal.
- O tratamento de exceção deve ser feito utilizando o bloco `try-catch`.
- A mensagem de erro da exceção deve ser clara e informativa.