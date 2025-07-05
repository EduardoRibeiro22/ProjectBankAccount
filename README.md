# ProjectBankAccount

Descrição do Projeto:
Este projeto em Java implementa um sistema simples de gerenciamento de contas bancárias com foco em tratamento de exceções personalizadas e uso de enums para categorização de tipos de conta. O programa permite a criação de contas com diferentes tipos (BRONZE, SILVER, GOLD), cada uma com seu desconto associado, e realiza operações básicas, como depósito e saque, respeitando limites e regras definidas.

O fluxo principal inclui:

Leitura segura de dados via Scanner com tratamento para entradas inválidas;

Definição do tipo de conta através de um enum (TypeAccount);

Implementação de exceções personalizadas para validar operações financeiras, evitando depósitos negativos e saques que ultrapassem o limite ou o saldo disponível;

Controle detalhado das operações de saque e depósito com mensagens claras de erro e confirmação.

Tecnologias e Conhecimentos Utilizados
Java: Linguagem principal utilizada para o desenvolvimento do projeto.

Exceções Personalizadas: Criação da classe DomainExceptions para lançar erros específicos do domínio bancário.

Enumerações (enum): Uso do TypeAccount para categorizar tipos de contas e associar descontos.

Tratamento de erros: Uso de try-catch para garantir que entradas inválidas não quebrem o programa, proporcionando uma experiência robusta.

POO (Programação Orientada a Objetos): Estruturação do código com classes bem definidas (Account, DomainExceptions, TypeAccount), encapsulamento, métodos e construtores.

Validação de dados de entrada: Métodos estáticos para leitura segura de tipos primitivos via Scanner, evitando falhas em entradas incorretas.

Boas práticas de codificação: Mensagens claras para o usuário, separação de responsabilidades, e organização do código em pacotes (model.entities, model.enums, model.exceptions, application).
