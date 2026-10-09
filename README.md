# Mobilidade App

Projeto em Java para simular o cálculo de holerites de diferentes categorias de motoristas.

## Descrição

O sistema cria objetos de motoristas com regras específicas de pagamento:

- Motorista Iniciante
- Motorista Premium
- Motorista Parceiro Frotista

Cada categoria possui uma lógica distinta para calcular o valor líquido recebido com base nas corridas registradas.

## Estrutura do projeto

- `src/Main.java` — ponto de entrada da aplicação
- `src/tech/mobilidadeapp/Motorista.java` — classe base abstrata
- `src/tech/mobilidadeapp/MotoristaIniciante.java` — motorista iniciante
- `src/tech/mobilidadeapp/MotoristaPremium.java` — motorista premium
- `src/tech/mobilidadeapp/MotoristaParceiroFrotista.java` — motorista frotista

## Resultado esperado

Ao executar, o programa deve imprimir os holerites/ extratos com:

- nome do motorista
- placa do veículo
- categoria
- quantidade de corridas
- valor bruto arrecadado
- valor líquido a receber

## Resultado compilado

```text
========================================
           EXTRATO / HOLERITE           
========================================
Nome: Carlos Silva
Placa: ABC-1234
Categoria: MotoristaIniciante
Qtd. Corridas: 2
Valor Bruto: R$ 100,00
Valor Líquido a Receber: R$ 25,00
========================================

========================================
           EXTRATO / HOLERITE           
========================================
Nome: Mariana Souza
Placa: XYZ-9876
Categoria: MotoristaPremium
Qtd. Corridas: 3
Valor Bruto: R$ 456,00
Valor Líquido a Receber: R$ 387,60
========================================

========================================
           EXTRATO / HOLERITE           
========================================
Nome: Roberto Dias
Placa: FRO-5678
Categoria: MotoristaParceiroFrotista
Qtd. Corridas: 2
Valor Bruto: R$ 1100,00
Valor Líquido a Receber: R$ 80,00
========================================
```
