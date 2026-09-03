# Unidade 03 - Relacionamento entre Objetos

> Material de apoio da disciplina de Programação Orientada a Objetos.
> Cada aula é registrada em uma seção própria abaixo, com uma âncora referenciada no sumário.

## Sumário

- [Aula 10 - Associações](#aula-10)

<!--
Padrão para as próximas aulas:
1. Adicione o link no sumário acima, seguindo o mesmo formato:
   - [Aula N - Título](#aula-n)
2. Crie a seção da aula com a âncora correspondente:
   <a id="aula-n"></a>
   ## Aula N - Título
-->

---

<a id="aula-10"></a>

## Aula 10 - Associações

### 1. O que é uma associação

Até aqui trabalhamos com objetos que existem de forma isolada. Na prática, porém, os objetos de um sistema quase sempre precisam colaborar entre si, e para isso um objeto precisa conhecer o outro.

Dois objetos podem estar ligados um ao outro. Essa ligação permite navegar de um objeto ao outro, isto é, a partir de um objeto chegar até o objeto ligado a ele e usar seus dados e comportamentos.

Para que seja possível ligar objetos, as classes desses objetos devem estar relacionadas através de uma associação. A associação é um tipo de relacionamento que conecta duas classes: ela indica, no nível do projeto (na UML), que instâncias de uma classe podem se ligar a instâncias da outra.

```text
+---------+                 +---------+
| Pessoa  |-----------------| Livro   |
+---------+                 +---------+
```

> Guarde a distinção: a associação é definida entre classes (no diagrama de classes), enquanto a ligação concreta acontece entre objetos (no diagrama de objetos), em tempo de execução.

Neste material usaremos o exemplo recorrente de `Pessoa` e `Livro`, em que uma pessoa é autora de livros.

---

### 2. Aprimoramentos (adornos) da associação

Uma associação simples, representada apenas por uma linha ligando duas classes, comunica pouco. As associações podem ser mais bem detalhadas através de aprimoramentos, também conhecidos como adornos.

Existem 4 tipos de aprimoramentos:

| Aprimoramento | Para que serve |
|---|---|
| Papel | Indica o papel que cada classe desempenha no relacionamento |
| Nome | Descreve a natureza (o propósito) da associação |
| Multiplicidade | Indica quantos objetos podem se interconectar |
| Navegabilidade | Indica em qual sentido é possível navegar entre os objetos |

Os próximos tópicos detalham cada um deles.

---

### 3. Papel

Cada classe que participa de uma associação tem um papel específico dentro daquele relacionamento. É possível nomear explicitamente o papel de uma classe, colocando o nome do papel próximo à extremidade da associação, junto da classe correspondente.

No exemplo, no relacionamento entre `Pessoa` e `Livro`, a pessoa desempenha o papel de `autor` e o livro o papel de `obra`.

```text
+---------+  autor            obra  +---------+
| Pessoa  |------------------------| Livro   |
+---------+                         +---------+
```

> Nomear papéis é especialmente útil quando a mesma classe pode participar da associação de mais de uma maneira, deixando claro qual função ela cumpre naquele vínculo.

---

### 4. Nome

Uma associação pode ter um nome, usado para descrever a natureza do relacionamento, ou seja, o seu propósito. O nome costuma ser um verbo ou uma expressão verbal que se lê ligando as duas classes.

Pode ser indicada a direção de leitura do nome, utilizando-se uma pequena seta ao lado do nome. Essa seta serve apenas para orientar a leitura (Pessoa escreve Livro), e não deve ser confundida com a navegabilidade, que é outro adorno.

```text
+---------+      escreve >      +---------+
| Pessoa  |---------------------| Livro   |
+---------+                     +---------+
```

Lê-se: "uma Pessoa escreve um Livro".

---

### 5. Multiplicidade

A multiplicidade determina a quantidade de objetos que podem ser interconectados pela associação. Ela é escrita com uma expressão que indica um valor mínimo e um valor máximo, colocada em cada extremidade da associação.

Para preencher a multiplicidade em uma extremidade, fixamos um objeto do outro lado e perguntamos qual a quantidade mínima e máxima de objetos que se ligam a ele.

#### Exemplo: quantas obras uma pessoa escreve

Dado um autor em particular:

- Qual a quantidade mínima de obras que ele pode escrever? Nenhum livro, ou seja, `0`.
- Qual a quantidade máxima de obras que ele pode escrever? Indeterminado, ou seja, `*`.

Logo, a multiplicidade do lado de `Livro` é `0..*`.

#### Exemplo: quantas pessoas escrevem uma obra

Dada uma obra em particular:

- Qual a quantidade mínima de autores que podem escrevê-la? Uma pessoa, ou seja, `1`.
- Qual a quantidade máxima de autores que podem escrevê-la? Indeterminado, ou seja, `*`.

Logo, a multiplicidade do lado de `Pessoa` é `1..*`.

Juntando as duas leituras, a associação fica assim:

```text
+---------+ 1..*            0..* +---------+
| Pessoa  |----------------------| Livro   |
+---------+                       +---------+
```

Ou seja: cada livro tem de 1 a muitos autores, e cada pessoa é autora de 0 a muitos livros.

#### Diagrama de objetos correspondente

O diagrama de objetos mostra instâncias concretas ligadas em tempo de execução, respeitando as multiplicidades definidas no diagrama de classes:

```text
p1:Pessoa ------- l1:Livro
             \
              --- l2:Livro ------- p2:Pessoa
```

Neste retrato, `p1` é autora de dois livros, `l2` foi escrito por dois autores (`p1` e `p2`) e todo livro tem ao menos um autor.

#### Tabela de multiplicidades comuns

| Multiplicidade | Significado |
|---|---|
| `0..1` | Os objetos não precisam obrigatoriamente estar relacionados, mas, se houver relacionamento, no máximo uma instância se relaciona com as instâncias da outra classe |
| `1` (ou `1..1`) | Exatamente um objeto da classe se relaciona com os objetos da outra classe |
| `0..*` | Pode ou não haver instâncias da classe participando do relacionamento, sem limite superior |
| `1..*` | Há pelo menos um objeto envolvido no relacionamento, podendo haver muitos |
| `3..5` | Existem pelo menos 3 instâncias envolvidas, mas não mais do que 5 |

> O `*` sozinho é equivalente a `0..*`. Sempre que a multiplicidade mínima for `1` ou mais, o relacionamento é obrigatório daquele lado.

---

### 6. Navegabilidade

A navegabilidade indica em qual sentido é possível ir de um objeto a outro através da associação.

Por padrão, a navegação entre objetos é bidirecional: a partir de qualquer um dos lados é possível alcançar o outro.

```text
+---------+                 +---------+
| Pessoa  |-----------------| Livro   |
+---------+                 +---------+
```

A partir de um livro é possível navegar até seus autores, e a partir de uma pessoa é possível navegar até suas obras.

É possível limitar a navegação para uma única direção, desenhando-se uma seta na extremidade para a qual se pode navegar. Trata-se de uma navegação unidirecional.

```text
+---------+                 +---------+
| Pessoa  |<----------------| Livro   |
+---------+                 +---------+
```

Aqui, a partir de um livro é possível navegar até seus autores, mas a partir de uma pessoa não é possível navegar até suas obras.

> A navegabilidade tem impacto direto na implementação: o lado que precisa navegar até o outro é o que guardará a referência para o objeto associado.

---

### 7. Associação reflexiva

Uma associação reflexiva é uma associação que estabelece uma conexão entre objetos de uma mesma classe. A linha da associação sai da classe e volta para ela mesma.

Esse tipo de relacionamento aparece quando objetos do mesmo tipo se relacionam entre si. Um exemplo clássico é o de `Funcionario`, em que um funcionário chefia outros funcionários e, ao mesmo tempo, pode ter um chefe (que também é um funcionário).

```text
              +---------------------+
              |                     | 0..1  (chefe)
      +----------------+            |
      |  Funcionario   |-----------+
      +----------------+            |
              |                     | 0..*  (subordinados)
              +---------------------+
```

Os papéis (`chefe` e `subordinados`) ajudam a distinguir os dois lados do mesmo relacionamento, já que ambos apontam para a mesma classe.

---

### 8. Resumindo

- Uma **associação** conecta duas classes e permite que objetos se liguem e naveguem entre si.
- Os **adornos** deixam a associação mais expressiva: **papel** (função de cada classe), **nome** (propósito do vínculo), **multiplicidade** (quantos objetos se ligam) e **navegabilidade** (em qual sentido se navega).
- A **multiplicidade** é lida fixando um objeto de um lado e contando o mínimo e o máximo de objetos do outro lado.
- A **navegabilidade** é bidirecional por padrão; uma seta a restringe a um único sentido.
- Uma **associação reflexiva** liga objetos de uma mesma classe, usando papéis para distinguir cada extremidade.

> A forma de implementar essas associações em Java (guardando referências e coleções de objetos associados) é o próximo passo desta unidade.
