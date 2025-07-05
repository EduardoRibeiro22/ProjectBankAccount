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

----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Project Description
This Java project implements a simple bank account management system focused on custom exception handling and the use of enums for account type categorization. The program allows creating accounts with different types (BRONZE, SILVER, GOLD), each with an associated discount rate, and performs basic operations like deposit and withdrawal while respecting limits and rules.

The main workflow includes:

Safe data input reading via Scanner with handling of invalid entries;

Definition of account types through an enum (TypeAccount);

Implementation of custom exceptions to validate financial operations, preventing negative deposits and withdrawals that exceed limits or available balance;

Detailed control of deposit and withdrawal operations with clear error and confirmation messages.

Technologies and Skills Used
Java: The main programming language used for this project.

Custom Exceptions: Creation of the DomainExceptions class to throw domain-specific errors.

Enumerations (enum): Use of TypeAccount enum to categorize account types and associate discounts.

Error Handling: Use of try-catch blocks to ensure invalid inputs do not break the program, providing robustness.

Object-Oriented Programming (OOP): Code structured with well-defined classes (Account, DomainExceptions, TypeAccount), encapsulation, methods, and constructors.

Input Validation: Static methods for safe reading of primitive types via Scanner, preventing failures on invalid inputs.

Best Coding Practices: Clear user messages, responsibility separation, and organized code in packages (model.entities, model.enums, model.exceptions, application).
