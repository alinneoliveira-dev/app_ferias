# FeriasApp - Sistema de Solicitação de Férias 🏖️

Este projeto simula o fluxo de solicitação, aprovação e registro de férias utilizando Java com Programação Orientada a Objetos (POO).

## 💡 Objetivo

Aplicação desenvolvida como parte da disciplina de Programação Orientada a Objetos (POO), com foco em:
- Princípios de POO (Herança, Encapsulamento, Responsabilidade Única)
- Estrutura de microserviços (em simulação)
- Autenticação com JWT (simulado no projeto)
- Controle de acesso por papel (RH, Gestor, Colaborador)

## 🧱 Arquitetura

- `Usuario` (classe pai): representa qualquer tipo de usuário
- `Colaborador`, `Gestor`, `RH`: herdam de `Usuario` com comportamentos específicos
- `FeriasSolicitacao`: representa uma solicitação de férias
- `FeriasService`: contém as regras de negócio (solicitar, aprovar, listar)

## 🚀 Como executar

1. Clone o repositório:
```bash
git clone https://github.com/seu-usuario/feriasapp.git
