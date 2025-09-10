# TRABALHO DE ASPECTOS AVANÇADOS DE ENGENHARIA DE SOFTWARE

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)

### ENUNCIADO
Dos 12 padrões estudados (Singleton, Bridge, Abstract Factory, Factory Method, Decorator, State, Observer, Strategy, Template Method, Chain of Responsibility, Mediator, Visitor) escolha pelo menos 8 e implemente uma única aplicação séria, de um único domínio de aplicação, com os padrões escolhidos.

Escolha, estude e implemente também mais 1 padrão GoF dentre os que não foram estudados.

Construa o diagrama de classes UML e implemente todos os casos de teste.

## TEMA ESCOLHIDO:
### `INDÚSTRIA ALIMENTÍCIA`

## PADRÕES ESCOLHIDOS
1. `Factory Method`
   - Criação dos alimentos processados (**Chocolate**, **Snack** e **Biscuit**)
2. `Abstract Factory`
   - Criação dos equipamentos da fábrica (**Mixer** e **Oven**)
3. `Singleton`
   - Estados do Lote de Alimento (**BatchStatusDiscarted**, **BatchStatusDelivered**, ...), Estratégias de Empacotamento(**VacuumPackaging**, **TraditionalPackaging**, ...) e Embalagem (**Packaging**)
4. `State`
   - Estados do Lote de Alimentos (**BatchStatus**, **BatchStatusDiscarted**, **BatchStatusDelivered**...)
5. `Observer`
   - Supervisor é alertado quando o lote de alimento tem o status igual à Reanálise (**BatchStatusReanalysis**)
6. `Visitor`
   - Calculadora de Impostos(**TaxCalculator**) e Calculadora de Validade(**ExpirationCalculator**) dos alimentos produzidos na fábrica
7. `Template Method`
   - Linhas de Produção da fábrica (**BiscuitProductionLine**, **SnackProductionLine**, ...)
8. `Strategy`
   - Estratégias de Empacotamento dos lotes de alimentos (**VacuumPackaging**, **TraditionalPackaging**, ...)
9. `Prototype`
   - Clonagem de embalagens (**Packaging**) de acordo com as informações dos lotes a serem empacotados

## DIAGRAMA DE CLASSES

![DiagramaClassesTrabalhoDesignPatterns drawio](https://github.com/user-attachments/assets/20e5c3c4-15e1-427e-8667-e31524cad95e)

## DIAGRAMA DE ESTADOS
![DiagramaEstadosTrabalhoDesignPatterns drawio](https://github.com/user-attachments/assets/5555bcb1-50e3-4e4c-baf7-2919df1e012c)

